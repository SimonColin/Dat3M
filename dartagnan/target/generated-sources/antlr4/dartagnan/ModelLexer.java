// Generated from Model.g4 by ANTLR 4.7

package dartagnan;
import dartagnan.wmm.*;
import dartagnan.program.event.filter.*;
import java.util.List;
import java.util.ArrayList;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ModelLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, PO=19, POLOC=20, RFE=21, RFI=22, RF=23, FR=24, FRE=25, FRI=26, 
		CO=27, COE=28, COI=29, AD=30, IDD=31, ISH=32, CD=33, STHD=34, SLOC=35, 
		MFENCE=36, LWSYNC=37, CTRLISYNC=38, ISYNC=39, SYNC=40, CTRLDIREKT=41, 
		CTRLISB=42, CTRL=43, ISB=44, ADDR=45, DATA=46, ID=47, EMPTY=48, EVENT_TYPE=49, 
		RMW=50, LKW=51, ATOMIC=52, READ=53, WRITE=54, INIT=55, MEMORY=56, FENCE=57, 
		SC=58, REL_ACQ=59, RELEASE=60, ACQUIRE=61, CONSUME=62, RELAXED=63, NON_ATOMIC=64, 
		NAME=65, MCMNAME=66, WS=67, ENDE=68, ML_COMMENT=69, INCLUDE=70, MODELNAME=71;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "PO", "POLOC", "RFE", "RFI", "RF", "FR", "FRE", "FRI", "CO", 
		"COE", "COI", "AD", "IDD", "ISH", "CD", "STHD", "SLOC", "MFENCE", "LWSYNC", 
		"CTRLISYNC", "ISYNC", "SYNC", "CTRLDIREKT", "CTRLISB", "CTRL", "ISB", 
		"ADDR", "DATA", "ID", "EMPTY", "EVENT_TYPE", "RMW", "LKW", "ATOMIC", "READ", 
		"WRITE", "INIT", "MEMORY", "FENCE", "SC", "REL_ACQ", "RELEASE", "ACQUIRE", 
		"CONSUME", "RELAXED", "NON_ATOMIC", "NAME", "MCMNAME", "WS", "ENDE", "ML_COMMENT", 
		"INCLUDE", "MODELNAME"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'acyclic'", "'as'", "'irreflexive'", "'let'", "'and'", "'rec'", 
		"'='", "'|'", "'&'", "';'", "'('", "')'", "'\\'", "'+'", "'*'", "'toid('", 
		"'['", "']'", "'po'", "'po-loc'", "'rfe'", "'rfi'", "'rf'", "'fr'", "'fre'", 
		"'fri'", "'co'", "'coe'", "'coi'", "'ad'", "'idd'", "'ish'", "'cd'", "'sthd'", 
		"'sloc'", "'mfence'", "'lwsync'", "'ctrlisync'", "'isync'", "'sync'", 
		"'ctrlDirect'", "'ctrlisb'", "'ctrl'", "'isb'", "'addr'", "'data'", "'id'", 
		"'0'", null, "'RMW'", "'LKW'", "'A'", "'R'", "'W'", "'I'", "'M'", "'F'", 
		null, null, null, null, "'CON'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "PO", "POLOC", "RFE", "RFI", 
		"RF", "FR", "FRE", "FRI", "CO", "COE", "COI", "AD", "IDD", "ISH", "CD", 
		"STHD", "SLOC", "MFENCE", "LWSYNC", "CTRLISYNC", "ISYNC", "SYNC", "CTRLDIREKT", 
		"CTRLISB", "CTRL", "ISB", "ADDR", "DATA", "ID", "EMPTY", "EVENT_TYPE", 
		"RMW", "LKW", "ATOMIC", "READ", "WRITE", "INIT", "MEMORY", "FENCE", "SC", 
		"REL_ACQ", "RELEASE", "ACQUIRE", "CONSUME", "RELAXED", "NON_ATOMIC", "NAME", 
		"MCMNAME", "WS", "ENDE", "ML_COMMENT", "INCLUDE", "MODELNAME"
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


	public ModelLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Model.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2I\u020a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3"+
		"$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3"+
		".\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\5\62\u016a\n\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64"+
		"\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3;\3;\3;\3"+
		";\3;\3;\3;\3;\3;\3;\5;\u018c\n;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3"+
		"<\3<\5<\u019c\n<\3=\3=\3=\3=\3=\3=\3=\5=\u01a5\n=\3>\3>\3>\3>\3>\3>\3"+
		">\3>\3>\3>\3>\3>\3>\3>\5>\u01b5\n>\3?\3?\3?\3?\3@\3@\3@\3@\3@\5@\u01c0"+
		"\n@\3A\3A\3A\3A\3A\5A\u01c7\nA\3B\6B\u01ca\nB\rB\16B\u01cb\3C\6C\u01cf"+
		"\nC\rC\16C\u01d0\3D\6D\u01d4\nD\rD\16D\u01d5\3D\3D\3E\3E\3E\3E\3F\3F\3"+
		"F\3F\7F\u01e2\nF\fF\16F\u01e5\13F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3G"+
		"\3G\3G\3G\3G\7G\u01f7\nG\fG\16G\u01fa\13G\3G\3G\3G\3G\3H\3H\7H\u0202\n"+
		"H\fH\16H\u0205\13H\3H\3H\3H\3H\5\u01e3\u01f8\u0203\2I\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177"+
		"A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\3\2\5\5\2//"+
		"\62;c|\5\2\62;C\\c|\5\2\13\f\17\17\"\"\2\u021e\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2"+
		"\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2"+
		"\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2"+
		"\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\3\u0091"+
		"\3\2\2\2\5\u0099\3\2\2\2\7\u009c\3\2\2\2\t\u00a8\3\2\2\2\13\u00ac\3\2"+
		"\2\2\r\u00b0\3\2\2\2\17\u00b4\3\2\2\2\21\u00b6\3\2\2\2\23\u00b8\3\2\2"+
		"\2\25\u00ba\3\2\2\2\27\u00bc\3\2\2\2\31\u00be\3\2\2\2\33\u00c0\3\2\2\2"+
		"\35\u00c2\3\2\2\2\37\u00c4\3\2\2\2!\u00c6\3\2\2\2#\u00cc\3\2\2\2%\u00ce"+
		"\3\2\2\2\'\u00d0\3\2\2\2)\u00d3\3\2\2\2+\u00da\3\2\2\2-\u00de\3\2\2\2"+
		"/\u00e2\3\2\2\2\61\u00e5\3\2\2\2\63\u00e8\3\2\2\2\65\u00ec\3\2\2\2\67"+
		"\u00f0\3\2\2\29\u00f3\3\2\2\2;\u00f7\3\2\2\2=\u00fb\3\2\2\2?\u00fe\3\2"+
		"\2\2A\u0102\3\2\2\2C\u0106\3\2\2\2E\u0109\3\2\2\2G\u010e\3\2\2\2I\u0113"+
		"\3\2\2\2K\u011a\3\2\2\2M\u0121\3\2\2\2O\u012b\3\2\2\2Q\u0131\3\2\2\2S"+
		"\u0136\3\2\2\2U\u0141\3\2\2\2W\u0149\3\2\2\2Y\u014e\3\2\2\2[\u0152\3\2"+
		"\2\2]\u0157\3\2\2\2_\u015c\3\2\2\2a\u015f\3\2\2\2c\u0169\3\2\2\2e\u016b"+
		"\3\2\2\2g\u016f\3\2\2\2i\u0173\3\2\2\2k\u0175\3\2\2\2m\u0177\3\2\2\2o"+
		"\u0179\3\2\2\2q\u017b\3\2\2\2s\u017d\3\2\2\2u\u018b\3\2\2\2w\u019b\3\2"+
		"\2\2y\u01a4\3\2\2\2{\u01b4\3\2\2\2}\u01b6\3\2\2\2\177\u01bf\3\2\2\2\u0081"+
		"\u01c6\3\2\2\2\u0083\u01c9\3\2\2\2\u0085\u01ce\3\2\2\2\u0087\u01d3\3\2"+
		"\2\2\u0089\u01d9\3\2\2\2\u008b\u01dd\3\2\2\2\u008d\u01eb\3\2\2\2\u008f"+
		"\u01ff\3\2\2\2\u0091\u0092\7c\2\2\u0092\u0093\7e\2\2\u0093\u0094\7{\2"+
		"\2\u0094\u0095\7e\2\2\u0095\u0096\7n\2\2\u0096\u0097\7k\2\2\u0097\u0098"+
		"\7e\2\2\u0098\4\3\2\2\2\u0099\u009a\7c\2\2\u009a\u009b\7u\2\2\u009b\6"+
		"\3\2\2\2\u009c\u009d\7k\2\2\u009d\u009e\7t\2\2\u009e\u009f\7t\2\2\u009f"+
		"\u00a0\7g\2\2\u00a0\u00a1\7h\2\2\u00a1\u00a2\7n\2\2\u00a2\u00a3\7g\2\2"+
		"\u00a3\u00a4\7z\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7x\2\2\u00a6\u00a7"+
		"\7g\2\2\u00a7\b\3\2\2\2\u00a8\u00a9\7n\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab"+
		"\7v\2\2\u00ab\n\3\2\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af"+
		"\7f\2\2\u00af\f\3\2\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3"+
		"\7e\2\2\u00b3\16\3\2\2\2\u00b4\u00b5\7?\2\2\u00b5\20\3\2\2\2\u00b6\u00b7"+
		"\7~\2\2\u00b7\22\3\2\2\2\u00b8\u00b9\7(\2\2\u00b9\24\3\2\2\2\u00ba\u00bb"+
		"\7=\2\2\u00bb\26\3\2\2\2\u00bc\u00bd\7*\2\2\u00bd\30\3\2\2\2\u00be\u00bf"+
		"\7+\2\2\u00bf\32\3\2\2\2\u00c0\u00c1\7^\2\2\u00c1\34\3\2\2\2\u00c2\u00c3"+
		"\7-\2\2\u00c3\36\3\2\2\2\u00c4\u00c5\7,\2\2\u00c5 \3\2\2\2\u00c6\u00c7"+
		"\7v\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7k\2\2\u00c9\u00ca\7f\2\2\u00ca"+
		"\u00cb\7*\2\2\u00cb\"\3\2\2\2\u00cc\u00cd\7]\2\2\u00cd$\3\2\2\2\u00ce"+
		"\u00cf\7_\2\2\u00cf&\3\2\2\2\u00d0\u00d1\7r\2\2\u00d1\u00d2\7q\2\2\u00d2"+
		"(\3\2\2\2\u00d3\u00d4\7r\2\2\u00d4\u00d5\7q\2\2\u00d5\u00d6\7/\2\2\u00d6"+
		"\u00d7\7n\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9\7e\2\2\u00d9*\3\2\2\2\u00da"+
		"\u00db\7t\2\2\u00db\u00dc\7h\2\2\u00dc\u00dd\7g\2\2\u00dd,\3\2\2\2\u00de"+
		"\u00df\7t\2\2\u00df\u00e0\7h\2\2\u00e0\u00e1\7k\2\2\u00e1.\3\2\2\2\u00e2"+
		"\u00e3\7t\2\2\u00e3\u00e4\7h\2\2\u00e4\60\3\2\2\2\u00e5\u00e6\7h\2\2\u00e6"+
		"\u00e7\7t\2\2\u00e7\62\3\2\2\2\u00e8\u00e9\7h\2\2\u00e9\u00ea\7t\2\2\u00ea"+
		"\u00eb\7g\2\2\u00eb\64\3\2\2\2\u00ec\u00ed\7h\2\2\u00ed\u00ee\7t\2\2\u00ee"+
		"\u00ef\7k\2\2\u00ef\66\3\2\2\2\u00f0\u00f1\7e\2\2\u00f1\u00f2\7q\2\2\u00f2"+
		"8\3\2\2\2\u00f3\u00f4\7e\2\2\u00f4\u00f5\7q\2\2\u00f5\u00f6\7g\2\2\u00f6"+
		":\3\2\2\2\u00f7\u00f8\7e\2\2\u00f8\u00f9\7q\2\2\u00f9\u00fa\7k\2\2\u00fa"+
		"<\3\2\2\2\u00fb\u00fc\7c\2\2\u00fc\u00fd\7f\2\2\u00fd>\3\2\2\2\u00fe\u00ff"+
		"\7k\2\2\u00ff\u0100\7f\2\2\u0100\u0101\7f\2\2\u0101@\3\2\2\2\u0102\u0103"+
		"\7k\2\2\u0103\u0104\7u\2\2\u0104\u0105\7j\2\2\u0105B\3\2\2\2\u0106\u0107"+
		"\7e\2\2\u0107\u0108\7f\2\2\u0108D\3\2\2\2\u0109\u010a\7u\2\2\u010a\u010b"+
		"\7v\2\2\u010b\u010c\7j\2\2\u010c\u010d\7f\2\2\u010dF\3\2\2\2\u010e\u010f"+
		"\7u\2\2\u010f\u0110\7n\2\2\u0110\u0111\7q\2\2\u0111\u0112\7e\2\2\u0112"+
		"H\3\2\2\2\u0113\u0114\7o\2\2\u0114\u0115\7h\2\2\u0115\u0116\7g\2\2\u0116"+
		"\u0117\7p\2\2\u0117\u0118\7e\2\2\u0118\u0119\7g\2\2\u0119J\3\2\2\2\u011a"+
		"\u011b\7n\2\2\u011b\u011c\7y\2\2\u011c\u011d\7u\2\2\u011d\u011e\7{\2\2"+
		"\u011e\u011f\7p\2\2\u011f\u0120\7e\2\2\u0120L\3\2\2\2\u0121\u0122\7e\2"+
		"\2\u0122\u0123\7v\2\2\u0123\u0124\7t\2\2\u0124\u0125\7n\2\2\u0125\u0126"+
		"\7k\2\2\u0126\u0127\7u\2\2\u0127\u0128\7{\2\2\u0128\u0129\7p\2\2\u0129"+
		"\u012a\7e\2\2\u012aN\3\2\2\2\u012b\u012c\7k\2\2\u012c\u012d\7u\2\2\u012d"+
		"\u012e\7{\2\2\u012e\u012f\7p\2\2\u012f\u0130\7e\2\2\u0130P\3\2\2\2\u0131"+
		"\u0132\7u\2\2\u0132\u0133\7{\2\2\u0133\u0134\7p\2\2\u0134\u0135\7e\2\2"+
		"\u0135R\3\2\2\2\u0136\u0137\7e\2\2\u0137\u0138\7v\2\2\u0138\u0139\7t\2"+
		"\2\u0139\u013a\7n\2\2\u013a\u013b\7F\2\2\u013b\u013c\7k\2\2\u013c\u013d"+
		"\7t\2\2\u013d\u013e\7g\2\2\u013e\u013f\7e\2\2\u013f\u0140\7v\2\2\u0140"+
		"T\3\2\2\2\u0141\u0142\7e\2\2\u0142\u0143\7v\2\2\u0143\u0144\7t\2\2\u0144"+
		"\u0145\7n\2\2\u0145\u0146\7k\2\2\u0146\u0147\7u\2\2\u0147\u0148\7d\2\2"+
		"\u0148V\3\2\2\2\u0149\u014a\7e\2\2\u014a\u014b\7v\2\2\u014b\u014c\7t\2"+
		"\2\u014c\u014d\7n\2\2\u014dX\3\2\2\2\u014e\u014f\7k\2\2\u014f\u0150\7"+
		"u\2\2\u0150\u0151\7d\2\2\u0151Z\3\2\2\2\u0152\u0153\7c\2\2\u0153\u0154"+
		"\7f\2\2\u0154\u0155\7f\2\2\u0155\u0156\7t\2\2\u0156\\\3\2\2\2\u0157\u0158"+
		"\7f\2\2\u0158\u0159\7c\2\2\u0159\u015a\7v\2\2\u015a\u015b\7c\2\2\u015b"+
		"^\3\2\2\2\u015c\u015d\7k\2\2\u015d\u015e\7f\2\2\u015e`\3\2\2\2\u015f\u0160"+
		"\7\62\2\2\u0160b\3\2\2\2\u0161\u016a\5e\63\2\u0162\u016a\5g\64\2\u0163"+
		"\u016a\5i\65\2\u0164\u016a\5k\66\2\u0165\u016a\5m\67\2\u0166\u016a\5o"+
		"8\2\u0167\u016a\5q9\2\u0168\u016a\5s:\2\u0169\u0161\3\2\2\2\u0169\u0162"+
		"\3\2\2\2\u0169\u0163\3\2\2\2\u0169\u0164\3\2\2\2\u0169\u0165\3\2\2\2\u0169"+
		"\u0166\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u0168\3\2\2\2\u016ad\3\2\2\2"+
		"\u016b\u016c\7T\2\2\u016c\u016d\7O\2\2\u016d\u016e\7Y\2\2\u016ef\3\2\2"+
		"\2\u016f\u0170\7N\2\2\u0170\u0171\7M\2\2\u0171\u0172\7Y\2\2\u0172h\3\2"+
		"\2\2\u0173\u0174\7C\2\2\u0174j\3\2\2\2\u0175\u0176\7T\2\2\u0176l\3\2\2"+
		"\2\u0177\u0178\7Y\2\2\u0178n\3\2\2\2\u0179\u017a\7K\2\2\u017ap\3\2\2\2"+
		"\u017b\u017c\7O\2\2\u017cr\3\2\2\2\u017d\u017e\7H\2\2\u017et\3\2\2\2\u017f"+
		"\u0180\7U\2\2\u0180\u018c\7E\2\2\u0181\u0182\7a\2\2\u0182\u0183\7u\2\2"+
		"\u0183\u018c\7e\2\2\u0184\u0185\7u\2\2\u0185\u0186\7g\2\2\u0186\u0187"+
		"\7s\2\2\u0187\u0188\7a\2\2\u0188\u0189\7e\2\2\u0189\u018a\7u\2\2\u018a"+
		"\u018c\7v\2\2\u018b\u017f\3\2\2\2\u018b\u0181\3\2\2\2\u018b\u0184\3\2"+
		"\2\2\u018cv\3\2\2\2\u018d\u018e\7T\2\2\u018e\u018f\7G\2\2\u018f\u0190"+
		"\7N\2\2\u0190\u0191\7a\2\2\u0191\u0192\7C\2\2\u0192\u0193\7E\2\2\u0193"+
		"\u019c\7S\2\2\u0194\u0195\7C\2\2\u0195\u0196\7E\2\2\u0196\u0197\7S\2\2"+
		"\u0197\u0198\7a\2\2\u0198\u0199\7T\2\2\u0199\u019a\7G\2\2\u019a\u019c"+
		"\7N\2\2\u019b\u018d\3\2\2\2\u019b\u0194\3\2\2\2\u019cx\3\2\2\2\u019d\u019e"+
		"\7T\2\2\u019e\u019f\7G\2\2\u019f\u01a5\7N\2\2\u01a0\u01a1\7a\2\2\u01a1"+
		"\u01a2\7t\2\2\u01a2\u01a3\7g\2\2\u01a3\u01a5\7n\2\2\u01a4\u019d\3\2\2"+
		"\2\u01a4\u01a0\3\2\2\2\u01a5z\3\2\2\2\u01a6\u01a7\7C\2\2\u01a7\u01a8\7"+
		"E\2\2\u01a8\u01b5\7S\2\2\u01a9\u01aa\7a\2\2\u01aa\u01ab\7c\2\2\u01ab\u01ac"+
		"\7e\2\2\u01ac\u01b5\7s\2\2\u01ad\u01ae\7C\2\2\u01ae\u01af\7e\2\2\u01af"+
		"\u01b0\7s\2\2\u01b0\u01b1\7w\2\2\u01b1\u01b2\7k\2\2\u01b2\u01b3\7t\2\2"+
		"\u01b3\u01b5\7g\2\2\u01b4\u01a6\3\2\2\2\u01b4\u01a9\3\2\2\2\u01b4\u01ad"+
		"\3\2\2\2\u01b5|\3\2\2\2\u01b6\u01b7\7E\2\2\u01b7\u01b8\7Q\2\2\u01b8\u01b9"+
		"\7P\2\2\u01b9~\3\2\2\2\u01ba\u01bb\7T\2\2\u01bb\u01c0\7Z\2\2\u01bc\u01bd"+
		"\7a\2\2\u01bd\u01be\7t\2\2\u01be\u01c0\7z\2\2\u01bf\u01ba\3\2\2\2\u01bf"+
		"\u01bc\3\2\2\2\u01c0\u0080\3\2\2\2\u01c1\u01c2\7P\2\2\u01c2\u01c7\7C\2"+
		"\2\u01c3\u01c4\7a\2\2\u01c4\u01c5\7p\2\2\u01c5\u01c7\7c\2\2\u01c6\u01c1"+
		"\3\2\2\2\u01c6\u01c3\3\2\2\2\u01c7\u0082\3\2\2\2\u01c8\u01ca\t\2\2\2\u01c9"+
		"\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2"+
		"\2\2\u01cc\u0084\3\2\2\2\u01cd\u01cf\t\3\2\2\u01ce\u01cd\3\2\2\2\u01cf"+
		"\u01d0\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u0086\3\2"+
		"\2\2\u01d2\u01d4\t\4\2\2\u01d3\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5"+
		"\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\bD"+
		"\2\2\u01d8\u0088\3\2\2\2\u01d9\u01da\7\2\2\3\u01da\u01db\3\2\2\2\u01db"+
		"\u01dc\bE\2\2\u01dc\u008a\3\2\2\2\u01dd\u01de\7*\2\2\u01de\u01df\7,\2"+
		"\2\u01df\u01e3\3\2\2\2\u01e0\u01e2\13\2\2\2\u01e1\u01e0\3\2\2\2\u01e2"+
		"\u01e5\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01e6\3\2"+
		"\2\2\u01e5\u01e3\3\2\2\2\u01e6\u01e7\7,\2\2\u01e7\u01e8\7+\2\2\u01e8\u01e9"+
		"\3\2\2\2\u01e9\u01ea\bF\2\2\u01ea\u008c\3\2\2\2\u01eb\u01ec\7k\2\2\u01ec"+
		"\u01ed\7p\2\2\u01ed\u01ee\7e\2\2\u01ee\u01ef\7n\2\2\u01ef\u01f0\7w\2\2"+
		"\u01f0\u01f1\7f\2\2\u01f1\u01f2\7g\2\2\u01f2\u01f3\7\"\2\2\u01f3\u01f4"+
		"\7$\2\2\u01f4\u01f8\3\2\2\2\u01f5\u01f7\13\2\2\2\u01f6\u01f5\3\2\2\2\u01f7"+
		"\u01fa\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f9\u01fb\3\2"+
		"\2\2\u01fa\u01f8\3\2\2\2\u01fb\u01fc\7$\2\2\u01fc\u01fd\3\2\2\2\u01fd"+
		"\u01fe\bG\2\2\u01fe\u008e\3\2\2\2\u01ff\u0203\7$\2\2\u0200\u0202\13\2"+
		"\2\2\u0201\u0200\3\2\2\2\u0202\u0205\3\2\2\2\u0203\u0204\3\2\2\2\u0203"+
		"\u0201\3\2\2\2\u0204\u0206\3\2\2\2\u0205\u0203\3\2\2\2\u0206\u0207\7$"+
		"\2\2\u0207\u0208\3\2\2\2\u0208\u0209\bH\2\2\u0209\u0090\3\2\2\2\20\2\u0169"+
		"\u018b\u019b\u01a4\u01b4\u01bf\u01c6\u01cb\u01d0\u01d5\u01e3\u01f8\u0203"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}