package dartagnan.asserts;

import com.microsoft.z3.BoolExpr;
import com.microsoft.z3.Context;
import com.microsoft.z3.Z3Exception;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AssertCompositeOr extends AssertCompositeInterface {

    private List<AssertInterface> children = new ArrayList<AssertInterface>();

    public AssertCompositeOr(){}

    public AssertCompositeOr(AssertInterface a1, AssertInterface a2){
        addChild(a1);
        addChild(a2);
    }

    public void addChild(AssertInterface ass){
        children.add(ass);
    }

    public BoolExpr encode(Context ctx) throws Z3Exception {
        if(children.isEmpty()){
            throw new RuntimeException("Empty assertion clause");
        }
        BoolExpr enc = ctx.mkFalse();
        for(AssertInterface child : children){
            enc = ctx.mkOr(enc, child.encode(ctx));
        }
        return enc;
    }

    public String toString() {
        return " (" + children.stream()
                .map(child -> child.toString())
                .collect(Collectors.joining(" || " )) + ") ";
    }
}
