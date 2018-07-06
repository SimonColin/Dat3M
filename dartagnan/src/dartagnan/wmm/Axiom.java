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
import java.util.Set;

/**
 *
 * @author Florian Furbach
 */
public abstract class Axiom {

    protected Relation rel;

    protected boolean negate = false;

    public Axiom(Relation rel) {
        this.rel = rel;
    }

    public Axiom(Relation rel, boolean negate) {
        this.rel = rel;
        this.negate = negate;
    }

    public Relation getRel() {
        return rel;
    }

    public BoolExpr Consistent(Set<Event> events, Context ctx) throws Z3Exception{
        if(negate){
            return _inconsistent(events, ctx);
        }
        return _consistent(events, ctx);
    }

    public BoolExpr Inconsistent(Set<Event> events, Context ctx) throws Z3Exception{
        if(negate){
            return _consistent(events, ctx);
        }
        return _inconsistent(events, ctx);
    }

    public String toString(){
        if(negate){
            return "~" + _toString();
        }
        return _toString();
    }

    protected abstract BoolExpr _consistent(Set<Event> events, Context ctx) throws Z3Exception;

    protected abstract BoolExpr _inconsistent(Set<Event> events, Context ctx) throws Z3Exception;

    protected abstract String _toString();
}
