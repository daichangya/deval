// $ANTLR 3.4 C:\\Documents and Settings\\Administrator\\桌面\\Formula.g 2013-11-03 17:18:17
package daicy.formula;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.Parser;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.RewriteRuleSubtreeStream;
import org.antlr.runtime.tree.RewriteRuleTokenStream;
import org.antlr.runtime.tree.TreeAdaptor;

@SuppressWarnings({ "all", "warnings", "unchecked" })
public class FormulaParser extends Parser {
	public static final String[] tokenNames = new String[] { "<invalid>",
			"<EOR>", "<DOWN>", "<UP>", "CALL", "EXPR", "FUNCTION", "ID",
			"NEGATE", "NEWLINE", "NOT", "NUM", "NUMBER", "PARAM", "PARAMATERS",
			"VAR", "WS", "'!'", "'!='", "'&&'", "'('", "')'", "'*'", "'+'",
			"','", "'-'", "'/'", "'<'", "'<='", "'=='", "'>'", "'>='", "'||'" };

	public static final int EOF = -1;
	public static final int T__17 = 17;
	public static final int T__18 = 18;
	public static final int T__19 = 19;
	public static final int T__20 = 20;
	public static final int T__21 = 21;
	public static final int T__22 = 22;
	public static final int T__23 = 23;
	public static final int T__24 = 24;
	public static final int T__25 = 25;
	public static final int T__26 = 26;
	public static final int T__27 = 27;
	public static final int T__28 = 28;
	public static final int T__29 = 29;
	public static final int T__30 = 30;
	public static final int T__31 = 31;
	public static final int T__32 = 32;
	public static final int CALL = 4;
	public static final int EXPR = 5;
	public static final int FUNCTION = 6;
	public static final int ID = 7;
	public static final int NEGATE = 8;
	public static final int NEWLINE = 9;
	public static final int NOT = 10;
	public static final int NUM = 11;
	public static final int NUMBER = 12;
	public static final int PARAM = 13;
	public static final int PARAMATERS = 14;
	public static final int VAR = 15;
	public static final int WS = 16;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators

