// Generated from Model.g4 by ANTLR 4.7

package dartagnan;
import dartagnan.wmm.*;
import dartagnan.program.event.filter.*;
import java.util.List;
import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ModelParser}.
 */
public interface ModelListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ModelParser#mcm}.
	 * @param ctx the parse tree
	 */
	void enterMcm(ModelParser.McmContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#mcm}.
	 * @param ctx the parse tree
	 */
	void exitMcm(ModelParser.McmContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#axiom}.
	 * @param ctx the parse tree
	 */
	void enterAxiom(ModelParser.AxiomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#axiom}.
	 * @param ctx the parse tree
	 */
	void exitAxiom(ModelParser.AxiomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#reldef}.
	 * @param ctx the parse tree
	 */
	void enterReldef(ModelParser.ReldefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#reldef}.
	 * @param ctx the parse tree
	 */
	void exitReldef(ModelParser.ReldefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#filterdef}.
	 * @param ctx the parse tree
	 */
	void enterFilterdef(ModelParser.FilterdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#filterdef}.
	 * @param ctx the parse tree
	 */
	void exitFilterdef(ModelParser.FilterdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#fancyrel}.
	 * @param ctx the parse tree
	 */
	void enterFancyrel(ModelParser.FancyrelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#fancyrel}.
	 * @param ctx the parse tree
	 */
	void exitFancyrel(ModelParser.FancyrelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(ModelParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(ModelParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(ModelParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(ModelParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#filterRelation}.
	 * @param ctx the parse tree
	 */
	void enterFilterRelation(ModelParser.FilterRelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#filterRelation}.
	 * @param ctx the parse tree
	 */
	void exitFilterRelation(ModelParser.FilterRelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#eventFilter}.
	 * @param ctx the parse tree
	 */
	void enterEventFilter(ModelParser.EventFilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#eventFilter}.
	 * @param ctx the parse tree
	 */
	void exitEventFilter(ModelParser.EventFilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#basicEventFilter}.
	 * @param ctx the parse tree
	 */
	void enterBasicEventFilter(ModelParser.BasicEventFilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#basicEventFilter}.
	 * @param ctx the parse tree
	 */
	void exitBasicEventFilter(ModelParser.BasicEventFilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#atomics}.
	 * @param ctx the parse tree
	 */
	void enterAtomics(ModelParser.AtomicsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#atomics}.
	 * @param ctx the parse tree
	 */
	void exitAtomics(ModelParser.AtomicsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#sc}.
	 * @param ctx the parse tree
	 */
	void enterSc(ModelParser.ScContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#sc}.
	 * @param ctx the parse tree
	 */
	void exitSc(ModelParser.ScContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#relAqc}.
	 * @param ctx the parse tree
	 */
	void enterRelAqc(ModelParser.RelAqcContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#relAqc}.
	 * @param ctx the parse tree
	 */
	void exitRelAqc(ModelParser.RelAqcContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#release}.
	 * @param ctx the parse tree
	 */
	void enterRelease(ModelParser.ReleaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#release}.
	 * @param ctx the parse tree
	 */
	void exitRelease(ModelParser.ReleaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#acquire}.
	 * @param ctx the parse tree
	 */
	void enterAcquire(ModelParser.AcquireContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#acquire}.
	 * @param ctx the parse tree
	 */
	void exitAcquire(ModelParser.AcquireContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#cons}.
	 * @param ctx the parse tree
	 */
	void enterCons(ModelParser.ConsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#cons}.
	 * @param ctx the parse tree
	 */
	void exitCons(ModelParser.ConsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#relaxed}.
	 * @param ctx the parse tree
	 */
	void enterRelaxed(ModelParser.RelaxedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#relaxed}.
	 * @param ctx the parse tree
	 */
	void exitRelaxed(ModelParser.RelaxedContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#nonAtomic}.
	 * @param ctx the parse tree
	 */
	void enterNonAtomic(ModelParser.NonAtomicContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#nonAtomic}.
	 * @param ctx the parse tree
	 */
	void exitNonAtomic(ModelParser.NonAtomicContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#base}.
	 * @param ctx the parse tree
	 */
	void enterBase(ModelParser.BaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#base}.
	 * @param ctx the parse tree
	 */
	void exitBase(ModelParser.BaseContext ctx);
}