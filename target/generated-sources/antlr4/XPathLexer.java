// Generated from XPath.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XPathLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, NOT=4, OR=5, AND=6, IS=7, DEQUAL=8, EQUAL=9, CEQUAL=10, 
		TEXT=11, LPAREN=12, RPAREN=13, LBRACKET=14, RBRACKET=15, SLASH=16, STAR=17, 
		DSLASH=18, DOT=19, DDOT=20, AT=21, COMMA=22, NAME=23, FILENAME=24, WHITESPACE=25;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "NOT", "OR", "AND", "IS", "DEQUAL", "EQUAL", "CEQUAL", 
		"TEXT", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "SLASH", "STAR", "DSLASH", 
		"DOT", "DDOT", "AT", "COMMA", "NAME", "FILENAME", "WHITESPACE"
	};


	public XPathLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "XPath.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\33\u008d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\6\30y\n\30\r\30\16\30z\3\31\6\31~\n\31"+
		"\r\31\16\31\177\3\31\3\31\3\31\3\31\3\31\3\32\6\32\u0088\n\32\r\32\16"+
		"\32\u0089\3\32\3\32\2\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\3\2\5\7\2//\62;C\\aac|\6\2\60;C\\aac|\5\2\13\f\17\17\"\"\u008f"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5\67\3\2\2\2\7@\3\2\2\2\tD\3"+
		"\2\2\2\13H\3\2\2\2\rK\3\2\2\2\17O\3\2\2\2\21R\3\2\2\2\23U\3\2\2\2\25W"+
		"\3\2\2\2\27Z\3\2\2\2\31_\3\2\2\2\33a\3\2\2\2\35c\3\2\2\2\37e\3\2\2\2!"+
		"g\3\2\2\2#i\3\2\2\2%k\3\2\2\2\'n\3\2\2\2)p\3\2\2\2+s\3\2\2\2-u\3\2\2\2"+
		"/x\3\2\2\2\61}\3\2\2\2\63\u0087\3\2\2\2\65\66\7$\2\2\66\4\3\2\2\2\678"+
		"\7f\2\289\7q\2\29:\7e\2\2:;\7w\2\2;<\7o\2\2<=\7g\2\2=>\7p\2\2>?\7v\2\2"+
		"?\6\3\2\2\2@A\7f\2\2AB\7q\2\2BC\7e\2\2C\b\3\2\2\2DE\7p\2\2EF\7q\2\2FG"+
		"\7v\2\2G\n\3\2\2\2HI\7q\2\2IJ\7t\2\2J\f\3\2\2\2KL\7c\2\2LM\7p\2\2MN\7"+
		"f\2\2N\16\3\2\2\2OP\7k\2\2PQ\7u\2\2Q\20\3\2\2\2RS\7?\2\2ST\7?\2\2T\22"+
		"\3\2\2\2UV\7?\2\2V\24\3\2\2\2WX\7g\2\2XY\7s\2\2Y\26\3\2\2\2Z[\7v\2\2["+
		"\\\7g\2\2\\]\7z\2\2]^\7v\2\2^\30\3\2\2\2_`\7*\2\2`\32\3\2\2\2ab\7+\2\2"+
		"b\34\3\2\2\2cd\7]\2\2d\36\3\2\2\2ef\7_\2\2f \3\2\2\2gh\7\61\2\2h\"\3\2"+
		"\2\2ij\7,\2\2j$\3\2\2\2kl\7\61\2\2lm\7\61\2\2m&\3\2\2\2no\7\60\2\2o(\3"+
		"\2\2\2pq\7\60\2\2qr\7\60\2\2r*\3\2\2\2st\7B\2\2t,\3\2\2\2uv\7.\2\2v.\3"+
		"\2\2\2wy\t\2\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\60\3\2\2\2|"+
		"~\t\3\2\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0082\7\60\2\2\u0082\u0083\7z\2\2\u0083\u0084\7o"+
		"\2\2\u0084\u0085\7n\2\2\u0085\62\3\2\2\2\u0086\u0088\t\4\2\2\u0087\u0086"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008c\b\32\2\2\u008c\64\3\2\2\2\6\2z\177\u0089\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}