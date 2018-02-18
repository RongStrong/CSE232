// Generated from src/XQuery.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XQueryParser}.
 */
public interface XQueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code xq_stringconst}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_stringconst(XQueryParser.Xq_stringconstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_stringconst}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_stringconst(XQueryParser.Xq_stringconstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xq_paren}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_paren(XQueryParser.Xq_parenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_paren}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_paren(XQueryParser.Xq_parenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xq_slash}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_slash(XQueryParser.Xq_slashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_slash}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_slash(XQueryParser.Xq_slashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xq_ap}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_ap(XQueryParser.Xq_apContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_ap}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_ap(XQueryParser.Xq_apContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xq_var}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_var(XQueryParser.Xq_varContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_var}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_var(XQueryParser.Xq_varContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xq_join}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_join(XQueryParser.Xq_joinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_join}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_join(XQueryParser.Xq_joinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xq_dslash}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_dslash(XQueryParser.Xq_dslashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_dslash}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_dslash(XQueryParser.Xq_dslashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xq_flwr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_flwr(XQueryParser.Xq_flwrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_flwr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_flwr(XQueryParser.Xq_flwrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xq_tag}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_tag(XQueryParser.Xq_tagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_tag}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_tag(XQueryParser.Xq_tagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xq_let}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_let(XQueryParser.Xq_letContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_let}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_let(XQueryParser.Xq_letContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xq_comma}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_comma(XQueryParser.Xq_commaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_comma}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_comma(XQueryParser.Xq_commaContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinClause(XQueryParser.JoinClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinClause(XQueryParser.JoinClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForClause(XQueryParser.ForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForClause(XQueryParser.ForClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#letClause}.
	 * @param ctx the parse tree
	 */
	void enterLetClause(XQueryParser.LetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#letClause}.
	 * @param ctx the parse tree
	 */
	void exitLetClause(XQueryParser.LetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(XQueryParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(XQueryParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void enterReturnClause(XQueryParser.ReturnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void exitReturnClause(XQueryParser.ReturnClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_and}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_and(XQueryParser.Cond_andContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_and}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_and(XQueryParser.Cond_andContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_empty}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_empty(XQueryParser.Cond_emptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_empty}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_empty(XQueryParser.Cond_emptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_eq}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_eq(XQueryParser.Cond_eqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_eq}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_eq(XQueryParser.Cond_eqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_ceq}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_ceq(XQueryParser.Cond_ceqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_ceq}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_ceq(XQueryParser.Cond_ceqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_deq}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_deq(XQueryParser.Cond_deqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_deq}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_deq(XQueryParser.Cond_deqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_is}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_is(XQueryParser.Cond_isContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_is}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_is(XQueryParser.Cond_isContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_satisfy}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_satisfy(XQueryParser.Cond_satisfyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_satisfy}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_satisfy(XQueryParser.Cond_satisfyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_paren}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_paren(XQueryParser.Cond_parenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_paren}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_paren(XQueryParser.Cond_parenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_not}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_not(XQueryParser.Cond_notContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_not}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_not(XQueryParser.Cond_notContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_or}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_or(XQueryParser.Cond_orContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_or}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_or(XQueryParser.Cond_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#joinAttr}.
	 * @param ctx the parse tree
	 */
	void enterJoinAttr(XQueryParser.JoinAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#joinAttr}.
	 * @param ctx the parse tree
	 */
	void exitJoinAttr(XQueryParser.JoinAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(XQueryParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(XQueryParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ap_child}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAp_child(XQueryParser.Ap_childContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ap_child}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAp_child(XQueryParser.Ap_childContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ap_all}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAp_all(XQueryParser.Ap_allContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ap_all}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAp_all(XQueryParser.Ap_allContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_dslash}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_dslash(XQueryParser.Rp_dslashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_dslash}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_dslash(XQueryParser.Rp_dslashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_star}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_star(XQueryParser.Rp_starContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_star}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_star(XQueryParser.Rp_starContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_dot}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_dot(XQueryParser.Rp_dotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_dot}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_dot(XQueryParser.Rp_dotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_comma}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_comma(XQueryParser.Rp_commaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_comma}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_comma(XQueryParser.Rp_commaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_ddot}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_ddot(XQueryParser.Rp_ddotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_ddot}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_ddot(XQueryParser.Rp_ddotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_text}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_text(XQueryParser.Rp_textContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_text}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_text(XQueryParser.Rp_textContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_tagName}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_tagName(XQueryParser.Rp_tagNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_tagName}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_tagName(XQueryParser.Rp_tagNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_filter}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_filter(XQueryParser.Rp_filterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_filter}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_filter(XQueryParser.Rp_filterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_paren}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_paren(XQueryParser.Rp_parenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_paren}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_paren(XQueryParser.Rp_parenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_at}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_at(XQueryParser.Rp_atContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_at}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_at(XQueryParser.Rp_atContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_slash}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_slash(XQueryParser.Rp_slashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_slash}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_slash(XQueryParser.Rp_slashContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#doc}.
	 * @param ctx the parse tree
	 */
	void enterDoc(XQueryParser.DocContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#doc}.
	 * @param ctx the parse tree
	 */
	void exitDoc(XQueryParser.DocContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_rp}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_rp(XQueryParser.Filter_rpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_rp}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_rp(XQueryParser.Filter_rpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_and}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_and(XQueryParser.Filter_andContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_and}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_and(XQueryParser.Filter_andContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_eq}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_eq(XQueryParser.Filter_eqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_eq}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_eq(XQueryParser.Filter_eqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_is}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_is(XQueryParser.Filter_isContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_is}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_is(XQueryParser.Filter_isContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_paren}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_paren(XQueryParser.Filter_parenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_paren}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_paren(XQueryParser.Filter_parenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_ceq}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_ceq(XQueryParser.Filter_ceqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_ceq}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_ceq(XQueryParser.Filter_ceqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_deq}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_deq(XQueryParser.Filter_deqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_deq}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_deq(XQueryParser.Filter_deqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_or}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_or(XQueryParser.Filter_orContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_or}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_or(XQueryParser.Filter_orContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_not}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_not(XQueryParser.Filter_notContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_not}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_not(XQueryParser.Filter_notContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterTagName(XQueryParser.TagNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitTagName(XQueryParser.TagNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#attName}.
	 * @param ctx the parse tree
	 */
	void enterAttName(XQueryParser.AttNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#attName}.
	 * @param ctx the parse tree
	 */
	void exitAttName(XQueryParser.AttNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#fileName}.
	 * @param ctx the parse tree
	 */
	void enterFileName(XQueryParser.FileNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#fileName}.
	 * @param ctx the parse tree
	 */
	void exitFileName(XQueryParser.FileNameContext ctx);
}