	public FormulaParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}

	public FormulaParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}

	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}

	public String[] getTokenNames() {
		return FormulaParser.tokenNames;
	}

	public String getGrammarFileName() {
		return "C:\\Documents and Settings\\Administrator\\桌面\\Formula.g";
	}

	public static class prog_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "prog"
	// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:15:1: prog :
	// expr ;
	public final FormulaParser.prog_return prog() throws RecognitionException {
		FormulaParser.prog_return retval = new FormulaParser.prog_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		FormulaParser.expr_return expr1 = null;

		try {
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:15:5: (
			// expr )
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:15:7:
			// expr
			{
				root_0 = (CommonTree) adaptor.nil();

				pushFollow(FOLLOW_expr_in_prog78);
				expr1 = expr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, expr1.getTree());

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
					input.LT(-1), re);

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "prog"

	public static class expr_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "expr"
	// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:18:1: expr :
	// orExpr ;
	public final FormulaParser.expr_return expr() throws RecognitionException {
		FormulaParser.expr_return retval = new FormulaParser.expr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		FormulaParser.orExpr_return orExpr2 = null;

		try {
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:18:6: (
			// orExpr )
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:18:8:
			// orExpr
			{
				root_0 = (CommonTree) adaptor.nil();

				pushFollow(FOLLOW_orExpr_in_expr89);
				orExpr2 = orExpr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, orExpr2.getTree());

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
					input.LT(-1), re);

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "expr"

	public static class orExpr_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "orExpr"
	// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:20:1: orExpr :
	// andExpr ( '||' ^ andExpr )* ;
	public final FormulaParser.orExpr_return orExpr()
			throws RecognitionException {
		FormulaParser.orExpr_return retval = new FormulaParser.orExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal4 = null;
		FormulaParser.andExpr_return andExpr3 = null;

		FormulaParser.andExpr_return andExpr5 = null;

		CommonTree string_literal4_tree = null;

		try {
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:20:8: (
			// andExpr ( '||' ^ andExpr )* )
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:20:10:
			// andExpr ( '||' ^ andExpr )*
			{
				root_0 = (CommonTree) adaptor.nil();

				pushFollow(FOLLOW_andExpr_in_orExpr97);
				andExpr3 = andExpr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, andExpr3.getTree());

				// C:\\Documents and
				// Settings\\Administrator\\桌面\\Formula.g:20:18: ( '||' ^
				// andExpr )*
				loop1: do {
					int alt1 = 2;
					int LA1_0 = input.LA(1);

					if ((LA1_0 == 32)) {
						alt1 = 1;
					}

					switch (alt1) {
					case 1:
					// C:\\Documents and
					// Settings\\Administrator\\桌面\\Formula.g:20:19: '||' ^
					// andExpr
					{
						string_literal4 = (Token) match(input, 32,
								FOLLOW_32_in_orExpr100);
						if (state.failed)
							return retval;
						if (state.backtracking == 0) {
							string_literal4_tree = (CommonTree) adaptor
									.create(string_literal4);
							root_0 = (CommonTree) adaptor.becomeRoot(
									string_literal4_tree, root_0);
						}

						pushFollow(FOLLOW_andExpr_in_orExpr103);
						andExpr5 = andExpr();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, andExpr5.getTree());

					}
						break;

					default:
						break loop1;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
					input.LT(-1), re);

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "orExpr"

	public static class andExpr_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "andExpr"
	// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:23:1: andExpr :
	// equalityExpr ( '&&' ^ equalityExpr )* ;
	public final FormulaParser.andExpr_return andExpr()
			throws RecognitionException {
		FormulaParser.andExpr_return retval = new FormulaParser.andExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal7 = null;
		FormulaParser.equalityExpr_return equalityExpr6 = null;

		FormulaParser.equalityExpr_return equalityExpr8 = null;

		CommonTree string_literal7_tree = null;

		try {
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:23:9: (
			// equalityExpr ( '&&' ^ equalityExpr )* )
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:23:11:
			// equalityExpr ( '&&' ^ equalityExpr )*
			{
				root_0 = (CommonTree) adaptor.nil();

				pushFollow(FOLLOW_equalityExpr_in_andExpr114);
				equalityExpr6 = equalityExpr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, equalityExpr6.getTree());

				// C:\\Documents and
				// Settings\\Administrator\\桌面\\Formula.g:23:24: ( '&&' ^
				// equalityExpr )*
				loop2: do {
					int alt2 = 2;
					int LA2_0 = input.LA(1);

					if ((LA2_0 == 19)) {
						alt2 = 1;
					}

					switch (alt2) {
					case 1:
					// C:\\Documents and
					// Settings\\Administrator\\桌面\\Formula.g:23:25: '&&' ^
					// equalityExpr
					{
						string_literal7 = (Token) match(input, 19,
								FOLLOW_19_in_andExpr117);
						if (state.failed)
							return retval;
						if (state.backtracking == 0) {
							string_literal7_tree = (CommonTree) adaptor
									.create(string_literal7);
							root_0 = (CommonTree) adaptor.becomeRoot(
									string_literal7_tree, root_0);
						}

						pushFollow(FOLLOW_equalityExpr_in_andExpr120);
						equalityExpr8 = equalityExpr();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, equalityExpr8.getTree());

					}
						break;

					default:
						break loop2;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
					input.LT(-1), re);

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "andExpr"

	public static class equalityExpr_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "equalityExpr"
	// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:26:1:
	// equalityExpr : comparisonExpr ( ( '==' | '!=' ) ^ comparisonExpr )* ;
	public final FormulaParser.equalityExpr_return equalityExpr()
			throws RecognitionException {
		FormulaParser.equalityExpr_return retval = new FormulaParser.equalityExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set10 = null;
		FormulaParser.comparisonExpr_return comparisonExpr9 = null;

		FormulaParser.comparisonExpr_return comparisonExpr11 = null;

		CommonTree set10_tree = null;

		try {
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:27:2: (
			// comparisonExpr ( ( '==' | '!=' ) ^ comparisonExpr )* )
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:27:4:
			// comparisonExpr ( ( '==' | '!=' ) ^ comparisonExpr )*
			{
				root_0 = (CommonTree) adaptor.nil();

				pushFollow(FOLLOW_comparisonExpr_in_equalityExpr132);
				comparisonExpr9 = comparisonExpr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, comparisonExpr9.getTree());

				// C:\\Documents and
				// Settings\\Administrator\\桌面\\Formula.g:27:19: ( ( '==' | '!='
				// ) ^ comparisonExpr )*
				loop3: do {
					int alt3 = 2;
					int LA3_0 = input.LA(1);

					if ((LA3_0 == 18 || LA3_0 == 29)) {
						alt3 = 1;
					}

					switch (alt3) {
					case 1:
					// C:\\Documents and
					// Settings\\Administrator\\桌面\\Formula.g:27:20: ( '==' |
					// '!=' ) ^ comparisonExpr
					{
						set10 = (Token) input.LT(1);

						set10 = (Token) input.LT(1);

						if (input.LA(1) == 18 || input.LA(1) == 29) {
							input.consume();
							if (state.backtracking == 0)
								root_0 = (CommonTree) adaptor.becomeRoot(
										(CommonTree) adaptor.create(set10),
										root_0);
							state.errorRecovery = false;
							state.failed = false;
						} else {
							if (state.backtracking > 0) {
								state.failed = true;
								return retval;
							}
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							throw mse;
						}

						pushFollow(FOLLOW_comparisonExpr_in_equalityExpr142);
						comparisonExpr11 = comparisonExpr();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, comparisonExpr11.getTree());

					}
						break;

					default:
						break loop3;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
					input.LT(-1), re);

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "equalityExpr"

	public static class comparisonExpr_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "comparisonExpr"
	// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:30:1:
	// comparisonExpr : additiveExpr ( ( '>' | '<' | '<=' | '>=' ) ^
	// additiveExpr )* ;
	public final FormulaParser.comparisonExpr_return comparisonExpr()
			throws RecognitionException {
		FormulaParser.comparisonExpr_return retval = new FormulaParser.comparisonExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set13 = null;
		FormulaParser.additiveExpr_return additiveExpr12 = null;

		FormulaParser.additiveExpr_return additiveExpr14 = null;

		CommonTree set13_tree = null;

		try {
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:31:2: (
			// additiveExpr ( ( '>' | '<' | '<=' | '>=' ) ^ additiveExpr )* )
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:31:4:
			// additiveExpr ( ( '>' | '<' | '<=' | '>=' ) ^ additiveExpr )*
			{
				root_0 = (CommonTree) adaptor.nil();

				pushFollow(FOLLOW_additiveExpr_in_comparisonExpr155);
				additiveExpr12 = additiveExpr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, additiveExpr12.getTree());

				// C:\\Documents and
				// Settings\\Administrator\\桌面\\Formula.g:31:17: ( ( '>' | '<' |
				// '<=' | '>=' ) ^ additiveExpr )*
				loop4: do {
					int alt4 = 2;
					int LA4_0 = input.LA(1);

					if (((LA4_0 >= 27 && LA4_0 <= 28) || (LA4_0 >= 30 && LA4_0 <= 31))) {
						alt4 = 1;
					}

					switch (alt4) {
					case 1:
					// C:\\Documents and
					// Settings\\Administrator\\桌面\\Formula.g:31:18: ( '>' | '<'
					// | '<=' | '>=' ) ^ additiveExpr
					{
						set13 = (Token) input.LT(1);

						set13 = (Token) input.LT(1);

						if ((input.LA(1) >= 27 && input.LA(1) <= 28)
								|| (input.LA(1) >= 30 && input.LA(1) <= 31)) {
							input.consume();
							if (state.backtracking == 0)
								root_0 = (CommonTree) adaptor.becomeRoot(
										(CommonTree) adaptor.create(set13),
										root_0);
							state.errorRecovery = false;
							state.failed = false;
						} else {
							if (state.backtracking > 0) {
								state.failed = true;
								return retval;
							}
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							throw mse;
						}

						pushFollow(FOLLOW_additiveExpr_in_comparisonExpr169);
						additiveExpr14 = additiveExpr();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, additiveExpr14.getTree());

					}
						break;

					default:
						break loop4;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
					input.LT(-1), re);

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "comparisonExpr"

	public static class additiveExpr_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "additiveExpr"
	// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:34:1:
	// additiveExpr : multExpr ( ( '+' | '-' ) ^ multExpr )* ;
	public final FormulaParser.additiveExpr_return additiveExpr()
			throws RecognitionException {
		FormulaParser.additiveExpr_return retval = new FormulaParser.additiveExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set16 = null;
		FormulaParser.multExpr_return multExpr15 = null;

		FormulaParser.multExpr_return multExpr17 = null;

		CommonTree set16_tree = null;

		try {
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:35:2: (
			// multExpr ( ( '+' | '-' ) ^ multExpr )* )
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:35:4:
			// multExpr ( ( '+' | '-' ) ^ multExpr )*
			{
				root_0 = (CommonTree) adaptor.nil();

				pushFollow(FOLLOW_multExpr_in_additiveExpr184);
				multExpr15 = multExpr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, multExpr15.getTree());

				// C:\\Documents and
				// Settings\\Administrator\\桌面\\Formula.g:35:13: ( ( '+' | '-' )
				// ^ multExpr )*
				loop5: do {
					int alt5 = 2;
					int LA5_0 = input.LA(1);

					if ((LA5_0 == 23 || LA5_0 == 25)) {
						alt5 = 1;
					}

					switch (alt5) {
					case 1:
					// C:\\Documents and
					// Settings\\Administrator\\桌面\\Formula.g:35:14: ( '+' | '-'
					// ) ^ multExpr
					{
						set16 = (Token) input.LT(1);

						set16 = (Token) input.LT(1);

						if (input.LA(1) == 23 || input.LA(1) == 25) {
							input.consume();
							if (state.backtracking == 0)
								root_0 = (CommonTree) adaptor.becomeRoot(
										(CommonTree) adaptor.create(set16),
										root_0);
							state.errorRecovery = false;
							state.failed = false;
						} else {
							if (state.backtracking > 0) {
								state.failed = true;
								return retval;
							}
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							throw mse;
						}

						pushFollow(FOLLOW_multExpr_in_additiveExpr196);
						multExpr17 = multExpr();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, multExpr17.getTree());

					}
						break;

					default:
						break loop5;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
					input.LT(-1), re);

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "additiveExpr"

	public static class multExpr_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "multExpr"
	// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:38:1: multExpr :
	// notExpr ( ( '*' | '/' ) ^ notExpr )* ;
	public final FormulaParser.multExpr_return multExpr()
			throws RecognitionException {
		FormulaParser.multExpr_return retval = new FormulaParser.multExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set19 = null;
		FormulaParser.notExpr_return notExpr18 = null;

		FormulaParser.notExpr_return notExpr20 = null;

		CommonTree set19_tree = null;

		try {
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:39:2: (
			// notExpr ( ( '*' | '/' ) ^ notExpr )* )
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:39:6:
			// notExpr ( ( '*' | '/' ) ^ notExpr )*
			{
				root_0 = (CommonTree) adaptor.nil();

				pushFollow(FOLLOW_notExpr_in_multExpr214);
				notExpr18 = notExpr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, notExpr18.getTree());

				// C:\\Documents and
				// Settings\\Administrator\\桌面\\Formula.g:39:14: ( ( '*' | '/' )
				// ^ notExpr )*
				loop6: do {
					int alt6 = 2;
					int LA6_0 = input.LA(1);

					if ((LA6_0 == 22 || LA6_0 == 26)) {
						alt6 = 1;
					}

					switch (alt6) {
					case 1:
					// C:\\Documents and
					// Settings\\Administrator\\桌面\\Formula.g:39:15: ( '*' | '/'
					// ) ^ notExpr
					{
						set19 = (Token) input.LT(1);

						set19 = (Token) input.LT(1);

						if (input.LA(1) == 22 || input.LA(1) == 26) {
							input.consume();
							if (state.backtracking == 0)
								root_0 = (CommonTree) adaptor.becomeRoot(
										(CommonTree) adaptor.create(set19),
										root_0);
							state.errorRecovery = false;
							state.failed = false;
						} else {
							if (state.backtracking > 0) {
								state.failed = true;
								return retval;
							}
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							throw mse;
						}

						pushFollow(FOLLOW_notExpr_in_multExpr226);
						notExpr20 = notExpr();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, notExpr20.getTree());

					}
						break;

					default:
						break loop6;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
					input.LT(-1), re);

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "multExpr"

	public static class notExpr_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "notExpr"
	// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:42:1: notExpr :
	// (op= '!' )? negationExpr -> {$op != null}? ^( NOT negationExpr ) ->
	// negationExpr ;
	public final FormulaParser.notExpr_return notExpr()
			throws RecognitionException {
		FormulaParser.notExpr_return retval = new FormulaParser.notExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token op = null;
		FormulaParser.negationExpr_return negationExpr21 = null;

		CommonTree op_tree = null;
		RewriteRuleTokenStream stream_17 = new RewriteRuleTokenStream(adaptor,
				"token 17");
		RewriteRuleSubtreeStream stream_negationExpr = new RewriteRuleSubtreeStream(
				adaptor, "rule negationExpr");
		try {
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:43:2: (
			// (op= '!' )? negationExpr -> {$op != null}? ^( NOT negationExpr )
			// -> negationExpr )
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:43:4:
			// (op= '!' )? negationExpr
			{
				// C:\\Documents and
				// Settings\\Administrator\\桌面\\Formula.g:43:4: (op= '!' )?
				int alt7 = 2;
				int LA7_0 = input.LA(1);

				if ((LA7_0 == 17)) {
					alt7 = 1;
				}
				switch (alt7) {
				case 1:
				// C:\\Documents and
				// Settings\\Administrator\\桌面\\Formula.g:43:5: op= '!'
				{
					op = (Token) match(input, 17, FOLLOW_17_in_notExpr244);
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						stream_17.add(op);

				}
					break;

				}

				pushFollow(FOLLOW_negationExpr_in_notExpr248);
				negationExpr21 = negationExpr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_negationExpr.add(negationExpr21.getTree());

				// AST REWRITE
				// elements: negationExpr, negationExpr
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (CommonTree) adaptor.nil();
					// 43:28: -> {$op != null}? ^( NOT negationExpr )
					if (op != null) {
						// C:\\Documents and
						// Settings\\Administrator\\桌面\\Formula.g:43:46: ^( NOT
						// negationExpr )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
									(CommonTree) adaptor.create(NOT, "NOT"),
									root_1);

							adaptor.addChild(root_1,
									stream_negationExpr.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}

					else // 44:15: -> negationExpr
					{
						adaptor.addChild(root_0, stream_negationExpr.nextTree());

					}

					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
					input.LT(-1), re);

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "notExpr"

	public static class negationExpr_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "negationExpr"
	// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:47:1:
	// negationExpr : (op= '-' )? primary -> {$op != null}? ^( NEGATE primary )
	// -> primary ;
	public final FormulaParser.negationExpr_return negationExpr()
			throws RecognitionException {
		FormulaParser.negationExpr_return retval = new FormulaParser.negationExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token op = null;
		FormulaParser.primary_return primary22 = null;

		CommonTree op_tree = null;
		RewriteRuleTokenStream stream_25 = new RewriteRuleTokenStream(adaptor,
				"token 25");
		RewriteRuleSubtreeStream stream_primary = new RewriteRuleSubtreeStream(
				adaptor, "rule primary");
		try {
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:48:2: (
			// (op= '-' )? primary -> {$op != null}? ^( NEGATE primary ) ->
			// primary )
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:48:4:
			// (op= '-' )? primary
			{
				// C:\\Documents and
				// Settings\\Administrator\\桌面\\Formula.g:48:4: (op= '-' )?
				int alt8 = 2;
				int LA8_0 = input.LA(1);

				if ((LA8_0 == 25)) {
					alt8 = 1;
				}
				switch (alt8) {
				case 1:
				// C:\\Documents and
				// Settings\\Administrator\\桌面\\Formula.g:48:5: op= '-'
				{
					op = (Token) match(input, 25, FOLLOW_25_in_negationExpr290);
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						stream_25.add(op);

				}
					break;

				}

				pushFollow(FOLLOW_primary_in_negationExpr294);
				primary22 = primary();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_primary.add(primary22.getTree());

				// AST REWRITE
				// elements: primary, primary
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (CommonTree) adaptor.nil();
					// 48:23: -> {$op != null}? ^( NEGATE primary )
					if (op != null) {
						// C:\\Documents and
						// Settings\\Administrator\\桌面\\Formula.g:48:41: ^(
						// NEGATE primary )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
									(CommonTree) adaptor.create(NEGATE,
											"NEGATE"), root_1);

							adaptor.addChild(root_1, stream_primary.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}

					else // 49:6: -> primary
					{
						adaptor.addChild(root_0, stream_primary.nextTree());

					}

					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
					input.LT(-1), re);

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "negationExpr"

	public static class primary_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "primary"
	// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:51:1: primary :
	// ( atom | '(' expr ')' -> expr );
	public final FormulaParser.primary_return primary()
			throws RecognitionException {
		FormulaParser.primary_return retval = new FormulaParser.primary_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal24 = null;
		Token char_literal26 = null;
		FormulaParser.atom_return atom23 = null;

		FormulaParser.expr_return expr25 = null;

		CommonTree char_literal24_tree = null;
		CommonTree char_literal26_tree = null;
		RewriteRuleTokenStream stream_21 = new RewriteRuleTokenStream(adaptor,
				"token 21");
		RewriteRuleTokenStream stream_20 = new RewriteRuleTokenStream(adaptor,
				"token 20");
		RewriteRuleSubtreeStream stream_expr = new RewriteRuleSubtreeStream(
				adaptor, "rule expr");
		try {
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:52:2: (
			// atom | '(' expr ')' -> expr )
			int alt9 = 2;
			int LA9_0 = input.LA(1);

			if ((LA9_0 == ID || LA9_0 == NUMBER)) {
				alt9 = 1;
			} else if ((LA9_0 == 20)) {
				alt9 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 9, 0,
						input);

				throw nvae;

			}
			switch (alt9) {
			case 1:
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:52:6:
			// atom
			{
				root_0 = (CommonTree) adaptor.nil();

				pushFollow(FOLLOW_atom_in_primary326);
				atom23 = atom();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, atom23.getTree());

			}
				break;
			case 2:
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:53:5:
			// '(' expr ')'
			{
				char_literal24 = (Token) match(input, 20,
						FOLLOW_20_in_primary337);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_20.add(char_literal24);

				pushFollow(FOLLOW_expr_in_primary339);
				expr25 = expr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_expr.add(expr25.getTree());

				char_literal26 = (Token) match(input, 21,
						FOLLOW_21_in_primary341);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_21.add(char_literal26);

				// AST REWRITE
				// elements: expr
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (CommonTree) adaptor.nil();
					// 53:18: -> expr
					{
						adaptor.addChild(root_0, stream_expr.nextTree());

					}

					retval.tree = root_0;
				}

			}
				break;

			}
			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
					input.LT(-1), re);

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "primary"

	public static class atom_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "atom"
	// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:56:1: atom
	// options {backtrack=true; } : ( NUMBER -> ^( NUM NUMBER ) | ID '('
	// exprList ')' -> ^( CALL ID exprList ) | ID -> ^( VAR ID ) );
	public final FormulaParser.atom_return atom() throws RecognitionException {
		FormulaParser.atom_return retval = new FormulaParser.atom_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token NUMBER27 = null;
		Token ID28 = null;
		Token char_literal29 = null;
		Token char_literal31 = null;
		Token ID32 = null;
		FormulaParser.exprList_return exprList30 = null;

		CommonTree NUMBER27_tree = null;
		CommonTree ID28_tree = null;
		CommonTree char_literal29_tree = null;
		CommonTree char_literal31_tree = null;
		CommonTree ID32_tree = null;
		RewriteRuleTokenStream stream_21 = new RewriteRuleTokenStream(adaptor,
				"token 21");
		RewriteRuleTokenStream stream_20 = new RewriteRuleTokenStream(adaptor,
				"token 20");
		RewriteRuleTokenStream stream_ID = new RewriteRuleTokenStream(adaptor,
				"token ID");
		RewriteRuleTokenStream stream_NUMBER = new RewriteRuleTokenStream(
				adaptor, "token NUMBER");
		RewriteRuleSubtreeStream stream_exprList = new RewriteRuleSubtreeStream(
				adaptor, "rule exprList");
		try {
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:59:3: (
			// NUMBER -> ^( NUM NUMBER ) | ID '(' exprList ')' -> ^( CALL ID
			// exprList ) | ID -> ^( VAR ID ) )
			int alt10 = 3;
			int LA10_0 = input.LA(1);

			if ((LA10_0 == NUMBER)) {
				alt10 = 1;
			} else if ((LA10_0 == ID)) {
				int LA10_2 = input.LA(2);

				if ((LA10_2 == 20)) {
					alt10 = 2;
				} else if ((LA10_2 == EOF || (LA10_2 >= 18 && LA10_2 <= 19) || (LA10_2 >= 21 && LA10_2 <= 32))) {
					alt10 = 3;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					NoViableAltException nvae = new NoViableAltException("",
							10, 2, input);

					throw nvae;

				}
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 10, 0,
						input);

				throw nvae;

			}
			switch (alt10) {
			case 1:
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:60:4:
			// NUMBER
			{
				NUMBER27 = (Token) match(input, NUMBER,
						FOLLOW_NUMBER_in_atom370);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_NUMBER.add(NUMBER27);

				// AST REWRITE
				// elements: NUMBER
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (CommonTree) adaptor.nil();
					// 60:12: -> ^( NUM NUMBER )
					{
						// C:\\Documents and
						// Settings\\Administrator\\桌面\\Formula.g:60:15: ^( NUM
						// NUMBER )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
									(CommonTree) adaptor.create(NUM, "NUM"),
									root_1);

							adaptor.addChild(root_1, stream_NUMBER.nextNode());

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}

			}
				break;
			case 2:
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:61:4: ID
			// '(' exprList ')'
			{
				ID28 = (Token) match(input, ID, FOLLOW_ID_in_atom388);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_ID.add(ID28);

				char_literal29 = (Token) match(input, 20, FOLLOW_20_in_atom390);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_20.add(char_literal29);

				pushFollow(FOLLOW_exprList_in_atom392);
				exprList30 = exprList();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_exprList.add(exprList30.getTree());

				char_literal31 = (Token) match(input, 21, FOLLOW_21_in_atom394);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_21.add(char_literal31);

				// AST REWRITE
				// elements: exprList, ID
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (CommonTree) adaptor.nil();
					// 61:24: -> ^( CALL ID exprList )
					{
						// C:\\Documents and
						// Settings\\Administrator\\桌面\\Formula.g:61:27: ^( CALL
						// ID exprList )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
									(CommonTree) adaptor.create(CALL, "CALL"),
									root_1);

							adaptor.addChild(root_1, stream_ID.nextNode());

							adaptor.addChild(root_1, stream_exprList.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}

			}
				break;
			case 3:
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:62:4: ID
			{
				ID32 = (Token) match(input, ID, FOLLOW_ID_in_atom413);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_ID.add(ID32);

				// AST REWRITE
				// elements: ID
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (CommonTree) adaptor.nil();
					// 62:7: -> ^( VAR ID )
					{
						// C:\\Documents and
						// Settings\\Administrator\\桌面\\Formula.g:62:10: ^( VAR
						// ID )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
									(CommonTree) adaptor.create(VAR, "VAR"),
									root_1);

							adaptor.addChild(root_1, stream_ID.nextNode());

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}

			}
				break;

			}
			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
					input.LT(-1), re);

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "atom"

	public static class exprList_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "exprList"
	// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:66:1: exprList :
	// ( expr ( ',' expr )* )? -> ( expr )* ;
	public final FormulaParser.exprList_return exprList()
			throws RecognitionException {
		FormulaParser.exprList_return retval = new FormulaParser.exprList_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal34 = null;
		FormulaParser.expr_return expr33 = null;

		FormulaParser.expr_return expr35 = null;

		CommonTree char_literal34_tree = null;
		RewriteRuleTokenStream stream_24 = new RewriteRuleTokenStream(adaptor,
				"token 24");
		RewriteRuleSubtreeStream stream_expr = new RewriteRuleSubtreeStream(
				adaptor, "rule expr");
		try {
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:66:9: (
			// ( expr ( ',' expr )* )? -> ( expr )* )
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:66:11: (
			// expr ( ',' expr )* )?
			{
				// C:\\Documents and
				// Settings\\Administrator\\桌面\\Formula.g:66:11: ( expr ( ','
				// expr )* )?
				int alt12 = 2;
				int LA12_0 = input.LA(1);

				if ((LA12_0 == ID || LA12_0 == NUMBER || LA12_0 == 17
						|| LA12_0 == 20 || LA12_0 == 25)) {
					alt12 = 1;
				}
				switch (alt12) {
				case 1:
				// C:\\Documents and
				// Settings\\Administrator\\桌面\\Formula.g:66:12: expr ( ',' expr
				// )*
				{
					pushFollow(FOLLOW_expr_in_exprList432);
					expr33 = expr();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						stream_expr.add(expr33.getTree());

					// C:\\Documents and
					// Settings\\Administrator\\桌面\\Formula.g:66:17: ( ',' expr
					// )*
					loop11: do {
						int alt11 = 2;
						int LA11_0 = input.LA(1);

						if ((LA11_0 == 24)) {
							alt11 = 1;
						}

						switch (alt11) {
						case 1:
						// C:\\Documents and
						// Settings\\Administrator\\桌面\\Formula.g:66:18: ','
						// expr
						{
							char_literal34 = (Token) match(input, 24,
									FOLLOW_24_in_exprList435);
							if (state.failed)
								return retval;
							if (state.backtracking == 0)
								stream_24.add(char_literal34);

							pushFollow(FOLLOW_expr_in_exprList437);
							expr35 = expr();

							state._fsp--;
							if (state.failed)
								return retval;
							if (state.backtracking == 0)
								stream_expr.add(expr35.getTree());

						}
							break;

						default:
							break loop11;
						}
					} while (true);

				}
					break;

				}

				// AST REWRITE
				// elements: expr
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (CommonTree) adaptor.nil();
					// 66:31: -> ( expr )*
					{
						// C:\\Documents and
						// Settings\\Administrator\\桌面\\Formula.g:66:35: ( expr
						// )*
						while (stream_expr.hasNext()) {
							adaptor.addChild(root_0, stream_expr.nextTree());

						}
						stream_expr.reset();

					}

					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
					input.LT(-1), re);

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "exprList"

	// Delegated rules

	public static final BitSet FOLLOW_expr_in_prog78 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_orExpr_in_expr89 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_andExpr_in_orExpr97 = new BitSet(
			new long[] { 0x0000000100000002L });
	public static final BitSet FOLLOW_32_in_orExpr100 = new BitSet(
			new long[] { 0x0000000002121080L });
	public static final BitSet FOLLOW_andExpr_in_orExpr103 = new BitSet(
			new long[] { 0x0000000100000002L });
	public static final BitSet FOLLOW_equalityExpr_in_andExpr114 = new BitSet(
			new long[] { 0x0000000000080002L });
	public static final BitSet FOLLOW_19_in_andExpr117 = new BitSet(
			new long[] { 0x0000000002121080L });
	public static final BitSet FOLLOW_equalityExpr_in_andExpr120 = new BitSet(
			new long[] { 0x0000000000080002L });
	public static final BitSet FOLLOW_comparisonExpr_in_equalityExpr132 = new BitSet(
			new long[] { 0x0000000020040002L });
	public static final BitSet FOLLOW_set_in_equalityExpr135 = new BitSet(
			new long[] { 0x0000000002121080L });
	public static final BitSet FOLLOW_comparisonExpr_in_equalityExpr142 = new BitSet(
			new long[] { 0x0000000020040002L });
	public static final BitSet FOLLOW_additiveExpr_in_comparisonExpr155 = new BitSet(
			new long[] { 0x00000000D8000002L });
	public static final BitSet FOLLOW_set_in_comparisonExpr158 = new BitSet(
			new long[] { 0x0000000002121080L });
	public static final BitSet FOLLOW_additiveExpr_in_comparisonExpr169 = new BitSet(
			new long[] { 0x00000000D8000002L });
	public static final BitSet FOLLOW_multExpr_in_additiveExpr184 = new BitSet(
			new long[] { 0x0000000002800002L });
	public static final BitSet FOLLOW_set_in_additiveExpr187 = new BitSet(
			new long[] { 0x0000000002121080L });
	public static final BitSet FOLLOW_multExpr_in_additiveExpr196 = new BitSet(
			new long[] { 0x0000000002800002L });
	public static final BitSet FOLLOW_notExpr_in_multExpr214 = new BitSet(
			new long[] { 0x0000000004400002L });
	public static final BitSet FOLLOW_set_in_multExpr217 = new BitSet(
			new long[] { 0x0000000002121080L });
	public static final BitSet FOLLOW_notExpr_in_multExpr226 = new BitSet(
			new long[] { 0x0000000004400002L });
	public static final BitSet FOLLOW_17_in_notExpr244 = new BitSet(
			new long[] { 0x0000000002101080L });
	public static final BitSet FOLLOW_negationExpr_in_notExpr248 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_25_in_negationExpr290 = new BitSet(
			new long[] { 0x0000000000101080L });
	public static final BitSet FOLLOW_primary_in_negationExpr294 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_atom_in_primary326 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_20_in_primary337 = new BitSet(
			new long[] { 0x0000000002121080L });
	public static final BitSet FOLLOW_expr_in_primary339 = new BitSet(
			new long[] { 0x0000000000200000L });
	public static final BitSet FOLLOW_21_in_primary341 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_NUMBER_in_atom370 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ID_in_atom388 = new BitSet(
			new long[] { 0x0000000000100000L });
	public static final BitSet FOLLOW_20_in_atom390 = new BitSet(
			new long[] { 0x0000000002321080L });
	public static final BitSet FOLLOW_exprList_in_atom392 = new BitSet(
			new long[] { 0x0000000000200000L });
	public static final BitSet FOLLOW_21_in_atom394 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ID_in_atom413 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_expr_in_exprList432 = new BitSet(
			new long[] { 0x0000000001000002L });
	public static final BitSet FOLLOW_24_in_exprList435 = new BitSet(
			new long[] { 0x0000000002121080L });
	public static final BitSet FOLLOW_expr_in_exprList437 = new BitSet(
			new long[] { 0x0000000001000002L });

}
