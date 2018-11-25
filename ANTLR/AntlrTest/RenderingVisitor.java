// Generated from Rendering.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RenderingParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RenderingVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RenderingParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(RenderingParser.DocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link RenderingParser#blocks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocks(RenderingParser.BlocksContext ctx);
	/**
	 * Visit a parse tree produced by the {@code STAR}
	 * labeled alternative in {@link RenderingParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTAR(RenderingParser.STARContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HEADER}
	 * labeled alternative in {@link RenderingParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHEADER(RenderingParser.HEADERContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HLINE}
	 * labeled alternative in {@link RenderingParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHLINE(RenderingParser.HLINEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLAINTEXT}
	 * labeled alternative in {@link RenderingParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLAINTEXT(RenderingParser.PLAINTEXTContext ctx);
}