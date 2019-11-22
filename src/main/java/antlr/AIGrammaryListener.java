// Generated from C:/Users/Dawid/git/antlr_assembler_interpreter/src/main\AIGrammary.g4 by ANTLR 4.7.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AIGrammaryParser}.
 */
public interface AIGrammaryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AIGrammaryParser#commendline_rule}.
	 * @param ctx the parse tree
	 */
	void enterCommendline_rule(AIGrammaryParser.Commendline_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link AIGrammaryParser#commendline_rule}.
	 * @param ctx the parse tree
	 */
	void exitCommendline_rule(AIGrammaryParser.Commendline_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link AIGrammaryParser#mov_xor_commend}.
	 * @param ctx the parse tree
	 */
	void enterMov_xor_commend(AIGrammaryParser.Mov_xor_commendContext ctx);
	/**
	 * Exit a parse tree produced by {@link AIGrammaryParser#mov_xor_commend}.
	 * @param ctx the parse tree
	 */
	void exitMov_xor_commend(AIGrammaryParser.Mov_xor_commendContext ctx);
	/**
	 * Enter a parse tree produced by {@link AIGrammaryParser#push_commend}.
	 * @param ctx the parse tree
	 */
	void enterPush_commend(AIGrammaryParser.Push_commendContext ctx);
	/**
	 * Exit a parse tree produced by {@link AIGrammaryParser#push_commend}.
	 * @param ctx the parse tree
	 */
	void exitPush_commend(AIGrammaryParser.Push_commendContext ctx);
	/**
	 * Enter a parse tree produced by {@link AIGrammaryParser#int_commend}.
	 * @param ctx the parse tree
	 */
	void enterInt_commend(AIGrammaryParser.Int_commendContext ctx);
	/**
	 * Exit a parse tree produced by {@link AIGrammaryParser#int_commend}.
	 * @param ctx the parse tree
	 */
	void exitInt_commend(AIGrammaryParser.Int_commendContext ctx);
	/**
	 * Enter a parse tree produced by {@link AIGrammaryParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(AIGrammaryParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AIGrammaryParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(AIGrammaryParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AIGrammaryParser#subexpression}.
	 * @param ctx the parse tree
	 */
	void enterSubexpression(AIGrammaryParser.SubexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AIGrammaryParser#subexpression}.
	 * @param ctx the parse tree
	 */
	void exitSubexpression(AIGrammaryParser.SubexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AIGrammaryParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(AIGrammaryParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AIGrammaryParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(AIGrammaryParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AIGrammaryParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(AIGrammaryParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link AIGrammaryParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(AIGrammaryParser.DataContext ctx);
}