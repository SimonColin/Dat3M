// Generated from Model.g4 by ANTLR 4.7

package dartagnan;
import dartagnan.wmm.*;
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
	 * Enter a parse tree produced by {@link ModelParser#setRelation}.
	 * @param ctx the parse tree
	 */
	void enterSetRelation(ModelParser.SetRelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#setRelation}.
	 * @param ctx the parse tree
	 */
	void exitSetRelation(ModelParser.SetRelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#relToSetRelation}.
	 * @param ctx the parse tree
	 */
	void enterRelToSetRelation(ModelParser.RelToSetRelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#relToSetRelation}.
	 * @param ctx the parse tree
	 */
	void exitRelToSetRelation(ModelParser.RelToSetRelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#setToRelRelation}.
	 * @param ctx the parse tree
	 */
	void enterSetToRelRelation(ModelParser.SetToRelRelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#setToRelRelation}.
	 * @param ctx the parse tree
	 */
	void exitSetToRelRelation(ModelParser.SetToRelRelationContext ctx);
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