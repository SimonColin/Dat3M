package dartagnan.asserts;

import com.microsoft.z3.BoolExpr;
import com.microsoft.z3.Context;
import com.microsoft.z3.Z3Exception;

// TODO: Temporary parent for backward compatibility. Should rely on AssertInterface only.
import dartagnan.expression.Assert;

public class AssertNot extends Assert implements AssertInterface {

    private AssertInterface child;

    public AssertNot(AssertInterface child){
        this.child = child;
    }

    public BoolExpr encode(Context ctx) throws Z3Exception {
        if(child == null){
            throw new RuntimeException("Empty assertion clause");
        }
        return ctx.mkNot(child.encode(ctx));
    }

    public String toString() {
        return "!" + child.toString();
    }
}