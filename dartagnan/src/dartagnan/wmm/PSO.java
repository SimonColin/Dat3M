package dartagnan.wmm;

import static dartagnan.wmm.Encodings.satAcyclic;
import static dartagnan.wmm.Encodings.satCycle;
import static dartagnan.wmm.Encodings.satCycleDef;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import com.microsoft.z3.*;

import dartagnan.program.*;
import dartagnan.program.event.filter.FilterBasic;

public class PSO {
	
	public static BoolExpr encode(Program program, Context ctx) throws Z3Exception {
		Set<Event> events = program.getEvents().stream().filter(e -> e instanceof MemEvent).collect(Collectors.toSet());

		// TODO: We do not actually need encodedRelations here
		Set<String> encodedRelations = new HashSet<>();
		Relation RM = new RelCartesian(new FilterBasic("R"), new FilterBasic("M"), "RM");
		BoolExpr enc = RM.encode(program, ctx, encodedRelations);

		enc = ctx.mkAnd(enc, EncodingsCAT.satUnion("co", "fr", events, ctx));
	    enc = ctx.mkAnd(enc, EncodingsCAT.satUnion("com", "(co+fr)", "rf", events, ctx));
	    enc = ctx.mkAnd(enc, EncodingsCAT.satUnion("poloc", "com", events, ctx));
	    enc = ctx.mkAnd(enc, EncodingsCAT.satUnion("com-pso", "(co+fr)", "rfe", events, ctx));
	    enc = ctx.mkAnd(enc, EncodingsCAT.satIntersection("po", "RM", events, ctx));
	    enc = ctx.mkAnd(enc, EncodingsCAT.satUnion("po-pso", "(po&RM)", "mfence", events, ctx));
	    enc = ctx.mkAnd(enc, EncodingsCAT.satUnion("ghb-pso", "po-pso", "com-pso", events, ctx));
		return enc;
	}
	
	public static BoolExpr Consistent(Program program, Context ctx) throws Z3Exception {
		Set<Event> events = program.getEvents().stream().filter(e -> e instanceof MemEvent).collect(Collectors.toSet());
		return ctx.mkAnd(satAcyclic("(poloc+com)", events, ctx), satAcyclic("ghb-pso", events, ctx));
	}
	
	public static BoolExpr Inconsistent(Program program, Context ctx) throws Z3Exception {
		Set<Event> events = program.getEvents().stream().filter(e -> e instanceof MemEvent).collect(Collectors.toSet());
		BoolExpr enc = ctx.mkAnd(satCycleDef("(poloc+com)", events, ctx), satCycleDef("ghb-pso", events, ctx));
		enc = ctx.mkAnd(enc, ctx.mkOr(satCycle("(poloc+com)", events, ctx), satCycle("ghb-pso", events, ctx)));
		return enc;
	}
}