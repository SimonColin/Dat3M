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
		NAME=25, LINE_COMMENT=26, BLOCK_COMMENT=27, WS=28, INCLUDE=29, MODELNAME=30;
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
		null, "NAME", "LINE_COMMENT", "BLOCK_COMMENT", "WS", "INCLUDE", "MODELNAME"
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
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(14);
				match(NAME);
				}
			}

			setState(18); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(17);
				definition();
				}
				}
				setState(20); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0) );
			setState(22);
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
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__3:
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				axiomDefinition();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				letDefinition();
				}
				break;
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(27);
				letRecDefinition();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(28);
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
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(31);
					((AxiomDefinitionContext)_localctx).negate = match(T__0);
					}
				}

				setState(34);
				match(T__1);
				 createDummy = false; 
				setState(36);
				((AxiomDefinitionContext)_localctx).e = expression(0);
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(37);
					match(T__2);
					setState(38);
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
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(43);
					((AxiomDefinitionContext)_localctx).negate = match(T__0);
					}
				}

				setState(46);
				match(T__3);
				 createDummy = false; 
				setState(48);
				((AxiomDefinitionContext)_localctx).e = expression(0);
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(49);
					match(T__2);
					setState(50);
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
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(55);
					((AxiomDefinitionContext)_localctx).negate = match(T__0);
					}
				}

				setState(58);
				match(T__4);
				 createDummy = false; 
				setState(60);
				((AxiomDefinitionContext)_localctx).e = expression(0);
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(61);
					match(T__2);
					setState(62);
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
			setState(69);
			match(T__5);
			 createDummy = false; 
			setState(71);
			((LetDefinitionContext)_localctx).n = match(NAME);
			setState(72);
			match(T__6);
			setState(73);
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
			setState(76);
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
			setState(78);
			((LetRecDefinitionContext)_localctx).n = match(NAME);
			setState(79);
			match(T__6);
			setState(80);
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
			setState(83);
			match(T__9);
			setState(84);
			expression(0);
			setState(85);
			match(T__2);
			setState(86);
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
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				setState(89);
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
				setState(99);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__10:
					{
					setState(91);
					match(T__10);
					setState(92);
					((ExpressionContext)_localctx).e = expression(0);
					setState(93);
					match(T__11);
					}
					break;
				case T__12:
					{
					setState(95);
					match(T__12);
					setState(96);
					((ExpressionContext)_localctx).e = expression(0);
					setState(97);
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
				setState(103);
				match(T__14);
				setState(104);
				((ExpressionContext)_localctx).e = expression(0);
				setState(105);
				match(T__11);

				            ((ExpressionContext)_localctx).value =  ((ExpressionContext)_localctx).e.value;
				        
				}
				break;
			case T__0:
				{
				setState(108);
				match(T__0);
				setState(109);
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
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(156);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(114);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(116);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__15) {
							{
							setState(115);
							match(T__15);
							}
						}

						setState(118);
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
						setState(121);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(122);
						match(T__20);
						setState(123);
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
						setState(126);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(127);
						match(T__21);
						setState(128);
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
						setState(131);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(132);
						match(T__22);
						setState(133);
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
						setState(136);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(137);
						match(T__23);
						setState(138);
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
						setState(141);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(142);
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
						setState(144);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(145);
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
						setState(147);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(148);
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
						setState(150);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(152);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__18) {
							{
							setState(151);
							match(T__18);
							}
						}

						setState(154);
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
				setState(160);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u00a4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\5\2\22\n\2\3\2\6\2"+
		"\25\n\2\r\2\16\2\26\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3 \n\3\3\4\5\4#\n\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4*\n\4\3\4\3\4\3\4\5\4/\n\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4\66\n\4\3\4\3\4\3\4\5\4;\n\4\3\4\3\4\3\4\3\4\3\4\5\4B\n\4\3\4\3\4"+
		"\5\4F\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bf\n\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bs\n\b\3\b\3\b\5\bw\n\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"\u009b\n\b\3\b\3\b\7\b\u009f\n\b\f\b\16\b\u00a2\13\b\3\b\2\3\16\t\2\4"+
		"\6\b\n\f\16\2\3\3\2\n\13\2\u00b8\2\21\3\2\2\2\4\37\3\2\2\2\6E\3\2\2\2"+
		"\bG\3\2\2\2\nN\3\2\2\2\fU\3\2\2\2\16r\3\2\2\2\20\22\7\33\2\2\21\20\3\2"+
		"\2\2\21\22\3\2\2\2\22\24\3\2\2\2\23\25\5\4\3\2\24\23\3\2\2\2\25\26\3\2"+
		"\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\30\3\2\2\2\30\31\7\2\2\3\31\32\b\2"+
		"\1\2\32\3\3\2\2\2\33 \5\6\4\2\34 \5\b\5\2\35 \5\n\6\2\36 \5\f\7\2\37\33"+
		"\3\2\2\2\37\34\3\2\2\2\37\35\3\2\2\2\37\36\3\2\2\2 \5\3\2\2\2!#\7\3\2"+
		"\2\"!\3\2\2\2\"#\3\2\2\2#$\3\2\2\2$%\7\4\2\2%&\b\4\1\2&)\5\16\b\2\'(\7"+
		"\5\2\2(*\7\33\2\2)\'\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\b\4\1\2,F\3\2\2\2-"+
		"/\7\3\2\2.-\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60\61\7\6\2\2\61\62\b\4\1\2"+
		"\62\65\5\16\b\2\63\64\7\5\2\2\64\66\7\33\2\2\65\63\3\2\2\2\65\66\3\2\2"+
		"\2\66\67\3\2\2\2\678\b\4\1\28F\3\2\2\29;\7\3\2\2:9\3\2\2\2:;\3\2\2\2;"+
		"<\3\2\2\2<=\7\7\2\2=>\b\4\1\2>A\5\16\b\2?@\7\5\2\2@B\7\33\2\2A?\3\2\2"+
		"\2AB\3\2\2\2BC\3\2\2\2CD\b\4\1\2DF\3\2\2\2E\"\3\2\2\2E.\3\2\2\2E:\3\2"+
		"\2\2F\7\3\2\2\2GH\7\b\2\2HI\b\5\1\2IJ\7\33\2\2JK\7\t\2\2KL\5\16\b\2LM"+
		"\b\5\1\2M\t\3\2\2\2NO\t\2\2\2OP\b\6\1\2PQ\7\33\2\2QR\7\t\2\2RS\5\16\b"+
		"\2ST\b\6\1\2T\13\3\2\2\2UV\7\f\2\2VW\5\16\b\2WX\7\5\2\2XY\7\33\2\2Y\r"+
		"\3\2\2\2Z[\b\b\1\2[\\\7\33\2\2\\s\b\b\1\2]^\7\r\2\2^_\5\16\b\2_`\7\16"+
		"\2\2`f\3\2\2\2ab\7\17\2\2bc\5\16\b\2cd\7\20\2\2df\3\2\2\2e]\3\2\2\2ea"+
		"\3\2\2\2fg\3\2\2\2gh\b\b\1\2hs\3\2\2\2ij\7\21\2\2jk\5\16\b\2kl\7\16\2"+
		"\2lm\b\b\1\2ms\3\2\2\2no\7\3\2\2op\5\16\b\7pq\b\b\1\2qs\3\2\2\2rZ\3\2"+
		"\2\2re\3\2\2\2ri\3\2\2\2rn\3\2\2\2s\u00a0\3\2\2\2tv\f\f\2\2uw\7\22\2\2"+
		"vu\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\5\16\b\ryz\b\b\1\2z\u009f\3\2\2\2{|\f"+
		"\6\2\2|}\7\27\2\2}~\5\16\b\7~\177\b\b\1\2\177\u009f\3\2\2\2\u0080\u0081"+
		"\f\5\2\2\u0081\u0082\7\30\2\2\u0082\u0083\5\16\b\6\u0083\u0084\b\b\1\2"+
		"\u0084\u009f\3\2\2\2\u0085\u0086\f\4\2\2\u0086\u0087\7\31\2\2\u0087\u0088"+
		"\5\16\b\5\u0088\u0089\b\b\1\2\u0089\u009f\3\2\2\2\u008a\u008b\f\3\2\2"+
		"\u008b\u008c\7\32\2\2\u008c\u008d\5\16\b\4\u008d\u008e\b\b\1\2\u008e\u009f"+
		"\3\2\2\2\u008f\u0090\f\13\2\2\u0090\u0091\7\22\2\2\u0091\u009f\b\b\1\2"+
		"\u0092\u0093\f\n\2\2\u0093\u0094\7\23\2\2\u0094\u009f\b\b\1\2\u0095\u0096"+
		"\f\t\2\2\u0096\u0097\7\24\2\2\u0097\u009f\b\b\1\2\u0098\u009a\f\b\2\2"+
		"\u0099\u009b\7\25\2\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c"+
		"\3\2\2\2\u009c\u009d\7\26\2\2\u009d\u009f\b\b\1\2\u009et\3\2\2\2\u009e"+
		"{\3\2\2\2\u009e\u0080\3\2\2\2\u009e\u0085\3\2\2\2\u009e\u008a\3\2\2\2"+
		"\u009e\u008f\3\2\2\2\u009e\u0092\3\2\2\2\u009e\u0095\3\2\2\2\u009e\u0098"+
		"\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\17\3\2\2\2\u00a2\u00a0\3\2\2\2\22\21\26\37\").\65:AEerv\u009a\u009e\u00a0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}