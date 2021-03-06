package dartagnan.asserts;

import com.microsoft.z3.BoolExpr;
import com.microsoft.z3.Context;
import com.microsoft.z3.Z3Exception;

import java.util.stream.Collectors;

public class AssertCompositeOr extends AbstractAssertComposite {

    public AssertCompositeOr(){}

    public AssertCompositeOr(AbstractAssert a1, AbstractAssert a2){
        addChild(a1);
        addChild(a2);
    }

    public BoolExpr encode(Context ctx) throws Z3Exception {
        if(children.isEmpty()){
            throw new RuntimeException("Empty assertion clause");
        }
        BoolExpr enc = ctx.mkFalse();
        for(AbstractAssert child : children){
            enc = ctx.mkOr(enc, child.encode(ctx));
        }
        return enc;
    }

    public String toString() {
        return "(" + children.stream()
                .map(child -> child.toString())
                .collect(Collectors.joining(" || " )) + ")";
    }
}
