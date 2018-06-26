package dartagnan.wmm;

import com.microsoft.z3.BoolExpr;
import com.microsoft.z3.Context;
import com.microsoft.z3.Z3Exception;
import dartagnan.program.Event;
import dartagnan.program.Program;
import dartagnan.utils.Utils;

import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

import static dartagnan.utils.Utils.edge;

public class RelSetToRel extends SetRelation {

    protected String type;
    protected Relation rel;
    protected List<Relation> rels = new ArrayList<Relation>();

    public RelSetToRel(String type, Relation rel, String name, String term) {
        super(name, term);
        this.rel = rel;
        this.type = type;
    }

    public RelSetToRel(String type, List<Relation> rels, String name, String term) {
        super(name, term);
        this.rels = rels;
        this.type = type;
    }

    public RelSetToRel(String type, Relation rel, String term) {
        this(type, rel, type + ";" + rel.getName(), term);
    }

    public RelSetToRel(String type, Relation rel) {
        this(type, rel, type + ";" + rel.getName());
    }

    protected BoolExpr encodeBasic(Program program, Context ctx) throws Z3Exception {
        Set<String> encodedRelations = new HashSet<>();
        BoolExpr enc = rel.encode(program, ctx, encodedRelations);

        Set<Event> events = program.getEvents();
        for (Event e1 : events) {
            if(e1.filter(type)){
                for (Event e2 : events) {
                    BoolExpr rel1 = Utils.edge(this.getName(), e1, e2, ctx);
                    BoolExpr rel2 = Utils.edge(rel.getName(), e1, e2, ctx);
                    enc = ctx.mkAnd(enc, ctx.mkEq(rel1, rel2));
                }
            } else {
                for (Event e2 : events) {
                    enc = ctx.mkAnd(enc, ctx.mkNot(edge(this.getName(), e1, e2, ctx)));
                }
            }
        }
        return enc;
    }
}
