package dartagnan.wmm;

import com.microsoft.z3.BoolExpr;
import com.microsoft.z3.Context;
import com.microsoft.z3.Z3Exception;
import dartagnan.program.Event;
import dartagnan.program.Program;
import dartagnan.utils.Utils;

import java.util.HashSet;
import java.util.Set;

import static dartagnan.utils.Utils.edge;

public class RelRelToSet extends SetRelation {

    protected String type;
    protected Relation rel;

    public RelRelToSet(Relation rel, String type, String name, String term) {
        super(name, term);
        this.rel = rel;
        this.type = type;
    }

    public RelRelToSet(Relation rel, String type, String term) {
        this(rel, type, rel.getName() + ";" + type, term);
    }

    public RelRelToSet(Relation rel, String type) {
        this(rel, type, rel.getName() + ";" + type);
    }

    protected BoolExpr encodeBasic(Program program, Context ctx) throws Z3Exception {
        Set<String> encodedRelations = new HashSet<>();
        BoolExpr enc = rel.encode(program, ctx, encodedRelations);

        Set<Event> events = program.getEvents();
        for (Event e1 : events) {
            if(e1.filter(type)){
                for (Event e2 : events) {
                    BoolExpr rel1 = Utils.edge(rel.getName(), e2, e1, ctx);
                    BoolExpr rel2 = Utils.edge(this.getName(), e2, e1, ctx);
                    enc = ctx.mkAnd(enc, ctx.mkEq(rel1, rel2));
                }
            } else {
                for (Event e2 : events) {
                    enc = ctx.mkAnd(enc, ctx.mkNot(edge(this.getName(), e2, e1, ctx)));
                }
            }
        }
        return enc;
    }
}
