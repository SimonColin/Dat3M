// Generated from Model.g4 by ANTLR 4.7

package dartagnan;
import dartagnan.wmm.*;
import dartagnan.program.event.filter.*;
import java.util.List;
import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ModelParser extends Parser {
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
		RMW=50, LKW=51, ATOMIC=52, READ=53, WRITE=54, INIT=55, MEMORY=56, SC=57, 
		REL_ACQ=58, RELEASE=59, ACQUIRE=60, CONSUME=61, RELAXED=62, NON_ATOMIC=63, 
		NAME=64, MCMNAME=65, WS=66, ENDE=67, ML_COMMENT=68, INCLUDE=69, MODELNAME=70;
	public static final int
		RULE_mcm = 0, RULE_axiom = 1, RULE_reldef = 2, RULE_fancyrel = 3, RULE_relation = 4, 
		RULE_setRelation = 5, RULE_relToSetRelation = 6, RULE_setToRelRelation = 7, 
		RULE_base = 8, RULE_complexEventType = 9, RULE_eventType = 10, RULE_eventTypeComposite = 11, 
		RULE_atomics = 12, RULE_sc = 13, RULE_relAqc = 14, RULE_release = 15, 
		RULE_acquire = 16, RULE_cons = 17, RULE_relaxed = 18, RULE_nonAtomic = 19;
	public static final String[] ruleNames = {
		"mcm", "axiom", "reldef", "fancyrel", "relation", "setRelation", "relToSetRelation", 
		"setToRelRelation", "base", "complexEventType", "eventType", "eventTypeComposite", 
		"atomics", "sc", "relAqc", "release", "acquire", "cons", "relaxed", "nonAtomic"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'acyclic'", "'as'", "'irreflexive'", "'let'", "'and'", "'rec'", 
		"'='", "'|'", "'&'", "';'", "'('", "')'", "'\\'", "'+'", "'*'", "'toid('", 
		"'['", "']'", "'po'", "'po-loc'", "'rfe'", "'rfi'", "'rf'", "'fr'", "'fre'", 
		"'fri'", "'co'", "'coe'", "'coi'", "'ad'", "'idd'", "'ish'", "'cd'", "'sthd'", 
		"'sloc'", "'mfence'", "'lwsync'", "'ctrlisync'", "'isync'", "'sync'", 
		"'ctrlDirect'", "'ctrlisb'", "'ctrl'", "'isb'", "'addr'", "'data'", "'id'", 
		"'0'", null, "'RMW'", "'LKW'", "'A'", "'R'", "'W'", "'I'", "'M'", null, 
		"'REL_AQC'", null, null, "'CON'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "PO", "POLOC", "RFE", "RFI", 
		"RF", "FR", "FRE", "FRI", "CO", "COE", "COI", "AD", "IDD", "ISH", "CD", 
		"STHD", "SLOC", "MFENCE", "LWSYNC", "CTRLISYNC", "ISYNC", "SYNC", "CTRLDIREKT", 
		"CTRLISB", "CTRL", "ISB", "ADDR", "DATA", "ID", "EMPTY", "EVENT_TYPE", 
		"RMW", "LKW", "ATOMIC", "READ", "WRITE", "INIT", "MEMORY", "SC", "REL_ACQ", 
		"RELEASE", "ACQUIRE", "CONSUME", "RELAXED", "NON_ATOMIC", "NAME", "MCMNAME", 
		"WS", "ENDE", "ML_COMMENT", "INCLUDE", "MODELNAME"
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
	public String getGrammarFileName() { return "Model.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	ArrayList<Relation> children = new ArrayList<Relation>();

	public ModelParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class McmContext extends ParserRuleContext {
		public Wmm value;
		public AxiomContext ax1;
		public ReldefContext r1;
		public TerminalNode MCMNAME() { return getToken(ModelParser.MCMNAME, 0); }
		public List<AxiomContext> axiom() {
			return getRuleContexts(AxiomContext.class);
		}
		public AxiomContext axiom(int i) {
			return getRuleContext(AxiomContext.class,i);
		}
		public List<ReldefContext> reldef() {
			return getRuleContexts(ReldefContext.class);
		}
		public ReldefContext reldef(int i) {
			return getRuleContext(ReldefContext.class,i);
		}
		public McmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mcm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterMcm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitMcm(this);
		}
	}

	public final McmContext mcm() throws RecognitionException {
		McmContext _localctx = new McmContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mcm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((McmContext)_localctx).value =   new Wmm();
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MCMNAME) {
				{
				setState(41);
				match(MCMNAME);
				}
			}

			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(50);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__2:
					{
					setState(44);
					((McmContext)_localctx).ax1 = axiom();
					_localctx.value.addAxiom(((McmContext)_localctx).ax1.value);
					}
					break;
				case T__3:
				case T__4:
					{
					setState(47);
					((McmContext)_localctx).r1 = reldef();
					_localctx.value.addRel(((McmContext)_localctx).r1.value);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0) );
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

	public static class AxiomContext extends ParserRuleContext {
		public Axiom value;
		public FancyrelContext m1;
		public FancyrelContext fancyrel() {
			return getRuleContext(FancyrelContext.class,0);
		}
		public TerminalNode NAME() { return getToken(ModelParser.NAME, 0); }
		public AxiomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_axiom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterAxiom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitAxiom(this);
		}
	}

	public final AxiomContext axiom() throws RecognitionException {
		AxiomContext _localctx = new AxiomContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_axiom);
		int _la;
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				match(T__0);
				setState(55);
				((AxiomContext)_localctx).m1 = fancyrel();
				((AxiomContext)_localctx).value =   new Acyclic(((AxiomContext)_localctx).m1.value);
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(57);
					match(T__1);
					setState(58);
					match(NAME);
					}
				}

				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(T__2);
				setState(62);
				((AxiomContext)_localctx).m1 = fancyrel();
				((AxiomContext)_localctx).value =   new Irreflexive(((AxiomContext)_localctx).m1.value);
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(64);
					match(T__1);
					setState(65);
					match(NAME);
					}
				}

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

	public static class ReldefContext extends ParserRuleContext {
		public Relation value;
		public Token n;
		public FancyrelContext m1;
		public TerminalNode NAME() { return getToken(ModelParser.NAME, 0); }
		public FancyrelContext fancyrel() {
			return getRuleContext(FancyrelContext.class,0);
		}
		public ReldefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reldef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterReldef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitReldef(this);
		}
	}

	public final ReldefContext reldef() throws RecognitionException {
		ReldefContext _localctx = new ReldefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_reldef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==T__4) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(71);
				match(T__5);
				}
			}

			setState(74);
			((ReldefContext)_localctx).n = match(NAME);
			setState(75);
			match(T__6);
			setState(76);
			((ReldefContext)_localctx).m1 = fancyrel();
			((ReldefContext)_localctx).value = ((ReldefContext)_localctx).m1.value; _localctx.value.setName((((ReldefContext)_localctx).n!=null?((ReldefContext)_localctx).n.getText():null));
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

	public static class FancyrelContext extends ParserRuleContext {
		public Relation value;
		public RelationContext m1;
		public RelationContext m2;
		public SetToRelRelationContext s1;
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public SetToRelRelationContext setToRelRelation() {
			return getRuleContext(SetToRelRelationContext.class,0);
		}
		public FancyrelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fancyrel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterFancyrel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitFancyrel(this);
		}
	}

	public final FancyrelContext fancyrel() throws RecognitionException {
		FancyrelContext _localctx = new FancyrelContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fancyrel);
		int _la;
		try {
			int _alt;
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				((FancyrelContext)_localctx).m1 = relation(0);
				((FancyrelContext)_localctx).value = ((FancyrelContext)_localctx).m1.value;
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(81);
					match(T__7);
					setState(82);
					((FancyrelContext)_localctx).m2 = relation(0);
					((FancyrelContext)_localctx).value = new RelUnion(_localctx.value, ((FancyrelContext)_localctx).m2.value);
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				((FancyrelContext)_localctx).m1 = relation(0);
				((FancyrelContext)_localctx).value = ((FancyrelContext)_localctx).m1.value;
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(92);
					match(T__8);
					setState(93);
					((FancyrelContext)_localctx).m2 = relation(0);
					((FancyrelContext)_localctx).value = new RelInterSect(_localctx.value, ((FancyrelContext)_localctx).m2.value);
					}
					}
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				((FancyrelContext)_localctx).m1 = relation(0);
				((FancyrelContext)_localctx).value = ((FancyrelContext)_localctx).m1.value;
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(103);
						match(T__9);
						setState(104);
						((FancyrelContext)_localctx).m2 = relation(0);
						 ((FancyrelContext)_localctx).value =  new RelComposition(_localctx.value, ((FancyrelContext)_localctx).m2.value);
						}
						} 
					}
					setState(111);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				((FancyrelContext)_localctx).s1 = setToRelRelation();
				((FancyrelContext)_localctx).value =  ((FancyrelContext)_localctx).s1.value; 
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

	public static class RelationContext extends ParserRuleContext {
		public Relation value;
		public RelationContext m1;
		public BaseContext b1;
		public SetRelationContext s1;
		public RelationContext m2;
		public RelationContext m3;
		public BaseContext base() {
			return getRuleContext(BaseContext.class,0);
		}
		public SetRelationContext setRelation() {
			return getRuleContext(SetRelationContext.class,0);
		}
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitRelation(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		return relation(0);
	}

	private RelationContext relation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationContext _localctx = new RelationContext(_ctx, _parentState);
		RelationContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_relation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(118);
				((RelationContext)_localctx).b1 = base();
				((RelationContext)_localctx).value = ((RelationContext)_localctx).b1.value;
				}
				break;
			case 3:
				{
				setState(121);
				((RelationContext)_localctx).s1 = setRelation();
				((RelationContext)_localctx).value = ((RelationContext)_localctx).s1.value;
				}
				break;
			case 4:
				{
				setState(124);
				match(T__10);
				{
				setState(125);
				((RelationContext)_localctx).m1 = relation(0);
				setState(126);
				match(T__7);
				((RelationContext)_localctx).value = ((RelationContext)_localctx).m1.value;
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(129);
						((RelationContext)_localctx).m2 = relation(0);
						setState(130);
						match(T__7);
						((RelationContext)_localctx).value = new RelUnion(_localctx.value, ((RelationContext)_localctx).m2.value);
						}
						} 
					}
					setState(137);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(138);
				((RelationContext)_localctx).m3 = relation(0);
				setState(139);
				match(T__11);
				((RelationContext)_localctx).value = new RelUnion(_localctx.value, ((RelationContext)_localctx).m3.value);
				}
				break;
			case 5:
				{
				setState(142);
				match(T__10);
				setState(143);
				((RelationContext)_localctx).m1 = relation(0);
				setState(144);
				match(T__12);
				setState(145);
				((RelationContext)_localctx).m2 = relation(0);
				setState(146);
				match(T__11);
				((RelationContext)_localctx).value = new RelMinus(((RelationContext)_localctx).m1.value, ((RelationContext)_localctx).m2.value);
				}
				break;
			case 6:
				{
				setState(149);
				match(T__10);
				setState(150);
				((RelationContext)_localctx).m1 = relation(0);
				setState(151);
				match(T__8);
				setState(152);
				((RelationContext)_localctx).m2 = relation(0);
				setState(153);
				match(T__11);
				((RelationContext)_localctx).value = new RelInterSect(((RelationContext)_localctx).m1.value, ((RelationContext)_localctx).m2.value);
				}
				break;
			case 7:
				{
				setState(156);
				match(T__10);
				{
				setState(157);
				((RelationContext)_localctx).m1 = relation(0);
				setState(158);
				match(T__9);
				((RelationContext)_localctx).value = ((RelationContext)_localctx).m1.value;
				}
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(161);
						((RelationContext)_localctx).m2 = relation(0);
						setState(162);
						match(T__9);
						 ((RelationContext)_localctx).value = new RelComposition(_localctx.value, ((RelationContext)_localctx).m2.value);
						}
						} 
					}
					setState(169);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(170);
				((RelationContext)_localctx).m3 = relation(0);
				setState(171);
				match(T__11);
				 ((RelationContext)_localctx).value = new RelComposition(_localctx.value, ((RelationContext)_localctx).m3.value);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(182);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new RelationContext(_parentctx, _parentState);
						_localctx.m1 = _prevctx;
						_localctx.m1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relation);
						setState(176);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(177);
						match(T__13);
						((RelationContext)_localctx).value = new RelTrans(((RelationContext)_localctx).m1.value);
						}
						break;
					case 2:
						{
						_localctx = new RelationContext(_parentctx, _parentState);
						_localctx.m1 = _prevctx;
						_localctx.m1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relation);
						setState(179);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(180);
						match(T__14);
						((RelationContext)_localctx).value = new RelTransRef(((RelationContext)_localctx).m1.value);
						}
						break;
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class SetRelationContext extends ParserRuleContext {
		public Relation value;
		public ComplexEventTypeContext s1;
		public ComplexEventTypeContext s2;
		public List<ComplexEventTypeContext> complexEventType() {
			return getRuleContexts(ComplexEventTypeContext.class);
		}
		public ComplexEventTypeContext complexEventType(int i) {
			return getRuleContext(ComplexEventTypeContext.class,i);
		}
		public SetRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterSetRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitSetRelation(this);
		}
	}

	public final SetRelationContext setRelation() throws RecognitionException {
		SetRelationContext _localctx = new SetRelationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_setRelation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			((SetRelationContext)_localctx).s1 = complexEventType();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(188);
				match(T__14);
				}
			}

			setState(191);
			((SetRelationContext)_localctx).s2 = complexEventType();
			((SetRelationContext)_localctx).value = new RelSetToSet(((SetRelationContext)_localctx).s1.filter, ((SetRelationContext)_localctx).s2.filter);
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

	public static class RelToSetRelationContext extends ParserRuleContext {
		public Relation value;
		public FancyrelContext r;
		public ComplexEventTypeContext s;
		public FancyrelContext fancyrel() {
			return getRuleContext(FancyrelContext.class,0);
		}
		public ComplexEventTypeContext complexEventType() {
			return getRuleContext(ComplexEventTypeContext.class,0);
		}
		public RelToSetRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relToSetRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterRelToSetRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitRelToSetRelation(this);
		}
	}

	public final RelToSetRelationContext relToSetRelation() throws RecognitionException {
		RelToSetRelationContext _localctx = new RelToSetRelationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_relToSetRelation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			((RelToSetRelationContext)_localctx).r = fancyrel();
			setState(195);
			match(T__9);
			setState(196);
			((RelToSetRelationContext)_localctx).s = complexEventType();
			((RelToSetRelationContext)_localctx).value =  new RelRelToSet(((RelToSetRelationContext)_localctx).r.value, ((RelToSetRelationContext)_localctx).s.filter); children.add(_localctx.value); 
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

	public static class SetToRelRelationContext extends ParserRuleContext {
		public Relation value;
		public ComplexEventTypeContext s;
		public RelToSetRelationContext r;
		public ComplexEventTypeContext complexEventType() {
			return getRuleContext(ComplexEventTypeContext.class,0);
		}
		public List<RelToSetRelationContext> relToSetRelation() {
			return getRuleContexts(RelToSetRelationContext.class);
		}
		public RelToSetRelationContext relToSetRelation(int i) {
			return getRuleContext(RelToSetRelationContext.class,i);
		}
		public SetToRelRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setToRelRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterSetToRelRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitSetToRelRelation(this);
		}
	}

	public final SetToRelRelationContext setToRelRelation() throws RecognitionException {
		SetToRelRelationContext _localctx = new SetToRelRelationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_setToRelRelation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			((SetToRelRelationContext)_localctx).s = complexEventType();
			setState(202); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(200);
					match(T__9);
					setState(201);
					((SetToRelRelationContext)_localctx).r = relToSetRelation();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(204); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );

			    Relation child = children.remove(0);
			    while(!children.isEmpty()){
			       child = new RelComposition(child, children.remove(0));
			    }
			    ((SetToRelRelationContext)_localctx).value =  new RelSetToRel(((SetToRelRelationContext)_localctx).s.filter, child);
			    children.clear();

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

	public static class BaseContext extends ParserRuleContext {
		public Relation value;
		public Token n;
		public TerminalNode PO() { return getToken(ModelParser.PO, 0); }
		public TerminalNode POLOC() { return getToken(ModelParser.POLOC, 0); }
		public TerminalNode RFE() { return getToken(ModelParser.RFE, 0); }
		public TerminalNode RFI() { return getToken(ModelParser.RFI, 0); }
		public TerminalNode RF() { return getToken(ModelParser.RF, 0); }
		public TerminalNode FR() { return getToken(ModelParser.FR, 0); }
		public TerminalNode FRI() { return getToken(ModelParser.FRI, 0); }
		public TerminalNode FRE() { return getToken(ModelParser.FRE, 0); }
		public TerminalNode CO() { return getToken(ModelParser.CO, 0); }
		public TerminalNode COE() { return getToken(ModelParser.COE, 0); }
		public TerminalNode COI() { return getToken(ModelParser.COI, 0); }
		public TerminalNode AD() { return getToken(ModelParser.AD, 0); }
		public TerminalNode IDD() { return getToken(ModelParser.IDD, 0); }
		public TerminalNode ISH() { return getToken(ModelParser.ISH, 0); }
		public TerminalNode CD() { return getToken(ModelParser.CD, 0); }
		public TerminalNode STHD() { return getToken(ModelParser.STHD, 0); }
		public TerminalNode SLOC() { return getToken(ModelParser.SLOC, 0); }
		public TerminalNode MFENCE() { return getToken(ModelParser.MFENCE, 0); }
		public TerminalNode CTRLISYNC() { return getToken(ModelParser.CTRLISYNC, 0); }
		public TerminalNode LWSYNC() { return getToken(ModelParser.LWSYNC, 0); }
		public TerminalNode ISYNC() { return getToken(ModelParser.ISYNC, 0); }
		public TerminalNode SYNC() { return getToken(ModelParser.SYNC, 0); }
		public TerminalNode CTRLDIREKT() { return getToken(ModelParser.CTRLDIREKT, 0); }
		public TerminalNode CTRLISB() { return getToken(ModelParser.CTRLISB, 0); }
		public TerminalNode CTRL() { return getToken(ModelParser.CTRL, 0); }
		public TerminalNode ISB() { return getToken(ModelParser.ISB, 0); }
		public TerminalNode ADDR() { return getToken(ModelParser.ADDR, 0); }
		public TerminalNode DATA() { return getToken(ModelParser.DATA, 0); }
		public TerminalNode NAME() { return getToken(ModelParser.NAME, 0); }
		public TerminalNode EMPTY() { return getToken(ModelParser.EMPTY, 0); }
		public TerminalNode ID() { return getToken(ModelParser.ID, 0); }
		public BaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitBase(this);
		}
	}

	public final BaseContext base() throws RecognitionException {
		BaseContext _localctx = new BaseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_base);
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PO:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(PO);
				((BaseContext)_localctx).value = new BasicRelation("po");
				}
				break;
			case POLOC:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(POLOC);
				((BaseContext)_localctx).value = new BasicRelation("poloc");
				}
				break;
			case RFE:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				match(RFE);
				((BaseContext)_localctx).value = new BasicRelation("rfe");
				}
				break;
			case RFI:
				enterOuterAlt(_localctx, 4);
				{
				setState(214);
				match(RFI);
				((BaseContext)_localctx).value = new BasicRelation("rfi");
				}
				break;
			case RF:
				enterOuterAlt(_localctx, 5);
				{
				setState(216);
				match(RF);
				((BaseContext)_localctx).value = new BasicRelation("rf");
				}
				break;
			case FR:
				enterOuterAlt(_localctx, 6);
				{
				setState(218);
				match(FR);
				((BaseContext)_localctx).value = new BasicRelation("fr");
				}
				break;
			case FRI:
				enterOuterAlt(_localctx, 7);
				{
				setState(220);
				match(FRI);
				((BaseContext)_localctx).value = new BasicRelation("fri");
				}
				break;
			case FRE:
				enterOuterAlt(_localctx, 8);
				{
				setState(222);
				match(FRE);
				((BaseContext)_localctx).value = new BasicRelation("fre");
				}
				break;
			case CO:
				enterOuterAlt(_localctx, 9);
				{
				setState(224);
				match(CO);
				((BaseContext)_localctx).value = new BasicRelation("co");
				}
				break;
			case COE:
				enterOuterAlt(_localctx, 10);
				{
				setState(226);
				match(COE);
				((BaseContext)_localctx).value = new BasicRelation("coe");
				}
				break;
			case COI:
				enterOuterAlt(_localctx, 11);
				{
				setState(228);
				match(COI);
				((BaseContext)_localctx).value = new BasicRelation("coi");
				}
				break;
			case AD:
				enterOuterAlt(_localctx, 12);
				{
				setState(230);
				match(AD);
				((BaseContext)_localctx).value = new BasicRelation("po");
				}
				break;
			case IDD:
				enterOuterAlt(_localctx, 13);
				{
				setState(232);
				match(IDD);
				((BaseContext)_localctx).value = new BasicRelation("idd");
				}
				break;
			case ISH:
				enterOuterAlt(_localctx, 14);
				{
				setState(234);
				match(ISH);
				((BaseContext)_localctx).value = new BasicRelation("ish");
				}
				break;
			case CD:
				enterOuterAlt(_localctx, 15);
				{
				setState(236);
				match(CD);
				((BaseContext)_localctx).value = new BasicRelation("cd");
				}
				break;
			case STHD:
				enterOuterAlt(_localctx, 16);
				{
				setState(238);
				match(STHD);
				((BaseContext)_localctx).value = new BasicRelation("sthd");
				}
				break;
			case SLOC:
				enterOuterAlt(_localctx, 17);
				{
				setState(240);
				match(SLOC);
				((BaseContext)_localctx).value = new BasicRelation("sloc");
				}
				break;
			case MFENCE:
				enterOuterAlt(_localctx, 18);
				{
				setState(242);
				match(MFENCE);
				((BaseContext)_localctx).value = new BasicRelation("mfence");
				}
				break;
			case CTRLISYNC:
				enterOuterAlt(_localctx, 19);
				{
				setState(244);
				match(CTRLISYNC);
				((BaseContext)_localctx).value = new BasicRelation("ctrlisync");
				}
				break;
			case LWSYNC:
				enterOuterAlt(_localctx, 20);
				{
				setState(246);
				match(LWSYNC);
				((BaseContext)_localctx).value = new BasicRelation("lwsync");
				}
				break;
			case ISYNC:
				enterOuterAlt(_localctx, 21);
				{
				setState(248);
				match(ISYNC);
				((BaseContext)_localctx).value = new BasicRelation("isync");
				}
				break;
			case SYNC:
				enterOuterAlt(_localctx, 22);
				{
				setState(250);
				match(SYNC);
				((BaseContext)_localctx).value = new BasicRelation("sync");
				}
				break;
			case CTRLDIREKT:
				enterOuterAlt(_localctx, 23);
				{
				setState(252);
				match(CTRLDIREKT);
				((BaseContext)_localctx).value = new BasicRelation("ctrlDirect");
				}
				break;
			case CTRLISB:
				enterOuterAlt(_localctx, 24);
				{
				setState(254);
				match(CTRLISB);
				((BaseContext)_localctx).value = new BasicRelation("ctrlisb");
				}
				break;
			case CTRL:
				enterOuterAlt(_localctx, 25);
				{
				setState(256);
				match(CTRL);
				((BaseContext)_localctx).value = new BasicRelation("ctrl");
				}
				break;
			case ISB:
				enterOuterAlt(_localctx, 26);
				{
				setState(258);
				match(ISB);
				((BaseContext)_localctx).value = new BasicRelation("isb");
				}
				break;
			case ADDR:
				enterOuterAlt(_localctx, 27);
				{
				setState(260);
				match(ADDR);
				((BaseContext)_localctx).value = new EmptyRel();
				}
				break;
			case DATA:
				enterOuterAlt(_localctx, 28);
				{
				setState(262);
				match(DATA);
				((BaseContext)_localctx).value = new RelInterSect(new RelLocTrans(new BasicRelation("idd")), new RelSetToSet(new FilterBasic("R"), new FilterBasic("W")));
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 29);
				{
				setState(264);
				((BaseContext)_localctx).n = match(NAME);
				((BaseContext)_localctx).value = new RelDummy((((BaseContext)_localctx).n!=null?((BaseContext)_localctx).n.getText():null));
				}
				break;
			case EMPTY:
				enterOuterAlt(_localctx, 30);
				{
				setState(266);
				match(EMPTY);
				((BaseContext)_localctx).value = new EmptyRel();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 31);
				{
				setState(268);
				match(ID);
				((BaseContext)_localctx).value = new BasicRelation("id");
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

	public static class ComplexEventTypeContext extends ParserRuleContext {
		public FilterInterface filter;
		public EventTypeContext f1;
		public EventTypeCompositeContext f2;
		public EventTypeContext eventType() {
			return getRuleContext(EventTypeContext.class,0);
		}
		public EventTypeCompositeContext eventTypeComposite() {
			return getRuleContext(EventTypeCompositeContext.class,0);
		}
		public ComplexEventTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexEventType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterComplexEventType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitComplexEventType(this);
		}
	}

	public final ComplexEventTypeContext complexEventType() throws RecognitionException {
		ComplexEventTypeContext _localctx = new ComplexEventTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_complexEventType);
		try {
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				((ComplexEventTypeContext)_localctx).f1 = eventType();
				((ComplexEventTypeContext)_localctx).filter =  ((ComplexEventTypeContext)_localctx).f1.filter;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				((ComplexEventTypeContext)_localctx).f2 = eventTypeComposite();
				((ComplexEventTypeContext)_localctx).filter =  ((ComplexEventTypeContext)_localctx).f2.filter;
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

	public static class EventTypeContext extends ParserRuleContext {
		public FilterInterface filter;
		public Token t;
		public AtomicsContext t2;
		public TerminalNode EVENT_TYPE() { return getToken(ModelParser.EVENT_TYPE, 0); }
		public AtomicsContext atomics() {
			return getRuleContext(AtomicsContext.class,0);
		}
		public EventTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterEventType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitEventType(this);
		}
	}

	public final EventTypeContext eventType() throws RecognitionException {
		EventTypeContext _localctx = new EventTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_eventType);
		try {
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				match(T__15);
				setState(281);
				((EventTypeContext)_localctx).t = match(EVENT_TYPE);
				setState(282);
				match(T__11);
				((EventTypeContext)_localctx).filter =  new FilterBasic((((EventTypeContext)_localctx).t!=null?((EventTypeContext)_localctx).t.getText():null)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(T__16);
				setState(285);
				((EventTypeContext)_localctx).t = match(EVENT_TYPE);
				setState(286);
				match(T__17);
				((EventTypeContext)_localctx).filter =  new FilterBasic((((EventTypeContext)_localctx).t!=null?((EventTypeContext)_localctx).t.getText():null)); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
				((EventTypeContext)_localctx).t = match(EVENT_TYPE);
				((EventTypeContext)_localctx).filter =  new FilterBasic((((EventTypeContext)_localctx).t!=null?((EventTypeContext)_localctx).t.getText():null)); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(290);
				match(T__15);
				setState(291);
				((EventTypeContext)_localctx).t2 = atomics();
				setState(292);
				match(T__11);
				((EventTypeContext)_localctx).filter =  new FilterBasic((((EventTypeContext)_localctx).t2!=null?_input.getText(((EventTypeContext)_localctx).t2.start,((EventTypeContext)_localctx).t2.stop):null));
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(295);
				match(T__16);
				setState(296);
				((EventTypeContext)_localctx).t2 = atomics();
				setState(297);
				match(T__17);
				((EventTypeContext)_localctx).filter =  new FilterBasic((((EventTypeContext)_localctx).t2!=null?_input.getText(((EventTypeContext)_localctx).t2.start,((EventTypeContext)_localctx).t2.stop):null));
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(300);
				((EventTypeContext)_localctx).t2 = atomics();
				((EventTypeContext)_localctx).filter =  new FilterBasic((((EventTypeContext)_localctx).t2!=null?_input.getText(((EventTypeContext)_localctx).t2.start,((EventTypeContext)_localctx).t2.stop):null));
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

	public static class EventTypeCompositeContext extends ParserRuleContext {
		public FilterInterface filter;
		public ComplexEventTypeContext f1;
		public ComplexEventTypeContext f2;
		public List<ComplexEventTypeContext> complexEventType() {
			return getRuleContexts(ComplexEventTypeContext.class);
		}
		public ComplexEventTypeContext complexEventType(int i) {
			return getRuleContext(ComplexEventTypeContext.class,i);
		}
		public EventTypeCompositeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventTypeComposite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterEventTypeComposite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitEventTypeComposite(this);
		}
	}

	public final EventTypeCompositeContext eventTypeComposite() throws RecognitionException {
		EventTypeCompositeContext _localctx = new EventTypeCompositeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_eventTypeComposite);
		try {
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				match(T__16);
				setState(306);
				((EventTypeCompositeContext)_localctx).f1 = complexEventType();
				setState(307);
				match(T__8);
				setState(308);
				((EventTypeCompositeContext)_localctx).f2 = complexEventType();
				setState(309);
				match(T__17);
				((EventTypeCompositeContext)_localctx).filter =  new FilterIntersection(((EventTypeCompositeContext)_localctx).f1.filter, ((EventTypeCompositeContext)_localctx).f2.filter);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				match(T__16);
				setState(313);
				((EventTypeCompositeContext)_localctx).f1 = complexEventType();
				setState(314);
				match(T__7);
				setState(315);
				((EventTypeCompositeContext)_localctx).f2 = complexEventType();
				setState(316);
				match(T__17);
				((EventTypeCompositeContext)_localctx).filter =  new FilterUnion(((EventTypeCompositeContext)_localctx).f1.filter, ((EventTypeCompositeContext)_localctx).f2.filter);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(319);
				match(T__16);
				setState(320);
				((EventTypeCompositeContext)_localctx).f1 = complexEventType();
				setState(321);
				match(T__12);
				setState(322);
				((EventTypeCompositeContext)_localctx).f2 = complexEventType();
				setState(323);
				match(T__17);
				((EventTypeCompositeContext)_localctx).filter =  new FilterDifference(((EventTypeCompositeContext)_localctx).f1.filter, ((EventTypeCompositeContext)_localctx).f2.filter);
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

	public static class AtomicsContext extends ParserRuleContext {
		public String value;
		public ScContext a1;
		public RelAqcContext a2;
		public ReleaseContext a3;
		public AcquireContext a4;
		public ConsContext a5;
		public RelaxedContext a6;
		public NonAtomicContext a7;
		public ScContext sc() {
			return getRuleContext(ScContext.class,0);
		}
		public RelAqcContext relAqc() {
			return getRuleContext(RelAqcContext.class,0);
		}
		public ReleaseContext release() {
			return getRuleContext(ReleaseContext.class,0);
		}
		public AcquireContext acquire() {
			return getRuleContext(AcquireContext.class,0);
		}
		public ConsContext cons() {
			return getRuleContext(ConsContext.class,0);
		}
		public RelaxedContext relaxed() {
			return getRuleContext(RelaxedContext.class,0);
		}
		public NonAtomicContext nonAtomic() {
			return getRuleContext(NonAtomicContext.class,0);
		}
		public AtomicsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterAtomics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitAtomics(this);
		}
	}

	public final AtomicsContext atomics() throws RecognitionException {
		AtomicsContext _localctx = new AtomicsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_atomics);
		try {
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SC:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				((AtomicsContext)_localctx).a1 = sc();
				((AtomicsContext)_localctx).value =  ((AtomicsContext)_localctx).a1.value; 
				}
				break;
			case REL_ACQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				((AtomicsContext)_localctx).a2 = relAqc();
				((AtomicsContext)_localctx).value =  ((AtomicsContext)_localctx).a2.value; 
				}
				break;
			case RELEASE:
				enterOuterAlt(_localctx, 3);
				{
				setState(334);
				((AtomicsContext)_localctx).a3 = release();
				((AtomicsContext)_localctx).value =  ((AtomicsContext)_localctx).a3.value; 
				}
				break;
			case ACQUIRE:
				enterOuterAlt(_localctx, 4);
				{
				setState(337);
				((AtomicsContext)_localctx).a4 = acquire();
				((AtomicsContext)_localctx).value =  ((AtomicsContext)_localctx).a4.value; 
				}
				break;
			case CONSUME:
				enterOuterAlt(_localctx, 5);
				{
				setState(340);
				((AtomicsContext)_localctx).a5 = cons();
				((AtomicsContext)_localctx).value =  ((AtomicsContext)_localctx).a5.value; 
				}
				break;
			case RELAXED:
				enterOuterAlt(_localctx, 6);
				{
				setState(343);
				((AtomicsContext)_localctx).a6 = relaxed();
				((AtomicsContext)_localctx).value =  ((AtomicsContext)_localctx).a6.value; 
				}
				break;
			case NON_ATOMIC:
				enterOuterAlt(_localctx, 7);
				{
				setState(346);
				((AtomicsContext)_localctx).a7 = nonAtomic();
				((AtomicsContext)_localctx).value =  ((AtomicsContext)_localctx).a7.value; 
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

	public static class ScContext extends ParserRuleContext {
		public String value;
		public Token v;
		public TerminalNode SC() { return getToken(ModelParser.SC, 0); }
		public ScContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterSc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitSc(this);
		}
	}

	public final ScContext sc() throws RecognitionException {
		ScContext _localctx = new ScContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			((ScContext)_localctx).v = match(SC);
			((ScContext)_localctx).value =  "_sc";
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

	public static class RelAqcContext extends ParserRuleContext {
		public String value;
		public Token v;
		public TerminalNode REL_ACQ() { return getToken(ModelParser.REL_ACQ, 0); }
		public RelAqcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relAqc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterRelAqc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitRelAqc(this);
		}
	}

	public final RelAqcContext relAqc() throws RecognitionException {
		RelAqcContext _localctx = new RelAqcContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_relAqc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			((RelAqcContext)_localctx).v = match(REL_ACQ);
			((RelAqcContext)_localctx).value =  "_rel_acq";
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

	public static class ReleaseContext extends ParserRuleContext {
		public String value;
		public Token v;
		public TerminalNode RELEASE() { return getToken(ModelParser.RELEASE, 0); }
		public ReleaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_release; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterRelease(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitRelease(this);
		}
	}

	public final ReleaseContext release() throws RecognitionException {
		ReleaseContext _localctx = new ReleaseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_release);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			((ReleaseContext)_localctx).v = match(RELEASE);
			((ReleaseContext)_localctx).value =  "_rel";
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

	public static class AcquireContext extends ParserRuleContext {
		public String value;
		public Token v;
		public TerminalNode ACQUIRE() { return getToken(ModelParser.ACQUIRE, 0); }
		public AcquireContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acquire; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterAcquire(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitAcquire(this);
		}
	}

	public final AcquireContext acquire() throws RecognitionException {
		AcquireContext _localctx = new AcquireContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_acquire);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			((AcquireContext)_localctx).v = match(ACQUIRE);
			((AcquireContext)_localctx).value =  "_acq";
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

	public static class ConsContext extends ParserRuleContext {
		public String value;
		public Token v;
		public TerminalNode CONSUME() { return getToken(ModelParser.CONSUME, 0); }
		public ConsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterCons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitCons(this);
		}
	}

	public final ConsContext cons() throws RecognitionException {
		ConsContext _localctx = new ConsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cons);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			((ConsContext)_localctx).v = match(CONSUME);
			((ConsContext)_localctx).value =  "_con";
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

	public static class RelaxedContext extends ParserRuleContext {
		public String value;
		public Token v;
		public TerminalNode RELAXED() { return getToken(ModelParser.RELAXED, 0); }
		public RelaxedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relaxed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterRelaxed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitRelaxed(this);
		}
	}

	public final RelaxedContext relaxed() throws RecognitionException {
		RelaxedContext _localctx = new RelaxedContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_relaxed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			((RelaxedContext)_localctx).v = match(RELAXED);
			((RelaxedContext)_localctx).value =  "_rx";
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

	public static class NonAtomicContext extends ParserRuleContext {
		public String value;
		public Token v;
		public TerminalNode NON_ATOMIC() { return getToken(ModelParser.NON_ATOMIC, 0); }
		public NonAtomicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonAtomic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterNonAtomic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitNonAtomic(this);
		}
	}

	public final NonAtomicContext nonAtomic() throws RecognitionException {
		NonAtomicContext _localctx = new NonAtomicContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_nonAtomic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			((NonAtomicContext)_localctx).v = match(NON_ATOMIC);
			((NonAtomicContext)_localctx).value =  "_na";
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
		case 4:
			return relation_sempred((RelationContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean relation_sempred(RelationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3H\u0177\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\5\2-\n\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\6\2\65\n\2\r\2\16\2\66\3\3\3\3\3\3\3\3\3\3\5\3>\n\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3E\n\3\5\3G\n\3\3\4\3\4\5\4K\n\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\7\5X\n\5\f\5\16\5[\13\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5c\n"+
		"\5\f\5\16\5f\13\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5n\n\5\f\5\16\5q\13\5\3\5"+
		"\3\5\3\5\5\5v\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\7\6\u0088\n\6\f\6\16\6\u008b\13\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\7\6\u00a8\n\6\f\6\16\6\u00ab\13\6\3\6\3\6\3\6\3\6\5\6\u00b1"+
		"\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00b9\n\6\f\6\16\6\u00bc\13\6\3\7\3\7"+
		"\5\7\u00c0\n\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\6\t\u00cd\n"+
		"\t\r\t\16\t\u00ce\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0111"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0119\n\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u0132\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0149\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u0160\n\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\2\3"+
		"\n\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\3\3\2\6\7\2\u01a7"+
		"\2*\3\2\2\2\4F\3\2\2\2\6H\3\2\2\2\bu\3\2\2\2\n\u00b0\3\2\2\2\f\u00bd\3"+
		"\2\2\2\16\u00c4\3\2\2\2\20\u00c9\3\2\2\2\22\u0110\3\2\2\2\24\u0118\3\2"+
		"\2\2\26\u0131\3\2\2\2\30\u0148\3\2\2\2\32\u015f\3\2\2\2\34\u0161\3\2\2"+
		"\2\36\u0164\3\2\2\2 \u0167\3\2\2\2\"\u016a\3\2\2\2$\u016d\3\2\2\2&\u0170"+
		"\3\2\2\2(\u0173\3\2\2\2*,\b\2\1\2+-\7C\2\2,+\3\2\2\2,-\3\2\2\2-\64\3\2"+
		"\2\2./\5\4\3\2/\60\b\2\1\2\60\65\3\2\2\2\61\62\5\6\4\2\62\63\b\2\1\2\63"+
		"\65\3\2\2\2\64.\3\2\2\2\64\61\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67"+
		"\3\2\2\2\67\3\3\2\2\289\7\3\2\29:\5\b\5\2:=\b\3\1\2;<\7\4\2\2<>\7B\2\2"+
		"=;\3\2\2\2=>\3\2\2\2>G\3\2\2\2?@\7\5\2\2@A\5\b\5\2AD\b\3\1\2BC\7\4\2\2"+
		"CE\7B\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2F8\3\2\2\2F?\3\2\2\2G\5\3\2\2\2"+
		"HJ\t\2\2\2IK\7\b\2\2JI\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\7B\2\2MN\7\t\2\2"+
		"NO\5\b\5\2OP\b\4\1\2P\7\3\2\2\2QR\5\n\6\2RY\b\5\1\2ST\7\n\2\2TU\5\n\6"+
		"\2UV\b\5\1\2VX\3\2\2\2WS\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Zv\3\2\2"+
		"\2[Y\3\2\2\2\\]\5\n\6\2]d\b\5\1\2^_\7\13\2\2_`\5\n\6\2`a\b\5\1\2ac\3\2"+
		"\2\2b^\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2ev\3\2\2\2fd\3\2\2\2gh\5\n"+
		"\6\2ho\b\5\1\2ij\7\f\2\2jk\5\n\6\2kl\b\5\1\2ln\3\2\2\2mi\3\2\2\2nq\3\2"+
		"\2\2om\3\2\2\2op\3\2\2\2pv\3\2\2\2qo\3\2\2\2rs\5\20\t\2st\b\5\1\2tv\3"+
		"\2\2\2uQ\3\2\2\2u\\\3\2\2\2ug\3\2\2\2ur\3\2\2\2v\t\3\2\2\2w\u00b1\b\6"+
		"\1\2xy\5\22\n\2yz\b\6\1\2z\u00b1\3\2\2\2{|\5\f\7\2|}\b\6\1\2}\u00b1\3"+
		"\2\2\2~\177\7\r\2\2\177\u0080\5\n\6\2\u0080\u0081\7\n\2\2\u0081\u0082"+
		"\b\6\1\2\u0082\u0089\3\2\2\2\u0083\u0084\5\n\6\2\u0084\u0085\7\n\2\2\u0085"+
		"\u0086\b\6\1\2\u0086\u0088\3\2\2\2\u0087\u0083\3\2\2\2\u0088\u008b\3\2"+
		"\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008c\u008d\5\n\6\2\u008d\u008e\7\16\2\2\u008e\u008f\b"+
		"\6\1\2\u008f\u00b1\3\2\2\2\u0090\u0091\7\r\2\2\u0091\u0092\5\n\6\2\u0092"+
		"\u0093\7\17\2\2\u0093\u0094\5\n\6\2\u0094\u0095\7\16\2\2\u0095\u0096\b"+
		"\6\1\2\u0096\u00b1\3\2\2\2\u0097\u0098\7\r\2\2\u0098\u0099\5\n\6\2\u0099"+
		"\u009a\7\13\2\2\u009a\u009b\5\n\6\2\u009b\u009c\7\16\2\2\u009c\u009d\b"+
		"\6\1\2\u009d\u00b1\3\2\2\2\u009e\u009f\7\r\2\2\u009f\u00a0\5\n\6\2\u00a0"+
		"\u00a1\7\f\2\2\u00a1\u00a2\b\6\1\2\u00a2\u00a9\3\2\2\2\u00a3\u00a4\5\n"+
		"\6\2\u00a4\u00a5\7\f\2\2\u00a5\u00a6\b\6\1\2\u00a6\u00a8\3\2\2\2\u00a7"+
		"\u00a3\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\5\n\6\2\u00ad"+
		"\u00ae\7\16\2\2\u00ae\u00af\b\6\1\2\u00af\u00b1\3\2\2\2\u00b0w\3\2\2\2"+
		"\u00b0x\3\2\2\2\u00b0{\3\2\2\2\u00b0~\3\2\2\2\u00b0\u0090\3\2\2\2\u00b0"+
		"\u0097\3\2\2\2\u00b0\u009e\3\2\2\2\u00b1\u00ba\3\2\2\2\u00b2\u00b3\f\4"+
		"\2\2\u00b3\u00b4\7\20\2\2\u00b4\u00b9\b\6\1\2\u00b5\u00b6\f\3\2\2\u00b6"+
		"\u00b7\7\21\2\2\u00b7\u00b9\b\6\1\2\u00b8\u00b2\3\2\2\2\u00b8\u00b5\3"+
		"\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\13\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00bf\5\24\13\2\u00be\u00c0\7\21"+
		"\2\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00c2\5\24\13\2\u00c2\u00c3\b\7\1\2\u00c3\r\3\2\2\2\u00c4\u00c5\5\b\5"+
		"\2\u00c5\u00c6\7\f\2\2\u00c6\u00c7\5\24\13\2\u00c7\u00c8\b\b\1\2\u00c8"+
		"\17\3\2\2\2\u00c9\u00cc\5\24\13\2\u00ca\u00cb\7\f\2\2\u00cb\u00cd\5\16"+
		"\b\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\b\t\1\2\u00d1\21\3\2\2"+
		"\2\u00d2\u00d3\7\25\2\2\u00d3\u0111\b\n\1\2\u00d4\u00d5\7\26\2\2\u00d5"+
		"\u0111\b\n\1\2\u00d6\u00d7\7\27\2\2\u00d7\u0111\b\n\1\2\u00d8\u00d9\7"+
		"\30\2\2\u00d9\u0111\b\n\1\2\u00da\u00db\7\31\2\2\u00db\u0111\b\n\1\2\u00dc"+
		"\u00dd\7\32\2\2\u00dd\u0111\b\n\1\2\u00de\u00df\7\34\2\2\u00df\u0111\b"+
		"\n\1\2\u00e0\u00e1\7\33\2\2\u00e1\u0111\b\n\1\2\u00e2\u00e3\7\35\2\2\u00e3"+
		"\u0111\b\n\1\2\u00e4\u00e5\7\36\2\2\u00e5\u0111\b\n\1\2\u00e6\u00e7\7"+
		"\37\2\2\u00e7\u0111\b\n\1\2\u00e8\u00e9\7 \2\2\u00e9\u0111\b\n\1\2\u00ea"+
		"\u00eb\7!\2\2\u00eb\u0111\b\n\1\2\u00ec\u00ed\7\"\2\2\u00ed\u0111\b\n"+
		"\1\2\u00ee\u00ef\7#\2\2\u00ef\u0111\b\n\1\2\u00f0\u00f1\7$\2\2\u00f1\u0111"+
		"\b\n\1\2\u00f2\u00f3\7%\2\2\u00f3\u0111\b\n\1\2\u00f4\u00f5\7&\2\2\u00f5"+
		"\u0111\b\n\1\2\u00f6\u00f7\7(\2\2\u00f7\u0111\b\n\1\2\u00f8\u00f9\7\'"+
		"\2\2\u00f9\u0111\b\n\1\2\u00fa\u00fb\7)\2\2\u00fb\u0111\b\n\1\2\u00fc"+
		"\u00fd\7*\2\2\u00fd\u0111\b\n\1\2\u00fe\u00ff\7+\2\2\u00ff\u0111\b\n\1"+
		"\2\u0100\u0101\7,\2\2\u0101\u0111\b\n\1\2\u0102\u0103\7-\2\2\u0103\u0111"+
		"\b\n\1\2\u0104\u0105\7.\2\2\u0105\u0111\b\n\1\2\u0106\u0107\7/\2\2\u0107"+
		"\u0111\b\n\1\2\u0108\u0109\7\60\2\2\u0109\u0111\b\n\1\2\u010a\u010b\7"+
		"B\2\2\u010b\u0111\b\n\1\2\u010c\u010d\7\62\2\2\u010d\u0111\b\n\1\2\u010e"+
		"\u010f\7\61\2\2\u010f\u0111\b\n\1\2\u0110\u00d2\3\2\2\2\u0110\u00d4\3"+
		"\2\2\2\u0110\u00d6\3\2\2\2\u0110\u00d8\3\2\2\2\u0110\u00da\3\2\2\2\u0110"+
		"\u00dc\3\2\2\2\u0110\u00de\3\2\2\2\u0110\u00e0\3\2\2\2\u0110\u00e2\3\2"+
		"\2\2\u0110\u00e4\3\2\2\2\u0110\u00e6\3\2\2\2\u0110\u00e8\3\2\2\2\u0110"+
		"\u00ea\3\2\2\2\u0110\u00ec\3\2\2\2\u0110\u00ee\3\2\2\2\u0110\u00f0\3\2"+
		"\2\2\u0110\u00f2\3\2\2\2\u0110\u00f4\3\2\2\2\u0110\u00f6\3\2\2\2\u0110"+
		"\u00f8\3\2\2\2\u0110\u00fa\3\2\2\2\u0110\u00fc\3\2\2\2\u0110\u00fe\3\2"+
		"\2\2\u0110\u0100\3\2\2\2\u0110\u0102\3\2\2\2\u0110\u0104\3\2\2\2\u0110"+
		"\u0106\3\2\2\2\u0110\u0108\3\2\2\2\u0110\u010a\3\2\2\2\u0110\u010c\3\2"+
		"\2\2\u0110\u010e\3\2\2\2\u0111\23\3\2\2\2\u0112\u0113\5\26\f\2\u0113\u0114"+
		"\b\13\1\2\u0114\u0119\3\2\2\2\u0115\u0116\5\30\r\2\u0116\u0117\b\13\1"+
		"\2\u0117\u0119\3\2\2\2\u0118\u0112\3\2\2\2\u0118\u0115\3\2\2\2\u0119\25"+
		"\3\2\2\2\u011a\u011b\7\22\2\2\u011b\u011c\7\63\2\2\u011c\u011d\7\16\2"+
		"\2\u011d\u0132\b\f\1\2\u011e\u011f\7\23\2\2\u011f\u0120\7\63\2\2\u0120"+
		"\u0121\7\24\2\2\u0121\u0132\b\f\1\2\u0122\u0123\7\63\2\2\u0123\u0132\b"+
		"\f\1\2\u0124\u0125\7\22\2\2\u0125\u0126\5\32\16\2\u0126\u0127\7\16\2\2"+
		"\u0127\u0128\b\f\1\2\u0128\u0132\3\2\2\2\u0129\u012a\7\23\2\2\u012a\u012b"+
		"\5\32\16\2\u012b\u012c\7\24\2\2\u012c\u012d\b\f\1\2\u012d\u0132\3\2\2"+
		"\2\u012e\u012f\5\32\16\2\u012f\u0130\b\f\1\2\u0130\u0132\3\2\2\2\u0131"+
		"\u011a\3\2\2\2\u0131\u011e\3\2\2\2\u0131\u0122\3\2\2\2\u0131\u0124\3\2"+
		"\2\2\u0131\u0129\3\2\2\2\u0131\u012e\3\2\2\2\u0132\27\3\2\2\2\u0133\u0134"+
		"\7\23\2\2\u0134\u0135\5\24\13\2\u0135\u0136\7\13\2\2\u0136\u0137\5\24"+
		"\13\2\u0137\u0138\7\24\2\2\u0138\u0139\b\r\1\2\u0139\u0149\3\2\2\2\u013a"+
		"\u013b\7\23\2\2\u013b\u013c\5\24\13\2\u013c\u013d\7\n\2\2\u013d\u013e"+
		"\5\24\13\2\u013e\u013f\7\24\2\2\u013f\u0140\b\r\1\2\u0140\u0149\3\2\2"+
		"\2\u0141\u0142\7\23\2\2\u0142\u0143\5\24\13\2\u0143\u0144\7\17\2\2\u0144"+
		"\u0145\5\24\13\2\u0145\u0146\7\24\2\2\u0146\u0147\b\r\1\2\u0147\u0149"+
		"\3\2\2\2\u0148\u0133\3\2\2\2\u0148\u013a\3\2\2\2\u0148\u0141\3\2\2\2\u0149"+
		"\31\3\2\2\2\u014a\u014b\5\34\17\2\u014b\u014c\b\16\1\2\u014c\u0160\3\2"+
		"\2\2\u014d\u014e\5\36\20\2\u014e\u014f\b\16\1\2\u014f\u0160\3\2\2\2\u0150"+
		"\u0151\5 \21\2\u0151\u0152\b\16\1\2\u0152\u0160\3\2\2\2\u0153\u0154\5"+
		"\"\22\2\u0154\u0155\b\16\1\2\u0155\u0160\3\2\2\2\u0156\u0157\5$\23\2\u0157"+
		"\u0158\b\16\1\2\u0158\u0160\3\2\2\2\u0159\u015a\5&\24\2\u015a\u015b\b"+
		"\16\1\2\u015b\u0160\3\2\2\2\u015c\u015d\5(\25\2\u015d\u015e\b\16\1\2\u015e"+
		"\u0160\3\2\2\2\u015f\u014a\3\2\2\2\u015f\u014d\3\2\2\2\u015f\u0150\3\2"+
		"\2\2\u015f\u0153\3\2\2\2\u015f\u0156\3\2\2\2\u015f\u0159\3\2\2\2\u015f"+
		"\u015c\3\2\2\2\u0160\33\3\2\2\2\u0161\u0162\7;\2\2\u0162\u0163\b\17\1"+
		"\2\u0163\35\3\2\2\2\u0164\u0165\7<\2\2\u0165\u0166\b\20\1\2\u0166\37\3"+
		"\2\2\2\u0167\u0168\7=\2\2\u0168\u0169\b\21\1\2\u0169!\3\2\2\2\u016a\u016b"+
		"\7>\2\2\u016b\u016c\b\22\1\2\u016c#\3\2\2\2\u016d\u016e\7?\2\2\u016e\u016f"+
		"\b\23\1\2\u016f%\3\2\2\2\u0170\u0171\7@\2\2\u0171\u0172\b\24\1\2\u0172"+
		"\'\3\2\2\2\u0173\u0174\7A\2\2\u0174\u0175\b\25\1\2\u0175)\3\2\2\2\31,"+
		"\64\66=DFJYdou\u0089\u00a9\u00b0\u00b8\u00ba\u00bf\u00ce\u0110\u0118\u0131"+
		"\u0148\u015f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}