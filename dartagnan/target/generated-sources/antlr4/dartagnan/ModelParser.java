// Generated from Model.g4 by ANTLR 4.7

package dartagnan;
import dartagnan.wmm.*;

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
		RULE_setRelation = 5, RULE_base = 6;
	public static final String[] ruleNames = {
		"mcm", "axiom", "reldef", "fancyrel", "relation", "setRelation", "base"
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


	String test="test";

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
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MCMNAME) {
				{
				setState(15);
				match(MCMNAME);
				}
			}

			setState(24); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(24);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__2:
					{
					setState(18);
					((McmContext)_localctx).ax1 = axiom();
					_localctx.value.addAxiom(((McmContext)_localctx).ax1.value);
					}
					break;
				case T__3:
				case T__4:
					{
					setState(21);
					((McmContext)_localctx).r1 = reldef();
					_localctx.value.addRel(((McmContext)_localctx).r1.value);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(26); 
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
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				match(T__0);
				setState(29);
				((AxiomContext)_localctx).m1 = fancyrel();
				((AxiomContext)_localctx).value =   new Acyclic(((AxiomContext)_localctx).m1.value);
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(31);
					match(T__1);
					setState(32);
					match(NAME);
					}
				}

				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				match(T__2);
				setState(36);
				((AxiomContext)_localctx).m1 = fancyrel();
				((AxiomContext)_localctx).value =   new Irreflexive(((AxiomContext)_localctx).m1.value);
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(38);
					match(T__1);
					setState(39);
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
			setState(44);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==T__4) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(45);
				match(T__5);
				}
			}

			setState(48);
			((ReldefContext)_localctx).n = match(NAME);
			setState(49);
			match(T__6);
			setState(50);
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
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
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
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				((FancyrelContext)_localctx).m1 = relation(0);
				((FancyrelContext)_localctx).value = ((FancyrelContext)_localctx).m1.value;
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(55);
					match(T__7);
					setState(56);
					((FancyrelContext)_localctx).m2 = relation(0);
					((FancyrelContext)_localctx).value = new RelUnion(_localctx.value, ((FancyrelContext)_localctx).m2.value);
					}
					}
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				((FancyrelContext)_localctx).m1 = relation(0);
				((FancyrelContext)_localctx).value = ((FancyrelContext)_localctx).m1.value;
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(66);
					match(T__8);
					setState(67);
					((FancyrelContext)_localctx).m2 = relation(0);
					((FancyrelContext)_localctx).value = new RelInterSect(_localctx.value, ((FancyrelContext)_localctx).m2.value);
					}
					}
					setState(74);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				((FancyrelContext)_localctx).m1 = relation(0);
				((FancyrelContext)_localctx).value = ((FancyrelContext)_localctx).m1.value;
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(77);
					match(T__9);
					setState(78);
					((FancyrelContext)_localctx).m2 = relation(0);
					((FancyrelContext)_localctx).value = new RelComposition(_localctx.value, ((FancyrelContext)_localctx).m2.value);
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
		public SetRelationContext b2;
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
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(89);
				((RelationContext)_localctx).b1 = base();
				((RelationContext)_localctx).value = ((RelationContext)_localctx).b1.value;
				}
				break;
			case 2:
				{
				setState(92);
				((RelationContext)_localctx).b2 = setRelation();
				((RelationContext)_localctx).value = ((RelationContext)_localctx).b2.value;
				}
				break;
			case 3:
				{
				setState(95);
				match(T__10);
				{
				setState(96);
				((RelationContext)_localctx).m1 = relation(0);
				setState(97);
				match(T__7);
				((RelationContext)_localctx).value = ((RelationContext)_localctx).m1.value;
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(100);
						((RelationContext)_localctx).m2 = relation(0);
						setState(101);
						match(T__7);
						((RelationContext)_localctx).value = new RelUnion(_localctx.value, ((RelationContext)_localctx).m2.value);
						}
						} 
					}
					setState(108);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(109);
				((RelationContext)_localctx).m3 = relation(0);
				setState(110);
				match(T__11);
				((RelationContext)_localctx).value = new RelUnion(_localctx.value, ((RelationContext)_localctx).m3.value);
				}
				break;
			case 4:
				{
				setState(113);
				match(T__10);
				setState(114);
				((RelationContext)_localctx).m1 = relation(0);
				setState(115);
				match(T__12);
				setState(116);
				((RelationContext)_localctx).m2 = relation(0);
				setState(117);
				match(T__11);
				((RelationContext)_localctx).value = new RelMinus(((RelationContext)_localctx).m1.value, ((RelationContext)_localctx).m2.value);
				}
				break;
			case 5:
				{
				setState(120);
				match(T__10);
				setState(121);
				((RelationContext)_localctx).m1 = relation(0);
				setState(122);
				match(T__8);
				setState(123);
				((RelationContext)_localctx).m2 = relation(0);
				setState(124);
				match(T__11);
				((RelationContext)_localctx).value = new RelInterSect(((RelationContext)_localctx).m1.value, ((RelationContext)_localctx).m2.value);
				}
				break;
			case 6:
				{
				setState(127);
				match(T__10);
				{
				setState(128);
				((RelationContext)_localctx).m1 = relation(0);
				setState(129);
				match(T__9);
				((RelationContext)_localctx).value = ((RelationContext)_localctx).m1.value;
				}
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(132);
						((RelationContext)_localctx).m2 = relation(0);
						setState(133);
						match(T__9);
						((RelationContext)_localctx).value = new RelComposition(_localctx.value, ((RelationContext)_localctx).m2.value);
						}
						} 
					}
					setState(140);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(141);
				((RelationContext)_localctx).m3 = relation(0);
				setState(142);
				match(T__11);
				((RelationContext)_localctx).value = new RelComposition(_localctx.value, ((RelationContext)_localctx).m3.value);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(153);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new RelationContext(_parentctx, _parentState);
						_localctx.m1 = _prevctx;
						_localctx.m1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relation);
						setState(147);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(148);
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
						setState(150);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(151);
						match(T__14);
						((RelationContext)_localctx).value = new RelTransRef(((RelationContext)_localctx).m1.value);
						}
						break;
					}
					} 
				}
				setState(157);
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
			setState(158);
			((SetRelationContext)_localctx).s1 = match(EVENT_SET);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(159);
				match(T__14);
				}
			}

			setState(162);
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
		enterRule(_localctx, 12, RULE_base);
		try {
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PO:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(PO);
				((BaseContext)_localctx).value = new BasicRelation("po");
				}
				break;
			case POLOC:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(POLOC);
				((BaseContext)_localctx).value = new BasicRelation("poloc");
				}
				break;
			case RFE:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				match(RFE);
				((BaseContext)_localctx).value = new BasicRelation("rfe");
				}
				break;
			case RFI:
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				match(RFI);
				((BaseContext)_localctx).value = new BasicRelation("rfi");
				}
				break;
			case RF:
				enterOuterAlt(_localctx, 5);
				{
				setState(173);
				match(RF);
				((BaseContext)_localctx).value = new BasicRelation("rf");
				}
				break;
			case FR:
				enterOuterAlt(_localctx, 6);
				{
				setState(175);
				match(FR);
				((BaseContext)_localctx).value = new BasicRelation("fr");
				}
				break;
			case FRI:
				enterOuterAlt(_localctx, 7);
				{
				setState(177);
				match(FRI);
				((BaseContext)_localctx).value = new BasicRelation("fri");
				}
				break;
			case FRE:
				enterOuterAlt(_localctx, 8);
				{
				setState(179);
				match(FRE);
				((BaseContext)_localctx).value = new BasicRelation("fre");
				}
				break;
			case CO:
				enterOuterAlt(_localctx, 9);
				{
				setState(181);
				match(CO);
				((BaseContext)_localctx).value = new BasicRelation("co");
				}
				break;
			case COE:
				enterOuterAlt(_localctx, 10);
				{
				setState(183);
				match(COE);
				((BaseContext)_localctx).value = new BasicRelation("coe");
				}
				break;
			case COI:
				enterOuterAlt(_localctx, 11);
				{
				setState(185);
				match(COI);
				((BaseContext)_localctx).value = new BasicRelation("coi");
				}
				break;
			case AD:
				enterOuterAlt(_localctx, 12);
				{
				setState(187);
				match(AD);
				((BaseContext)_localctx).value = new BasicRelation("po");
				}
				break;
			case IDD:
				enterOuterAlt(_localctx, 13);
				{
				setState(189);
				match(IDD);
				((BaseContext)_localctx).value = new BasicRelation("idd");
				}
				break;
			case ISH:
				enterOuterAlt(_localctx, 14);
				{
				setState(191);
				match(ISH);
				((BaseContext)_localctx).value = new BasicRelation("ish");
				}
				break;
			case CD:
				enterOuterAlt(_localctx, 15);
				{
				setState(193);
				match(CD);
				((BaseContext)_localctx).value = new BasicRelation("cd");
				}
				break;
			case STHD:
				enterOuterAlt(_localctx, 16);
				{
				setState(195);
				match(STHD);
				((BaseContext)_localctx).value = new BasicRelation("sthd");
				}
				break;
			case SLOC:
				enterOuterAlt(_localctx, 17);
				{
				setState(197);
				match(SLOC);
				((BaseContext)_localctx).value = new BasicRelation("sloc");
				}
				break;
			case MFENCE:
				enterOuterAlt(_localctx, 18);
				{
				setState(199);
				match(MFENCE);
				((BaseContext)_localctx).value = new BasicRelation("mfence");
				}
				break;
			case CTRLISYNC:
				enterOuterAlt(_localctx, 19);
				{
				setState(201);
				match(CTRLISYNC);
				((BaseContext)_localctx).value = new BasicRelation("ctrlisync");
				}
				break;
			case LWSYNC:
				enterOuterAlt(_localctx, 20);
				{
				setState(203);
				match(LWSYNC);
				((BaseContext)_localctx).value = new BasicRelation("lwsync");
				}
				break;
			case ISYNC:
				enterOuterAlt(_localctx, 21);
				{
				setState(205);
				match(ISYNC);
				((BaseContext)_localctx).value = new BasicRelation("isync");
				}
				break;
			case SYNC:
				enterOuterAlt(_localctx, 22);
				{
				setState(207);
				match(SYNC);
				((BaseContext)_localctx).value = new BasicRelation("sync");
				}
				break;
			case CTRLDIREKT:
				enterOuterAlt(_localctx, 23);
				{
				setState(209);
				match(CTRLDIREKT);
				((BaseContext)_localctx).value = new BasicRelation("ctrlDirect");
				}
				break;
			case CTRLISB:
				enterOuterAlt(_localctx, 24);
				{
				setState(211);
				match(CTRLISB);
				((BaseContext)_localctx).value = new BasicRelation("ctrlisb");
				}
				break;
			case CTRL:
				enterOuterAlt(_localctx, 25);
				{
				setState(213);
				match(CTRL);
				((BaseContext)_localctx).value = new BasicRelation("ctrl");
				}
				break;
			case ISB:
				enterOuterAlt(_localctx, 26);
				{
				setState(215);
				match(ISB);
				((BaseContext)_localctx).value = new BasicRelation("isb");
				}
				break;
			case ADDR:
				enterOuterAlt(_localctx, 27);
				{
				setState(217);
				match(ADDR);
				((BaseContext)_localctx).value = new EmptyRel();
				}
				break;
			case DATA:
				enterOuterAlt(_localctx, 28);
				{
				setState(219);
				match(DATA);
				((BaseContext)_localctx).value = new RelInterSect(new RelLocTrans(new BasicRelation("idd")), new RelSetToSet("R", "W"));
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 29);
				{
				setState(221);
				((BaseContext)_localctx).n = match(NAME);
				((BaseContext)_localctx).value = new RelDummy((((BaseContext)_localctx).n!=null?((BaseContext)_localctx).n.getText():null));
				}
				break;
			case EMPTY:
				enterOuterAlt(_localctx, 30);
				{
				setState(223);
				match(EMPTY);
				((BaseContext)_localctx).value = new EmptyRel();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 31);
				{
				setState(225);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3?\u00e8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\5\2\23\n\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\6\2\33\n\2\r\2\16\2\34\3\3\3\3\3\3\3\3\3\3\5\3$\n"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3+\n\3\5\3-\n\3\3\4\3\4\5\4\61\n\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5>\n\5\f\5\16\5A\13\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\7\5I\n\5\f\5\16\5L\13\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5T\n\5"+
		"\f\5\16\5W\13\5\5\5Y\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\7\6k\n\6\f\6\16\6n\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\7\6\u008b\n\6\f\6\16\6\u008e\13\6\3\6\3\6\3\6\3\6\5\6\u0094"+
		"\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u009c\n\6\f\6\16\6\u009f\13\6\3\7\3\7"+
		"\5\7\u00a3\n\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00e6"+
		"\n\b\3\b\2\3\n\t\2\4\6\b\n\f\16\2\3\3\2\6\7\2\u0114\2\20\3\2\2\2\4,\3"+
		"\2\2\2\6.\3\2\2\2\bX\3\2\2\2\n\u0093\3\2\2\2\f\u00a0\3\2\2\2\16\u00e5"+
		"\3\2\2\2\20\22\b\2\1\2\21\23\7:\2\2\22\21\3\2\2\2\22\23\3\2\2\2\23\32"+
		"\3\2\2\2\24\25\5\4\3\2\25\26\b\2\1\2\26\33\3\2\2\2\27\30\5\6\4\2\30\31"+
		"\b\2\1\2\31\33\3\2\2\2\32\24\3\2\2\2\32\27\3\2\2\2\33\34\3\2\2\2\34\32"+
		"\3\2\2\2\34\35\3\2\2\2\35\3\3\2\2\2\36\37\7\3\2\2\37 \5\b\5\2 #\b\3\1"+
		"\2!\"\7\4\2\2\"$\79\2\2#!\3\2\2\2#$\3\2\2\2$-\3\2\2\2%&\7\5\2\2&\'\5\b"+
		"\5\2\'*\b\3\1\2()\7\4\2\2)+\79\2\2*(\3\2\2\2*+\3\2\2\2+-\3\2\2\2,\36\3"+
		"\2\2\2,%\3\2\2\2-\5\3\2\2\2.\60\t\2\2\2/\61\7\b\2\2\60/\3\2\2\2\60\61"+
		"\3\2\2\2\61\62\3\2\2\2\62\63\79\2\2\63\64\7\t\2\2\64\65\5\b\5\2\65\66"+
		"\b\4\1\2\66\7\3\2\2\2\678\5\n\6\28?\b\5\1\29:\7\n\2\2:;\5\n\6\2;<\b\5"+
		"\1\2<>\3\2\2\2=9\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@Y\3\2\2\2A?\3\2"+
		"\2\2BC\5\n\6\2CJ\b\5\1\2DE\7\13\2\2EF\5\n\6\2FG\b\5\1\2GI\3\2\2\2HD\3"+
		"\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KY\3\2\2\2LJ\3\2\2\2MN\5\n\6\2NU\b"+
		"\5\1\2OP\7\f\2\2PQ\5\n\6\2QR\b\5\1\2RT\3\2\2\2SO\3\2\2\2TW\3\2\2\2US\3"+
		"\2\2\2UV\3\2\2\2VY\3\2\2\2WU\3\2\2\2X\67\3\2\2\2XB\3\2\2\2XM\3\2\2\2Y"+
		"\t\3\2\2\2Z[\b\6\1\2[\\\5\16\b\2\\]\b\6\1\2]\u0094\3\2\2\2^_\5\f\7\2_"+
		"`\b\6\1\2`\u0094\3\2\2\2ab\7\r\2\2bc\5\n\6\2cd\7\n\2\2de\b\6\1\2el\3\2"+
		"\2\2fg\5\n\6\2gh\7\n\2\2hi\b\6\1\2ik\3\2\2\2jf\3\2\2\2kn\3\2\2\2lj\3\2"+
		"\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\5\n\6\2pq\7\16\2\2qr\b\6\1\2r\u0094"+
		"\3\2\2\2st\7\r\2\2tu\5\n\6\2uv\7\17\2\2vw\5\n\6\2wx\7\16\2\2xy\b\6\1\2"+
		"y\u0094\3\2\2\2z{\7\r\2\2{|\5\n\6\2|}\7\13\2\2}~\5\n\6\2~\177\7\16\2\2"+
		"\177\u0080\b\6\1\2\u0080\u0094\3\2\2\2\u0081\u0082\7\r\2\2\u0082\u0083"+
		"\5\n\6\2\u0083\u0084\7\f\2\2\u0084\u0085\b\6\1\2\u0085\u008c\3\2\2\2\u0086"+
		"\u0087\5\n\6\2\u0087\u0088\7\f\2\2\u0088\u0089\b\6\1\2\u0089\u008b\3\2"+
		"\2\2\u008a\u0086\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\5\n"+
		"\6\2\u0090\u0091\7\16\2\2\u0091\u0092\b\6\1\2\u0092\u0094\3\2\2\2\u0093"+
		"Z\3\2\2\2\u0093^\3\2\2\2\u0093a\3\2\2\2\u0093s\3\2\2\2\u0093z\3\2\2\2"+
		"\u0093\u0081\3\2\2\2\u0094\u009d\3\2\2\2\u0095\u0096\f\4\2\2\u0096\u0097"+
		"\7\20\2\2\u0097\u009c\b\6\1\2\u0098\u0099\f\3\2\2\u0099\u009a\7\21\2\2"+
		"\u009a\u009c\b\6\1\2\u009b\u0095\3\2\2\2\u009b\u0098\3\2\2\2\u009c\u009f"+
		"\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\13\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u00a0\u00a2\7\60\2\2\u00a1\u00a3\7\21\2\2\u00a2\u00a1\3"+
		"\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\7\60\2\2\u00a5"+
		"\u00a6\b\7\1\2\u00a6\r\3\2\2\2\u00a7\u00a8\7\22\2\2\u00a8\u00e6\b\b\1"+
		"\2\u00a9\u00aa\7\23\2\2\u00aa\u00e6\b\b\1\2\u00ab\u00ac\7\24\2\2\u00ac"+
		"\u00e6\b\b\1\2\u00ad\u00ae\7\25\2\2\u00ae\u00e6\b\b\1\2\u00af\u00b0\7"+
		"\26\2\2\u00b0\u00e6\b\b\1\2\u00b1\u00b2\7\27\2\2\u00b2\u00e6\b\b\1\2\u00b3"+
		"\u00b4\7\31\2\2\u00b4\u00e6\b\b\1\2\u00b5\u00b6\7\30\2\2\u00b6\u00e6\b"+
		"\b\1\2\u00b7\u00b8\7\32\2\2\u00b8\u00e6\b\b\1\2\u00b9\u00ba\7\33\2\2\u00ba"+
		"\u00e6\b\b\1\2\u00bb\u00bc\7\34\2\2\u00bc\u00e6\b\b\1\2\u00bd\u00be\7"+
		"\35\2\2\u00be\u00e6\b\b\1\2\u00bf\u00c0\7\36\2\2\u00c0\u00e6\b\b\1\2\u00c1"+
		"\u00c2\7\37\2\2\u00c2\u00e6\b\b\1\2\u00c3\u00c4\7 \2\2\u00c4\u00e6\b\b"+
		"\1\2\u00c5\u00c6\7!\2\2\u00c6\u00e6\b\b\1\2\u00c7\u00c8\7\"\2\2\u00c8"+
		"\u00e6\b\b\1\2\u00c9\u00ca\7#\2\2\u00ca\u00e6\b\b\1\2\u00cb\u00cc\7%\2"+
		"\2\u00cc\u00e6\b\b\1\2\u00cd\u00ce\7$\2\2\u00ce\u00e6\b\b\1\2\u00cf\u00d0"+
		"\7&\2\2\u00d0\u00e6\b\b\1\2\u00d1\u00d2\7\'\2\2\u00d2\u00e6\b\b\1\2\u00d3"+
		"\u00d4\7(\2\2\u00d4\u00e6\b\b\1\2\u00d5\u00d6\7)\2\2\u00d6\u00e6\b\b\1"+
		"\2\u00d7\u00d8\7*\2\2\u00d8\u00e6\b\b\1\2\u00d9\u00da\7+\2\2\u00da\u00e6"+
		"\b\b\1\2\u00db\u00dc\7,\2\2\u00dc\u00e6\b\b\1\2\u00dd\u00de\7-\2\2\u00de"+
		"\u00e6\b\b\1\2\u00df\u00e0\79\2\2\u00e0\u00e6\b\b\1\2\u00e1\u00e2\7/\2"+
		"\2\u00e2\u00e6\b\b\1\2\u00e3\u00e4\7.\2\2\u00e4\u00e6\b\b\1\2\u00e5\u00a7"+
		"\3\2\2\2\u00e5\u00a9\3\2\2\2\u00e5\u00ab\3\2\2\2\u00e5\u00ad\3\2\2\2\u00e5"+
		"\u00af\3\2\2\2\u00e5\u00b1\3\2\2\2\u00e5\u00b3\3\2\2\2\u00e5\u00b5\3\2"+
		"\2\2\u00e5\u00b7\3\2\2\2\u00e5\u00b9\3\2\2\2\u00e5\u00bb\3\2\2\2\u00e5"+
		"\u00bd\3\2\2\2\u00e5\u00bf\3\2\2\2\u00e5\u00c1\3\2\2\2\u00e5\u00c3\3\2"+
		"\2\2\u00e5\u00c5\3\2\2\2\u00e5\u00c7\3\2\2\2\u00e5\u00c9\3\2\2\2\u00e5"+
		"\u00cb\3\2\2\2\u00e5\u00cd\3\2\2\2\u00e5\u00cf\3\2\2\2\u00e5\u00d1\3\2"+
		"\2\2\u00e5\u00d3\3\2\2\2\u00e5\u00d5\3\2\2\2\u00e5\u00d7\3\2\2\2\u00e5"+
		"\u00d9\3\2\2\2\u00e5\u00db\3\2\2\2\u00e5\u00dd\3\2\2\2\u00e5\u00df\3\2"+
		"\2\2\u00e5\u00e1\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\17\3\2\2\2\24\22\32"+
		"\34#*,\60?JUXl\u008c\u0093\u009b\u009d\u00a2\u00e5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}