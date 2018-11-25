// Generated from Rendering.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RenderingParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEWLINE=1, STARs=2, EQs=3, HLINEs=4, TEXT=5, EQ=6, HLINE=7;
	public static final int
		RULE_document = 0, RULE_blocks = 1, RULE_block = 2;
	public static final String[] ruleNames = {
		"document", "blocks", "block"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "'='", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NEWLINE", "STARs", "EQs", "HLINEs", "TEXT", "EQ", "HLINE"
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
	public String getGrammarFileName() { return "Rendering.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RenderingParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DocumentContext extends ParserRuleContext {
		public BlocksContext blocks() {
			return getRuleContext(BlocksContext.class,0);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RenderingVisitor ) return ((RenderingVisitor<? extends T>)visitor).visitDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			blocks();
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

	public static class BlocksContext extends ParserRuleContext {
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(RenderingParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RenderingParser.NEWLINE, i);
		}
		public BlocksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocks; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RenderingVisitor ) return ((RenderingVisitor<? extends T>)visitor).visitBlocks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocksContext blocks() throws RecognitionException {
		BlocksContext _localctx = new BlocksContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_blocks);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STARs) | (1L << EQs) | (1L << HLINEs) | (1L << TEXT))) != 0)) {
				{
				{
				setState(8);
				block();
				setState(9);
				match(NEWLINE);
				}
				}
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PLAINTEXTContext extends BlockContext {
		public TerminalNode TEXT() { return getToken(RenderingParser.TEXT, 0); }
		public PLAINTEXTContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RenderingVisitor ) return ((RenderingVisitor<? extends T>)visitor).visitPLAINTEXT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class STARContext extends BlockContext {
		public TerminalNode STARs() { return getToken(RenderingParser.STARs, 0); }
		public TerminalNode TEXT() { return getToken(RenderingParser.TEXT, 0); }
		public STARContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RenderingVisitor ) return ((RenderingVisitor<? extends T>)visitor).visitSTAR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HLINEContext extends BlockContext {
		public TerminalNode HLINEs() { return getToken(RenderingParser.HLINEs, 0); }
		public HLINEContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RenderingVisitor ) return ((RenderingVisitor<? extends T>)visitor).visitHLINE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HEADERContext extends BlockContext {
		public List<TerminalNode> EQs() { return getTokens(RenderingParser.EQs); }
		public TerminalNode EQs(int i) {
			return getToken(RenderingParser.EQs, i);
		}
		public TerminalNode TEXT() { return getToken(RenderingParser.TEXT, 0); }
		public HEADERContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RenderingVisitor ) return ((RenderingVisitor<? extends T>)visitor).visitHEADER(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		try {
			setState(23);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STARs:
				_localctx = new STARContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				match(STARs);
				setState(17);
				match(TEXT);
				}
				break;
			case EQs:
				_localctx = new HEADERContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(18);
				match(EQs);
				setState(19);
				match(TEXT);
				setState(20);
				match(EQs);
				}
				break;
			case HLINEs:
				_localctx = new HLINEContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(21);
				match(HLINEs);
				}
				break;
			case TEXT:
				_localctx = new PLAINTEXTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(22);
				match(TEXT);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\t\34\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\3\3\3\3\3\3\7\3\16\n\3\f\3\16\3\21\13\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4\32\n\4\3\4\2\2\5\2\4\6\2\2\2\34\2\b\3\2\2\2\4\17"+
		"\3\2\2\2\6\31\3\2\2\2\b\t\5\4\3\2\t\3\3\2\2\2\n\13\5\6\4\2\13\f\7\3\2"+
		"\2\f\16\3\2\2\2\r\n\3\2\2\2\16\21\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20"+
		"\5\3\2\2\2\21\17\3\2\2\2\22\23\7\4\2\2\23\32\7\7\2\2\24\25\7\5\2\2\25"+
		"\26\7\7\2\2\26\32\7\5\2\2\27\32\7\6\2\2\30\32\7\7\2\2\31\22\3\2\2\2\31"+
		"\24\3\2\2\2\31\27\3\2\2\2\31\30\3\2\2\2\32\7\3\2\2\2\4\17\31";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}