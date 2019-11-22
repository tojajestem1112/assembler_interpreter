// Generated from C:/Users/Dawid/git/antlr_assembler_interpreter/src/main\AIGrammary.g4 by ANTLR 4.7.2
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AIGrammaryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, REGISTER=16, 
		INTERRUPTION_NUMBER=17, NUMBER=18, WS=19, TABS=20;
	public static final int
		RULE_commendline_rule = 0, RULE_mov_xor_commend = 1, RULE_push_commend = 2, 
		RULE_int_commend = 3, RULE_expr = 4, RULE_subexpression = 5, RULE_function = 6, 
		RULE_data = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"commendline_rule", "mov_xor_commend", "push_commend", "int_commend", 
			"expr", "subexpression", "function", "data"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\n'", "'mov '", "'mov\t'", "'xor '", "','", "'push '", "'push\t'", 
			"'int '", "'int\t'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", null, 
			"'0x80'", null, "' '", "'\t'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "REGISTER", "INTERRUPTION_NUMBER", "NUMBER", 
			"WS", "TABS"
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

	@Override
	public String getGrammarFileName() { return "AIGrammary.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AIGrammaryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Commendline_ruleContext extends ParserRuleContext {
		public Mov_xor_commendContext mov_xor_commend() {
			return getRuleContext(Mov_xor_commendContext.class,0);
		}
		public Push_commendContext push_commend() {
			return getRuleContext(Push_commendContext.class,0);
		}
		public Int_commendContext int_commend() {
			return getRuleContext(Int_commendContext.class,0);
		}
		public Commendline_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commendline_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AIGrammaryListener ) ((AIGrammaryListener)listener).enterCommendline_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AIGrammaryListener ) ((AIGrammaryListener)listener).exitCommendline_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AIGrammaryVisitor ) return ((AIGrammaryVisitor<? extends T>)visitor).visitCommendline_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Commendline_ruleContext commendline_rule() throws RecognitionException {
		Commendline_ruleContext _localctx = new Commendline_ruleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_commendline_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__3:
			case T__13:
			case REGISTER:
			case NUMBER:
				{
				setState(16);
				mov_xor_commend();
				}
				break;
			case T__5:
			case T__6:
				{
				setState(17);
				push_commend();
				}
				break;
			case T__7:
			case T__8:
				{
				setState(18);
				int_commend();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(21);
			match(T__0);
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

	public static class Mov_xor_commendContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode REGISTER() { return getToken(AIGrammaryParser.REGISTER, 0); }
		public Mov_xor_commendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mov_xor_commend; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AIGrammaryListener ) ((AIGrammaryListener)listener).enterMov_xor_commend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AIGrammaryListener ) ((AIGrammaryListener)listener).exitMov_xor_commend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AIGrammaryVisitor ) return ((AIGrammaryVisitor<? extends T>)visitor).visitMov_xor_commend(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mov_xor_commendContext mov_xor_commend() throws RecognitionException {
		Mov_xor_commendContext _localctx = new Mov_xor_commendContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mov_xor_commend);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(23);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==T__2) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				{
				setState(27);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
					{
					setState(24);
					match(T__3);
					}
					break;
				case T__13:
				case REGISTER:
				case NUMBER:
					{
					}
					break;
				case T__2:
					{
					setState(26);
					match(T__2);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			setState(31);
			expr(0);
			setState(32);
			match(T__4);
			setState(33);
			match(REGISTER);
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

	public static class Push_commendContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Push_commendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_push_commend; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AIGrammaryListener ) ((AIGrammaryListener)listener).enterPush_commend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AIGrammaryListener ) ((AIGrammaryListener)listener).exitPush_commend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AIGrammaryVisitor ) return ((AIGrammaryVisitor<? extends T>)visitor).visitPush_commend(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Push_commendContext push_commend() throws RecognitionException {
		Push_commendContext _localctx = new Push_commendContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_push_commend);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__6) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(36);
			expr(0);
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

	public static class Int_commendContext extends ParserRuleContext {
		public TerminalNode INTERRUPTION_NUMBER() { return getToken(AIGrammaryParser.INTERRUPTION_NUMBER, 0); }
		public Int_commendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_commend; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AIGrammaryListener ) ((AIGrammaryListener)listener).enterInt_commend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AIGrammaryListener ) ((AIGrammaryListener)listener).exitInt_commend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AIGrammaryVisitor ) return ((AIGrammaryVisitor<? extends T>)visitor).visitInt_commend(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_commendContext int_commend() throws RecognitionException {
		Int_commendContext _localctx = new Int_commendContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_int_commend);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__8) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(39);
			match(INTERRUPTION_NUMBER);
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

	public static class ExprContext extends ParserRuleContext {
		public SubexpressionContext subexpression() {
			return getRuleContext(SubexpressionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AIGrammaryListener ) ((AIGrammaryListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AIGrammaryListener ) ((AIGrammaryListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AIGrammaryVisitor ) return ((AIGrammaryVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(42);
			subexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(52);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(50);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(44);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(45);
						match(T__9);
						setState(46);
						subexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(47);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(48);
						match(T__10);
						setState(49);
						subexpression(0);
						}
						break;
					}
					} 
				}
				setState(54);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class SubexpressionContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public SubexpressionContext subexpression() {
			return getRuleContext(SubexpressionContext.class,0);
		}
		public SubexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AIGrammaryListener ) ((AIGrammaryListener)listener).enterSubexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AIGrammaryListener ) ((AIGrammaryListener)listener).exitSubexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AIGrammaryVisitor ) return ((AIGrammaryVisitor<? extends T>)visitor).visitSubexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubexpressionContext subexpression() throws RecognitionException {
		return subexpression(0);
	}

	private SubexpressionContext subexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SubexpressionContext _localctx = new SubexpressionContext(_ctx, _parentState);
		SubexpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_subexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(56);
			function();
			}
			_ctx.stop = _input.LT(-1);
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(64);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new SubexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_subexpression);
						setState(58);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(59);
						match(T__11);
						setState(60);
						function();
						}
						break;
					case 2:
						{
						_localctx = new SubexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_subexpression);
						setState(61);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(62);
						match(T__12);
						setState(63);
						function();
						}
						break;
					}
					} 
				}
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class FunctionContext extends ParserRuleContext {
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AIGrammaryListener ) ((AIGrammaryListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AIGrammaryListener ) ((AIGrammaryListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AIGrammaryVisitor ) return ((AIGrammaryVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGISTER:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				data();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(T__13);
				setState(71);
				expr(0);
				setState(72);
				match(T__14);
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

	public static class DataContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(AIGrammaryParser.NUMBER, 0); }
		public TerminalNode REGISTER() { return getToken(AIGrammaryParser.REGISTER, 0); }
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AIGrammaryListener ) ((AIGrammaryListener)listener).enterData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AIGrammaryListener ) ((AIGrammaryListener)listener).exitData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AIGrammaryVisitor ) return ((AIGrammaryVisitor<? extends T>)visitor).visitData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_data);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_la = _input.LA(1);
			if ( !(_la==REGISTER || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 5:
			return subexpression_sempred((SubexpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean subexpression_sempred(SubexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26Q\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\5\2\26"+
		"\n\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\36\n\3\5\3 \n\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\65\n\6\f\6"+
		"\16\68\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7C\n\7\f\7\16\7F\13"+
		"\7\3\b\3\b\3\b\3\b\3\b\5\bM\n\b\3\t\3\t\3\t\2\4\n\f\n\2\4\6\b\n\f\16\20"+
		"\2\6\3\2\4\5\3\2\b\t\3\2\n\13\4\2\22\22\24\24\2R\2\25\3\2\2\2\4\37\3\2"+
		"\2\2\6%\3\2\2\2\b(\3\2\2\2\n+\3\2\2\2\f9\3\2\2\2\16L\3\2\2\2\20N\3\2\2"+
		"\2\22\26\5\4\3\2\23\26\5\6\4\2\24\26\5\b\5\2\25\22\3\2\2\2\25\23\3\2\2"+
		"\2\25\24\3\2\2\2\26\27\3\2\2\2\27\30\7\3\2\2\30\3\3\2\2\2\31 \t\2\2\2"+
		"\32\36\7\6\2\2\33\36\3\2\2\2\34\36\7\5\2\2\35\32\3\2\2\2\35\33\3\2\2\2"+
		"\35\34\3\2\2\2\36 \3\2\2\2\37\31\3\2\2\2\37\35\3\2\2\2 !\3\2\2\2!\"\5"+
		"\n\6\2\"#\7\7\2\2#$\7\22\2\2$\5\3\2\2\2%&\t\3\2\2&\'\5\n\6\2\'\7\3\2\2"+
		"\2()\t\4\2\2)*\7\23\2\2*\t\3\2\2\2+,\b\6\1\2,-\5\f\7\2-\66\3\2\2\2./\f"+
		"\5\2\2/\60\7\f\2\2\60\65\5\f\7\2\61\62\f\4\2\2\62\63\7\r\2\2\63\65\5\f"+
		"\7\2\64.\3\2\2\2\64\61\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2"+
		"\67\13\3\2\2\28\66\3\2\2\29:\b\7\1\2:;\5\16\b\2;D\3\2\2\2<=\f\5\2\2=>"+
		"\7\16\2\2>C\5\16\b\2?@\f\4\2\2@A\7\17\2\2AC\5\16\b\2B<\3\2\2\2B?\3\2\2"+
		"\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\r\3\2\2\2FD\3\2\2\2GM\5\20\t\2HI\7\20"+
		"\2\2IJ\5\n\6\2JK\7\21\2\2KM\3\2\2\2LG\3\2\2\2LH\3\2\2\2M\17\3\2\2\2NO"+
		"\t\5\2\2O\21\3\2\2\2\n\25\35\37\64\66BDL";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}