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
		RMW=50, LKW=51, ATOMIC=52, READ=53, WRITE=54, INIT=55, MEMORY=56, FENCE=57, 
		SC=58, REL_ACQ=59, RELEASE=60, ACQUIRE=61, CONSUME=62, RELAXED=63, NON_ATOMIC=64, 
		NAME=65, MCMNAME=66, WS=67, ENDE=68, ML_COMMENT=69, INCLUDE=70, MODELNAME=71;
	public static final int
		RULE_mcm = 0, RULE_axiom = 1, RULE_reldef = 2, RULE_filterdef = 3, RULE_fancyrel = 4, 
		RULE_identifier = 5, RULE_relation = 6, RULE_filterRelation = 7, RULE_eventFilter = 8, 
		RULE_basicEventFilter = 9, RULE_atomics = 10, RULE_sc = 11, RULE_relAqc = 12, 
		RULE_release = 13, RULE_acquire = 14, RULE_cons = 15, RULE_relaxed = 16, 
		RULE_nonAtomic = 17, RULE_base = 18;
	public static final String[] ruleNames = {
		"mcm", "axiom", "reldef", "filterdef", "fancyrel", "identifier", "relation", 
		"filterRelation", "eventFilter", "basicEventFilter", "atomics", "sc", 
		"relAqc", "release", "acquire", "cons", "relaxed", "nonAtomic", "base"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'acyclic'", "'as'", "'irreflexive'", "'let'", "'and'", "'rec'", 
		"'='", "'|'", "'&'", "'\\'", "';'", "'+'", "'*'", "'('", "')'", "'toid('", 
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

	@Override
	public String getGrammarFileName() { return "Model.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	Wmm wmm = new Wmm();

	public ModelParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class McmContext extends ParserRuleContext {
		public Wmm value;
		public AxiomContext ax1;
		public FilterdefContext f1;
		public ReldefContext r1;
		public TerminalNode EOF() { return getToken(ModelParser.EOF, 0); }
		public TerminalNode MCMNAME() { return getToken(ModelParser.MCMNAME, 0); }
		public List<AxiomContext> axiom() {
			return getRuleContexts(AxiomContext.class);
		}
		public AxiomContext axiom(int i) {
			return getRuleContext(AxiomContext.class,i);
		}
		public List<FilterdefContext> filterdef() {
			return getRuleContexts(FilterdefContext.class);
		}
		public FilterdefContext filterdef(int i) {
			return getRuleContext(FilterdefContext.class,i);
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
			((McmContext)_localctx).value =   wmm;
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MCMNAME) {
				{
				setState(39);
				match(MCMNAME);
				}
			}

			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(51);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(42);
					((McmContext)_localctx).ax1 = axiom();
					_localctx.value.addAxiom(((McmContext)_localctx).ax1.value);
					}
					break;
				case 2:
					{
					setState(45);
					((McmContext)_localctx).f1 = filterdef();
					_localctx.value.addFilter(((McmContext)_localctx).f1.value);
					}
					break;
				case 3:
					{
					setState(48);
					((McmContext)_localctx).r1 = reldef();
					_localctx.value.addRelation(((McmContext)_localctx).r1.value);
					}
					break;
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0) );
			setState(55);
			match(EOF);
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
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(T__0);
				setState(58);
				((AxiomContext)_localctx).m1 = fancyrel();
				((AxiomContext)_localctx).value =   new Acyclic(((AxiomContext)_localctx).m1.value);
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(60);
					match(T__1);
					setState(61);
					match(NAME);
					}
				}

				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(T__2);
				setState(65);
				((AxiomContext)_localctx).m1 = fancyrel();
				((AxiomContext)_localctx).value =   new Irreflexive(((AxiomContext)_localctx).m1.value);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(67);
					match(T__1);
					setState(68);
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
			setState(73);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==T__4) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(74);
				match(T__5);
				}
			}

			setState(77);
			((ReldefContext)_localctx).n = match(NAME);
			setState(78);
			match(T__6);
			setState(79);
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

	public static class FilterdefContext extends ParserRuleContext {
		public FilterInterface value;
		public Token n;
		public EventFilterContext s1;
		public TerminalNode NAME() { return getToken(ModelParser.NAME, 0); }
		public EventFilterContext eventFilter() {
			return getRuleContext(EventFilterContext.class,0);
		}
		public FilterdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterFilterdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitFilterdef(this);
		}
	}

	public final FilterdefContext filterdef() throws RecognitionException {
		FilterdefContext _localctx = new FilterdefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_filterdef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__3);
			setState(83);
			((FilterdefContext)_localctx).n = match(NAME);
			setState(84);
			match(T__6);
			setState(85);
			((FilterdefContext)_localctx).s1 = eventFilter(0);
			((FilterdefContext)_localctx).value =  ((FilterdefContext)_localctx).s1.filter; _localctx.value.setName((((FilterdefContext)_localctx).n!=null?((FilterdefContext)_localctx).n.getText():null)); 
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
		public Object object;
		public IdentifierContext m1;
		public IdentifierContext m2;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
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
		enterRule(_localctx, 8, RULE_fancyrel);
		int _la;
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				((FancyrelContext)_localctx).m1 = identifier();
				((FancyrelContext)_localctx).object =  ((FancyrelContext)_localctx).m1.value; 
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(90);
					match(T__7);
					setState(91);
					((FancyrelContext)_localctx).m2 = identifier();

					        if(_localctx.value == null){
					            ((FancyrelContext)_localctx).value = new RelUnion((Relation)_localctx.object, (Relation)((FancyrelContext)_localctx).m2.value);
					        } else {
					            ((FancyrelContext)_localctx).value = new RelUnion(_localctx.value, (Relation)((FancyrelContext)_localctx).m2.value);
					        }
					}
					}
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				((FancyrelContext)_localctx).m1 = identifier();
				((FancyrelContext)_localctx).object =  ((FancyrelContext)_localctx).m1.value; 
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(101);
					match(T__8);
					setState(102);
					((FancyrelContext)_localctx).m2 = identifier();

					        if(_localctx.value == null){
					            ((FancyrelContext)_localctx).value = new RelInterSect((Relation)_localctx.object, (Relation)((FancyrelContext)_localctx).m2.value);
					        } else {
					            ((FancyrelContext)_localctx).value = new RelInterSect(_localctx.value, (Relation)((FancyrelContext)_localctx).m2.value);
					        }
					}
					}
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				((FancyrelContext)_localctx).m1 = identifier();
				((FancyrelContext)_localctx).object =  ((FancyrelContext)_localctx).m1.value; 
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(112);
					match(T__9);
					setState(113);
					((FancyrelContext)_localctx).m2 = identifier();

					        if(_localctx.value == null){
					            ((FancyrelContext)_localctx).value = new RelMinus((Relation)_localctx.object, (Relation)((FancyrelContext)_localctx).m2.value);
					        } else {
					            ((FancyrelContext)_localctx).value = new RelMinus(_localctx.value, (Relation)((FancyrelContext)_localctx).m2.value);
					        }
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				((FancyrelContext)_localctx).m1 = identifier();
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(122);
					match(T__10);
					setState(123);
					((FancyrelContext)_localctx).m2 = identifier();

					        if(_localctx.value == null){
					        if(((FancyrelContext)_localctx).m1.value instanceof Relation){
					            if(((FancyrelContext)_localctx).m2.value instanceof Relation){
					                ((FancyrelContext)_localctx).value =  new RelComposition((Relation)((FancyrelContext)_localctx).m1.value, (Relation)((FancyrelContext)_localctx).m2.value);
					            } else {
					                ((FancyrelContext)_localctx).value =  new RelRelToSet((Relation)((FancyrelContext)_localctx).m1.value, (FilterInterface)((FancyrelContext)_localctx).m2.value);
					            }
					        } else {
					            if(((FancyrelContext)_localctx).m2.value instanceof Relation){
					                ((FancyrelContext)_localctx).value =  new RelSetToRel((FilterInterface)((FancyrelContext)_localctx).m1.value, (Relation)((FancyrelContext)_localctx).m2.value);
					            } else {
					                throw new RuntimeException("Invalid syntax");
					            }
					        }
					        } else {
					            if(((FancyrelContext)_localctx).m2.value instanceof Relation){
					                ((FancyrelContext)_localctx).value =  new RelComposition(_localctx.value, (Relation)((FancyrelContext)_localctx).m2.value);
					            } else {
					                ((FancyrelContext)_localctx).value =  new RelRelToSet(_localctx.value, (FilterInterface)((FancyrelContext)_localctx).m2.value);
					            }
					        }
					    
					}
					}
					setState(130);
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

	public static class IdentifierContext extends ParserRuleContext {
		public Object value;
		public RelationContext r;
		public EventFilterContext f;
		public Token s;
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public EventFilterContext eventFilter() {
			return getRuleContext(EventFilterContext.class,0);
		}
		public TerminalNode NAME() { return getToken(ModelParser.NAME, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_identifier);
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				((IdentifierContext)_localctx).r = relation(0);
				((IdentifierContext)_localctx).value =  ((IdentifierContext)_localctx).r.value;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				((IdentifierContext)_localctx).f = eventFilter(0);
				((IdentifierContext)_localctx).value =  ((IdentifierContext)_localctx).f.filter;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				((IdentifierContext)_localctx).s = match(NAME);

				            ((IdentifierContext)_localctx).value =  wmm.getRelation((((IdentifierContext)_localctx).s!=null?((IdentifierContext)_localctx).s.getText():null));
				            if(_localctx.value == null){
				                ((IdentifierContext)_localctx).value =  wmm.getFilter((((IdentifierContext)_localctx).s!=null?((IdentifierContext)_localctx).s.getText():null));
				                if(_localctx.value == null){
				                    throw new RuntimeException("Uninitialised identifier " + (((IdentifierContext)_localctx).s!=null?((IdentifierContext)_localctx).s.getText():null));
				                }
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
		public FilterRelationContext s1;
		public FancyrelContext r1;
		public BaseContext base() {
			return getRuleContext(BaseContext.class,0);
		}
		public FilterRelationContext filterRelation() {
			return getRuleContext(FilterRelationContext.class,0);
		}
		public FancyrelContext fancyrel() {
			return getRuleContext(FancyrelContext.class,0);
		}
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_relation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(144);
				((RelationContext)_localctx).b1 = base();
				((RelationContext)_localctx).value = ((RelationContext)_localctx).b1.value;
				}
				break;
			case 3:
				{
				setState(147);
				((RelationContext)_localctx).s1 = filterRelation();
				((RelationContext)_localctx).value = ((RelationContext)_localctx).s1.value;
				}
				break;
			case 4:
				{
				setState(150);
				match(T__13);
				setState(151);
				((RelationContext)_localctx).r1 = fancyrel();
				setState(152);
				match(T__14);
				((RelationContext)_localctx).value =  ((RelationContext)_localctx).r1.value; 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(163);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new RelationContext(_parentctx, _parentState);
						_localctx.m1 = _prevctx;
						_localctx.m1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relation);
						setState(157);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(158);
						match(T__11);
						((RelationContext)_localctx).value = new RelTrans(((RelationContext)_localctx).m1.value);
						}
						break;
					case 2:
						{
						_localctx = new RelationContext(_parentctx, _parentState);
						_localctx.m1 = _prevctx;
						_localctx.m1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relation);
						setState(160);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(161);
						match(T__12);
						((RelationContext)_localctx).value = new RelTransRef(((RelationContext)_localctx).m1.value);
						}
						break;
					}
					} 
				}
				setState(167);
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

	public static class FilterRelationContext extends ParserRuleContext {
		public Relation value;
		public EventFilterContext s1;
		public EventFilterContext s2;
		public List<EventFilterContext> eventFilter() {
			return getRuleContexts(EventFilterContext.class);
		}
		public EventFilterContext eventFilter(int i) {
			return getRuleContext(EventFilterContext.class,i);
		}
		public FilterRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterFilterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitFilterRelation(this);
		}
	}

	public final FilterRelationContext filterRelation() throws RecognitionException {
		FilterRelationContext _localctx = new FilterRelationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_filterRelation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			((FilterRelationContext)_localctx).s1 = eventFilter(0);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(169);
				match(T__12);
				}
			}

			setState(172);
			((FilterRelationContext)_localctx).s2 = eventFilter(0);
			((FilterRelationContext)_localctx).value = new RelSetToSet(((FilterRelationContext)_localctx).s1.filter, ((FilterRelationContext)_localctx).s2.filter);
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

	public static class EventFilterContext extends ParserRuleContext {
		public FilterInterface filter;
		public FilterIntersection fi;
		public FilterUnion fu;
		public EventFilterContext f1;
		public BasicEventFilterContext f3;
		public EventFilterContext f2;
		public List<EventFilterContext> eventFilter() {
			return getRuleContexts(EventFilterContext.class);
		}
		public EventFilterContext eventFilter(int i) {
			return getRuleContext(EventFilterContext.class,i);
		}
		public BasicEventFilterContext basicEventFilter() {
			return getRuleContext(BasicEventFilterContext.class,0);
		}
		public EventFilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventFilter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterEventFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitEventFilter(this);
		}
	}

	public final EventFilterContext eventFilter() throws RecognitionException {
		return eventFilter(0);
	}

	private EventFilterContext eventFilter(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EventFilterContext _localctx = new EventFilterContext(_ctx, _parentState);
		EventFilterContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_eventFilter, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				{
				setState(176);
				match(T__13);
				setState(177);
				((EventFilterContext)_localctx).f1 = eventFilter(0);
				setState(178);
				match(T__14);
				((EventFilterContext)_localctx).filter =  ((EventFilterContext)_localctx).f1.filter; 
				}
				break;
			case T__15:
			case T__16:
			case EVENT_TYPE:
			case SC:
			case REL_ACQ:
			case RELEASE:
			case ACQUIRE:
			case CONSUME:
			case RELAXED:
			case NON_ATOMIC:
				{
				setState(181);
				((EventFilterContext)_localctx).f3 = basicEventFilter();
				((EventFilterContext)_localctx).filter =  ((EventFilterContext)_localctx).f3.filter; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(201);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new EventFilterContext(_parentctx, _parentState);
						_localctx.f1 = _prevctx;
						_localctx.f1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_eventFilter);
						setState(186);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(187);
						match(T__8);
						setState(188);
						((EventFilterContext)_localctx).f2 = eventFilter(6);

						                  if(((EventFilterContext)_localctx).f1.filter instanceof FilterIntersection){
						                      ((EventFilterContext)_localctx).fi =  (FilterIntersection)((EventFilterContext)_localctx).f1.filter;
						                  } else {
						                      ((EventFilterContext)_localctx).fi =  new FilterIntersection();
						                      _localctx.fi.addFilter(((EventFilterContext)_localctx).f1.filter);
						                  }
						                  _localctx.fi.addFilter(((EventFilterContext)_localctx).f2.filter);
						                  ((EventFilterContext)_localctx).filter =  _localctx.fi;
						              
						}
						break;
					case 2:
						{
						_localctx = new EventFilterContext(_parentctx, _parentState);
						_localctx.f1 = _prevctx;
						_localctx.f1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_eventFilter);
						setState(191);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(192);
						match(T__7);
						setState(193);
						((EventFilterContext)_localctx).f2 = eventFilter(5);

						                      if(((EventFilterContext)_localctx).f1.filter instanceof FilterUnion){
						                          ((EventFilterContext)_localctx).fu =  (FilterUnion)((EventFilterContext)_localctx).f1.filter;
						                      } else {
						                          ((EventFilterContext)_localctx).fu =  new FilterUnion();
						                          _localctx.fu.addFilter(((EventFilterContext)_localctx).f1.filter);
						                      }
						                      _localctx.fu.addFilter(((EventFilterContext)_localctx).f2.filter);
						                      ((EventFilterContext)_localctx).filter =  _localctx.fu;
						                  
						}
						break;
					case 3:
						{
						_localctx = new EventFilterContext(_parentctx, _parentState);
						_localctx.f1 = _prevctx;
						_localctx.f1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_eventFilter);
						setState(196);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(197);
						match(T__9);
						setState(198);
						((EventFilterContext)_localctx).f2 = eventFilter(4);

						                      ((EventFilterContext)_localctx).filter =  new FilterDifference(((EventFilterContext)_localctx).f1.filter, ((EventFilterContext)_localctx).f2.filter);
						                  
						}
						break;
					}
					} 
				}
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class BasicEventFilterContext extends ParserRuleContext {
		public FilterInterface filter;
		public Token t;
		public AtomicsContext t2;
		public TerminalNode EVENT_TYPE() { return getToken(ModelParser.EVENT_TYPE, 0); }
		public AtomicsContext atomics() {
			return getRuleContext(AtomicsContext.class,0);
		}
		public BasicEventFilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicEventFilter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterBasicEventFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitBasicEventFilter(this);
		}
	}

	public final BasicEventFilterContext basicEventFilter() throws RecognitionException {
		BasicEventFilterContext _localctx = new BasicEventFilterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_basicEventFilter);
		try {
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(T__15);
				setState(207);
				((BasicEventFilterContext)_localctx).t = match(EVENT_TYPE);
				setState(208);
				match(T__14);
				((BasicEventFilterContext)_localctx).filter =  new FilterBasic((((BasicEventFilterContext)_localctx).t!=null?((BasicEventFilterContext)_localctx).t.getText():null)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(T__16);
				setState(211);
				((BasicEventFilterContext)_localctx).t = match(EVENT_TYPE);
				setState(212);
				match(T__17);
				((BasicEventFilterContext)_localctx).filter =  new FilterBasic((((BasicEventFilterContext)_localctx).t!=null?((BasicEventFilterContext)_localctx).t.getText():null)); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				((BasicEventFilterContext)_localctx).t = match(EVENT_TYPE);
				((BasicEventFilterContext)_localctx).filter =  new FilterBasic((((BasicEventFilterContext)_localctx).t!=null?((BasicEventFilterContext)_localctx).t.getText():null)); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(216);
				match(T__15);
				setState(217);
				((BasicEventFilterContext)_localctx).t2 = atomics();
				setState(218);
				match(T__14);
				((BasicEventFilterContext)_localctx).filter =  new FilterBasic((((BasicEventFilterContext)_localctx).t2!=null?_input.getText(((BasicEventFilterContext)_localctx).t2.start,((BasicEventFilterContext)_localctx).t2.stop):null));
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(221);
				match(T__16);
				setState(222);
				((BasicEventFilterContext)_localctx).t2 = atomics();
				setState(223);
				match(T__17);
				((BasicEventFilterContext)_localctx).filter =  new FilterBasic((((BasicEventFilterContext)_localctx).t2!=null?_input.getText(((BasicEventFilterContext)_localctx).t2.start,((BasicEventFilterContext)_localctx).t2.stop):null));
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(226);
				((BasicEventFilterContext)_localctx).t2 = atomics();
				((BasicEventFilterContext)_localctx).filter =  new FilterBasic((((BasicEventFilterContext)_localctx).t2!=null?_input.getText(((BasicEventFilterContext)_localctx).t2.start,((BasicEventFilterContext)_localctx).t2.stop):null));
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
		enterRule(_localctx, 20, RULE_atomics);
		try {
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SC:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				((AtomicsContext)_localctx).a1 = sc();
				((AtomicsContext)_localctx).value =  ((AtomicsContext)_localctx).a1.value; 
				}
				break;
			case REL_ACQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				((AtomicsContext)_localctx).a2 = relAqc();
				((AtomicsContext)_localctx).value =  ((AtomicsContext)_localctx).a2.value; 
				}
				break;
			case RELEASE:
				enterOuterAlt(_localctx, 3);
				{
				setState(237);
				((AtomicsContext)_localctx).a3 = release();
				((AtomicsContext)_localctx).value =  ((AtomicsContext)_localctx).a3.value; 
				}
				break;
			case ACQUIRE:
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
				((AtomicsContext)_localctx).a4 = acquire();
				((AtomicsContext)_localctx).value =  ((AtomicsContext)_localctx).a4.value; 
				}
				break;
			case CONSUME:
				enterOuterAlt(_localctx, 5);
				{
				setState(243);
				((AtomicsContext)_localctx).a5 = cons();
				((AtomicsContext)_localctx).value =  ((AtomicsContext)_localctx).a5.value; 
				}
				break;
			case RELAXED:
				enterOuterAlt(_localctx, 6);
				{
				setState(246);
				((AtomicsContext)_localctx).a6 = relaxed();
				((AtomicsContext)_localctx).value =  ((AtomicsContext)_localctx).a6.value; 
				}
				break;
			case NON_ATOMIC:
				enterOuterAlt(_localctx, 7);
				{
				setState(249);
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
		enterRule(_localctx, 22, RULE_sc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
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
		enterRule(_localctx, 24, RULE_relAqc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
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
		enterRule(_localctx, 26, RULE_release);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
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
		enterRule(_localctx, 28, RULE_acquire);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
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
		enterRule(_localctx, 30, RULE_cons);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
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
		enterRule(_localctx, 32, RULE_relaxed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
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
		enterRule(_localctx, 34, RULE_nonAtomic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
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

	public static class BaseContext extends ParserRuleContext {
		public Relation value;
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
		enterRule(_localctx, 36, RULE_base);
		try {
			setState(335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PO:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(PO);
				((BaseContext)_localctx).value = new BasicRelation("po");
				}
				break;
			case POLOC:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				match(POLOC);
				((BaseContext)_localctx).value = new BasicRelation("poloc");
				}
				break;
			case RFE:
				enterOuterAlt(_localctx, 3);
				{
				setState(279);
				match(RFE);
				((BaseContext)_localctx).value = new BasicRelation("rfe");
				}
				break;
			case RFI:
				enterOuterAlt(_localctx, 4);
				{
				setState(281);
				match(RFI);
				((BaseContext)_localctx).value = new BasicRelation("rfi");
				}
				break;
			case RF:
				enterOuterAlt(_localctx, 5);
				{
				setState(283);
				match(RF);
				((BaseContext)_localctx).value = new BasicRelation("rf");
				}
				break;
			case FR:
				enterOuterAlt(_localctx, 6);
				{
				setState(285);
				match(FR);
				((BaseContext)_localctx).value = new BasicRelation("fr");
				}
				break;
			case FRI:
				enterOuterAlt(_localctx, 7);
				{
				setState(287);
				match(FRI);
				((BaseContext)_localctx).value = new BasicRelation("fri");
				}
				break;
			case FRE:
				enterOuterAlt(_localctx, 8);
				{
				setState(289);
				match(FRE);
				((BaseContext)_localctx).value = new BasicRelation("fre");
				}
				break;
			case CO:
				enterOuterAlt(_localctx, 9);
				{
				setState(291);
				match(CO);
				((BaseContext)_localctx).value = new BasicRelation("co");
				}
				break;
			case COE:
				enterOuterAlt(_localctx, 10);
				{
				setState(293);
				match(COE);
				((BaseContext)_localctx).value = new BasicRelation("coe");
				}
				break;
			case COI:
				enterOuterAlt(_localctx, 11);
				{
				setState(295);
				match(COI);
				((BaseContext)_localctx).value = new BasicRelation("coi");
				}
				break;
			case AD:
				enterOuterAlt(_localctx, 12);
				{
				setState(297);
				match(AD);
				((BaseContext)_localctx).value = new BasicRelation("po");
				}
				break;
			case IDD:
				enterOuterAlt(_localctx, 13);
				{
				setState(299);
				match(IDD);
				((BaseContext)_localctx).value = new BasicRelation("idd");
				}
				break;
			case ISH:
				enterOuterAlt(_localctx, 14);
				{
				setState(301);
				match(ISH);
				((BaseContext)_localctx).value = new BasicRelation("ish");
				}
				break;
			case CD:
				enterOuterAlt(_localctx, 15);
				{
				setState(303);
				match(CD);
				((BaseContext)_localctx).value = new BasicRelation("cd");
				}
				break;
			case STHD:
				enterOuterAlt(_localctx, 16);
				{
				setState(305);
				match(STHD);
				((BaseContext)_localctx).value = new BasicRelation("sthd");
				}
				break;
			case SLOC:
				enterOuterAlt(_localctx, 17);
				{
				setState(307);
				match(SLOC);
				((BaseContext)_localctx).value = new BasicRelation("sloc");
				}
				break;
			case MFENCE:
				enterOuterAlt(_localctx, 18);
				{
				setState(309);
				match(MFENCE);
				((BaseContext)_localctx).value = new BasicRelation("mfence");
				}
				break;
			case CTRLISYNC:
				enterOuterAlt(_localctx, 19);
				{
				setState(311);
				match(CTRLISYNC);
				((BaseContext)_localctx).value = new BasicRelation("ctrlisync");
				}
				break;
			case LWSYNC:
				enterOuterAlt(_localctx, 20);
				{
				setState(313);
				match(LWSYNC);
				((BaseContext)_localctx).value = new BasicRelation("lwsync");
				}
				break;
			case ISYNC:
				enterOuterAlt(_localctx, 21);
				{
				setState(315);
				match(ISYNC);
				((BaseContext)_localctx).value = new BasicRelation("isync");
				}
				break;
			case SYNC:
				enterOuterAlt(_localctx, 22);
				{
				setState(317);
				match(SYNC);
				((BaseContext)_localctx).value = new BasicRelation("sync");
				}
				break;
			case CTRLDIREKT:
				enterOuterAlt(_localctx, 23);
				{
				setState(319);
				match(CTRLDIREKT);
				((BaseContext)_localctx).value = new BasicRelation("ctrlDirect");
				}
				break;
			case CTRLISB:
				enterOuterAlt(_localctx, 24);
				{
				setState(321);
				match(CTRLISB);
				((BaseContext)_localctx).value = new BasicRelation("ctrlisb");
				}
				break;
			case CTRL:
				enterOuterAlt(_localctx, 25);
				{
				setState(323);
				match(CTRL);
				((BaseContext)_localctx).value = new BasicRelation("ctrl");
				}
				break;
			case ISB:
				enterOuterAlt(_localctx, 26);
				{
				setState(325);
				match(ISB);
				((BaseContext)_localctx).value = new BasicRelation("isb");
				}
				break;
			case ADDR:
				enterOuterAlt(_localctx, 27);
				{
				setState(327);
				match(ADDR);
				((BaseContext)_localctx).value = new EmptyRel();
				}
				break;
			case DATA:
				enterOuterAlt(_localctx, 28);
				{
				setState(329);
				match(DATA);
				((BaseContext)_localctx).value = new RelInterSect(new RelLocTrans(new BasicRelation("idd")), new RelSetToSet(new FilterBasic("R"), new FilterBasic("W")));
				}
				break;
			case EMPTY:
				enterOuterAlt(_localctx, 29);
				{
				setState(331);
				match(EMPTY);
				((BaseContext)_localctx).value = new EmptyRel();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 30);
				{
				setState(333);
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
		case 6:
			return relation_sempred((RelationContext)_localctx, predIndex);
		case 8:
			return eventFilter_sempred((EventFilterContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean relation_sempred(RelationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean eventFilter_sempred(EventFilterContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3I\u0154\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\5\2+\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\6\2\66\n\2\r\2\16\2\67\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3A\n\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3H\n\3\5\3J\n\3\3\4\3\4\5\4N\n\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6a\n\6\f\6\16\6d\13"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6l\n\6\f\6\16\6o\13\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\7\6w\n\6\f\6\16\6z\13\6\3\6\3\6\3\6\3\6\3\6\7\6\u0081\n\6\f\6\16"+
		"\6\u0084\13\6\5\6\u0086\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0090"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u009e\n\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\7\b\u00a6\n\b\f\b\16\b\u00a9\13\b\3\t\3\t\5\t\u00ad"+
		"\n\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00bb\n\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00cc\n\n"+
		"\f\n\16\n\u00cf\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u00e8\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ff\n\f\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\5\24\u0152\n\24\3\24\2\4\16\22\25\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&\2\3\3\2\6\7\2\u0183\2(\3\2\2\2\4I\3\2"+
		"\2\2\6K\3\2\2\2\bT\3\2\2\2\n\u0085\3\2\2\2\f\u008f\3\2\2\2\16\u009d\3"+
		"\2\2\2\20\u00aa\3\2\2\2\22\u00ba\3\2\2\2\24\u00e7\3\2\2\2\26\u00fe\3\2"+
		"\2\2\30\u0100\3\2\2\2\32\u0103\3\2\2\2\34\u0106\3\2\2\2\36\u0109\3\2\2"+
		"\2 \u010c\3\2\2\2\"\u010f\3\2\2\2$\u0112\3\2\2\2&\u0151\3\2\2\2(*\b\2"+
		"\1\2)+\7D\2\2*)\3\2\2\2*+\3\2\2\2+\65\3\2\2\2,-\5\4\3\2-.\b\2\1\2.\66"+
		"\3\2\2\2/\60\5\b\5\2\60\61\b\2\1\2\61\66\3\2\2\2\62\63\5\6\4\2\63\64\b"+
		"\2\1\2\64\66\3\2\2\2\65,\3\2\2\2\65/\3\2\2\2\65\62\3\2\2\2\66\67\3\2\2"+
		"\2\67\65\3\2\2\2\678\3\2\2\289\3\2\2\29:\7\2\2\3:\3\3\2\2\2;<\7\3\2\2"+
		"<=\5\n\6\2=@\b\3\1\2>?\7\4\2\2?A\7C\2\2@>\3\2\2\2@A\3\2\2\2AJ\3\2\2\2"+
		"BC\7\5\2\2CD\5\n\6\2DG\b\3\1\2EF\7\4\2\2FH\7C\2\2GE\3\2\2\2GH\3\2\2\2"+
		"HJ\3\2\2\2I;\3\2\2\2IB\3\2\2\2J\5\3\2\2\2KM\t\2\2\2LN\7\b\2\2ML\3\2\2"+
		"\2MN\3\2\2\2NO\3\2\2\2OP\7C\2\2PQ\7\t\2\2QR\5\n\6\2RS\b\4\1\2S\7\3\2\2"+
		"\2TU\7\6\2\2UV\7C\2\2VW\7\t\2\2WX\5\22\n\2XY\b\5\1\2Y\t\3\2\2\2Z[\5\f"+
		"\7\2[b\b\6\1\2\\]\7\n\2\2]^\5\f\7\2^_\b\6\1\2_a\3\2\2\2`\\\3\2\2\2ad\3"+
		"\2\2\2b`\3\2\2\2bc\3\2\2\2c\u0086\3\2\2\2db\3\2\2\2ef\5\f\7\2fm\b\6\1"+
		"\2gh\7\13\2\2hi\5\f\7\2ij\b\6\1\2jl\3\2\2\2kg\3\2\2\2lo\3\2\2\2mk\3\2"+
		"\2\2mn\3\2\2\2n\u0086\3\2\2\2om\3\2\2\2pq\5\f\7\2qx\b\6\1\2rs\7\f\2\2"+
		"st\5\f\7\2tu\b\6\1\2uw\3\2\2\2vr\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2"+
		"y\u0086\3\2\2\2zx\3\2\2\2{\u0082\5\f\7\2|}\7\r\2\2}~\5\f\7\2~\177\b\6"+
		"\1\2\177\u0081\3\2\2\2\u0080|\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0085"+
		"Z\3\2\2\2\u0085e\3\2\2\2\u0085p\3\2\2\2\u0085{\3\2\2\2\u0086\13\3\2\2"+
		"\2\u0087\u0088\5\16\b\2\u0088\u0089\b\7\1\2\u0089\u0090\3\2\2\2\u008a"+
		"\u008b\5\22\n\2\u008b\u008c\b\7\1\2\u008c\u0090\3\2\2\2\u008d\u008e\7"+
		"C\2\2\u008e\u0090\b\7\1\2\u008f\u0087\3\2\2\2\u008f\u008a\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u0090\r\3\2\2\2\u0091\u009e\b\b\1\2\u0092\u0093\5&\24\2"+
		"\u0093\u0094\b\b\1\2\u0094\u009e\3\2\2\2\u0095\u0096\5\20\t\2\u0096\u0097"+
		"\b\b\1\2\u0097\u009e\3\2\2\2\u0098\u0099\7\20\2\2\u0099\u009a\5\n\6\2"+
		"\u009a\u009b\7\21\2\2\u009b\u009c\b\b\1\2\u009c\u009e\3\2\2\2\u009d\u0091"+
		"\3\2\2\2\u009d\u0092\3\2\2\2\u009d\u0095\3\2\2\2\u009d\u0098\3\2\2\2\u009e"+
		"\u00a7\3\2\2\2\u009f\u00a0\f\5\2\2\u00a0\u00a1\7\16\2\2\u00a1\u00a6\b"+
		"\b\1\2\u00a2\u00a3\f\4\2\2\u00a3\u00a4\7\17\2\2\u00a4\u00a6\b\b\1\2\u00a5"+
		"\u009f\3\2\2\2\u00a5\u00a2\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a8\17\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ac"+
		"\5\22\n\2\u00ab\u00ad\7\17\2\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2"+
		"\u00ad\u00ae\3\2\2\2\u00ae\u00af\5\22\n\2\u00af\u00b0\b\t\1\2\u00b0\21"+
		"\3\2\2\2\u00b1\u00b2\b\n\1\2\u00b2\u00b3\7\20\2\2\u00b3\u00b4\5\22\n\2"+
		"\u00b4\u00b5\7\21\2\2\u00b5\u00b6\b\n\1\2\u00b6\u00bb\3\2\2\2\u00b7\u00b8"+
		"\5\24\13\2\u00b8\u00b9\b\n\1\2\u00b9\u00bb\3\2\2\2\u00ba\u00b1\3\2\2\2"+
		"\u00ba\u00b7\3\2\2\2\u00bb\u00cd\3\2\2\2\u00bc\u00bd\f\7\2\2\u00bd\u00be"+
		"\7\13\2\2\u00be\u00bf\5\22\n\b\u00bf\u00c0\b\n\1\2\u00c0\u00cc\3\2\2\2"+
		"\u00c1\u00c2\f\6\2\2\u00c2\u00c3\7\n\2\2\u00c3\u00c4\5\22\n\7\u00c4\u00c5"+
		"\b\n\1\2\u00c5\u00cc\3\2\2\2\u00c6\u00c7\f\5\2\2\u00c7\u00c8\7\f\2\2\u00c8"+
		"\u00c9\5\22\n\6\u00c9\u00ca\b\n\1\2\u00ca\u00cc\3\2\2\2\u00cb\u00bc\3"+
		"\2\2\2\u00cb\u00c1\3\2\2\2\u00cb\u00c6\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\23\3\2\2\2\u00cf\u00cd\3\2\2"+
		"\2\u00d0\u00d1\7\22\2\2\u00d1\u00d2\7\63\2\2\u00d2\u00d3\7\21\2\2\u00d3"+
		"\u00e8\b\13\1\2\u00d4\u00d5\7\23\2\2\u00d5\u00d6\7\63\2\2\u00d6\u00d7"+
		"\7\24\2\2\u00d7\u00e8\b\13\1\2\u00d8\u00d9\7\63\2\2\u00d9\u00e8\b\13\1"+
		"\2\u00da\u00db\7\22\2\2\u00db\u00dc\5\26\f\2\u00dc\u00dd\7\21\2\2\u00dd"+
		"\u00de\b\13\1\2\u00de\u00e8\3\2\2\2\u00df\u00e0\7\23\2\2\u00e0\u00e1\5"+
		"\26\f\2\u00e1\u00e2\7\24\2\2\u00e2\u00e3\b\13\1\2\u00e3\u00e8\3\2\2\2"+
		"\u00e4\u00e5\5\26\f\2\u00e5\u00e6\b\13\1\2\u00e6\u00e8\3\2\2\2\u00e7\u00d0"+
		"\3\2\2\2\u00e7\u00d4\3\2\2\2\u00e7\u00d8\3\2\2\2\u00e7\u00da\3\2\2\2\u00e7"+
		"\u00df\3\2\2\2\u00e7\u00e4\3\2\2\2\u00e8\25\3\2\2\2\u00e9\u00ea\5\30\r"+
		"\2\u00ea\u00eb\b\f\1\2\u00eb\u00ff\3\2\2\2\u00ec\u00ed\5\32\16\2\u00ed"+
		"\u00ee\b\f\1\2\u00ee\u00ff\3\2\2\2\u00ef\u00f0\5\34\17\2\u00f0\u00f1\b"+
		"\f\1\2\u00f1\u00ff\3\2\2\2\u00f2\u00f3\5\36\20\2\u00f3\u00f4\b\f\1\2\u00f4"+
		"\u00ff\3\2\2\2\u00f5\u00f6\5 \21\2\u00f6\u00f7\b\f\1\2\u00f7\u00ff\3\2"+
		"\2\2\u00f8\u00f9\5\"\22\2\u00f9\u00fa\b\f\1\2\u00fa\u00ff\3\2\2\2\u00fb"+
		"\u00fc\5$\23\2\u00fc\u00fd\b\f\1\2\u00fd\u00ff\3\2\2\2\u00fe\u00e9\3\2"+
		"\2\2\u00fe\u00ec\3\2\2\2\u00fe\u00ef\3\2\2\2\u00fe\u00f2\3\2\2\2\u00fe"+
		"\u00f5\3\2\2\2\u00fe\u00f8\3\2\2\2\u00fe\u00fb\3\2\2\2\u00ff\27\3\2\2"+
		"\2\u0100\u0101\7<\2\2\u0101\u0102\b\r\1\2\u0102\31\3\2\2\2\u0103\u0104"+
		"\7=\2\2\u0104\u0105\b\16\1\2\u0105\33\3\2\2\2\u0106\u0107\7>\2\2\u0107"+
		"\u0108\b\17\1\2\u0108\35\3\2\2\2\u0109\u010a\7?\2\2\u010a\u010b\b\20\1"+
		"\2\u010b\37\3\2\2\2\u010c\u010d\7@\2\2\u010d\u010e\b\21\1\2\u010e!\3\2"+
		"\2\2\u010f\u0110\7A\2\2\u0110\u0111\b\22\1\2\u0111#\3\2\2\2\u0112\u0113"+
		"\7B\2\2\u0113\u0114\b\23\1\2\u0114%\3\2\2\2\u0115\u0116\7\25\2\2\u0116"+
		"\u0152\b\24\1\2\u0117\u0118\7\26\2\2\u0118\u0152\b\24\1\2\u0119\u011a"+
		"\7\27\2\2\u011a\u0152\b\24\1\2\u011b\u011c\7\30\2\2\u011c\u0152\b\24\1"+
		"\2\u011d\u011e\7\31\2\2\u011e\u0152\b\24\1\2\u011f\u0120\7\32\2\2\u0120"+
		"\u0152\b\24\1\2\u0121\u0122\7\34\2\2\u0122\u0152\b\24\1\2\u0123\u0124"+
		"\7\33\2\2\u0124\u0152\b\24\1\2\u0125\u0126\7\35\2\2\u0126\u0152\b\24\1"+
		"\2\u0127\u0128\7\36\2\2\u0128\u0152\b\24\1\2\u0129\u012a\7\37\2\2\u012a"+
		"\u0152\b\24\1\2\u012b\u012c\7 \2\2\u012c\u0152\b\24\1\2\u012d\u012e\7"+
		"!\2\2\u012e\u0152\b\24\1\2\u012f\u0130\7\"\2\2\u0130\u0152\b\24\1\2\u0131"+
		"\u0132\7#\2\2\u0132\u0152\b\24\1\2\u0133\u0134\7$\2\2\u0134\u0152\b\24"+
		"\1\2\u0135\u0136\7%\2\2\u0136\u0152\b\24\1\2\u0137\u0138\7&\2\2\u0138"+
		"\u0152\b\24\1\2\u0139\u013a\7(\2\2\u013a\u0152\b\24\1\2\u013b\u013c\7"+
		"\'\2\2\u013c\u0152\b\24\1\2\u013d\u013e\7)\2\2\u013e\u0152\b\24\1\2\u013f"+
		"\u0140\7*\2\2\u0140\u0152\b\24\1\2\u0141\u0142\7+\2\2\u0142\u0152\b\24"+
		"\1\2\u0143\u0144\7,\2\2\u0144\u0152\b\24\1\2\u0145\u0146\7-\2\2\u0146"+
		"\u0152\b\24\1\2\u0147\u0148\7.\2\2\u0148\u0152\b\24\1\2\u0149\u014a\7"+
		"/\2\2\u014a\u0152\b\24\1\2\u014b\u014c\7\60\2\2\u014c\u0152\b\24\1\2\u014d"+
		"\u014e\7\62\2\2\u014e\u0152\b\24\1\2\u014f\u0150\7\61\2\2\u0150\u0152"+
		"\b\24\1\2\u0151\u0115\3\2\2\2\u0151\u0117\3\2\2\2\u0151\u0119\3\2\2\2"+
		"\u0151\u011b\3\2\2\2\u0151\u011d\3\2\2\2\u0151\u011f\3\2\2\2\u0151\u0121"+
		"\3\2\2\2\u0151\u0123\3\2\2\2\u0151\u0125\3\2\2\2\u0151\u0127\3\2\2\2\u0151"+
		"\u0129\3\2\2\2\u0151\u012b\3\2\2\2\u0151\u012d\3\2\2\2\u0151\u012f\3\2"+
		"\2\2\u0151\u0131\3\2\2\2\u0151\u0133\3\2\2\2\u0151\u0135\3\2\2\2\u0151"+
		"\u0137\3\2\2\2\u0151\u0139\3\2\2\2\u0151\u013b\3\2\2\2\u0151\u013d\3\2"+
		"\2\2\u0151\u013f\3\2\2\2\u0151\u0141\3\2\2\2\u0151\u0143\3\2\2\2\u0151"+
		"\u0145\3\2\2\2\u0151\u0147\3\2\2\2\u0151\u0149\3\2\2\2\u0151\u014b\3\2"+
		"\2\2\u0151\u014d\3\2\2\2\u0151\u014f\3\2\2\2\u0152\'\3\2\2\2\31*\65\67"+
		"@GIMbmx\u0082\u0085\u008f\u009d\u00a5\u00a7\u00ac\u00ba\u00cb\u00cd\u00e7"+
		"\u00fe\u0151";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}