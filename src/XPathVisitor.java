// Generated from src/XPath.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XPathParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface XPathVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code ap_child}
	 * labeled alternative in {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAp_child(XPathParser.Ap_childContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ap_all}
	 * labeled alternative in {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAp_all(XPathParser.Ap_allContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_dslash}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_dslash(XPathParser.Rp_dslashContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_star}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_star(XPathParser.Rp_starContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_dot}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_dot(XPathParser.Rp_dotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_comma}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_comma(XPathParser.Rp_commaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_ddot}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_ddot(XPathParser.Rp_ddotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_text}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_text(XPathParser.Rp_textContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_tagName}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_tagName(XPathParser.Rp_tagNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_filter}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_filter(XPathParser.Rp_filterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_paren}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_paren(XPathParser.Rp_parenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_at}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_at(XPathParser.Rp_atContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_slash}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_slash(XPathParser.Rp_slashContext ctx);
	/**
	 * Visit a parse tree produced by {@link XPathParser#doc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoc(XPathParser.DocContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filter_rp}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_rp(XPathParser.Filter_rpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filter_and}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_and(XPathParser.Filter_andContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filter_eq}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_eq(XPathParser.Filter_eqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filter_is}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_is(XPathParser.Filter_isContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filter_paren}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_paren(XPathParser.Filter_parenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filter_ceq}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_ceq(XPathParser.Filter_ceqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filter_deq}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_deq(XPathParser.Filter_deqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filter_or}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_or(XPathParser.Filter_orContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filter_not}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_not(XPathParser.Filter_notContext ctx);
	/**
	 * Visit a parse tree produced by {@link XPathParser#tagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagName(XPathParser.TagNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link XPathParser#attName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttName(XPathParser.AttNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link XPathParser#fileName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileName(XPathParser.FileNameContext ctx);
}