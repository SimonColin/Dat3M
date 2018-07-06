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
	 * Enter a parse tree produced by {@link ModelParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(ModelParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(ModelParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#axiomDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAxiomDefinition(ModelParser.AxiomDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#axiomDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAxiomDefinition(ModelParser.AxiomDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#letDefinition}.
	 * @param ctx the parse tree
	 */
	void enterLetDefinition(ModelParser.LetDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#letDefinition}.
	 * @param ctx the parse tree
	 */
	void exitLetDefinition(ModelParser.LetDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#letRecDefinition}.
	 * @param ctx the parse tree
	 */
	void enterLetRecDefinition(ModelParser.LetRecDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#letRecDefinition}.
	 * @param ctx the parse tree
	 */
	void exitLetRecDefinition(ModelParser.LetRecDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#showDefinition}.
	 * @param ctx the parse tree
	 */
	void enterShowDefinition(ModelParser.ShowDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#showDefinition}.
	 * @param ctx the parse tree
	 */
	void exitShowDefinition(ModelParser.ShowDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ModelParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ModelParser.ExpressionContext ctx);
}