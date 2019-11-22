// Generated from C:/Users/Dawid/git/antlr_assembler_interpreter/src/main\AIGrammary.g4 by ANTLR 4.7.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AIGrammaryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AIGrammaryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AIGrammaryParser#commendline_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommendline_rule(AIGrammaryParser.Commendline_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link AIGrammaryParser#mov_xor_commend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMov_xor_commend(AIGrammaryParser.Mov_xor_commendContext ctx);
	/**
	 * Visit a parse tree produced by {@link AIGrammaryParser#push_commend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPush_commend(AIGrammaryParser.Push_commendContext ctx);
	/**
	 * Visit a parse tree produced by {@link AIGrammaryParser#int_commend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_commend(AIGrammaryParser.Int_commendContext ctx);
	/**
	 * Visit a parse tree produced by {@link AIGrammaryParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(AIGrammaryParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AIGrammaryParser#subexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubexpression(AIGrammaryParser.SubexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AIGrammaryParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(AIGrammaryParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AIGrammaryParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(AIGrammaryParser.DataContext ctx);
}