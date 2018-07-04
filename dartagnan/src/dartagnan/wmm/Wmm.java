/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dartagnan.wmm;

import com.microsoft.z3.BoolExpr;
import com.microsoft.z3.Context;
import com.microsoft.z3.Z3Exception;
import dartagnan.program.Event;
import dartagnan.program.Program;
import dartagnan.program.event.filter.FilterInterface;
import dartagnan.program.event.filter.FilterBasic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Florian Furbach
 */
public class Wmm {

    protected ArrayList<Axiom> axioms = new ArrayList<>();
    protected Map<String, FilterInterface> filters = new HashMap<String, FilterInterface>();
    protected Map<String, Relation> relations = new HashMap<String, Relation>();

    protected List<String> basicRelations;
    protected List<String> basicFilters;

    public Wmm(){
        basicRelations = new ArrayList<String>(Arrays.asList(Relation.BASIC_RELATIONS));
        basicFilters = new ArrayList<String>(Arrays.asList(Event.BASIC_EVENT_TYPES));
        // TODO: Add atomics to filter

        // TODO: Move me somewhere
        relations.put("addr", new EmptyRel());
        relations.put("0", new EmptyRel());
        relations.put("data", new RelIntersection(new RelLocTrans(new BasicRelation("idd")), new BasicRelation("RW")));
    }

    public void addAxiom(Axiom ax) {
        axioms.add(ax);
    }

    public void addRelation(Relation rel) {
        relations.put(rel.getName(), rel);
    }

    public Relation getRelation(String name){
        Relation relation = relations.get(name);
        if(relation == null && basicRelations.indexOf(name) > -1){
            // TODO: Add to relations here, fix "po-loc" vs "poloc"
            if(name.equals("po-loc")){
                relation = new BasicRelation("poloc");
            } else {
                relation = new BasicRelation(name);
            }
        }
        return relation;
    }

    public void addFilter(FilterInterface filter) {
        filters.put(filter.getName(), filter);
    }

    public FilterInterface getFilter(String name){
        FilterInterface filter = filters.get(name);
        if(filter == null && basicFilters.indexOf(name) > -1){
            filter = new FilterBasic(name);
        }
        return filter;
    }

    /**
     * Encodes  all relations in the model according to the predicate and approximate settings.
     * @param program
     * @param ctx
     * @return the encoding of the relations.
     * @throws Z3Exception
     */
    public BoolExpr encode(Program program, Context ctx) throws Z3Exception {
        BoolExpr expr = ctx.mkTrue();
        Set<String> encodedRels = new HashSet<>();

        for (Axiom ax : axioms) {
            expr = ctx.mkAnd(expr, ax.getRel().encode(program, ctx, encodedRels));
        }

        for (Map.Entry<String, Relation> relation : relations.entrySet()){
            expr = ctx.mkAnd(expr, relation.getValue().encode(program, ctx, encodedRels));
        }

        return expr;
    }

    /**
     * 
     * @param program
     * @param ctx
     * @return encoding that ensures all axioms are satisfied and the execution is consistent.
     * @throws Z3Exception
     */
    public BoolExpr Consistent(Program program, Context ctx) throws Z3Exception {
        Set<Event> events = program.getMemEvents();
        BoolExpr expr = ctx.mkTrue();
        for (Axiom ax : axioms) {
            expr = ctx.mkAnd(expr, ax.Consistent(events, ctx));
        }
        return expr;
    }

    /**
     *
     * @param program
     * @param ctx
     * @return encoding that ensures one axiom is not satisfied and the execution is not consistent.
     * @throws Z3Exception
     */
    public BoolExpr Inconsistent(Program program, Context ctx) throws Z3Exception {
        Set<Event> events = program.getMemEvents();
        BoolExpr expr = ctx.mkFalse();
        for (Axiom ax : axioms) {
            expr = ctx.mkOr(expr, ax.Inconsistent(events, ctx));
        }
        return expr;
    }

    /**
     * A string representation of the model.
     * @return String
     */
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (Axiom axiom : axioms) {
            result.append(axiom);
            result.append("\n");
        }

        for (Map.Entry<String, Relation> relation : relations.entrySet()) {
            // TODO: Cleanup names
            if(relation.getValue().isnamed){
                result.append(relation.getValue());
                result.append("\n");
            }
        }

        for (Map.Entry<String, FilterInterface> filter : filters.entrySet()){
            result.append(filter.getValue());
            result.append("\n");
        }
        return result.toString();
    }

}
