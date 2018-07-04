package dartagnan.wmm;

import com.microsoft.z3.BoolExpr;
import com.microsoft.z3.Context;
import com.microsoft.z3.Z3Exception;
import dartagnan.program.Event;
import dartagnan.program.Program;
import dartagnan.program.event.filter.FilterInterface;

import java.util.Set;

import static dartagnan.utils.Utils.edge;

public class RelFromSet extends SetRelation {

    protected FilterInterface filter;

    public RelFromSet(FilterInterface filter, String name, String term) {
        super(name, term);
        this.filter = filter;
    }

    public RelFromSet(FilterInterface filter, String term) {
        this(filter, "[" + filter.toString() + "]", term);
    }

    public RelFromSet(FilterInterface filter) {
        this(filter,"[" + filter.toString() + "]");
    }

    protected BoolExpr encodeBasic(Program program, Context ctx) throws Z3Exception {
        BoolExpr enc = ctx.mkTrue();
        Set<Event> events = program.getEvents();
        for (Event e : events) {
            if(filter.filter(e)){
                enc = ctx.mkAnd(enc, edge(this.getName(), e, e, ctx));
            } else {
                enc = ctx.mkAnd(enc, ctx.mkNot(edge(this.getName(), e, e, ctx)));
            }
        }
        return enc;
    }
}
