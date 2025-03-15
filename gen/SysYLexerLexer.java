// Generated from C:/Users/taojian/nju-compiler/src/SysYLexer.g4 by ANTLR 4.13.2

package simpleexpr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SysYLexerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ASSIGN=1, BType=2, IF=3, ELSE=4, WHILE=5, BREAK=6, VOID=7, CONST=8, SEMI=9, 
		PRINT=10, MUL=11, DIV=12, PLUS=13, MINUS=14, LPAREN=15, RPAREN=16, LBR=17, 
		RBR=18, LB=19, RB=20, COMMA=21, LT=22, GT=23, LE=24, GE=25, EQ=26, NEQ=27, 
		NOT=28, AND=29, OR=30, MOD=31, CONTINUE=32, RETURN=33, IDENT=34, NUMBER=35, 
		IntConst=36, DecimalConst=37, OctalConst=38, HexadecimalConst=39, WS=40, 
		SL_COMMENT=41, DOC_COMMENT=42, ML_COMMENT=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ASSIGN", "BType", "IF", "ELSE", "WHILE", "BREAK", "VOID", "CONST", "SEMI", 
			"PRINT", "MUL", "DIV", "PLUS", "MINUS", "LPAREN", "RPAREN", "LBR", "RBR", 
			"LB", "RB", "COMMA", "LT", "GT", "LE", "GE", "EQ", "NEQ", "NOT", "AND", 
			"OR", "MOD", "CONTINUE", "RETURN", "IDENT", "NUMBER", "IntConst", "DecimalConst", 
			"OctalConst", "HexadecimalConst", "WS", "SL_COMMENT", "DOC_COMMENT", 
			"ML_COMMENT", "LETTER", "DIGIT", "WORD", "HexadecimalPrefix", "NonzeroDigit", 
			"OctalDigit", "HexadecimalDigit", "IndentifierNondigit", "Indentifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'int'", "'if'", "'else'", "'while'", "'break'", "'void'", 
			"'const'", "';'", "'print'", "'*'", "'/'", "'+'", "'-'", "'('", "')'", 
			"'['", "']'", "'{'", "'}'", "','", "'<'", "'>'", "'<='", "'>='", "'=='", 
			"'!='", "'!'", "'&&'", "'||'", "'%'", "'continue'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ASSIGN", "BType", "IF", "ELSE", "WHILE", "BREAK", "VOID", "CONST", 
			"SEMI", "PRINT", "MUL", "DIV", "PLUS", "MINUS", "LPAREN", "RPAREN", "LBR", 
			"RBR", "LB", "RB", "COMMA", "LT", "GT", "LE", "GE", "EQ", "NEQ", "NOT", 
			"AND", "OR", "MOD", "CONTINUE", "RETURN", "IDENT", "NUMBER", "IntConst", 
			"DecimalConst", "OctalConst", "HexadecimalConst", "WS", "SL_COMMENT", 
			"DOC_COMMENT", "ML_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public SysYLexerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SysYLexer.g4"; }

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
		"\u0004\u0000+\u0142\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0005!\u00d9\b!\n!"+
		"\f!\u00dc\t!\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0003#\u00e3\b#\u0001"+
		"$\u0001$\u0005$\u00e7\b$\n$\f$\u00ea\t$\u0001%\u0001%\u0005%\u00ee\b%"+
		"\n%\f%\u00f1\t%\u0001&\u0001&\u0004&\u00f5\b&\u000b&\f&\u00f6\u0001\'"+
		"\u0004\'\u00fa\b\'\u000b\'\f\'\u00fb\u0001\'\u0001\'\u0001(\u0001(\u0001"+
		"(\u0001(\u0005(\u0104\b(\n(\f(\u0107\t(\u0001(\u0001(\u0001(\u0001(\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0005)\u0112\b)\n)\f)\u0115\t)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0005*\u0120\b*\n*"+
		"\f*\u0123\t*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001,\u0001"+
		",\u0001-\u0001-\u0001-\u0003-\u0131\b-\u0001.\u0001.\u0001.\u0001.\u0003"+
		".\u0137\b.\u0001/\u0001/\u00010\u00010\u00011\u00011\u00012\u00012\u0001"+
		"3\u00013\u0003\u0105\u0113\u0121\u00004\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b"+
		"7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U+W\u0000Y\u0000["+
		"\u0000]\u0000_\u0000a\u0000c\u0000e\u0000g\u0000\u0001\u0000\u0007\u0003"+
		"\u0000\t\n\r\r  \u0002\u0000AZaz\u0001\u000009\u0001\u000019\u0001\u0000"+
		"07\u0003\u000009AFaf\u0003\u000009AZaz\u0145\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
		"\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000"+
		"\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001"+
		"\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000"+
		"\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000"+
		"\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?"+
		"\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000"+
		"\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000"+
		"\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M"+
		"\u0001\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000"+
		"\u0000\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000"+
		"\u0001i\u0001\u0000\u0000\u0000\u0003k\u0001\u0000\u0000\u0000\u0005o"+
		"\u0001\u0000\u0000\u0000\u0007r\u0001\u0000\u0000\u0000\tw\u0001\u0000"+
		"\u0000\u0000\u000b}\u0001\u0000\u0000\u0000\r\u0083\u0001\u0000\u0000"+
		"\u0000\u000f\u0088\u0001\u0000\u0000\u0000\u0011\u008e\u0001\u0000\u0000"+
		"\u0000\u0013\u0090\u0001\u0000\u0000\u0000\u0015\u0096\u0001\u0000\u0000"+
		"\u0000\u0017\u0098\u0001\u0000\u0000\u0000\u0019\u009a\u0001\u0000\u0000"+
		"\u0000\u001b\u009c\u0001\u0000\u0000\u0000\u001d\u009e\u0001\u0000\u0000"+
		"\u0000\u001f\u00a0\u0001\u0000\u0000\u0000!\u00a2\u0001\u0000\u0000\u0000"+
		"#\u00a4\u0001\u0000\u0000\u0000%\u00a6\u0001\u0000\u0000\u0000\'\u00a8"+
		"\u0001\u0000\u0000\u0000)\u00aa\u0001\u0000\u0000\u0000+\u00ac\u0001\u0000"+
		"\u0000\u0000-\u00ae\u0001\u0000\u0000\u0000/\u00b0\u0001\u0000\u0000\u0000"+
		"1\u00b3\u0001\u0000\u0000\u00003\u00b6\u0001\u0000\u0000\u00005\u00b9"+
		"\u0001\u0000\u0000\u00007\u00bc\u0001\u0000\u0000\u00009\u00be\u0001\u0000"+
		"\u0000\u0000;\u00c1\u0001\u0000\u0000\u0000=\u00c4\u0001\u0000\u0000\u0000"+
		"?\u00c6\u0001\u0000\u0000\u0000A\u00cf\u0001\u0000\u0000\u0000C\u00d6"+
		"\u0001\u0000\u0000\u0000E\u00dd\u0001\u0000\u0000\u0000G\u00e2\u0001\u0000"+
		"\u0000\u0000I\u00e4\u0001\u0000\u0000\u0000K\u00eb\u0001\u0000\u0000\u0000"+
		"M\u00f2\u0001\u0000\u0000\u0000O\u00f9\u0001\u0000\u0000\u0000Q\u00ff"+
		"\u0001\u0000\u0000\u0000S\u010c\u0001\u0000\u0000\u0000U\u011b\u0001\u0000"+
		"\u0000\u0000W\u0129\u0001\u0000\u0000\u0000Y\u012b\u0001\u0000\u0000\u0000"+
		"[\u0130\u0001\u0000\u0000\u0000]\u0136\u0001\u0000\u0000\u0000_\u0138"+
		"\u0001\u0000\u0000\u0000a\u013a\u0001\u0000\u0000\u0000c\u013c\u0001\u0000"+
		"\u0000\u0000e\u013e\u0001\u0000\u0000\u0000g\u0140\u0001\u0000\u0000\u0000"+
		"ij\u0005=\u0000\u0000j\u0002\u0001\u0000\u0000\u0000kl\u0005i\u0000\u0000"+
		"lm\u0005n\u0000\u0000mn\u0005t\u0000\u0000n\u0004\u0001\u0000\u0000\u0000"+
		"op\u0005i\u0000\u0000pq\u0005f\u0000\u0000q\u0006\u0001\u0000\u0000\u0000"+
		"rs\u0005e\u0000\u0000st\u0005l\u0000\u0000tu\u0005s\u0000\u0000uv\u0005"+
		"e\u0000\u0000v\b\u0001\u0000\u0000\u0000wx\u0005w\u0000\u0000xy\u0005"+
		"h\u0000\u0000yz\u0005i\u0000\u0000z{\u0005l\u0000\u0000{|\u0005e\u0000"+
		"\u0000|\n\u0001\u0000\u0000\u0000}~\u0005b\u0000\u0000~\u007f\u0005r\u0000"+
		"\u0000\u007f\u0080\u0005e\u0000\u0000\u0080\u0081\u0005a\u0000\u0000\u0081"+
		"\u0082\u0005k\u0000\u0000\u0082\f\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0005v\u0000\u0000\u0084\u0085\u0005o\u0000\u0000\u0085\u0086\u0005i"+
		"\u0000\u0000\u0086\u0087\u0005d\u0000\u0000\u0087\u000e\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0005c\u0000\u0000\u0089\u008a\u0005o\u0000\u0000\u008a"+
		"\u008b\u0005n\u0000\u0000\u008b\u008c\u0005s\u0000\u0000\u008c\u008d\u0005"+
		"t\u0000\u0000\u008d\u0010\u0001\u0000\u0000\u0000\u008e\u008f\u0005;\u0000"+
		"\u0000\u008f\u0012\u0001\u0000\u0000\u0000\u0090\u0091\u0005p\u0000\u0000"+
		"\u0091\u0092\u0005r\u0000\u0000\u0092\u0093\u0005i\u0000\u0000\u0093\u0094"+
		"\u0005n\u0000\u0000\u0094\u0095\u0005t\u0000\u0000\u0095\u0014\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0005*\u0000\u0000\u0097\u0016\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u0005/\u0000\u0000\u0099\u0018\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0005+\u0000\u0000\u009b\u001a\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0005-\u0000\u0000\u009d\u001c\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0005(\u0000\u0000\u009f\u001e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005"+
		")\u0000\u0000\u00a1 \u0001\u0000\u0000\u0000\u00a2\u00a3\u0005[\u0000"+
		"\u0000\u00a3\"\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005]\u0000\u0000"+
		"\u00a5$\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005{\u0000\u0000\u00a7&"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005}\u0000\u0000\u00a9(\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0005,\u0000\u0000\u00ab*\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ad\u0005<\u0000\u0000\u00ad,\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0005>\u0000\u0000\u00af.\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005<"+
		"\u0000\u0000\u00b1\u00b2\u0005=\u0000\u0000\u00b20\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b4\u0005>\u0000\u0000\u00b4\u00b5\u0005=\u0000\u0000\u00b52"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005=\u0000\u0000\u00b7\u00b8\u0005"+
		"=\u0000\u0000\u00b84\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005!\u0000"+
		"\u0000\u00ba\u00bb\u0005=\u0000\u0000\u00bb6\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u0005!\u0000\u0000\u00bd8\u0001\u0000\u0000\u0000\u00be\u00bf\u0005"+
		"&\u0000\u0000\u00bf\u00c0\u0005&\u0000\u0000\u00c0:\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c2\u0005|\u0000\u0000\u00c2\u00c3\u0005|\u0000\u0000\u00c3"+
		"<\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005%\u0000\u0000\u00c5>\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c7\u0005c\u0000\u0000\u00c7\u00c8\u0005o\u0000"+
		"\u0000\u00c8\u00c9\u0005n\u0000\u0000\u00c9\u00ca\u0005t\u0000\u0000\u00ca"+
		"\u00cb\u0005i\u0000\u0000\u00cb\u00cc\u0005n\u0000\u0000\u00cc\u00cd\u0005"+
		"u\u0000\u0000\u00cd\u00ce\u0005e\u0000\u0000\u00ce@\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d0\u0005r\u0000\u0000\u00d0\u00d1\u0005e\u0000\u0000\u00d1"+
		"\u00d2\u0005t\u0000\u0000\u00d2\u00d3\u0005u\u0000\u0000\u00d3\u00d4\u0005"+
		"r\u0000\u0000\u00d4\u00d5\u0005n\u0000\u0000\u00d5B\u0001\u0000\u0000"+
		"\u0000\u00d6\u00da\u0003e2\u0000\u00d7\u00d9\u0003g3\u0000\u00d8\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8"+
		"\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00dbD\u0001"+
		"\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd\u00de\u0003"+
		"G#\u0000\u00deF\u0001\u0000\u0000\u0000\u00df\u00e3\u0003I$\u0000\u00e0"+
		"\u00e3\u0003K%\u0000\u00e1\u00e3\u0003M&\u0000\u00e2\u00df\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e3H\u0001\u0000\u0000\u0000\u00e4\u00e8\u0003_/\u0000"+
		"\u00e5\u00e7\u0003Y,\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e7\u00ea"+
		"\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9"+
		"\u0001\u0000\u0000\u0000\u00e9J\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ef\u00050\u0000\u0000\u00ec\u00ee\u0003a0"+
		"\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000"+
		"\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000"+
		"\u0000\u00f0L\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f4\u0003].\u0000\u00f3\u00f5\u0003c1\u0000\u00f4\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7N\u0001\u0000"+
		"\u0000\u0000\u00f8\u00fa\u0007\u0000\u0000\u0000\u00f9\u00f8\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000"+
		"\u0000\u0000\u00fd\u00fe\u0006\'\u0000\u0000\u00feP\u0001\u0000\u0000"+
		"\u0000\u00ff\u0100\u0005/\u0000\u0000\u0100\u0101\u0005/\u0000\u0000\u0101"+
		"\u0105\u0001\u0000\u0000\u0000\u0102\u0104\t\u0000\u0000\u0000\u0103\u0102"+
		"\u0001\u0000\u0000\u0000\u0104\u0107\u0001\u0000\u0000\u0000\u0105\u0106"+
		"\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0106\u0108"+
		"\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0108\u0109"+
		"\u0005\n\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u010b\u0006"+
		"(\u0000\u0000\u010bR\u0001\u0000\u0000\u0000\u010c\u010d\u0005/\u0000"+
		"\u0000\u010d\u010e\u0005*\u0000\u0000\u010e\u010f\u0005*\u0000\u0000\u010f"+
		"\u0113\u0001\u0000\u0000\u0000\u0110\u0112\t\u0000\u0000\u0000\u0111\u0110"+
		"\u0001\u0000\u0000\u0000\u0112\u0115\u0001\u0000\u0000\u0000\u0113\u0114"+
		"\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0114\u0116"+
		"\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0116\u0117"+
		"\u0005*\u0000\u0000\u0117\u0118\u0005/\u0000\u0000\u0118\u0119\u0001\u0000"+
		"\u0000\u0000\u0119\u011a\u0006)\u0000\u0000\u011aT\u0001\u0000\u0000\u0000"+
		"\u011b\u011c\u0005/\u0000\u0000\u011c\u011d\u0005*\u0000\u0000\u011d\u0121"+
		"\u0001\u0000\u0000\u0000\u011e\u0120\t\u0000\u0000\u0000\u011f\u011e\u0001"+
		"\u0000\u0000\u0000\u0120\u0123\u0001\u0000\u0000\u0000\u0121\u0122\u0001"+
		"\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0122\u0124\u0001"+
		"\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0124\u0125\u0005"+
		"*\u0000\u0000\u0125\u0126\u0005/\u0000\u0000\u0126\u0127\u0001\u0000\u0000"+
		"\u0000\u0127\u0128\u0006*\u0000\u0000\u0128V\u0001\u0000\u0000\u0000\u0129"+
		"\u012a\u0007\u0001\u0000\u0000\u012aX\u0001\u0000\u0000\u0000\u012b\u012c"+
		"\u0007\u0002\u0000\u0000\u012cZ\u0001\u0000\u0000\u0000\u012d\u0131\u0003"+
		"W+\u0000\u012e\u0131\u0003Y,\u0000\u012f\u0131\u0005_\u0000\u0000\u0130"+
		"\u012d\u0001\u0000\u0000\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0130"+
		"\u012f\u0001\u0000\u0000\u0000\u0131\\\u0001\u0000\u0000\u0000\u0132\u0133"+
		"\u00050\u0000\u0000\u0133\u0137\u0005x\u0000\u0000\u0134\u0135\u00050"+
		"\u0000\u0000\u0135\u0137\u0005X\u0000\u0000\u0136\u0132\u0001\u0000\u0000"+
		"\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0137^\u0001\u0000\u0000\u0000"+
		"\u0138\u0139\u0007\u0003\u0000\u0000\u0139`\u0001\u0000\u0000\u0000\u013a"+
		"\u013b\u0007\u0004\u0000\u0000\u013bb\u0001\u0000\u0000\u0000\u013c\u013d"+
		"\u0007\u0005\u0000\u0000\u013dd\u0001\u0000\u0000\u0000\u013e\u013f\u0007"+
		"\u0001\u0000\u0000\u013ff\u0001\u0000\u0000\u0000\u0140\u0141\u0007\u0006"+
		"\u0000\u0000\u0141h\u0001\u0000\u0000\u0000\f\u0000\u00da\u00e2\u00e8"+
		"\u00ef\u00f6\u00fb\u0105\u0113\u0121\u0130\u0136\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}