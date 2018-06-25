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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Florian Furbach
 */
public class Wmm {

    protected ArrayList<Axiom> axioms = new ArrayList<>();
    private final ArrayList<Relation> namedrels = new ArrayList<>();

    public void addAxiom(Axiom ax) {
        axioms.add(ax);
    }

    public void addRel(Relation rel) {
        namedrels.add(rel);
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

        for (Relation namedrel : namedrels) {
            expr = ctx.mkAnd(expr, namedrel.encode(program, ctx, encodedRels));
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
        Set<Relation> named = new HashSet<>();
        for (Axiom axiom : axioms) {
            result.append(axiom);
            result.append("\n");
            named.addAll(axiom.getRel().getNamedRelations());
        }
        for (Relation relation : named) {
            result.append(relation);
            result.append("\n");
        }
        for (Relation namedrel : namedrels) {
            result.append(namedrel);
            result.append("\n");
        }
        return result.toString();
    }

}
