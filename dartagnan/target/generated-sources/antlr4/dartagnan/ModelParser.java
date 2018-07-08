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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		NAME=25, NEW_LINE=26, BLOCK_COMMENT=27, LINE_COMMENT=28, WS=29, INCLUDE=30, 
		MODELNAME=31;
	public static final int
		RULE_mcm = 0, RULE_definition = 1, RULE_axiomDefinition = 2, RULE_letDefinition = 3, 
		RULE_letRecDefinition = 4, RULE_showDefinition = 5, RULE_expression = 6;
	public static final String[] ruleNames = {
		"mcm", "definition", "axiomDefinition", "letDefinition", "letRecDefinition", 
		"showDefinition", "expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'~'", "'acyclic'", "'as'", "'irreflexive'", "'empty'", "'let'", 
		"'='", "'let rec'", "'and'", "'show'", "'toid('", "')'", "'['", "']'", 
		"'('", "'*'", "'+'", "'?'", "'^'", "'-1'", "';'", "'|'", "'\\'", "'&'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "NAME", "NEW_LINE", "BLOCK_COMMENT", "LINE_COMMENT", "WS", "INCLUDE", 
		"MODELNAME"
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
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public TerminalNode EOF() { return getToken(ModelParser.EOF, 0); }
		public TerminalNode NAME() { return getToken(ModelParser.NAME, 0); }
		public List<TerminalNode> NEW_LINE() { return getTokens(ModelParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(ModelParser.NEW_LINE, i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(14);
				match(NAME);
				}
			}

			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEW_LINE) {
				{
				{
				setState(17);
				match(NEW_LINE);
				}
				}
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(23);
					definition();
					setState(25); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(24);
						match(NEW_LINE);
						}
						}
						setState(27); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEW_LINE );
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(31); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(33);
			definition();
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEW_LINE) {
				{
				setState(34);
				match(NEW_LINE);
				}
			}

			setState(37);
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
		public ShowDefinitionContext showDefinition() {
			return getRuleContext(ShowDefinitionContext.class,0);
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
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__3:
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				axiomDefinition();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				letDefinition();
				}
				break;
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				letRecDefinition();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				showDefinition();
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
		public Token negate;
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
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(46);
					((AxiomDefinitionContext)_localctx).negate = match(T__0);
					}
				}

				setState(49);
				match(T__1);
				 createDummy = false; 
				setState(51);
				((AxiomDefinitionContext)_localctx).e = expression(0);
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(52);
					match(T__2);
					setState(53);
					match(NAME);
					}
				}


				            if(!(((AxiomDefinitionContext)_localctx).e.value instanceof Relation)){
				                throw new RuntimeException("Invalid syntax at " + (((AxiomDefinitionContext)_localctx).e!=null?_input.getText(((AxiomDefinitionContext)_localctx).e.start,((AxiomDefinitionContext)_localctx).e.stop):null));
				            }
				            wmm.addAxiom(new Acyclic((Relation)((AxiomDefinitionContext)_localctx).e.value, ((AxiomDefinitionContext)_localctx).negate != null));
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(58);
					((AxiomDefinitionContext)_localctx).negate = match(T__0);
					}
				}

				setState(61);
				match(T__3);
				 createDummy = false; 
				setState(63);
				((AxiomDefinitionContext)_localctx).e = expression(0);
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(64);
					match(T__2);
					setState(65);
					match(NAME);
					}
				}


				            if(!(((AxiomDefinitionContext)_localctx).e.value instanceof Relation)){
				                throw new RuntimeException("Invalid syntax at " + (((AxiomDefinitionContext)_localctx).e!=null?_input.getText(((AxiomDefinitionContext)_localctx).e.start,((AxiomDefinitionContext)_localctx).e.stop):null));
				            }
				            wmm.addAxiom(new Irreflexive((Relation)((AxiomDefinitionContext)_localctx).e.value, ((AxiomDefinitionContext)_localctx).negate != null));
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(70);
					((AxiomDefinitionContext)_localctx).negate = match(T__0);
					}
				}

				setState(73);
				match(T__4);
				 createDummy = false; 
				setState(75);
				((AxiomDefinitionContext)_localctx).e = expression(0);
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(76);
					match(T__2);
					setState(77);
					match(NAME);
					}
				}


				            if(!(((AxiomDefinitionContext)_localctx).e.value instanceof Relation)){
				                throw new RuntimeException("Invalid syntax at " + (((AxiomDefinitionContext)_localctx).e!=null?_input.getText(((AxiomDefinitionContext)_localctx).e.start,((AxiomDefinitionContext)_localctx).e.stop):null));
				            }
				            wmm.addAxiom(new Empty((Relation)((AxiomDefinitionContext)_localctx).e.value, ((AxiomDefinitionContext)_localctx).negate != null));
				        
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
			setState(84);
			match(T__5);
			 createDummy = false; 
			setState(86);
			((LetDefinitionContext)_localctx).n = match(NAME);
			setState(87);
			match(T__6);
			setState(88);
			((LetDefinitionContext)_localctx).e = expression(0);

			            if(((LetDefinitionContext)_localctx).e.value instanceof Relation){
			                ((Relation)((LetDefinitionContext)_localctx).e.value).setName((((LetDefinitionContext)_localctx).n!=null?((LetDefinitionContext)_localctx).n.getText():null));
			                wmm.addRelation((Relation)((LetDefinitionContext)_localctx).e.value);
			            } else if (((LetDefinitionContext)_localctx).e.value instanceof FilterInterface){
			                ((FilterInterface)((LetDefinitionContext)_localctx).e.value).setName((((LetDefinitionContext)_localctx).n!=null?((LetDefinitionContext)_localctx).n.getText():null));
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
			setState(91);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__8) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 createDummy = true; 
			setState(93);
			((LetRecDefinitionContext)_localctx).n = match(NAME);
			setState(94);
			match(T__6);
			setState(95);
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

	public static class ShowDefinitionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NAME() { return getToken(ModelParser.NAME, 0); }
		public ShowDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterShowDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitShowDefinition(this);
		}
	}

	public final ShowDefinitionContext showDefinition() throws RecognitionException {
		ShowDefinitionContext _localctx = new ShowDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_showDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__9);
			setState(99);
			expression(0);
			setState(100);
			match(T__2);
			setState(101);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				setState(104);
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
			case T__10:
			case T__12:
				{
				setState(114);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__10:
					{
					setState(106);
					match(T__10);
					setState(107);
					((ExpressionContext)_localctx).e = expression(0);
					setState(108);
					match(T__11);
					}
					break;
				case T__12:
					{
					setState(110);
					match(T__12);
					setState(111);
					((ExpressionContext)_localctx).e = expression(0);
					setState(112);
					match(T__13);
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
			case T__14:
				{
				setState(118);
				match(T__14);
				setState(119);
				((ExpressionContext)_localctx).e = expression(0);
				setState(120);
				match(T__11);

				            ((ExpressionContext)_localctx).value =  ((ExpressionContext)_localctx).e.value;
				        
				}
				break;
			case T__0:
				{
				setState(123);
				match(T__0);
				setState(124);
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
			setState(173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(171);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(129);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(131);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__15) {
							{
							setState(130);
							match(T__15);
							}
						}

						setState(133);
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
						setState(136);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(137);
						match(T__20);
						setState(138);
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
						setState(141);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(142);
						match(T__21);
						setState(143);
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
						setState(146);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(147);
						match(T__22);
						setState(148);
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
						setState(151);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(152);
						match(T__23);
						setState(153);
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
						setState(156);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(157);
						match(T__15);

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
						setState(159);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(160);
						match(T__16);

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
						setState(162);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(163);
						match(T__17);

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
						setState(165);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(167);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__18) {
							{
							setState(166);
							match(T__18);
							}
						}

						setState(169);
						match(T__19);

						                      if(!(((ExpressionContext)_localctx).e.value instanceof Relation)){
						                          throw new RuntimeException("Invalid syntax at " + (((ExpressionContext)_localctx).e!=null?_input.getText(((ExpressionContext)_localctx).e.start,((ExpressionContext)_localctx).e.stop):null));
						                      }
						                      ((ExpressionContext)_localctx).value =  new RelInverse((Relation)((ExpressionContext)_localctx).e.value);
						                  
						}
						break;
					}
					} 
				}
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		case 6:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u00b3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\5\2\22\n\2\3\2\7\2"+
		"\25\n\2\f\2\16\2\30\13\2\3\2\3\2\6\2\34\n\2\r\2\16\2\35\6\2 \n\2\r\2\16"+
		"\2!\3\2\3\2\5\2&\n\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3/\n\3\3\4\5\4\62\n"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\49\n\4\3\4\3\4\3\4\5\4>\n\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4E\n\4\3\4\3\4\3\4\5\4J\n\4\3\4\3\4\3\4\3\4\3\4\5\4Q\n\4\3\4\3\4"+
		"\5\4U\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bu\n\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0082\n\b\3\b\3\b\5\b"+
		"\u0086\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\b\u00aa\n\b\3\b\3\b\7\b\u00ae\n\b\f\b\16\b\u00b1\13\b\3\b\2\3"+
		"\16\t\2\4\6\b\n\f\16\2\3\3\2\n\13\2\u00ca\2\21\3\2\2\2\4.\3\2\2\2\6T\3"+
		"\2\2\2\bV\3\2\2\2\n]\3\2\2\2\fd\3\2\2\2\16\u0081\3\2\2\2\20\22\7\33\2"+
		"\2\21\20\3\2\2\2\21\22\3\2\2\2\22\26\3\2\2\2\23\25\7\34\2\2\24\23\3\2"+
		"\2\2\25\30\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\37\3\2\2\2\30\26\3\2"+
		"\2\2\31\33\5\4\3\2\32\34\7\34\2\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3"+
		"\2\2\2\35\36\3\2\2\2\36 \3\2\2\2\37\31\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!"+
		"\"\3\2\2\2\"#\3\2\2\2#%\5\4\3\2$&\7\34\2\2%$\3\2\2\2%&\3\2\2\2&\'\3\2"+
		"\2\2\'(\7\2\2\3()\b\2\1\2)\3\3\2\2\2*/\5\6\4\2+/\5\b\5\2,/\5\n\6\2-/\5"+
		"\f\7\2.*\3\2\2\2.+\3\2\2\2.,\3\2\2\2.-\3\2\2\2/\5\3\2\2\2\60\62\7\3\2"+
		"\2\61\60\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\64\7\4\2\2\64\65\b\4\1"+
		"\2\658\5\16\b\2\66\67\7\5\2\2\679\7\33\2\28\66\3\2\2\289\3\2\2\29:\3\2"+
		"\2\2:;\b\4\1\2;U\3\2\2\2<>\7\3\2\2=<\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\7\6"+
		"\2\2@A\b\4\1\2AD\5\16\b\2BC\7\5\2\2CE\7\33\2\2DB\3\2\2\2DE\3\2\2\2EF\3"+
		"\2\2\2FG\b\4\1\2GU\3\2\2\2HJ\7\3\2\2IH\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\7"+
		"\7\2\2LM\b\4\1\2MP\5\16\b\2NO\7\5\2\2OQ\7\33\2\2PN\3\2\2\2PQ\3\2\2\2Q"+
		"R\3\2\2\2RS\b\4\1\2SU\3\2\2\2T\61\3\2\2\2T=\3\2\2\2TI\3\2\2\2U\7\3\2\2"+
		"\2VW\7\b\2\2WX\b\5\1\2XY\7\33\2\2YZ\7\t\2\2Z[\5\16\b\2[\\\b\5\1\2\\\t"+
		"\3\2\2\2]^\t\2\2\2^_\b\6\1\2_`\7\33\2\2`a\7\t\2\2ab\5\16\b\2bc\b\6\1\2"+
		"c\13\3\2\2\2de\7\f\2\2ef\5\16\b\2fg\7\5\2\2gh\7\33\2\2h\r\3\2\2\2ij\b"+
		"\b\1\2jk\7\33\2\2k\u0082\b\b\1\2lm\7\r\2\2mn\5\16\b\2no\7\16\2\2ou\3\2"+
		"\2\2pq\7\17\2\2qr\5\16\b\2rs\7\20\2\2su\3\2\2\2tl\3\2\2\2tp\3\2\2\2uv"+
		"\3\2\2\2vw\b\b\1\2w\u0082\3\2\2\2xy\7\21\2\2yz\5\16\b\2z{\7\16\2\2{|\b"+
		"\b\1\2|\u0082\3\2\2\2}~\7\3\2\2~\177\5\16\b\7\177\u0080\b\b\1\2\u0080"+
		"\u0082\3\2\2\2\u0081i\3\2\2\2\u0081t\3\2\2\2\u0081x\3\2\2\2\u0081}\3\2"+
		"\2\2\u0082\u00af\3\2\2\2\u0083\u0085\f\f\2\2\u0084\u0086\7\22\2\2\u0085"+
		"\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\5\16"+
		"\b\r\u0088\u0089\b\b\1\2\u0089\u00ae\3\2\2\2\u008a\u008b\f\6\2\2\u008b"+
		"\u008c\7\27\2\2\u008c\u008d\5\16\b\7\u008d\u008e\b\b\1\2\u008e\u00ae\3"+
		"\2\2\2\u008f\u0090\f\5\2\2\u0090\u0091\7\30\2\2\u0091\u0092\5\16\b\6\u0092"+
		"\u0093\b\b\1\2\u0093\u00ae\3\2\2\2\u0094\u0095\f\4\2\2\u0095\u0096\7\31"+
		"\2\2\u0096\u0097\5\16\b\5\u0097\u0098\b\b\1\2\u0098\u00ae\3\2\2\2\u0099"+
		"\u009a\f\3\2\2\u009a\u009b\7\32\2\2\u009b\u009c\5\16\b\4\u009c\u009d\b"+
		"\b\1\2\u009d\u00ae\3\2\2\2\u009e\u009f\f\13\2\2\u009f\u00a0\7\22\2\2\u00a0"+
		"\u00ae\b\b\1\2\u00a1\u00a2\f\n\2\2\u00a2\u00a3\7\23\2\2\u00a3\u00ae\b"+
		"\b\1\2\u00a4\u00a5\f\t\2\2\u00a5\u00a6\7\24\2\2\u00a6\u00ae\b\b\1\2\u00a7"+
		"\u00a9\f\b\2\2\u00a8\u00aa\7\25\2\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3"+
		"\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\7\26\2\2\u00ac\u00ae\b\b\1\2\u00ad"+
		"\u0083\3\2\2\2\u00ad\u008a\3\2\2\2\u00ad\u008f\3\2\2\2\u00ad\u0094\3\2"+
		"\2\2\u00ad\u0099\3\2\2\2\u00ad\u009e\3\2\2\2\u00ad\u00a1\3\2\2\2\u00ad"+
		"\u00a4\3\2\2\2\u00ad\u00a7\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0\17\3\2\2\2\u00b1\u00af\3\2\2\2\25\21\26"+
		"\35!%.\618=DIPTt\u0081\u0085\u00a9\u00ad\u00af";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}