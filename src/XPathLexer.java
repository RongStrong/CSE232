// Generated from src/XPath.g4 by ANTLR 4.7.1
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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, NOT=3, OR=4, AND=5, IS=6, DEQUAL=7, EQUAL=8, CEQUAL=9, 
		TEXT=10, LPAREN=11, RPAREN=12, LBRACKET=13, RBRACKET=14, SLASH=15, STAR=16, 
		DSLASH=17, DOT=18, DDOT=19, AT=20, COMMA=21, NAME=22, FILENAME=23, WHITESPACE=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "NOT", "OR", "AND", "IS", "DEQUAL", "EQUAL", "CEQUAL", 
		"TEXT", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "SLASH", "STAR", "DSLASH", 
		"DOT", "DDOT", "AT", "COMMA", "NAME", "FILENAME", "WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'doc'", "'\"'", "'not'", "'or'", "'and'", "'is'", "'=='", "'='", 
		"'eq'", "'text'", "'('", "')'", "'['", "']'", "'/'", "'*'", "'//'", "'.'", 
		"'..'", "'@'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "NOT", "OR", "AND", "IS", "DEQUAL", "EQUAL", "CEQUAL", 
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


	public XPathLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "XPath.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u0082\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\6\27n\n\27\r\27"+
		"\16\27o\3\30\6\30s\n\30\r\30\16\30t\3\30\3\30\3\30\3\30\3\30\3\31\6\31"+
		"}\n\31\r\31\16\31~\3\31\3\31\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\3\2\5\7\2//\62;C\\aac|\6\2\60;C\\aac|\5\2\13\f\17\17\"\"\2"+
		"\u0084\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5\67\3\2\2\2\79\3\2\2\2\t=\3\2\2\2"+
		"\13@\3\2\2\2\rD\3\2\2\2\17G\3\2\2\2\21J\3\2\2\2\23L\3\2\2\2\25O\3\2\2"+
		"\2\27T\3\2\2\2\31V\3\2\2\2\33X\3\2\2\2\35Z\3\2\2\2\37\\\3\2\2\2!^\3\2"+
		"\2\2#`\3\2\2\2%c\3\2\2\2\'e\3\2\2\2)h\3\2\2\2+j\3\2\2\2-m\3\2\2\2/r\3"+
		"\2\2\2\61|\3\2\2\2\63\64\7f\2\2\64\65\7q\2\2\65\66\7e\2\2\66\4\3\2\2\2"+
		"\678\7$\2\28\6\3\2\2\29:\7p\2\2:;\7q\2\2;<\7v\2\2<\b\3\2\2\2=>\7q\2\2"+
		">?\7t\2\2?\n\3\2\2\2@A\7c\2\2AB\7p\2\2BC\7f\2\2C\f\3\2\2\2DE\7k\2\2EF"+
		"\7u\2\2F\16\3\2\2\2GH\7?\2\2HI\7?\2\2I\20\3\2\2\2JK\7?\2\2K\22\3\2\2\2"+
		"LM\7g\2\2MN\7s\2\2N\24\3\2\2\2OP\7v\2\2PQ\7g\2\2QR\7z\2\2RS\7v\2\2S\26"+
		"\3\2\2\2TU\7*\2\2U\30\3\2\2\2VW\7+\2\2W\32\3\2\2\2XY\7]\2\2Y\34\3\2\2"+
		"\2Z[\7_\2\2[\36\3\2\2\2\\]\7\61\2\2] \3\2\2\2^_\7,\2\2_\"\3\2\2\2`a\7"+
		"\61\2\2ab\7\61\2\2b$\3\2\2\2cd\7\60\2\2d&\3\2\2\2ef\7\60\2\2fg\7\60\2"+
		"\2g(\3\2\2\2hi\7B\2\2i*\3\2\2\2jk\7.\2\2k,\3\2\2\2ln\t\2\2\2ml\3\2\2\2"+
		"no\3\2\2\2om\3\2\2\2op\3\2\2\2p.\3\2\2\2qs\t\3\2\2rq\3\2\2\2st\3\2\2\2"+
		"tr\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\7\60\2\2wx\7z\2\2xy\7o\2\2yz\7n\2\2z"+
		"\60\3\2\2\2{}\t\4\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\u0081\b\31\2\2\u0081\62\3\2\2\2\6\2ot~\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}