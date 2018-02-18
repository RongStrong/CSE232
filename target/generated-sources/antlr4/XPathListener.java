// Generated from XPath.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XPathParser}.
 */
public interface XPathListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code ap_child}
	 * labeled alternative in {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAp_child(@NotNull XPathParser.Ap_childContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ap_child}
	 * labeled alternative in {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAp_child(@NotNull XPathParser.Ap_childContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#fileName}.
	 * @param ctx the parse tree
	 */
	void enterFileName(@NotNull XPathParser.FileNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#fileName}.
	 * @param ctx the parse tree
	 */
	void exitFileName(@NotNull XPathParser.FileNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_ddot}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_ddot(@NotNull XPathParser.Rp_ddotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_ddot}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_ddot(@NotNull XPathParser.Rp_ddotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ap_all}
	 * labeled alternative in {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAp_all(@NotNull XPathParser.Ap_allContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ap_all}
	 * labeled alternative in {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAp_all(@NotNull XPathParser.Ap_allContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_rp}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_rp(@NotNull XPathParser.Filter_rpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_rp}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_rp(@NotNull XPathParser.Filter_rpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_dot}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_dot(@NotNull XPathParser.Rp_dotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_dot}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_dot(@NotNull XPathParser.Rp_dotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_comma}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_comma(@NotNull XPathParser.Rp_commaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_comma}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_comma(@NotNull XPathParser.Rp_commaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_text}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_text(@NotNull XPathParser.Rp_textContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_text}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_text(@NotNull XPathParser.Rp_textContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_tagName}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_tagName(@NotNull XPathParser.Rp_tagNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_tagName}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_tagName(@NotNull XPathParser.Rp_tagNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_slash}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_slash(@NotNull XPathParser.Rp_slashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_slash}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_slash(@NotNull XPathParser.Rp_slashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_dslash}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_dslash(@NotNull XPathParser.Rp_dslashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_dslash}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_dslash(@NotNull XPathParser.Rp_dslashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_and}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_and(@NotNull XPathParser.Filter_andContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_and}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_and(@NotNull XPathParser.Filter_andContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_eq}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_eq(@NotNull XPathParser.Filter_eqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_eq}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_eq(@NotNull XPathParser.Filter_eqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_star}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_star(@NotNull XPathParser.Rp_starContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_star}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_star(@NotNull XPathParser.Rp_starContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_is}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_is(@NotNull XPathParser.Filter_isContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_is}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_is(@NotNull XPathParser.Filter_isContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_paren}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_paren(@NotNull XPathParser.Filter_parenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_paren}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_paren(@NotNull XPathParser.Filter_parenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_filter}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_filter(@NotNull XPathParser.Rp_filterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_filter}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_filter(@NotNull XPathParser.Rp_filterContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterTagName(@NotNull XPathParser.TagNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitTagName(@NotNull XPathParser.TagNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_at}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_at(@NotNull XPathParser.Rp_atContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_at}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_at(@NotNull XPathParser.Rp_atContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#doc}.
	 * @param ctx the parse tree
	 */
	void enterDoc(@NotNull XPathParser.DocContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#doc}.
	 * @param ctx the parse tree
	 */
	void exitDoc(@NotNull XPathParser.DocContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_ceq}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_ceq(@NotNull XPathParser.Filter_ceqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_ceq}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_ceq(@NotNull XPathParser.Filter_ceqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_deq}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_deq(@NotNull XPathParser.Filter_deqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_deq}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_deq(@NotNull XPathParser.Filter_deqContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#attName}.
	 * @param ctx the parse tree
	 */
	void enterAttName(@NotNull XPathParser.AttNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#attName}.
	 * @param ctx the parse tree
	 */
	void exitAttName(@NotNull XPathParser.AttNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_paren}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_paren(@NotNull XPathParser.Rp_parenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_paren}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_paren(@NotNull XPathParser.Rp_parenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_or}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_or(@NotNull XPathParser.Filter_orContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_or}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_or(@NotNull XPathParser.Filter_orContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_not}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_not(@NotNull XPathParser.Filter_notContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_not}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_not(@NotNull XPathParser.Filter_notContext ctx);
}