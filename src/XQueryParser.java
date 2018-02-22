// Generated from src/XQuery.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XQueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, LANGLE=6, RANGLE=7, LBRACE=8, 
		RBRACE=9, JOIN=10, IN=11, LET=12, FOR=13, WHERE=14, RETURN=15, EMPTY=16, 
		SOME=17, SATISFIES=18, StringConstant=19, NOT=20, OR=21, AND=22, IS=23, 
		DEQUAL=24, EQUAL=25, CEQUAL=26, TEXT=27, LPAREN=28, RPAREN=29, LBRACKET=30, 
		RBRACKET=31, SLASH=32, STAR=33, DSLASH=34, DOT=35, DDOT=36, AT=37, COMMA=38, 
		NAME=39, FILENAME=40, WHITESPACE=41;
	public static final int
		RULE_xq = 0, RULE_joinClause = 1, RULE_forClause = 2, RULE_letClause = 3, 
		RULE_whereClause = 4, RULE_returnClause = 5, RULE_cond = 6, RULE_joinAttr = 7, 
		RULE_var = 8, RULE_ap = 9, RULE_rp = 10, RULE_doc = 11, RULE_filter = 12, 
		RULE_tagName = 13, RULE_attName = 14, RULE_fileName = 15;
	public static final String[] ruleNames = {
		"xq", "joinClause", "forClause", "letClause", "whereClause", "returnClause", 
		"cond", "joinAttr", "var", "ap", "rp", "doc", "filter", "tagName", "attName", 
		"fileName"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':='", "'$'", "'doc'", "'\"'", "'document'", "'<'", "'>'", "'{'", 
		"'}'", "'join'", "'in'", "'let'", "'for'", "'where'", "'return'", "'empty'", 
		"'some'", "'satisfies'", null, "'not'", "'or'", "'and'", "'is'", "'=='", 
		"'='", "'eq'", "'text'", "'('", "')'", "'['", "']'", "'/'", "'*'", "'//'", 
		"'.'", "'..'", "'@'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "LANGLE", "RANGLE", "LBRACE", "RBRACE", 
		"JOIN", "IN", "LET", "FOR", "WHERE", "RETURN", "EMPTY", "SOME", "SATISFIES", 
		"StringConstant", "NOT", "OR", "AND", "IS", "DEQUAL", "EQUAL", "CEQUAL", 
		"TEXT", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "SLASH", "STAR", "DSLASH", 
		"DOT", "DDOT", "AT", "COMMA", "NAME", "FILENAME", "WHITESPACE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "XQuery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XQueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class XqContext extends ParserRuleContext {
		public XqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xq; }
	 
		public XqContext() { }
		public void copyFrom(XqContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Xq_stringconstContext extends XqContext {
		public TerminalNode StringConstant() { return getToken(XQueryParser.StringConstant, 0); }
		public Xq_stringconstContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXq_stringconst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXq_stringconst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXq_stringconst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_parenContext extends XqContext {
		public TerminalNode LPAREN() { return getToken(XQueryParser.LPAREN, 0); }
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(XQueryParser.RPAREN, 0); }
		public Xq_parenContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXq_paren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXq_paren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXq_paren(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_slashContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(XQueryParser.SLASH, 0); }
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public Xq_slashContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXq_slash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXq_slash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXq_slash(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_apContext extends XqContext {
		public ApContext ap() {
			return getRuleContext(ApContext.class,0);
		}
		public Xq_apContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXq_ap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXq_ap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXq_ap(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_varContext extends XqContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Xq_varContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXq_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXq_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXq_var(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_joinContext extends XqContext {
		public JoinClauseContext joinClause() {
			return getRuleContext(JoinClauseContext.class,0);
		}
		public Xq_joinContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXq_join(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXq_join(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXq_join(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_dslashContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public TerminalNode DSLASH() { return getToken(XQueryParser.DSLASH, 0); }
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public Xq_dslashContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXq_dslash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXq_dslash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXq_dslash(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_flwrContext extends XqContext {
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public Xq_flwrContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXq_flwr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXq_flwr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXq_flwr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_tagContext extends XqContext {
		public List<TerminalNode> LANGLE() { return getTokens(XQueryParser.LANGLE); }
		public TerminalNode LANGLE(int i) {
			return getToken(XQueryParser.LANGLE, i);
		}
		public List<TagNameContext> tagName() {
			return getRuleContexts(TagNameContext.class);
		}
		public TagNameContext tagName(int i) {
			return getRuleContext(TagNameContext.class,i);
		}
		public List<TerminalNode> RANGLE() { return getTokens(XQueryParser.RANGLE); }
		public TerminalNode RANGLE(int i) {
			return getToken(XQueryParser.RANGLE, i);
		}
		public TerminalNode LBRACE() { return getToken(XQueryParser.LBRACE, 0); }
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(XQueryParser.RBRACE, 0); }
		public TerminalNode SLASH() { return getToken(XQueryParser.SLASH, 0); }
		public Xq_tagContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXq_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXq_tag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXq_tag(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_letContext extends XqContext {
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public Xq_letContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXq_let(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXq_let(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXq_let(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_commaContext extends XqContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(XQueryParser.COMMA, 0); }
		public Xq_commaContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXq_comma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXq_comma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXq_comma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XqContext xq() throws RecognitionException {
		return xq(0);
	}

	private XqContext xq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		XqContext _localctx = new XqContext(_ctx, _parentState);
		XqContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_xq, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				_localctx = new Xq_varContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(33);
				var();
				}
				break;
			case StringConstant:
				{
				_localctx = new Xq_stringconstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(34);
				match(StringConstant);
				}
				break;
			case T__2:
			case T__4:
				{
				_localctx = new Xq_apContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(35);
				ap();
				}
				break;
			case LPAREN:
				{
				_localctx = new Xq_parenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(36);
				match(LPAREN);
				setState(37);
				xq(0);
				setState(38);
				match(RPAREN);
				}
				break;
			case LANGLE:
				{
				_localctx = new Xq_tagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(40);
				match(LANGLE);
				setState(41);
				tagName();
				setState(42);
				match(RANGLE);
				setState(43);
				match(LBRACE);
				setState(44);
				xq(0);
				setState(45);
				match(RBRACE);
				setState(46);
				match(LANGLE);
				setState(47);
				match(SLASH);
				setState(48);
				tagName();
				setState(49);
				match(RANGLE);
				}
				break;
			case FOR:
				{
				_localctx = new Xq_flwrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(51);
				forClause();
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LET) {
					{
					setState(52);
					letClause();
					}
				}

				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(55);
					whereClause();
					}
				}

				setState(58);
				returnClause();
				}
				break;
			case LET:
				{
				_localctx = new Xq_letContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60);
				letClause();
				setState(61);
				xq(2);
				}
				break;
			case JOIN:
				{
				_localctx = new Xq_joinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(63);
				joinClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(75);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new Xq_commaContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(66);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(67);
						match(COMMA);
						setState(68);
						xq(8);
						}
						break;
					case 2:
						{
						_localctx = new Xq_slashContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(69);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(70);
						match(SLASH);
						setState(71);
						rp(0);
						}
						break;
					case 3:
						{
						_localctx = new Xq_dslashContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(72);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(73);
						match(DSLASH);
						setState(74);
						rp(0);
						}
						break;
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class JoinClauseContext extends ParserRuleContext {
		public TerminalNode JOIN() { return getToken(XQueryParser.JOIN, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(XQueryParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(XQueryParser.LPAREN, i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(XQueryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(XQueryParser.COMMA, i);
		}
		public List<JoinAttrContext> joinAttr() {
			return getRuleContexts(JoinAttrContext.class);
		}
		public JoinAttrContext joinAttr(int i) {
			return getRuleContext(JoinAttrContext.class,i);
		}
		public JoinClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterJoinClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitJoinClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitJoinClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinClauseContext joinClause() throws RecognitionException {
		JoinClauseContext _localctx = new JoinClauseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_joinClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(JOIN);
			setState(81);
			match(LPAREN);
			setState(82);
			xq(0);
			setState(83);
			match(COMMA);
			setState(84);
			xq(0);
			setState(85);
			match(COMMA);
			setState(86);
			joinAttr();
			setState(87);
			match(COMMA);
			setState(88);
			joinAttr();
			setState(89);
			match(LPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForClauseContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(XQueryParser.FOR, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<TerminalNode> IN() { return getTokens(XQueryParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(XQueryParser.IN, i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(XQueryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(XQueryParser.COMMA, i);
		}
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterForClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitForClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitForClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(FOR);
			setState(92);
			var();
			setState(93);
			match(IN);
			setState(94);
			xq(0);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(95);
				match(COMMA);
				setState(96);
				var();
				setState(97);
				match(IN);
				setState(98);
				xq(0);
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetClauseContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(XQueryParser.LET, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(XQueryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(XQueryParser.COMMA, i);
		}
		public LetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterLetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitLetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitLetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetClauseContext letClause() throws RecognitionException {
		LetClauseContext _localctx = new LetClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_letClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(LET);
			setState(106);
			var();
			setState(107);
			match(T__0);
			setState(108);
			xq(0);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(109);
				match(COMMA);
				setState(110);
				var();
				setState(111);
				match(T__0);
				setState(112);
				xq(0);
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(XQueryParser.WHERE, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(WHERE);
			setState(120);
			cond(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnClauseContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(XQueryParser.RETURN, 0); }
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public ReturnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterReturnClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitReturnClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitReturnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnClauseContext returnClause() throws RecognitionException {
		ReturnClauseContext _localctx = new ReturnClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_returnClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(RETURN);
			setState(123);
			xq(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondContext extends ParserRuleContext {
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	 
		public CondContext() { }
		public void copyFrom(CondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Cond_andContext extends CondContext {
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public TerminalNode AND() { return getToken(XQueryParser.AND, 0); }
		public Cond_andContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCond_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCond_and(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCond_and(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_emptyContext extends CondContext {
		public TerminalNode EMPTY() { return getToken(XQueryParser.EMPTY, 0); }
		public TerminalNode LPAREN() { return getToken(XQueryParser.LPAREN, 0); }
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(XQueryParser.RPAREN, 0); }
		public Cond_emptyContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCond_empty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCond_empty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCond_empty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_eqContext extends CondContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(XQueryParser.EQUAL, 0); }
		public Cond_eqContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCond_eq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCond_eq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCond_eq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_ceqContext extends CondContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TerminalNode CEQUAL() { return getToken(XQueryParser.CEQUAL, 0); }
		public Cond_ceqContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCond_ceq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCond_ceq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCond_ceq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_deqContext extends CondContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TerminalNode DEQUAL() { return getToken(XQueryParser.DEQUAL, 0); }
		public Cond_deqContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCond_deq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCond_deq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCond_deq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_isContext extends CondContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TerminalNode IS() { return getToken(XQueryParser.IS, 0); }
		public Cond_isContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCond_is(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCond_is(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCond_is(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_satisfyContext extends CondContext {
		public TerminalNode SOME() { return getToken(XQueryParser.SOME, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<TerminalNode> IN() { return getTokens(XQueryParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(XQueryParser.IN, i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TerminalNode SATISFIES() { return getToken(XQueryParser.SATISFIES, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(XQueryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(XQueryParser.COMMA, i);
		}
		public Cond_satisfyContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCond_satisfy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCond_satisfy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCond_satisfy(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_parenContext extends CondContext {
		public TerminalNode LPAREN() { return getToken(XQueryParser.LPAREN, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(XQueryParser.RPAREN, 0); }
		public Cond_parenContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCond_paren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCond_paren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCond_paren(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_notContext extends CondContext {
		public TerminalNode NOT() { return getToken(XQueryParser.NOT, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public Cond_notContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCond_not(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCond_not(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCond_not(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_orContext extends CondContext {
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public TerminalNode OR() { return getToken(XQueryParser.OR, 0); }
		public Cond_orContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCond_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCond_or(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCond_or(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new Cond_eqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(126);
				xq(0);
				setState(127);
				match(EQUAL);
				setState(128);
				xq(0);
				}
				break;
			case 2:
				{
				_localctx = new Cond_ceqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130);
				xq(0);
				setState(131);
				match(CEQUAL);
				setState(132);
				xq(0);
				}
				break;
			case 3:
				{
				_localctx = new Cond_deqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(134);
				xq(0);
				setState(135);
				match(DEQUAL);
				setState(136);
				xq(0);
				}
				break;
			case 4:
				{
				_localctx = new Cond_isContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(138);
				xq(0);
				setState(139);
				match(IS);
				setState(140);
				xq(0);
				}
				break;
			case 5:
				{
				_localctx = new Cond_emptyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				match(EMPTY);
				setState(143);
				match(LPAREN);
				setState(144);
				xq(0);
				setState(145);
				match(RPAREN);
				}
				break;
			case 6:
				{
				_localctx = new Cond_satisfyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				match(SOME);
				setState(148);
				var();
				setState(149);
				match(IN);
				setState(150);
				xq(0);
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(151);
					match(COMMA);
					setState(152);
					var();
					setState(153);
					match(IN);
					setState(154);
					xq(0);
					}
					}
					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(161);
				match(SATISFIES);
				setState(162);
				cond(5);
				}
				break;
			case 7:
				{
				_localctx = new Cond_parenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				match(LPAREN);
				setState(165);
				cond(0);
				setState(166);
				match(RPAREN);
				}
				break;
			case 8:
				{
				_localctx = new Cond_notContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				match(NOT);
				setState(169);
				cond(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(178);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new Cond_andContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(172);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(173);
						match(AND);
						setState(174);
						cond(4);
						}
						break;
					case 2:
						{
						_localctx = new Cond_orContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(175);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(176);
						match(OR);
						setState(177);
						cond(3);
						}
						break;
					}
					} 
				}
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class JoinAttrContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(XQueryParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(XQueryParser.RBRACKET, 0); }
		public List<TerminalNode> NAME() { return getTokens(XQueryParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(XQueryParser.NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(XQueryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(XQueryParser.COMMA, i);
		}
		public JoinAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterJoinAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitJoinAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitJoinAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinAttrContext joinAttr() throws RecognitionException {
		JoinAttrContext _localctx = new JoinAttrContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_joinAttr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(LBRACKET);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(184);
				match(NAME);
				}
			}

			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(187);
				match(COMMA);
				setState(188);
				match(NAME);
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(XQueryParser.NAME, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__1);
			setState(197);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ApContext extends ParserRuleContext {
		public ApContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ap; }
	 
		public ApContext() { }
		public void copyFrom(ApContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Ap_childContext extends ApContext {
		public DocContext doc() {
			return getRuleContext(DocContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(XQueryParser.SLASH, 0); }
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public Ap_childContext(ApContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterAp_child(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitAp_child(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitAp_child(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Ap_allContext extends ApContext {
		public DocContext doc() {
			return getRuleContext(DocContext.class,0);
		}
		public TerminalNode DSLASH() { return getToken(XQueryParser.DSLASH, 0); }
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public Ap_allContext(ApContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterAp_all(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitAp_all(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitAp_all(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApContext ap() throws RecognitionException {
		ApContext _localctx = new ApContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ap);
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new Ap_childContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				doc();
				setState(200);
				match(SLASH);
				setState(201);
				rp(0);
				}
				break;
			case 2:
				_localctx = new Ap_allContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				doc();
				setState(204);
				match(DSLASH);
				setState(205);
				rp(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RpContext extends ParserRuleContext {
		public RpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rp; }
	 
		public RpContext() { }
		public void copyFrom(RpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Rp_dslashContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public TerminalNode DSLASH() { return getToken(XQueryParser.DSLASH, 0); }
		public Rp_dslashContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRp_dslash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRp_dslash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRp_dslash(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_starContext extends RpContext {
		public TerminalNode STAR() { return getToken(XQueryParser.STAR, 0); }
		public Rp_starContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRp_star(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRp_star(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRp_star(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_dotContext extends RpContext {
		public TerminalNode DOT() { return getToken(XQueryParser.DOT, 0); }
		public Rp_dotContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRp_dot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRp_dot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRp_dot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_commaContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(XQueryParser.COMMA, 0); }
		public Rp_commaContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRp_comma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRp_comma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRp_comma(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_ddotContext extends RpContext {
		public TerminalNode DDOT() { return getToken(XQueryParser.DDOT, 0); }
		public Rp_ddotContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRp_ddot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRp_ddot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRp_ddot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_textContext extends RpContext {
		public TerminalNode TEXT() { return getToken(XQueryParser.TEXT, 0); }
		public TerminalNode LPAREN() { return getToken(XQueryParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(XQueryParser.RPAREN, 0); }
		public Rp_textContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRp_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRp_text(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRp_text(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_tagNameContext extends RpContext {
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public Rp_tagNameContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRp_tagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRp_tagName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRp_tagName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_filterContext extends RpContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(XQueryParser.LBRACKET, 0); }
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(XQueryParser.RBRACKET, 0); }
		public Rp_filterContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRp_filter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRp_filter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRp_filter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_parenContext extends RpContext {
		public TerminalNode LPAREN() { return getToken(XQueryParser.LPAREN, 0); }
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(XQueryParser.RPAREN, 0); }
		public Rp_parenContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRp_paren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRp_paren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRp_paren(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_atContext extends RpContext {
		public TerminalNode AT() { return getToken(XQueryParser.AT, 0); }
		public AttNameContext attName() {
			return getRuleContext(AttNameContext.class,0);
		}
		public Rp_atContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRp_at(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRp_at(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRp_at(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_slashContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public TerminalNode SLASH() { return getToken(XQueryParser.SLASH, 0); }
		public Rp_slashContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRp_slash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRp_slash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRp_slash(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RpContext rp() throws RecognitionException {
		return rp(0);
	}

	private RpContext rp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RpContext _localctx = new RpContext(_ctx, _parentState);
		RpContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_rp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				_localctx = new Rp_tagNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(210);
				tagName();
				}
				break;
			case STAR:
				{
				_localctx = new Rp_starContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(211);
				match(STAR);
				}
				break;
			case DOT:
				{
				_localctx = new Rp_dotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(212);
				match(DOT);
				}
				break;
			case DDOT:
				{
				_localctx = new Rp_ddotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(213);
				match(DDOT);
				}
				break;
			case TEXT:
				{
				_localctx = new Rp_textContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214);
				match(TEXT);
				setState(215);
				match(LPAREN);
				setState(216);
				match(RPAREN);
				}
				break;
			case AT:
				{
				_localctx = new Rp_atContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(217);
				match(AT);
				setState(218);
				attName();
				}
				break;
			case LPAREN:
				{
				_localctx = new Rp_parenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				match(LPAREN);
				setState(220);
				rp(0);
				setState(221);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(239);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new Rp_slashContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(225);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(226);
						match(SLASH);
						setState(227);
						rp(5);
						}
						break;
					case 2:
						{
						_localctx = new Rp_dslashContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(228);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(229);
						match(DSLASH);
						setState(230);
						rp(4);
						}
						break;
					case 3:
						{
						_localctx = new Rp_commaContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(231);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(232);
						match(COMMA);
						setState(233);
						rp(2);
						}
						break;
					case 4:
						{
						_localctx = new Rp_filterContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(234);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(235);
						match(LBRACKET);
						setState(236);
						filter(0);
						setState(237);
						match(RBRACKET);
						}
						break;
					}
					} 
				}
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DocContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(XQueryParser.LPAREN, 0); }
		public FileNameContext fileName() {
			return getRuleContext(FileNameContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(XQueryParser.RPAREN, 0); }
		public DocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterDoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitDoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitDoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocContext doc() throws RecognitionException {
		DocContext _localctx = new DocContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_doc);
		try {
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(T__2);
				setState(245);
				match(LPAREN);
				setState(246);
				match(T__3);
				setState(247);
				fileName();
				setState(248);
				match(T__3);
				setState(249);
				match(RPAREN);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				match(T__4);
				setState(252);
				match(LPAREN);
				setState(253);
				match(T__3);
				setState(254);
				fileName();
				setState(255);
				match(T__3);
				setState(256);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterContext extends ParserRuleContext {
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
	 
		public FilterContext() { }
		public void copyFrom(FilterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Filter_rpContext extends FilterContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public Filter_rpContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFilter_rp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFilter_rp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFilter_rp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Filter_andContext extends FilterContext {
		public List<FilterContext> filter() {
			return getRuleContexts(FilterContext.class);
		}
		public FilterContext filter(int i) {
			return getRuleContext(FilterContext.class,i);
		}
		public TerminalNode AND() { return getToken(XQueryParser.AND, 0); }
		public Filter_andContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFilter_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFilter_and(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFilter_and(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Filter_eqContext extends FilterContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(XQueryParser.EQUAL, 0); }
		public Filter_eqContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFilter_eq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFilter_eq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFilter_eq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Filter_isContext extends FilterContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public TerminalNode IS() { return getToken(XQueryParser.IS, 0); }
		public Filter_isContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFilter_is(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFilter_is(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFilter_is(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Filter_parenContext extends FilterContext {
		public TerminalNode LPAREN() { return getToken(XQueryParser.LPAREN, 0); }
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(XQueryParser.RPAREN, 0); }
		public Filter_parenContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFilter_paren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFilter_paren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFilter_paren(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Filter_ceqContext extends FilterContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public TerminalNode CEQUAL() { return getToken(XQueryParser.CEQUAL, 0); }
		public Filter_ceqContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFilter_ceq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFilter_ceq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFilter_ceq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Filter_deqContext extends FilterContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public TerminalNode DEQUAL() { return getToken(XQueryParser.DEQUAL, 0); }
		public Filter_deqContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFilter_deq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFilter_deq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFilter_deq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Filter_orContext extends FilterContext {
		public List<FilterContext> filter() {
			return getRuleContexts(FilterContext.class);
		}
		public FilterContext filter(int i) {
			return getRuleContext(FilterContext.class,i);
		}
		public TerminalNode OR() { return getToken(XQueryParser.OR, 0); }
		public Filter_orContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFilter_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFilter_or(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFilter_or(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Filter_notContext extends FilterContext {
		public TerminalNode NOT() { return getToken(XQueryParser.NOT, 0); }
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public Filter_notContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFilter_not(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFilter_not(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFilter_not(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		return filter(0);
	}

	private FilterContext filter(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FilterContext _localctx = new FilterContext(_ctx, _parentState);
		FilterContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_filter, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new Filter_rpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(261);
				rp(0);
				}
				break;
			case 2:
				{
				_localctx = new Filter_eqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(262);
				rp(0);
				setState(263);
				match(EQUAL);
				setState(264);
				rp(0);
				}
				break;
			case 3:
				{
				_localctx = new Filter_ceqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(266);
				rp(0);
				setState(267);
				match(CEQUAL);
				setState(268);
				rp(0);
				}
				break;
			case 4:
				{
				_localctx = new Filter_deqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(270);
				rp(0);
				setState(271);
				match(DEQUAL);
				setState(272);
				rp(0);
				}
				break;
			case 5:
				{
				_localctx = new Filter_isContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(274);
				rp(0);
				setState(275);
				match(IS);
				setState(276);
				rp(0);
				}
				break;
			case 6:
				{
				_localctx = new Filter_parenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(278);
				match(LPAREN);
				setState(279);
				filter(0);
				setState(280);
				match(RPAREN);
				}
				break;
			case 7:
				{
				_localctx = new Filter_notContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(282);
				match(NOT);
				setState(283);
				filter(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(294);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(292);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new Filter_andContext(new FilterContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_filter);
						setState(286);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(287);
						match(AND);
						setState(288);
						filter(4);
						}
						break;
					case 2:
						{
						_localctx = new Filter_orContext(new FilterContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_filter);
						setState(289);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(290);
						match(OR);
						setState(291);
						filter(3);
						}
						break;
					}
					} 
				}
				setState(296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TagNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(XQueryParser.NAME, 0); }
		public TagNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterTagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitTagName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitTagName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagNameContext tagName() throws RecognitionException {
		TagNameContext _localctx = new TagNameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tagName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(XQueryParser.NAME, 0); }
		public AttNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterAttName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitAttName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitAttName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttNameContext attName() throws RecognitionException {
		AttNameContext _localctx = new AttNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_attName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileNameContext extends ParserRuleContext {
		public TerminalNode FILENAME() { return getToken(XQueryParser.FILENAME, 0); }
		public FileNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFileName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFileName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFileName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileNameContext fileName() throws RecognitionException {
		FileNameContext _localctx = new FileNameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_fileName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(FILENAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return xq_sempred((XqContext)_localctx, predIndex);
		case 6:
			return cond_sempred((CondContext)_localctx, predIndex);
		case 10:
			return rp_sempred((RpContext)_localctx, predIndex);
		case 12:
			return filter_sempred((FilterContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean xq_sempred(XqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean rp_sempred(RpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 1);
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean filter_sempred(FilterContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0132\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\5\28\n\2\3\2\5\2;\n\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2C\n\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2N\n\2\f\2\16\2Q\13\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4g\n\4"+
		"\f\4\16\4j\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5u\n\5\f\5\16\5"+
		"x\13\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\7\b\u009f\n\b\f\b\16\b\u00a2\13\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\b\u00ad\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00b5\n\b\f\b"+
		"\16\b\u00b8\13\b\3\t\3\t\5\t\u00bc\n\t\3\t\3\t\7\t\u00c0\n\t\f\t\16\t"+
		"\u00c3\13\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00d2\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u00e2\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\7\f\u00f2\n\f\f\f\16\f\u00f5\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\5\r\u0105\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u011f\n\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0127"+
		"\n\16\f\16\16\16\u012a\13\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\2\6\2"+
		"\16\26\32\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\2\2\u014f\2B\3"+
		"\2\2\2\4R\3\2\2\2\6]\3\2\2\2\bk\3\2\2\2\ny\3\2\2\2\f|\3\2\2\2\16\u00ac"+
		"\3\2\2\2\20\u00b9\3\2\2\2\22\u00c6\3\2\2\2\24\u00d1\3\2\2\2\26\u00e1\3"+
		"\2\2\2\30\u0104\3\2\2\2\32\u011e\3\2\2\2\34\u012b\3\2\2\2\36\u012d\3\2"+
		"\2\2 \u012f\3\2\2\2\"#\b\2\1\2#C\5\22\n\2$C\7\25\2\2%C\5\24\13\2&\'\7"+
		"\36\2\2\'(\5\2\2\2()\7\37\2\2)C\3\2\2\2*+\7\b\2\2+,\5\34\17\2,-\7\t\2"+
		"\2-.\7\n\2\2./\5\2\2\2/\60\7\13\2\2\60\61\7\b\2\2\61\62\7\"\2\2\62\63"+
		"\5\34\17\2\63\64\7\t\2\2\64C\3\2\2\2\65\67\5\6\4\2\668\5\b\5\2\67\66\3"+
		"\2\2\2\678\3\2\2\28:\3\2\2\29;\5\n\6\2:9\3\2\2\2:;\3\2\2\2;<\3\2\2\2<"+
		"=\5\f\7\2=C\3\2\2\2>?\5\b\5\2?@\5\2\2\4@C\3\2\2\2AC\5\4\3\2B\"\3\2\2\2"+
		"B$\3\2\2\2B%\3\2\2\2B&\3\2\2\2B*\3\2\2\2B\65\3\2\2\2B>\3\2\2\2BA\3\2\2"+
		"\2CO\3\2\2\2DE\f\t\2\2EF\7(\2\2FN\5\2\2\nGH\f\b\2\2HI\7\"\2\2IN\5\26\f"+
		"\2JK\f\7\2\2KL\7$\2\2LN\5\26\f\2MD\3\2\2\2MG\3\2\2\2MJ\3\2\2\2NQ\3\2\2"+
		"\2OM\3\2\2\2OP\3\2\2\2P\3\3\2\2\2QO\3\2\2\2RS\7\f\2\2ST\7\36\2\2TU\5\2"+
		"\2\2UV\7(\2\2VW\5\2\2\2WX\7(\2\2XY\5\20\t\2YZ\7(\2\2Z[\5\20\t\2[\\\7\36"+
		"\2\2\\\5\3\2\2\2]^\7\17\2\2^_\5\22\n\2_`\7\r\2\2`h\5\2\2\2ab\7(\2\2bc"+
		"\5\22\n\2cd\7\r\2\2de\5\2\2\2eg\3\2\2\2fa\3\2\2\2gj\3\2\2\2hf\3\2\2\2"+
		"hi\3\2\2\2i\7\3\2\2\2jh\3\2\2\2kl\7\16\2\2lm\5\22\n\2mn\7\3\2\2nv\5\2"+
		"\2\2op\7(\2\2pq\5\22\n\2qr\7\3\2\2rs\5\2\2\2su\3\2\2\2to\3\2\2\2ux\3\2"+
		"\2\2vt\3\2\2\2vw\3\2\2\2w\t\3\2\2\2xv\3\2\2\2yz\7\20\2\2z{\5\16\b\2{\13"+
		"\3\2\2\2|}\7\21\2\2}~\5\2\2\2~\r\3\2\2\2\177\u0080\b\b\1\2\u0080\u0081"+
		"\5\2\2\2\u0081\u0082\7\33\2\2\u0082\u0083\5\2\2\2\u0083\u00ad\3\2\2\2"+
		"\u0084\u0085\5\2\2\2\u0085\u0086\7\34\2\2\u0086\u0087\5\2\2\2\u0087\u00ad"+
		"\3\2\2\2\u0088\u0089\5\2\2\2\u0089\u008a\7\32\2\2\u008a\u008b\5\2\2\2"+
		"\u008b\u00ad\3\2\2\2\u008c\u008d\5\2\2\2\u008d\u008e\7\31\2\2\u008e\u008f"+
		"\5\2\2\2\u008f\u00ad\3\2\2\2\u0090\u0091\7\22\2\2\u0091\u0092\7\36\2\2"+
		"\u0092\u0093\5\2\2\2\u0093\u0094\7\37\2\2\u0094\u00ad\3\2\2\2\u0095\u0096"+
		"\7\23\2\2\u0096\u0097\5\22\n\2\u0097\u0098\7\r\2\2\u0098\u00a0\5\2\2\2"+
		"\u0099\u009a\7(\2\2\u009a\u009b\5\22\n\2\u009b\u009c\7\r\2\2\u009c\u009d"+
		"\5\2\2\2\u009d\u009f\3\2\2\2\u009e\u0099\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a3\u00a4\7\24\2\2\u00a4\u00a5\5\16\b\7\u00a5\u00ad\3\2\2\2\u00a6"+
		"\u00a7\7\36\2\2\u00a7\u00a8\5\16\b\2\u00a8\u00a9\7\37\2\2\u00a9\u00ad"+
		"\3\2\2\2\u00aa\u00ab\7\26\2\2\u00ab\u00ad\5\16\b\3\u00ac\177\3\2\2\2\u00ac"+
		"\u0084\3\2\2\2\u00ac\u0088\3\2\2\2\u00ac\u008c\3\2\2\2\u00ac\u0090\3\2"+
		"\2\2\u00ac\u0095\3\2\2\2\u00ac\u00a6\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad"+
		"\u00b6\3\2\2\2\u00ae\u00af\f\5\2\2\u00af\u00b0\7\30\2\2\u00b0\u00b5\5"+
		"\16\b\6\u00b1\u00b2\f\4\2\2\u00b2\u00b3\7\27\2\2\u00b3\u00b5\5\16\b\5"+
		"\u00b4\u00ae\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4"+
		"\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\17\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9"+
		"\u00bb\7 \2\2\u00ba\u00bc\7)\2\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2"+
		"\2\u00bc\u00c1\3\2\2\2\u00bd\u00be\7(\2\2\u00be\u00c0\7)\2\2\u00bf\u00bd"+
		"\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\7!\2\2\u00c5\21\3\2\2\2"+
		"\u00c6\u00c7\7\4\2\2\u00c7\u00c8\7)\2\2\u00c8\23\3\2\2\2\u00c9\u00ca\5"+
		"\30\r\2\u00ca\u00cb\7\"\2\2\u00cb\u00cc\5\26\f\2\u00cc\u00d2\3\2\2\2\u00cd"+
		"\u00ce\5\30\r\2\u00ce\u00cf\7$\2\2\u00cf\u00d0\5\26\f\2\u00d0\u00d2\3"+
		"\2\2\2\u00d1\u00c9\3\2\2\2\u00d1\u00cd\3\2\2\2\u00d2\25\3\2\2\2\u00d3"+
		"\u00d4\b\f\1\2\u00d4\u00e2\5\34\17\2\u00d5\u00e2\7#\2\2\u00d6\u00e2\7"+
		"%\2\2\u00d7\u00e2\7&\2\2\u00d8\u00d9\7\35\2\2\u00d9\u00da\7\36\2\2\u00da"+
		"\u00e2\7\37\2\2\u00db\u00dc\7\'\2\2\u00dc\u00e2\5\36\20\2\u00dd\u00de"+
		"\7\36\2\2\u00de\u00df\5\26\f\2\u00df\u00e0\7\37\2\2\u00e0\u00e2\3\2\2"+
		"\2\u00e1\u00d3\3\2\2\2\u00e1\u00d5\3\2\2\2\u00e1\u00d6\3\2\2\2\u00e1\u00d7"+
		"\3\2\2\2\u00e1\u00d8\3\2\2\2\u00e1\u00db\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e2"+
		"\u00f3\3\2\2\2\u00e3\u00e4\f\6\2\2\u00e4\u00e5\7\"\2\2\u00e5\u00f2\5\26"+
		"\f\7\u00e6\u00e7\f\5\2\2\u00e7\u00e8\7$\2\2\u00e8\u00f2\5\26\f\6\u00e9"+
		"\u00ea\f\3\2\2\u00ea\u00eb\7(\2\2\u00eb\u00f2\5\26\f\4\u00ec\u00ed\f\4"+
		"\2\2\u00ed\u00ee\7 \2\2\u00ee\u00ef\5\32\16\2\u00ef\u00f0\7!\2\2\u00f0"+
		"\u00f2\3\2\2\2\u00f1\u00e3\3\2\2\2\u00f1\u00e6\3\2\2\2\u00f1\u00e9\3\2"+
		"\2\2\u00f1\u00ec\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\27\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\7\5\2"+
		"\2\u00f7\u00f8\7\36\2\2\u00f8\u00f9\7\6\2\2\u00f9\u00fa\5 \21\2\u00fa"+
		"\u00fb\7\6\2\2\u00fb\u00fc\7\37\2\2\u00fc\u0105\3\2\2\2\u00fd\u00fe\7"+
		"\7\2\2\u00fe\u00ff\7\36\2\2\u00ff\u0100\7\6\2\2\u0100\u0101\5 \21\2\u0101"+
		"\u0102\7\6\2\2\u0102\u0103\7\37\2\2\u0103\u0105\3\2\2\2\u0104\u00f6\3"+
		"\2\2\2\u0104\u00fd\3\2\2\2\u0105\31\3\2\2\2\u0106\u0107\b\16\1\2\u0107"+
		"\u011f\5\26\f\2\u0108\u0109\5\26\f\2\u0109\u010a\7\33\2\2\u010a\u010b"+
		"\5\26\f\2\u010b\u011f\3\2\2\2\u010c\u010d\5\26\f\2\u010d\u010e\7\34\2"+
		"\2\u010e\u010f\5\26\f\2\u010f\u011f\3\2\2\2\u0110\u0111\5\26\f\2\u0111"+
		"\u0112\7\32\2\2\u0112\u0113\5\26\f\2\u0113\u011f\3\2\2\2\u0114\u0115\5"+
		"\26\f\2\u0115\u0116\7\31\2\2\u0116\u0117\5\26\f\2\u0117\u011f\3\2\2\2"+
		"\u0118\u0119\7\36\2\2\u0119\u011a\5\32\16\2\u011a\u011b\7\37\2\2\u011b"+
		"\u011f\3\2\2\2\u011c\u011d\7\26\2\2\u011d\u011f\5\32\16\3\u011e\u0106"+
		"\3\2\2\2\u011e\u0108\3\2\2\2\u011e\u010c\3\2\2\2\u011e\u0110\3\2\2\2\u011e"+
		"\u0114\3\2\2\2\u011e\u0118\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0128\3\2"+
		"\2\2\u0120\u0121\f\5\2\2\u0121\u0122\7\30\2\2\u0122\u0127\5\32\16\6\u0123"+
		"\u0124\f\4\2\2\u0124\u0125\7\27\2\2\u0125\u0127\5\32\16\5\u0126\u0120"+
		"\3\2\2\2\u0126\u0123\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\33\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012c\7)\2\2"+
		"\u012c\35\3\2\2\2\u012d\u012e\7)\2\2\u012e\37\3\2\2\2\u012f\u0130\7*\2"+
		"\2\u0130!\3\2\2\2\27\67:BMOhv\u00a0\u00ac\u00b4\u00b6\u00bb\u00c1\u00d1"+
		"\u00e1\u00f1\u00f3\u0104\u011e\u0126\u0128";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}