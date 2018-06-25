package dartagnan.wmm;

import com.microsoft.z3.BoolExpr;
import com.microsoft.z3.Context;
import com.microsoft.z3.Z3Exception;
import dartagnan.program.Event;
import dartagnan.program.Program;
import java.util.Set;

import static dartagnan.utils.Utils.edge;

public class RelSetToSet extends SetRelation{

    public RelSetToSet(String type1, String type2, String name) {
        super(type1, type2, name, type1 + type2);
    }

    public RelSetToSet(String type1, String type2) {
        super(type1, type2, type1 + type2);
    }

    protected BoolExpr encodeBasic(Program program, Context ctx) throws Z3Exception{
        BoolExpr enc = ctx.mkTrue();
        Set<Event> events = program.getEvents();
        for (Event e1 : events) {
            for (Event e2 : events) {
                if(e1.filter(type1) && e2.filter(type2)){
                    enc = ctx.mkAnd(enc, edge(this.getName(), e1, e2, ctx));
                } else {
                    enc = ctx.mkAnd(enc, ctx.mkNot(edge(this.getName(), e1, e2, ctx)));
                }
            }
        }
        return enc;
    }
}
