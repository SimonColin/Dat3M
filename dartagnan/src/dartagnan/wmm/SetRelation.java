package dartagnan.wmm;

import com.microsoft.z3.BoolExpr;
import com.microsoft.z3.Context;
import com.microsoft.z3.Z3Exception;
import dartagnan.program.Program;

import java.util.Set;

public abstract class SetRelation extends Relation{

    public SetRelation(String name, String term) {
        super(name, term);
    }

    public BoolExpr encode(Program program, Context ctx, Set<String> encodedRels) throws Z3Exception{
        return encodeBasic(program, ctx);
    }

    public BoolExpr encodeApprox(Program program, Context ctx) throws Z3Exception{
        return this.encodeBasic(program, ctx);
    }

    protected BoolExpr encodePredicateBasic(Program program, Context ctx) throws Z3Exception {
        return null;
    }

    protected BoolExpr encodePredicateApprox(Program program, Context ctx) throws Z3Exception{
        return null;
    }
}
