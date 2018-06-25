package dartagnan.wmm;

import static dartagnan.wmm.Encodings.satAcyclic;
import static dartagnan.wmm.Encodings.satCycle;
import static dartagnan.wmm.Encodings.satCycleDef;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import com.microsoft.z3.*;

import dartagnan.program.*;

public class Alpha {
	
	public static BoolExpr encode(Program program, boolean approx, Context ctx) throws Z3Exception {
		Set<Event> events = program.getEvents().stream().filter(e -> e instanceof MemEvent).collect(Collectors.toSet());
		Set<Event> eventsL = program.getEvents().stream().filter(e -> e instanceof MemEvent || e instanceof Local).collect(Collectors.toSet());

		// TODO: We do not actually need encodedRelations here
		Set<String> encodedRelations = new HashSet<>();
		Relation RW = new RelSetToSet("R", "W", "RW");
		Relation WR = new RelSetToSet("W", "R", "WR");
		Relation RM = new RelSetToSet("R", "M", "RM");
		Relation WW = new RelSetToSet("W", "W", "WW");
		BoolExpr enc = RW.encode(program, ctx, encodedRelations);
		enc = ctx.mkAnd(enc, WR.encode(program, ctx, encodedRelations));
		enc = ctx.mkAnd(enc, RM.encode(program, ctx, encodedRelations));
		enc = ctx.mkAnd(enc, WW.encode(program, ctx, encodedRelations));

		enc = ctx.mkAnd(enc, EncodingsCAT.satUnion("co", "fr", events, ctx));
	    enc = ctx.mkAnd(enc, EncodingsCAT.satUnion("com", "(co+fr)", "rf", events, ctx));
	    enc = ctx.mkAnd(enc, EncodingsCAT.satUnion("poloc", "com", events, ctx));
	    enc = ctx.mkAnd(enc, EncodingsCAT.satUnion("com-alpha", "(co+fr)", "rfe", events, ctx));
	    enc = ctx.mkAnd(enc, EncodingsCAT.satTransFixPoint("idd", eventsL, approx, ctx));
	    enc = ctx.mkAnd(enc, EncodingsCAT.satIntersection("data", "idd^+", "RW", eventsL, ctx));
	    enc = ctx.mkAnd(enc, EncodingsCAT.satIntersection("poloc", "WR", events, ctx));
	    enc = ctx.mkAnd(enc, EncodingsCAT.satUnion("data", "(poloc&WR)", events, ctx));
	    enc = ctx.mkAnd(enc, EncodingsCAT.satTransFixPoint("(data+(poloc&WR))", events, approx, ctx));
	    enc = ctx.mkAnd(enc, EncodingsCAT.satIntersection("(data+(poloc&WR))^+", "RM", events, ctx));
	    enc = ctx.mkAnd(enc, EncodingsCAT.satIntersection("ctrl", "RW", events, ctx));
	    enc = ctx.mkAnd(enc, EncodingsCAT.satUnion("(ctrl&RW)", "ctrlisync", events, ctx));
	    enc = ctx.mkAnd(enc, EncodingsCAT.satUnion("dp-alpha", "((ctrl&RW)+ctrlisync)", "((data+(poloc&WR))^+&RM)", events, ctx));
	    enc = ctx.mkAnd(enc, EncodingsCAT.satUnion("dp-alpha", "rf", events, ctx));
	    enc = ctx.mkAnd(enc, EncodingsCAT.satUnion("WW", "RM", events, ctx));
	    enc = ctx.mkAnd(enc, EncodingsCAT.satIntersection("(WW+RM)", "loc", events, ctx));
	    enc = ctx.mkAnd(enc, EncodingsCAT.satIntersection("po", "((WW+RM)&loc)", events, ctx));
	    enc = ctx.mkAnd(enc, EncodingsCAT.satUnion("po-alpha", "(po&((WW+RM)&loc))", "mfence", events, ctx));
	    enc = ctx.mkAnd(enc, EncodingsCAT.satUnion("ghb-alpha", "po-alpha", "com-alpha", events, ctx));
	    return enc;
	}

	public static BoolExpr Consistent(Program program, Context ctx) throws Z3Exception {
		Set<Event> events = program.getEvents().stream().filter(e -> e instanceof MemEvent).collect(Collectors.toSet());
		return ctx.mkAnd(satAcyclic("(poloc+com)", events, ctx), satAcyclic("(dp-alpha+rf)", events, ctx), satAcyclic("ghb-alpha", events, ctx));
	}
	
	public static BoolExpr Inconsistent(Program program, Context ctx) throws Z3Exception {
		Set<Event> events = program.getEvents().stream().filter(e -> e instanceof MemEvent).collect(Collectors.toSet());
		BoolExpr enc = ctx.mkAnd(satCycleDef("(poloc+com)", events, ctx), satCycleDef("(dp-alpha+rf)", events, ctx), satCycleDef("ghb-alpha", events, ctx));
		enc = ctx.mkAnd(enc, ctx.mkOr(satCycle("(poloc+com)", events, ctx), satCycle("(dp-alpha+rf)", events, ctx), satCycle("ghb-alpha", events, ctx)));
		return enc;
	}

	
}