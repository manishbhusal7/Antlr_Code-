// Generated from Hello.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#startRule}.
	 * @param ctx the parse tree
	 */
	void enterStartRule(HelloParser.StartRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#startRule}.
	 * @param ctx the parse tree
	 */
	void exitStartRule(HelloParser.StartRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#greet}.
	 * @param ctx the parse tree
	 */
	void enterGreet(HelloParser.GreetContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#greet}.
	 * @param ctx the parse tree
	 */
	void exitGreet(HelloParser.GreetContext ctx);
}