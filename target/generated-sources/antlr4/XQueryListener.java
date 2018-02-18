// Generated from XQuery.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XQueryParser}.
 */
public interface XQueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link XQueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(@NotNull XQueryParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(@NotNull XQueryParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#fileName}.
	 * @param ctx the parse tree
	 */
	void enterFileName(@NotNull XQueryParser.FileNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#fileName}.
	 * @param ctx the parse tree
	 */
	void exitFileName(@NotNull XQueryParser.FileNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xq_dslash}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_dslash(@NotNull XQueryParser.Xq_dslashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_dslash}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_dslash(@NotNull XQueryParser.Xq_dslashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xq_flwr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_flwr(@NotNull XQueryParser.Xq_flwrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_flwr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_flwr(@NotNull XQueryParser.Xq_flwrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_or}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_or(@NotNull XQueryParser.Cond_orContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_or}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_or(@NotNull XQueryParser.Cond_orContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_rp}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_rp(@NotNull XQueryParser.Filter_rpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_rp}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_rp(@NotNull XQueryParser.Filter_rpContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#letClause}.
	 * @param ctx the parse tree
	 */
	void enterLetClause(@NotNull XQueryParser.LetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#letClause}.
	 * @param ctx the parse tree
	 */
	void exitLetClause(@NotNull XQueryParser.LetClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_dot}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_dot(@NotNull XQueryParser.Rp_dotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_dot}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_dot(@NotNull XQueryParser.Rp_dotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_text}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_text(@NotNull XQueryParser.Rp_textContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_text}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_text(@NotNull XQueryParser.Rp_textContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_tagName}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_tagName(@NotNull XQueryParser.Rp_tagNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_tagName}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_tagName(@NotNull XQueryParser.Rp_tagNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_paren}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_paren(@NotNull XQueryParser.Cond_parenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_paren}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_paren(@NotNull XQueryParser.Cond_parenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xq_join}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_join(@NotNull XQueryParser.Xq_joinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_join}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_join(@NotNull XQueryParser.Xq_joinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_slash}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_slash(@NotNull XQueryParser.Rp_slashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_slash}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_slash(@NotNull XQueryParser.Rp_slashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_dslash}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_dslash(@NotNull XQueryParser.Rp_dslashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_dslash}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_dslash(@NotNull XQueryParser.Rp_dslashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_eq}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_eq(@NotNull XQueryParser.Filter_eqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_eq}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_eq(@NotNull XQueryParser.Filter_eqContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(@NotNull XQueryParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(@NotNull XQueryParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_star}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_star(@NotNull XQueryParser.Rp_starContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_star}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_star(@NotNull XQueryParser.Rp_starContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_is}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_is(@NotNull XQueryParser.Filter_isContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_is}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_is(@NotNull XQueryParser.Filter_isContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_at}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_at(@NotNull XQueryParser.Rp_atContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_at}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_at(@NotNull XQueryParser.Rp_atContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void enterReturnClause(@NotNull XQueryParser.ReturnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void exitReturnClause(@NotNull XQueryParser.ReturnClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_deq}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_deq(@NotNull XQueryParser.Cond_deqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_deq}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_deq(@NotNull XQueryParser.Cond_deqContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#doc}.
	 * @param ctx the parse tree
	 */
	void enterDoc(@NotNull XQueryParser.DocContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#doc}.
	 * @param ctx the parse tree
	 */
	void exitDoc(@NotNull XQueryParser.DocContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_deq}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_deq(@NotNull XQueryParser.Filter_deqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_deq}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_deq(@NotNull XQueryParser.Filter_deqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_paren}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_paren(@NotNull XQueryParser.Rp_parenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_paren}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_paren(@NotNull XQueryParser.Rp_parenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ap_child}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAp_child(@NotNull XQueryParser.Ap_childContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ap_child}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAp_child(@NotNull XQueryParser.Ap_childContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xq_stringconst}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_stringconst(@NotNull XQueryParser.Xq_stringconstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_stringconst}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_stringconst(@NotNull XQueryParser.Xq_stringconstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_eq}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_eq(@NotNull XQueryParser.Cond_eqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_eq}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_eq(@NotNull XQueryParser.Cond_eqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_is}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_is(@NotNull XQueryParser.Cond_isContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_is}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_is(@NotNull XQueryParser.Cond_isContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_ddot}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_ddot(@NotNull XQueryParser.Rp_ddotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_ddot}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_ddot(@NotNull XQueryParser.Rp_ddotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xq_var}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_var(@NotNull XQueryParser.Xq_varContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_var}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_var(@NotNull XQueryParser.Xq_varContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ap_all}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAp_all(@NotNull XQueryParser.Ap_allContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ap_all}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAp_all(@NotNull XQueryParser.Ap_allContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#joinAttr}.
	 * @param ctx the parse tree
	 */
	void enterJoinAttr(@NotNull XQueryParser.JoinAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#joinAttr}.
	 * @param ctx the parse tree
	 */
	void exitJoinAttr(@NotNull XQueryParser.JoinAttrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_empty}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_empty(@NotNull XQueryParser.Cond_emptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_empty}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_empty(@NotNull XQueryParser.Cond_emptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_comma}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_comma(@NotNull XQueryParser.Rp_commaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_comma}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_comma(@NotNull XQueryParser.Rp_commaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_and}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_and(@NotNull XQueryParser.Filter_andContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_and}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_and(@NotNull XQueryParser.Filter_andContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xq_paren}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_paren(@NotNull XQueryParser.Xq_parenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_paren}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_paren(@NotNull XQueryParser.Xq_parenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xq_slash}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_slash(@NotNull XQueryParser.Xq_slashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_slash}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_slash(@NotNull XQueryParser.Xq_slashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_paren}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_paren(@NotNull XQueryParser.Filter_parenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_paren}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_paren(@NotNull XQueryParser.Filter_parenContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinClause(@NotNull XQueryParser.JoinClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinClause(@NotNull XQueryParser.JoinClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_filter}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_filter(@NotNull XQueryParser.Rp_filterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_filter}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_filter(@NotNull XQueryParser.Rp_filterContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterTagName(@NotNull XQueryParser.TagNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitTagName(@NotNull XQueryParser.TagNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_and}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_and(@NotNull XQueryParser.Cond_andContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_and}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_and(@NotNull XQueryParser.Cond_andContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_ceq}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_ceq(@NotNull XQueryParser.Cond_ceqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_ceq}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_ceq(@NotNull XQueryParser.Cond_ceqContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForClause(@NotNull XQueryParser.ForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForClause(@NotNull XQueryParser.ForClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xq_ap}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_ap(@NotNull XQueryParser.Xq_apContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_ap}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_ap(@NotNull XQueryParser.Xq_apContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_satisfy}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_satisfy(@NotNull XQueryParser.Cond_satisfyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_satisfy}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_satisfy(@NotNull XQueryParser.Cond_satisfyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_ceq}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_ceq(@NotNull XQueryParser.Filter_ceqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_ceq}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_ceq(@NotNull XQueryParser.Filter_ceqContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#attName}.
	 * @param ctx the parse tree
	 */
	void enterAttName(@NotNull XQueryParser.AttNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#attName}.
	 * @param ctx the parse tree
	 */
	void exitAttName(@NotNull XQueryParser.AttNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_not}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_not(@NotNull XQueryParser.Cond_notContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_not}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_not(@NotNull XQueryParser.Cond_notContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_or}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_or(@NotNull XQueryParser.Filter_orContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_or}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_or(@NotNull XQueryParser.Filter_orContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xq_tag}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_tag(@NotNull XQueryParser.Xq_tagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_tag}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_tag(@NotNull XQueryParser.Xq_tagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xq_let}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_let(@NotNull XQueryParser.Xq_letContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_let}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_let(@NotNull XQueryParser.Xq_letContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xq_comma}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_comma(@NotNull XQueryParser.Xq_commaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_comma}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_comma(@NotNull XQueryParser.Xq_commaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_not}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_not(@NotNull XQueryParser.Filter_notContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_not}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_not(@NotNull XQueryParser.Filter_notContext ctx);
}