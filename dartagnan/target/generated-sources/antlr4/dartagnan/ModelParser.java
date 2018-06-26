// Generated from Model.g4 by ANTLR 4.7

package dartagnan;
import dartagnan.wmm.*;
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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, PO=16, POLOC=17, 
		RFE=18, RFI=19, RF=20, FR=21, FRE=22, FRI=23, CO=24, COE=25, COI=26, AD=27, 
		IDD=28, ISH=29, CD=30, STHD=31, SLOC=32, MFENCE=33, LWSYNC=34, CTRLISYNC=35, 
		ISYNC=36, SYNC=37, CTRLDIREKT=38, CTRLISB=39, CTRL=40, ISB=41, ADDR=42, 
		DATA=43, ID=44, EMPTY=45, EVENT_SET=46, EVENT_TYPE=47, RMW=48, LKW=49, 
		ATOMIC=50, READ=51, WRITE=52, INIT=53, MEMORY=54, NAME=55, MCMNAME=56, 
		WS=57, ENDE=58, ML_COMMENT=59, INCLUDE=60, MODELNAME=61;
	public static final int
		RULE_mcm = 0, RULE_axiom = 1, RULE_reldef = 2, RULE_fancyrel = 3, RULE_relation = 4, 
		RULE_setRelation = 5, RULE_relToSetRelation = 6, RULE_setToRelRelation = 7, 
		RULE_base = 8;
	public static final String[] ruleNames = {
		"mcm", "axiom", "reldef", "fancyrel", "relation", "setRelation", "relToSetRelation", 
		"setToRelRelation", "base"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'acyclic'", "'as'", "'irreflexive'", "'let'", "'and'", "'rec'", 
		"'='", "'|'", "'&'", "';'", "'('", "')'", "'\\'", "'+'", "'*'", "'po'", 
		"'po-loc'", "'rfe'", "'rfi'", "'rf'", "'fr'", "'fre'", "'fri'", "'co'", 
		"'coe'", "'coi'", "'ad'", "'idd'", "'ish'", "'cd'", "'sthd'", "'sloc'", 
		"'mfence'", "'lwsync'", "'ctrlisync'", "'isync'", "'sync'", "'ctrlDirect'", 
		"'ctrlisb'", "'ctrl'", "'isb'", "'addr'", "'data'", "'id'", "'0'", null, 
		null, "'RMW'", "'LKW'", "'A'", "'R'", "'W'", "'I'", "'M'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "PO", "POLOC", "RFE", "RFI", "RF", "FR", "FRE", 
		"FRI", "CO", "COE", "COI", "AD", "IDD", "ISH", "CD", "STHD", "SLOC", "MFENCE", 
		"LWSYNC", "CTRLISYNC", "ISYNC", "SYNC", "CTRLDIREKT", "CTRLISB", "CTRL", 
		"ISB", "ADDR", "DATA", "ID", "EMPTY", "EVENT_SET", "EVENT_TYPE", "RMW", 
		"LKW", "ATOMIC", "READ", "WRITE", "INIT", "MEMORY", "NAME", "MCMNAME", 
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
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MCMNAME) {
				{
				setState(19);
				match(MCMNAME);
				}
			}

			setState(28); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(28);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__2:
					{
					setState(22);
					((McmContext)_localctx).ax1 = axiom();
					_localctx.value.addAxiom(((McmContext)_localctx).ax1.value);
					}
					break;
				case T__3:
				case T__4:
					{
					setState(25);
					((McmContext)_localctx).r1 = reldef();
					_localctx.value.addRel(((McmContext)_localctx).r1.value);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(30); 
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
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(T__0);
				setState(33);
				((AxiomContext)_localctx).m1 = fancyrel();
				((AxiomContext)_localctx).value =   new Acyclic(((AxiomContext)_localctx).m1.value);
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(35);
					match(T__1);
					setState(36);
					match(NAME);
					}
				}

				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				match(T__2);
				setState(40);
				((AxiomContext)_localctx).m1 = fancyrel();
				((AxiomContext)_localctx).value =   new Irreflexive(((AxiomContext)_localctx).m1.value);
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(42);
					match(T__1);
					setState(43);
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
			setState(48);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==T__4) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(49);
				match(T__5);
				}
			}

			setState(52);
			((ReldefContext)_localctx).n = match(NAME);
			setState(53);
			match(T__6);
			setState(54);
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
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				((FancyrelContext)_localctx).m1 = relation(0);
				((FancyrelContext)_localctx).value = ((FancyrelContext)_localctx).m1.value;
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(59);
					match(T__7);
					setState(60);
					((FancyrelContext)_localctx).m2 = relation(0);
					((FancyrelContext)_localctx).value = new RelUnion(_localctx.value, ((FancyrelContext)_localctx).m2.value);
					}
					}
					setState(67);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				((FancyrelContext)_localctx).m1 = relation(0);
				((FancyrelContext)_localctx).value = ((FancyrelContext)_localctx).m1.value;
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(70);
					match(T__8);
					setState(71);
					((FancyrelContext)_localctx).m2 = relation(0);
					((FancyrelContext)_localctx).value = new RelInterSect(_localctx.value, ((FancyrelContext)_localctx).m2.value);
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				((FancyrelContext)_localctx).m1 = relation(0);
				((FancyrelContext)_localctx).value = ((FancyrelContext)_localctx).m1.value;
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(81);
						match(T__9);
						setState(82);
						((FancyrelContext)_localctx).m2 = relation(0);
						 ((FancyrelContext)_localctx).value =  new RelComposition(_localctx.value, ((FancyrelContext)_localctx).m2.value);
						}
						} 
					}
					setState(89);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
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
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(96);
				((RelationContext)_localctx).b1 = base();
				((RelationContext)_localctx).value = ((RelationContext)_localctx).b1.value;
				}
				break;
			case 3:
				{
				setState(99);
				((RelationContext)_localctx).s1 = setRelation();
				((RelationContext)_localctx).value = ((RelationContext)_localctx).s1.value;
				}
				break;
			case 4:
				{
				setState(102);
				match(T__10);
				{
				setState(103);
				((RelationContext)_localctx).m1 = relation(0);
				setState(104);
				match(T__7);
				((RelationContext)_localctx).value = ((RelationContext)_localctx).m1.value;
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(107);
						((RelationContext)_localctx).m2 = relation(0);
						setState(108);
						match(T__7);
						((RelationContext)_localctx).value = new RelUnion(_localctx.value, ((RelationContext)_localctx).m2.value);
						}
						} 
					}
					setState(115);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(116);
				((RelationContext)_localctx).m3 = relation(0);
				setState(117);
				match(T__11);
				((RelationContext)_localctx).value = new RelUnion(_localctx.value, ((RelationContext)_localctx).m3.value);
				}
				break;
			case 5:
				{
				setState(120);
				match(T__10);
				setState(121);
				((RelationContext)_localctx).m1 = relation(0);
				setState(122);
				match(T__12);
				setState(123);
				((RelationContext)_localctx).m2 = relation(0);
				setState(124);
				match(T__11);
				((RelationContext)_localctx).value = new RelMinus(((RelationContext)_localctx).m1.value, ((RelationContext)_localctx).m2.value);
				}
				break;
			case 6:
				{
				setState(127);
				match(T__10);
				setState(128);
				((RelationContext)_localctx).m1 = relation(0);
				setState(129);
				match(T__8);
				setState(130);
				((RelationContext)_localctx).m2 = relation(0);
				setState(131);
				match(T__11);
				((RelationContext)_localctx).value = new RelInterSect(((RelationContext)_localctx).m1.value, ((RelationContext)_localctx).m2.value);
				}
				break;
			case 7:
				{
				setState(134);
				match(T__10);
				{
				setState(135);
				((RelationContext)_localctx).m1 = relation(0);
				setState(136);
				match(T__9);
				((RelationContext)_localctx).value = ((RelationContext)_localctx).m1.value;
				}
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(139);
						((RelationContext)_localctx).m2 = relation(0);
						setState(140);
						match(T__9);
						System.out.println("relComposition 2"); ((RelationContext)_localctx).value = new RelComposition(_localctx.value, ((RelationContext)_localctx).m2.value);
						}
						} 
					}
					setState(147);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(148);
				((RelationContext)_localctx).m3 = relation(0);
				setState(149);
				match(T__11);
				System.out.println("relComposition 3"); ((RelationContext)_localctx).value = new RelComposition(_localctx.value, ((RelationContext)_localctx).m3.value);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(162);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(160);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new RelationContext(_parentctx, _parentState);
						_localctx.m1 = _prevctx;
						_localctx.m1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relation);
						setState(154);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(155);
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
						setState(157);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(158);
						match(T__14);
						((RelationContext)_localctx).value = new RelTransRef(((RelationContext)_localctx).m1.value);
						}
						break;
					}
					} 
				}
				setState(164);
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
		public Token s1;
		public Token s2;
		public List<TerminalNode> EVENT_SET() { return getTokens(ModelParser.EVENT_SET); }
		public TerminalNode EVENT_SET(int i) {
			return getToken(ModelParser.EVENT_SET, i);
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
			setState(165);
			((SetRelationContext)_localctx).s1 = match(EVENT_SET);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(166);
				match(T__14);
				}
			}

			setState(169);
			((SetRelationContext)_localctx).s2 = match(EVENT_SET);
			((SetRelationContext)_localctx).value = new RelSetToSet((((SetRelationContext)_localctx).s1!=null?((SetRelationContext)_localctx).s1.getText():null), (((SetRelationContext)_localctx).s2!=null?((SetRelationContext)_localctx).s2.getText():null));
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
		public Token s;
		public FancyrelContext fancyrel() {
			return getRuleContext(FancyrelContext.class,0);
		}
		public TerminalNode EVENT_SET() { return getToken(ModelParser.EVENT_SET, 0); }
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
			setState(172);
			((RelToSetRelationContext)_localctx).r = fancyrel();
			setState(173);
			match(T__9);
			setState(174);
			((RelToSetRelationContext)_localctx).s = match(EVENT_SET);
			((RelToSetRelationContext)_localctx).value =  new RelRelToSet(((RelToSetRelationContext)_localctx).r.value, (((RelToSetRelationContext)_localctx).s!=null?((RelToSetRelationContext)_localctx).s.getText():null)); children.add(_localctx.value); 
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
		public Token s;
		public RelToSetRelationContext r;
		public TerminalNode EVENT_SET() { return getToken(ModelParser.EVENT_SET, 0); }
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
			setState(177);
			((SetToRelRelationContext)_localctx).s = match(EVENT_SET);
			setState(180); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(178);
					match(T__9);
					setState(179);
					((SetToRelRelationContext)_localctx).r = relToSetRelation();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(182); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );

			    Relation child = children.remove(0);
			    while(!children.isEmpty()){
			       child = new RelComposition(child, children.remove(0));
			    }
			    ((SetToRelRelationContext)_localctx).value =  new RelSetToRel((((SetToRelRelationContext)_localctx).s!=null?((SetToRelRelationContext)_localctx).s.getText():null), child);
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
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PO:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(PO);
				((BaseContext)_localctx).value = new BasicRelation("po");
				}
				break;
			case POLOC:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(POLOC);
				((BaseContext)_localctx).value = new BasicRelation("poloc");
				}
				break;
			case RFE:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				match(RFE);
				((BaseContext)_localctx).value = new BasicRelation("rfe");
				}
				break;
			case RFI:
				enterOuterAlt(_localctx, 4);
				{
				setState(192);
				match(RFI);
				((BaseContext)_localctx).value = new BasicRelation("rfi");
				}
				break;
			case RF:
				enterOuterAlt(_localctx, 5);
				{
				setState(194);
				match(RF);
				((BaseContext)_localctx).value = new BasicRelation("rf");
				}
				break;
			case FR:
				enterOuterAlt(_localctx, 6);
				{
				setState(196);
				match(FR);
				((BaseContext)_localctx).value = new BasicRelation("fr");
				}
				break;
			case FRI:
				enterOuterAlt(_localctx, 7);
				{
				setState(198);
				match(FRI);
				((BaseContext)_localctx).value = new BasicRelation("fri");
				}
				break;
			case FRE:
				enterOuterAlt(_localctx, 8);
				{
				setState(200);
				match(FRE);
				((BaseContext)_localctx).value = new BasicRelation("fre");
				}
				break;
			case CO:
				enterOuterAlt(_localctx, 9);
				{
				setState(202);
				match(CO);
				((BaseContext)_localctx).value = new BasicRelation("co");
				}
				break;
			case COE:
				enterOuterAlt(_localctx, 10);
				{
				setState(204);
				match(COE);
				((BaseContext)_localctx).value = new BasicRelation("coe");
				}
				break;
			case COI:
				enterOuterAlt(_localctx, 11);
				{
				setState(206);
				match(COI);
				((BaseContext)_localctx).value = new BasicRelation("coi");
				}
				break;
			case AD:
				enterOuterAlt(_localctx, 12);
				{
				setState(208);
				match(AD);
				((BaseContext)_localctx).value = new BasicRelation("po");
				}
				break;
			case IDD:
				enterOuterAlt(_localctx, 13);
				{
				setState(210);
				match(IDD);
				((BaseContext)_localctx).value = new BasicRelation("idd");
				}
				break;
			case ISH:
				enterOuterAlt(_localctx, 14);
				{
				setState(212);
				match(ISH);
				((BaseContext)_localctx).value = new BasicRelation("ish");
				}
				break;
			case CD:
				enterOuterAlt(_localctx, 15);
				{
				setState(214);
				match(CD);
				((BaseContext)_localctx).value = new BasicRelation("cd");
				}
				break;
			case STHD:
				enterOuterAlt(_localctx, 16);
				{
				setState(216);
				match(STHD);
				((BaseContext)_localctx).value = new BasicRelation("sthd");
				}
				break;
			case SLOC:
				enterOuterAlt(_localctx, 17);
				{
				setState(218);
				match(SLOC);
				((BaseContext)_localctx).value = new BasicRelation("sloc");
				}
				break;
			case MFENCE:
				enterOuterAlt(_localctx, 18);
				{
				setState(220);
				match(MFENCE);
				((BaseContext)_localctx).value = new BasicRelation("mfence");
				}
				break;
			case CTRLISYNC:
				enterOuterAlt(_localctx, 19);
				{
				setState(222);
				match(CTRLISYNC);
				((BaseContext)_localctx).value = new BasicRelation("ctrlisync");
				}
				break;
			case LWSYNC:
				enterOuterAlt(_localctx, 20);
				{
				setState(224);
				match(LWSYNC);
				((BaseContext)_localctx).value = new BasicRelation("lwsync");
				}
				break;
			case ISYNC:
				enterOuterAlt(_localctx, 21);
				{
				setState(226);
				match(ISYNC);
				((BaseContext)_localctx).value = new BasicRelation("isync");
				}
				break;
			case SYNC:
				enterOuterAlt(_localctx, 22);
				{
				setState(228);
				match(SYNC);
				((BaseContext)_localctx).value = new BasicRelation("sync");
				}
				break;
			case CTRLDIREKT:
				enterOuterAlt(_localctx, 23);
				{
				setState(230);
				match(CTRLDIREKT);
				((BaseContext)_localctx).value = new BasicRelation("ctrlDirect");
				}
				break;
			case CTRLISB:
				enterOuterAlt(_localctx, 24);
				{
				setState(232);
				match(CTRLISB);
				((BaseContext)_localctx).value = new BasicRelation("ctrlisb");
				}
				break;
			case CTRL:
				enterOuterAlt(_localctx, 25);
				{
				setState(234);
				match(CTRL);
				((BaseContext)_localctx).value = new BasicRelation("ctrl");
				}
				break;
			case ISB:
				enterOuterAlt(_localctx, 26);
				{
				setState(236);
				match(ISB);
				((BaseContext)_localctx).value = new BasicRelation("isb");
				}
				break;
			case ADDR:
				enterOuterAlt(_localctx, 27);
				{
				setState(238);
				match(ADDR);
				((BaseContext)_localctx).value = new EmptyRel();
				}
				break;
			case DATA:
				enterOuterAlt(_localctx, 28);
				{
				setState(240);
				match(DATA);
				((BaseContext)_localctx).value = new RelInterSect(new RelLocTrans(new BasicRelation("idd")), new RelSetToSet("R", "W"));
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 29);
				{
				setState(242);
				((BaseContext)_localctx).n = match(NAME);
				((BaseContext)_localctx).value = new RelDummy((((BaseContext)_localctx).n!=null?((BaseContext)_localctx).n.getText():null));
				}
				break;
			case EMPTY:
				enterOuterAlt(_localctx, 30);
				{
				setState(244);
				match(EMPTY);
				((BaseContext)_localctx).value = new EmptyRel();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 31);
				{
				setState(246);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3?\u00fd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\5\2\27\n\2\3\2\3\2\3\2\3\2\3\2\3\2\6\2\37\n\2\r\2\16\2 \3\3\3\3\3\3\3"+
		"\3\3\3\5\3(\n\3\3\3\3\3\3\3\3\3\3\3\5\3/\n\3\5\3\61\n\3\3\4\3\4\5\4\65"+
		"\n\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5B\n\5\f\5\16\5E\13"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5M\n\5\f\5\16\5P\13\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\7\5X\n\5\f\5\16\5[\13\5\3\5\3\5\3\5\5\5`\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6r\n\6\f\6\16\6u\13\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0092\n\6\f\6\16\6\u0095\13\6"+
		"\3\6\3\6\3\6\3\6\5\6\u009b\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00a3\n\6\f"+
		"\6\16\6\u00a6\13\6\3\7\3\7\5\7\u00aa\n\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\6\t\u00b7\n\t\r\t\16\t\u00b8\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\5\n\u00fb\n\n\3\n\2\3\n\13\2\4\6\b\n\f\16\20\22\2"+
		"\3\3\2\6\7\2\u012a\2\24\3\2\2\2\4\60\3\2\2\2\6\62\3\2\2\2\b_\3\2\2\2\n"+
		"\u009a\3\2\2\2\f\u00a7\3\2\2\2\16\u00ae\3\2\2\2\20\u00b3\3\2\2\2\22\u00fa"+
		"\3\2\2\2\24\26\b\2\1\2\25\27\7:\2\2\26\25\3\2\2\2\26\27\3\2\2\2\27\36"+
		"\3\2\2\2\30\31\5\4\3\2\31\32\b\2\1\2\32\37\3\2\2\2\33\34\5\6\4\2\34\35"+
		"\b\2\1\2\35\37\3\2\2\2\36\30\3\2\2\2\36\33\3\2\2\2\37 \3\2\2\2 \36\3\2"+
		"\2\2 !\3\2\2\2!\3\3\2\2\2\"#\7\3\2\2#$\5\b\5\2$\'\b\3\1\2%&\7\4\2\2&("+
		"\79\2\2\'%\3\2\2\2\'(\3\2\2\2(\61\3\2\2\2)*\7\5\2\2*+\5\b\5\2+.\b\3\1"+
		"\2,-\7\4\2\2-/\79\2\2.,\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60\"\3\2\2\2\60"+
		")\3\2\2\2\61\5\3\2\2\2\62\64\t\2\2\2\63\65\7\b\2\2\64\63\3\2\2\2\64\65"+
		"\3\2\2\2\65\66\3\2\2\2\66\67\79\2\2\678\7\t\2\289\5\b\5\29:\b\4\1\2:\7"+
		"\3\2\2\2;<\5\n\6\2<C\b\5\1\2=>\7\n\2\2>?\5\n\6\2?@\b\5\1\2@B\3\2\2\2A"+
		"=\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2D`\3\2\2\2EC\3\2\2\2FG\5\n\6\2"+
		"GN\b\5\1\2HI\7\13\2\2IJ\5\n\6\2JK\b\5\1\2KM\3\2\2\2LH\3\2\2\2MP\3\2\2"+
		"\2NL\3\2\2\2NO\3\2\2\2O`\3\2\2\2PN\3\2\2\2QR\5\n\6\2RY\b\5\1\2ST\7\f\2"+
		"\2TU\5\n\6\2UV\b\5\1\2VX\3\2\2\2WS\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2"+
		"\2Z`\3\2\2\2[Y\3\2\2\2\\]\5\20\t\2]^\b\5\1\2^`\3\2\2\2_;\3\2\2\2_F\3\2"+
		"\2\2_Q\3\2\2\2_\\\3\2\2\2`\t\3\2\2\2a\u009b\b\6\1\2bc\5\22\n\2cd\b\6\1"+
		"\2d\u009b\3\2\2\2ef\5\f\7\2fg\b\6\1\2g\u009b\3\2\2\2hi\7\r\2\2ij\5\n\6"+
		"\2jk\7\n\2\2kl\b\6\1\2ls\3\2\2\2mn\5\n\6\2no\7\n\2\2op\b\6\1\2pr\3\2\2"+
		"\2qm\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\5\n\6"+
		"\2wx\7\16\2\2xy\b\6\1\2y\u009b\3\2\2\2z{\7\r\2\2{|\5\n\6\2|}\7\17\2\2"+
		"}~\5\n\6\2~\177\7\16\2\2\177\u0080\b\6\1\2\u0080\u009b\3\2\2\2\u0081\u0082"+
		"\7\r\2\2\u0082\u0083\5\n\6\2\u0083\u0084\7\13\2\2\u0084\u0085\5\n\6\2"+
		"\u0085\u0086\7\16\2\2\u0086\u0087\b\6\1\2\u0087\u009b\3\2\2\2\u0088\u0089"+
		"\7\r\2\2\u0089\u008a\5\n\6\2\u008a\u008b\7\f\2\2\u008b\u008c\b\6\1\2\u008c"+
		"\u0093\3\2\2\2\u008d\u008e\5\n\6\2\u008e\u008f\7\f\2\2\u008f\u0090\b\6"+
		"\1\2\u0090\u0092\3\2\2\2\u0091\u008d\3\2\2\2\u0092\u0095\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0096\u0097\5\n\6\2\u0097\u0098\7\16\2\2\u0098\u0099\b\6\1\2\u0099"+
		"\u009b\3\2\2\2\u009aa\3\2\2\2\u009ab\3\2\2\2\u009ae\3\2\2\2\u009ah\3\2"+
		"\2\2\u009az\3\2\2\2\u009a\u0081\3\2\2\2\u009a\u0088\3\2\2\2\u009b\u00a4"+
		"\3\2\2\2\u009c\u009d\f\4\2\2\u009d\u009e\7\20\2\2\u009e\u00a3\b\6\1\2"+
		"\u009f\u00a0\f\3\2\2\u00a0\u00a1\7\21\2\2\u00a1\u00a3\b\6\1\2\u00a2\u009c"+
		"\3\2\2\2\u00a2\u009f\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\13\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a9\7\60\2"+
		"\2\u00a8\u00aa\7\21\2\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ac\7\60\2\2\u00ac\u00ad\b\7\1\2\u00ad\r\3\2\2"+
		"\2\u00ae\u00af\5\b\5\2\u00af\u00b0\7\f\2\2\u00b0\u00b1\7\60\2\2\u00b1"+
		"\u00b2\b\b\1\2\u00b2\17\3\2\2\2\u00b3\u00b6\7\60\2\2\u00b4\u00b5\7\f\2"+
		"\2\u00b5\u00b7\5\16\b\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\b\t"+
		"\1\2\u00bb\21\3\2\2\2\u00bc\u00bd\7\22\2\2\u00bd\u00fb\b\n\1\2\u00be\u00bf"+
		"\7\23\2\2\u00bf\u00fb\b\n\1\2\u00c0\u00c1\7\24\2\2\u00c1\u00fb\b\n\1\2"+
		"\u00c2\u00c3\7\25\2\2\u00c3\u00fb\b\n\1\2\u00c4\u00c5\7\26\2\2\u00c5\u00fb"+
		"\b\n\1\2\u00c6\u00c7\7\27\2\2\u00c7\u00fb\b\n\1\2\u00c8\u00c9\7\31\2\2"+
		"\u00c9\u00fb\b\n\1\2\u00ca\u00cb\7\30\2\2\u00cb\u00fb\b\n\1\2\u00cc\u00cd"+
		"\7\32\2\2\u00cd\u00fb\b\n\1\2\u00ce\u00cf\7\33\2\2\u00cf\u00fb\b\n\1\2"+
		"\u00d0\u00d1\7\34\2\2\u00d1\u00fb\b\n\1\2\u00d2\u00d3\7\35\2\2\u00d3\u00fb"+
		"\b\n\1\2\u00d4\u00d5\7\36\2\2\u00d5\u00fb\b\n\1\2\u00d6\u00d7\7\37\2\2"+
		"\u00d7\u00fb\b\n\1\2\u00d8\u00d9\7 \2\2\u00d9\u00fb\b\n\1\2\u00da\u00db"+
		"\7!\2\2\u00db\u00fb\b\n\1\2\u00dc\u00dd\7\"\2\2\u00dd\u00fb\b\n\1\2\u00de"+
		"\u00df\7#\2\2\u00df\u00fb\b\n\1\2\u00e0\u00e1\7%\2\2\u00e1\u00fb\b\n\1"+
		"\2\u00e2\u00e3\7$\2\2\u00e3\u00fb\b\n\1\2\u00e4\u00e5\7&\2\2\u00e5\u00fb"+
		"\b\n\1\2\u00e6\u00e7\7\'\2\2\u00e7\u00fb\b\n\1\2\u00e8\u00e9\7(\2\2\u00e9"+
		"\u00fb\b\n\1\2\u00ea\u00eb\7)\2\2\u00eb\u00fb\b\n\1\2\u00ec\u00ed\7*\2"+
		"\2\u00ed\u00fb\b\n\1\2\u00ee\u00ef\7+\2\2\u00ef\u00fb\b\n\1\2\u00f0\u00f1"+
		"\7,\2\2\u00f1\u00fb\b\n\1\2\u00f2\u00f3\7-\2\2\u00f3\u00fb\b\n\1\2\u00f4"+
		"\u00f5\79\2\2\u00f5\u00fb\b\n\1\2\u00f6\u00f7\7/\2\2\u00f7\u00fb\b\n\1"+
		"\2\u00f8\u00f9\7.\2\2\u00f9\u00fb\b\n\1\2\u00fa\u00bc\3\2\2\2\u00fa\u00be"+
		"\3\2\2\2\u00fa\u00c0\3\2\2\2\u00fa\u00c2\3\2\2\2\u00fa\u00c4\3\2\2\2\u00fa"+
		"\u00c6\3\2\2\2\u00fa\u00c8\3\2\2\2\u00fa\u00ca\3\2\2\2\u00fa\u00cc\3\2"+
		"\2\2\u00fa\u00ce\3\2\2\2\u00fa\u00d0\3\2\2\2\u00fa\u00d2\3\2\2\2\u00fa"+
		"\u00d4\3\2\2\2\u00fa\u00d6\3\2\2\2\u00fa\u00d8\3\2\2\2\u00fa\u00da\3\2"+
		"\2\2\u00fa\u00dc\3\2\2\2\u00fa\u00de\3\2\2\2\u00fa\u00e0\3\2\2\2\u00fa"+
		"\u00e2\3\2\2\2\u00fa\u00e4\3\2\2\2\u00fa\u00e6\3\2\2\2\u00fa\u00e8\3\2"+
		"\2\2\u00fa\u00ea\3\2\2\2\u00fa\u00ec\3\2\2\2\u00fa\u00ee\3\2\2\2\u00fa"+
		"\u00f0\3\2\2\2\u00fa\u00f2\3\2\2\2\u00fa\u00f4\3\2\2\2\u00fa\u00f6\3\2"+
		"\2\2\u00fa\u00f8\3\2\2\2\u00fb\23\3\2\2\2\25\26\36 \'.\60\64CNY_s\u0093"+
		"\u009a\u00a2\u00a4\u00a9\u00b8\u00fa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}