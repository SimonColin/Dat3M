package dartagnan.wmm;

import com.microsoft.z3.BoolExpr;
import com.microsoft.z3.Context;
import com.microsoft.z3.Z3Exception;
import dartagnan.program.Program;

import java.util.Set;

public abstract class SetRelation extends Relation{

    protected String type1;
    protected String type2;

    public SetRelation(String type1, String type2, String name, String term) {
        super(name, term);
        this.type1 = type1;
        this.type2 = type2;
    }

    public SetRelation(String type1, String type2, String term) {
        super(term);
        this.type1 = type1;
        this.type2 = type2;
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
