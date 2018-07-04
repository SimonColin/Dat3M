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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, NAME=24, WS=25, 
		BLOCK_COMMENT=26, INCLUDE=27, MODELNAME=28;
	public static final int
		RULE_mcm = 0, RULE_definition = 1, RULE_axiomDefinition = 2, RULE_letDefinition = 3, 
		RULE_letRecDefinition = 4, RULE_expression = 5;
	public static final String[] ruleNames = {
		"mcm", "definition", "axiomDefinition", "letDefinition", "letRecDefinition", 
		"expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'acyclic'", "'as'", "'irreflexive'", "'empty'", "'let'", "'='", 
		"'let rec'", "'and'", "'toid('", "')'", "'['", "']'", "'('", "'*'", "'+'", 
		"'?'", "'^'", "'-1'", "'~'", "';'", "'|'", "'\\'", "'&'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"NAME", "WS", "BLOCK_COMMENT", "INCLUDE", "MODELNAME"
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
	    boolean createDummy = false;

	public ModelParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class McmContext extends ParserRuleContext {
		public Wmm value;
		public TerminalNode EOF() { return getToken(ModelParser.EOF, 0); }
		public TerminalNode NAME() { return getToken(ModelParser.NAME, 0); }
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
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
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(12);
				match(NAME);
				}
			}

			setState(16); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(15);
				definition();
				}
				}
				setState(18); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << T__7))) != 0) );
			setState(20);
			match(EOF);

			            ((McmContext)_localctx).value =   wmm;
			        
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

	public static class DefinitionContext extends ParserRuleContext {
		public AxiomDefinitionContext axiomDefinition() {
			return getRuleContext(AxiomDefinitionContext.class,0);
		}
		public LetDefinitionContext letDefinition() {
			return getRuleContext(LetDefinitionContext.class,0);
		}
		public LetRecDefinitionContext letRecDefinition() {
			return getRuleContext(LetRecDefinitionContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitDefinition(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		try {
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__2:
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				axiomDefinition();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				letDefinition();
				}
				break;
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
				letRecDefinition();
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

	public static class AxiomDefinitionContext extends ParserRuleContext {
		public Axiom value;
		public ExpressionContext e;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NAME() { return getToken(ModelParser.NAME, 0); }
		public AxiomDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_axiomDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterAxiomDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitAxiomDefinition(this);
		}
	}

	public final AxiomDefinitionContext axiomDefinition() throws RecognitionException {
		AxiomDefinitionContext _localctx = new AxiomDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_axiomDefinition);
		int _la;
		try {
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				match(T__0);
				 createDummy = false; 
				setState(30);
				((AxiomDefinitionContext)_localctx).e = expression(0);

				            if(!(((AxiomDefinitionContext)_localctx).e.value instanceof Relation)){
				                throw new RuntimeException("Invalid syntax at " + (((AxiomDefinitionContext)_localctx).e!=null?_input.getText(((AxiomDefinitionContext)_localctx).e.start,((AxiomDefinitionContext)_localctx).e.stop):null));
				            }
				            wmm.addAxiom(new Acyclic((Relation)((AxiomDefinitionContext)_localctx).e.value));
				        
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(32);
					match(T__1);
					setState(33);
					match(NAME);
					}
				}

				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				match(T__2);
				 createDummy = false; 
				setState(38);
				((AxiomDefinitionContext)_localctx).e = expression(0);

				            if(!(((AxiomDefinitionContext)_localctx).e.value instanceof Relation)){
				                throw new RuntimeException("Invalid syntax at " + (((AxiomDefinitionContext)_localctx).e!=null?_input.getText(((AxiomDefinitionContext)_localctx).e.start,((AxiomDefinitionContext)_localctx).e.stop):null));
				            }
				            wmm.addAxiom(new Irreflexive((Relation)((AxiomDefinitionContext)_localctx).e.value));
				        
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(40);
					match(T__1);
					setState(41);
					match(NAME);
					}
				}

				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				match(T__3);
				 createDummy = false; 
				setState(46);
				((AxiomDefinitionContext)_localctx).e = expression(0);

				            // TODO: Implementation (relation and filter)
				            //throw new RuntimeException("Not implemented");
				            System.out.println("empty is not implemented");
				        
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(48);
					match(T__1);
					setState(49);
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

	public static class LetDefinitionContext extends ParserRuleContext {
		public Token n;
		public ExpressionContext e;
		public TerminalNode NAME() { return getToken(ModelParser.NAME, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LetDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterLetDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitLetDefinition(this);
		}
	}

	public final LetDefinitionContext letDefinition() throws RecognitionException {
		LetDefinitionContext _localctx = new LetDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_letDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__4);
			 createDummy = false; 
			setState(56);
			((LetDefinitionContext)_localctx).n = match(NAME);
			setState(57);
			match(T__5);
			setState(58);
			((LetDefinitionContext)_localctx).e = expression(0);

			            if(((LetDefinitionContext)_localctx).e.value instanceof Relation){
			                ((Relation)((LetDefinitionContext)_localctx).e.value).setName((((LetDefinitionContext)_localctx).n!=null?((LetDefinitionContext)_localctx).n.getText():null));
			                wmm.addRelation((Relation)((LetDefinitionContext)_localctx).e.value);
			            } else if (((LetDefinitionContext)_localctx).e.value instanceof FilterInterface){
			                ((Relation)((LetDefinitionContext)_localctx).e.value).setName((((LetDefinitionContext)_localctx).n!=null?((LetDefinitionContext)_localctx).n.getText():null));
			                wmm.addFilter((FilterInterface)((LetDefinitionContext)_localctx).e.value);
			            } else {
			                throw new RuntimeException("Invalid definition of " + (((LetDefinitionContext)_localctx).n!=null?((LetDefinitionContext)_localctx).n.getText():null));
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

	public static class LetRecDefinitionContext extends ParserRuleContext {
		public Token n;
		public ExpressionContext e;
		public TerminalNode NAME() { return getToken(ModelParser.NAME, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LetRecDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letRecDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterLetRecDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitLetRecDefinition(this);
		}
	}

	public final LetRecDefinitionContext letRecDefinition() throws RecognitionException {
		LetRecDefinitionContext _localctx = new LetRecDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_letRecDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==T__7) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 createDummy = true; 
			setState(63);
			((LetRecDefinitionContext)_localctx).n = match(NAME);
			setState(64);
			match(T__5);
			setState(65);
			((LetRecDefinitionContext)_localctx).e = expression(0);

			            if(((LetRecDefinitionContext)_localctx).e.value instanceof Relation){
			                ((Relation)((LetRecDefinitionContext)_localctx).e.value).setName((((LetRecDefinitionContext)_localctx).n!=null?((LetRecDefinitionContext)_localctx).n.getText():null));
			                wmm.addRelation((Relation)((LetRecDefinitionContext)_localctx).e.value);
			            } else {
			                throw new RuntimeException("Invalid definition of " + (((LetRecDefinitionContext)_localctx).n!=null?((LetRecDefinitionContext)_localctx).n.getText():null));
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

	public static class ExpressionContext extends ParserRuleContext {
		public Object value;
		public ExpressionContext e1;
		public ExpressionContext e;
		public Token n;
		public ExpressionContext e2;
		public TerminalNode NAME() { return getToken(ModelParser.NAME, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				setState(69);
				((ExpressionContext)_localctx).n = match(NAME);

				            ((ExpressionContext)_localctx).value =  wmm.getRelation((((ExpressionContext)_localctx).n!=null?((ExpressionContext)_localctx).n.getText():null));
				            if(_localctx.value == null){
				                ((ExpressionContext)_localctx).value =  wmm.getFilter((((ExpressionContext)_localctx).n!=null?((ExpressionContext)_localctx).n.getText():null));
				                if(_localctx.value == null && createDummy){
				                    ((ExpressionContext)_localctx).value =  new RelDummy((((ExpressionContext)_localctx).n!=null?((ExpressionContext)_localctx).n.getText():null));
				                }
				            }
				        
				}
				break;
			case T__8:
			case T__10:
				{
				setState(79);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
					{
					setState(71);
					match(T__8);
					setState(72);
					((ExpressionContext)_localctx).e = expression(0);
					setState(73);
					match(T__9);
					}
					break;
				case T__10:
					{
					setState(75);
					match(T__10);
					setState(76);
					((ExpressionContext)_localctx).e = expression(0);
					setState(77);
					match(T__11);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}

				            if(!(((ExpressionContext)_localctx).e.value instanceof FilterInterface)){
				                throw new RuntimeException("Invalid syntax at " + (((ExpressionContext)_localctx).e!=null?_input.getText(((ExpressionContext)_localctx).e.start,((ExpressionContext)_localctx).e.stop):null));
				            }
				            ((ExpressionContext)_localctx).value =  new RelFromSet((FilterInterface)((ExpressionContext)_localctx).e.value);
				        
				}
				break;
			case T__12:
				{
				setState(83);
				match(T__12);
				setState(84);
				((ExpressionContext)_localctx).e = expression(0);
				setState(85);
				match(T__9);

				            ((ExpressionContext)_localctx).value =  ((ExpressionContext)_localctx).e.value;
				        
				}
				break;
			case T__18:
				{
				setState(88);
				match(T__18);
				setState(89);
				((ExpressionContext)_localctx).e = expression(5);

				            // TODO: Implementation (relation and filter)
				            //throw new RuntimeException("Not implemented");
				            System.out.println("~ is not implemented");
				        
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(136);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(94);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(96);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__13) {
							{
							setState(95);
							match(T__13);
							}
						}

						setState(98);
						((ExpressionContext)_localctx).e2 = expression(11);

						                      if(!(((ExpressionContext)_localctx).e1.value instanceof FilterInterface) || !(((ExpressionContext)_localctx).e2.value instanceof FilterInterface)){
						                          throw new RuntimeException("Invalid syntax at " + (((ExpressionContext)_localctx).e1!=null?_input.getText(((ExpressionContext)_localctx).e1.start,((ExpressionContext)_localctx).e1.stop):null) + " " + (((ExpressionContext)_localctx).e2!=null?_input.getText(((ExpressionContext)_localctx).e2.start,((ExpressionContext)_localctx).e2.stop):null));
						                      }
						                      ((ExpressionContext)_localctx).value =  new RelCartesian((FilterInterface)((ExpressionContext)_localctx).e1.value, (FilterInterface)((ExpressionContext)_localctx).e2.value);
						                  
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(101);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(102);
						match(T__19);
						setState(103);
						((ExpressionContext)_localctx).e2 = expression(5);

						                      if(!(((ExpressionContext)_localctx).e1.value instanceof Relation) || !(((ExpressionContext)_localctx).e2.value instanceof Relation)){
						                          throw new RuntimeException("Invalid syntax at " + (((ExpressionContext)_localctx).e1!=null?_input.getText(((ExpressionContext)_localctx).e1.start,((ExpressionContext)_localctx).e1.stop):null) + " " + (((ExpressionContext)_localctx).e2!=null?_input.getText(((ExpressionContext)_localctx).e2.start,((ExpressionContext)_localctx).e2.stop):null));
						                      }
						                      ((ExpressionContext)_localctx).value =  new RelComposition((Relation)((ExpressionContext)_localctx).e1.value, (Relation)((ExpressionContext)_localctx).e2.value);
						                  
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(106);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(107);
						match(T__20);
						setState(108);
						((ExpressionContext)_localctx).e2 = expression(4);

						                      if(((ExpressionContext)_localctx).e1.value instanceof Relation && ((ExpressionContext)_localctx).e2.value instanceof Relation){
						                          ((ExpressionContext)_localctx).value =  new RelUnion((Relation)((ExpressionContext)_localctx).e1.value, (Relation)((ExpressionContext)_localctx).e2.value);
						                      } else if(((ExpressionContext)_localctx).e1.value instanceof FilterInterface && ((ExpressionContext)_localctx).e2.value instanceof FilterInterface){
						                          ((ExpressionContext)_localctx).value =  new FilterUnion((FilterInterface)((ExpressionContext)_localctx).e1.value, (FilterInterface)((ExpressionContext)_localctx).e2.value);
						                      } else {
						                          throw new RuntimeException("Invalid syntax at " + (((ExpressionContext)_localctx).e1!=null?_input.getText(((ExpressionContext)_localctx).e1.start,((ExpressionContext)_localctx).e1.stop):null) + " " + (((ExpressionContext)_localctx).e2!=null?_input.getText(((ExpressionContext)_localctx).e2.start,((ExpressionContext)_localctx).e2.stop):null));
						                      }
						                  
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(111);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(112);
						match(T__21);
						setState(113);
						((ExpressionContext)_localctx).e2 = expression(3);

						                      if(((ExpressionContext)_localctx).e1.value instanceof Relation && ((ExpressionContext)_localctx).e2.value instanceof Relation){
						                          ((ExpressionContext)_localctx).value =  new RelMinus((Relation)((ExpressionContext)_localctx).e1.value, (Relation)((ExpressionContext)_localctx).e2.value);
						                      } else if(((ExpressionContext)_localctx).e1.value instanceof FilterInterface && ((ExpressionContext)_localctx).e2.value instanceof FilterInterface){
						                          ((ExpressionContext)_localctx).value =  new FilterMinus((FilterInterface)((ExpressionContext)_localctx).e1.value, (FilterInterface)((ExpressionContext)_localctx).e2.value);
						                      } else {
						                          throw new RuntimeException("Invalid syntax at " + (((ExpressionContext)_localctx).e1!=null?_input.getText(((ExpressionContext)_localctx).e1.start,((ExpressionContext)_localctx).e1.stop):null) + " " + (((ExpressionContext)_localctx).e2!=null?_input.getText(((ExpressionContext)_localctx).e2.start,((ExpressionContext)_localctx).e2.stop):null));
						                      }
						                  
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(116);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(117);
						match(T__22);
						setState(118);
						((ExpressionContext)_localctx).e2 = expression(2);

						                      if(((ExpressionContext)_localctx).e1.value instanceof Relation && ((ExpressionContext)_localctx).e2.value instanceof Relation){
						                          ((ExpressionContext)_localctx).value =  new RelIntersection((Relation)((ExpressionContext)_localctx).e1.value, (Relation)((ExpressionContext)_localctx).e2.value);
						                      } else if(((ExpressionContext)_localctx).e1.value instanceof FilterInterface && ((ExpressionContext)_localctx).e2.value instanceof FilterInterface){
						                          ((ExpressionContext)_localctx).value =  new FilterIntersection((FilterInterface)((ExpressionContext)_localctx).e1.value, (FilterInterface)((ExpressionContext)_localctx).e2.value);
						                      } else {
						                          throw new RuntimeException("Invalid syntax at " + (((ExpressionContext)_localctx).e1!=null?_input.getText(((ExpressionContext)_localctx).e1.start,((ExpressionContext)_localctx).e1.stop):null) + " " + (((ExpressionContext)_localctx).e2!=null?_input.getText(((ExpressionContext)_localctx).e2.start,((ExpressionContext)_localctx).e2.stop):null));
						                      }
						                  
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e = _prevctx;
						_localctx.e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(121);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(122);
						match(T__13);

						                      if(!(((ExpressionContext)_localctx).e.value instanceof Relation)){
						                          throw new RuntimeException("Invalid syntax at " + (((ExpressionContext)_localctx).e!=null?_input.getText(((ExpressionContext)_localctx).e.start,((ExpressionContext)_localctx).e.stop):null));
						                      }
						                      ((ExpressionContext)_localctx).value =  new RelTransRef((Relation)((ExpressionContext)_localctx).e.value);
						                  
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e = _prevctx;
						_localctx.e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(124);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(125);
						match(T__14);

						                      if(!(((ExpressionContext)_localctx).e.value instanceof Relation)){
						                          throw new RuntimeException("Invalid syntax at " + (((ExpressionContext)_localctx).e!=null?_input.getText(((ExpressionContext)_localctx).e.start,((ExpressionContext)_localctx).e.stop):null));
						                      }
						                      ((ExpressionContext)_localctx).value =  new RelTrans((Relation)((ExpressionContext)_localctx).e.value);
						                  
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e = _prevctx;
						_localctx.e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(127);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(128);
						match(T__15);

						                      // TODO: Implementation
						                      //throw new RuntimeException("Not implemented");
						                      System.out.println("? is not implemented");
						                  
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e = _prevctx;
						_localctx.e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(130);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(132);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__16) {
							{
							setState(131);
							match(T__16);
							}
						}

						setState(134);
						match(T__17);

						                      if(!(((ExpressionContext)_localctx).e.value instanceof Relation)){
						                          throw new RuntimeException("Invalid syntax at " + (((ExpressionContext)_localctx).e!=null?_input.getText(((ExpressionContext)_localctx).e.start,((ExpressionContext)_localctx).e.stop):null));
						                      }
						                      ((ExpressionContext)_localctx).value =  new RelInverse((Relation)((ExpressionContext)_localctx).e.value);
						                  
						}
						break;
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u0090\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\5\2\20\n\2\3\2\6\2\23\n\2"+
		"\r\2\16\2\24\3\2\3\2\3\2\3\3\3\3\3\3\5\3\35\n\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4%\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4-\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4\65\n\4\5\4\67\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7R\n\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7_\n\7\3\7\3\7\5\7c\n\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0087\n\7"+
		"\3\7\3\7\7\7\u008b\n\7\f\7\16\7\u008e\13\7\3\7\2\3\f\b\2\4\6\b\n\f\2\3"+
		"\3\2\t\n\2\u00a1\2\17\3\2\2\2\4\34\3\2\2\2\6\66\3\2\2\2\b8\3\2\2\2\n?"+
		"\3\2\2\2\f^\3\2\2\2\16\20\7\32\2\2\17\16\3\2\2\2\17\20\3\2\2\2\20\22\3"+
		"\2\2\2\21\23\5\4\3\2\22\21\3\2\2\2\23\24\3\2\2\2\24\22\3\2\2\2\24\25\3"+
		"\2\2\2\25\26\3\2\2\2\26\27\7\2\2\3\27\30\b\2\1\2\30\3\3\2\2\2\31\35\5"+
		"\6\4\2\32\35\5\b\5\2\33\35\5\n\6\2\34\31\3\2\2\2\34\32\3\2\2\2\34\33\3"+
		"\2\2\2\35\5\3\2\2\2\36\37\7\3\2\2\37 \b\4\1\2 !\5\f\7\2!$\b\4\1\2\"#\7"+
		"\4\2\2#%\7\32\2\2$\"\3\2\2\2$%\3\2\2\2%\67\3\2\2\2&\'\7\5\2\2\'(\b\4\1"+
		"\2()\5\f\7\2),\b\4\1\2*+\7\4\2\2+-\7\32\2\2,*\3\2\2\2,-\3\2\2\2-\67\3"+
		"\2\2\2./\7\6\2\2/\60\b\4\1\2\60\61\5\f\7\2\61\64\b\4\1\2\62\63\7\4\2\2"+
		"\63\65\7\32\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\36\3\2\2"+
		"\2\66&\3\2\2\2\66.\3\2\2\2\67\7\3\2\2\289\7\7\2\29:\b\5\1\2:;\7\32\2\2"+
		";<\7\b\2\2<=\5\f\7\2=>\b\5\1\2>\t\3\2\2\2?@\t\2\2\2@A\b\6\1\2AB\7\32\2"+
		"\2BC\7\b\2\2CD\5\f\7\2DE\b\6\1\2E\13\3\2\2\2FG\b\7\1\2GH\7\32\2\2H_\b"+
		"\7\1\2IJ\7\13\2\2JK\5\f\7\2KL\7\f\2\2LR\3\2\2\2MN\7\r\2\2NO\5\f\7\2OP"+
		"\7\16\2\2PR\3\2\2\2QI\3\2\2\2QM\3\2\2\2RS\3\2\2\2ST\b\7\1\2T_\3\2\2\2"+
		"UV\7\17\2\2VW\5\f\7\2WX\7\f\2\2XY\b\7\1\2Y_\3\2\2\2Z[\7\25\2\2[\\\5\f"+
		"\7\7\\]\b\7\1\2]_\3\2\2\2^F\3\2\2\2^Q\3\2\2\2^U\3\2\2\2^Z\3\2\2\2_\u008c"+
		"\3\2\2\2`b\f\f\2\2ac\7\20\2\2ba\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\5\f\7\r"+
		"ef\b\7\1\2f\u008b\3\2\2\2gh\f\6\2\2hi\7\26\2\2ij\5\f\7\7jk\b\7\1\2k\u008b"+
		"\3\2\2\2lm\f\5\2\2mn\7\27\2\2no\5\f\7\6op\b\7\1\2p\u008b\3\2\2\2qr\f\4"+
		"\2\2rs\7\30\2\2st\5\f\7\5tu\b\7\1\2u\u008b\3\2\2\2vw\f\3\2\2wx\7\31\2"+
		"\2xy\5\f\7\4yz\b\7\1\2z\u008b\3\2\2\2{|\f\13\2\2|}\7\20\2\2}\u008b\b\7"+
		"\1\2~\177\f\n\2\2\177\u0080\7\21\2\2\u0080\u008b\b\7\1\2\u0081\u0082\f"+
		"\t\2\2\u0082\u0083\7\22\2\2\u0083\u008b\b\7\1\2\u0084\u0086\f\b\2\2\u0085"+
		"\u0087\7\23\2\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3"+
		"\2\2\2\u0088\u0089\7\24\2\2\u0089\u008b\b\7\1\2\u008a`\3\2\2\2\u008ag"+
		"\3\2\2\2\u008al\3\2\2\2\u008aq\3\2\2\2\u008av\3\2\2\2\u008a{\3\2\2\2\u008a"+
		"~\3\2\2\2\u008a\u0081\3\2\2\2\u008a\u0084\3\2\2\2\u008b\u008e\3\2\2\2"+
		"\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\r\3\2\2\2\u008e\u008c\3"+
		"\2\2\2\17\17\24\34$,\64\66Q^b\u0086\u008a\u008c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}