package dartagnan.wmm;

import com.microsoft.z3.BoolExpr;
import com.microsoft.z3.Context;
import com.microsoft.z3.Z3Exception;
import dartagnan.program.Event;
import dartagnan.program.Program;
import dartagnan.program.event.filter.FilterInterface;

import java.util.Set;

import static dartagnan.utils.Utils.edge;

public class RelSetToSet extends SetRelation{

    protected FilterInterface filter1;
    protected FilterInterface filter2;

    public RelSetToSet(FilterInterface filter1, FilterInterface filter2, String name, String term) {
        super(name, term);
        this.filter1 = filter1;
        this.filter2 = filter2;
    }

    public RelSetToSet(FilterInterface filter1, FilterInterface filter2, String term) {
        this(filter1, filter2, filter1.toString() + filter2.toString(), term);
    }

    public RelSetToSet(FilterInterface filter1, FilterInterface filter2) {
        this(filter1, filter2, filter1.toString() + filter2.toString());
    }

    protected BoolExpr encodeBasic(Program program, Context ctx) throws Z3Exception{
        BoolExpr enc = ctx.mkTrue();
        Set<Event> events = program.getEvents();
        for (Event e1 : events) {
            for (Event e2 : events) {
                if(filter1.filter(e1) && filter2.filter(e2)){
                    enc = ctx.mkAnd(enc, edge(this.getName(), e1, e2, ctx));
                } else {
                    enc = ctx.mkAnd(enc, ctx.mkNot(edge(this.getName(), e1, e2, ctx)));
                }
            }
        }
        return enc;
    }
}
