// $ANTLR 3.4 C:\\Documents and Settings\\Administrator\\桌面\\Formula.g 2013-11-03 17:18:17
package daicy.formula;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;

@SuppressWarnings({ "all", "warnings", "unchecked" })
public class FormulaLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public FormulaLexer() {
	}

	public FormulaLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}

	public FormulaLexer(CharStream input, RecognizerSharedState state) {
		super(input, state);
	}

	public String getGrammarFileName() {
		return "C:\\Documents and Settings\\Administrator\\桌面\\Formula.g";
	}

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:4:7: (
			// '!' )
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:4:9: '!'
			{
				match('!');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:5:7: (
			// '!=' )
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:5:9:
			// '!='
			{
				match("!=");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:6:7: (
			// '&&' )
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:6:9:
			// '&&'
			{
				match("&&");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:7:7: (
			// '(' )
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:7:9: '('
			{
				match('(');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:8:7: (
			// ')' )
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:8:9: ')'
			{
				match(')');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:9:7: (
			// '*' )
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:9:9: '*'
			{
				match('*');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:10:7: (
			// '+' )
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:10:9:
			// '+'
			{
				match('+');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:11:7: (
			// ',' )
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:11:9:
			// ','
			{
				match(',');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:12:7: (
			// '-' )
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:12:9:
			// '-'
			{
				match('-');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:13:7: (
			// '/' )
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:13:9:
			// '/'
			{
				match('/');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:14:7: (
			// '<' )
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:14:9:
			// '<'
			{
				match('<');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:15:7: (
			// '<=' )
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:15:9:
			// '<='
			{
				match("<=");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:16:7: (
			// '==' )
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:16:9:
			// '=='
			{
				match("==");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:17:7: (
			// '>' )
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:17:9:
			// '>'
			{
				match('>');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:18:7: (
			// '>=' )
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:18:9:
			// '>='
			{
				match(">=");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:19:7: (
			// '||' )
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:19:9:
			// '||'
			{
				match("||");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__32"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:70:4: (
			// ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' ..
			// '9' )* )
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:70:6: (
			// 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9'
			// )*
			{
				if ((input.LA(1) >= 'A' && input.LA(1) <= 'Z')
						|| (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

				// C:\\Documents and
				// Settings\\Administrator\\桌面\\Formula.g:70:27: ( 'a' .. 'z' |
				// 'A' .. 'Z' | '0' .. '9' )*
				loop1: do {
					int alt1 = 2;
					int LA1_0 = input.LA(1);

					if (((LA1_0 >= '0' && LA1_0 <= '9')
							|| (LA1_0 >= 'A' && LA1_0 <= 'Z') || (LA1_0 >= 'a' && LA1_0 <= 'z'))) {
						alt1 = 1;
					}

					switch (alt1) {
					case 1:
					// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:
					{
						if ((input.LA(1) >= '0' && input.LA(1) <= '9')
								|| (input.LA(1) >= 'A' && input.LA(1) <= 'Z')
								|| (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
							input.consume();
						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							recover(mse);
							throw mse;
						}

					}
						break;

					default:
						break loop1;
					}
				} while (true);

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "ID"

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:71:8: (
			// ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:71:10: (
			// '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
			{
				// C:\\Documents and
				// Settings\\Administrator\\桌面\\Formula.g:71:10: ( '0' .. '9' )+
				int cnt2 = 0;
				loop2: do {
					int alt2 = 2;
					int LA2_0 = input.LA(1);

					if (((LA2_0 >= '0' && LA2_0 <= '9'))) {
						alt2 = 1;
					}

					switch (alt2) {
					case 1:
					// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:
					{
						if ((input.LA(1) >= '0' && input.LA(1) <= '9')) {
							input.consume();
						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							recover(mse);
							throw mse;
						}

					}
						break;

					default:
						if (cnt2 >= 1)
							break loop2;
						EarlyExitException eee = new EarlyExitException(2,
								input);
						throw eee;
					}
					cnt2++;
				} while (true);

				// C:\\Documents and
				// Settings\\Administrator\\桌面\\Formula.g:71:22: ( '.' ( '0' ..
				// '9' )+ )?
				int alt4 = 2;
				int LA4_0 = input.LA(1);

				if ((LA4_0 == '.')) {
					alt4 = 1;
				}
				switch (alt4) {
				case 1:
				// C:\\Documents and
				// Settings\\Administrator\\桌面\\Formula.g:71:23: '.' ( '0' ..
				// '9' )+
				{
					match('.');

					// C:\\Documents and
					// Settings\\Administrator\\桌面\\Formula.g:71:27: ( '0' ..
					// '9' )+
					int cnt3 = 0;
					loop3: do {
						int alt3 = 2;
						int LA3_0 = input.LA(1);

						if (((LA3_0 >= '0' && LA3_0 <= '9'))) {
							alt3 = 1;
						}

						switch (alt3) {
						case 1:
						// C:\\Documents and
						// Settings\\Administrator\\桌面\\Formula.g:
						{
							if ((input.LA(1) >= '0' && input.LA(1) <= '9')) {
								input.consume();
							} else {
								MismatchedSetException mse = new MismatchedSetException(
										null, input);
								recover(mse);
								throw mse;
							}

						}
							break;

						default:
							if (cnt3 >= 1)
								break loop3;
							EarlyExitException eee = new EarlyExitException(3,
									input);
							throw eee;
						}
						cnt3++;
					} while (true);

				}
					break;

				}

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "NUMBER"

	// $ANTLR start "NEWLINE"
	public final void mNEWLINE() throws RecognitionException {
		try {
			int _type = NEWLINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:72:8: (
			// ( '\\r' )? '\\n' )
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:72:9: (
			// '\\r' )? '\\n'
			{
				// C:\\Documents and
				// Settings\\Administrator\\桌面\\Formula.g:72:9: ( '\\r' )?
				int alt5 = 2;
				int LA5_0 = input.LA(1);

				if ((LA5_0 == '\r')) {
					alt5 = 1;
				}
				switch (alt5) {
				case 1:
				// C:\\Documents and
				// Settings\\Administrator\\桌面\\Formula.g:72:9: '\\r'
				{
					match('\r');

				}
					break;

				}

				match('\n');

				skip();

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "NEWLINE"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:73:4: (
			// ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:73:6: (
			// ' ' | '\\t' | '\\n' | '\\r' )+
			{
				// C:\\Documents and
				// Settings\\Administrator\\桌面\\Formula.g:73:6: ( ' ' | '\\t' |
				// '\\n' | '\\r' )+
				int cnt6 = 0;
				loop6: do {
					int alt6 = 2;
					int LA6_0 = input.LA(1);

					if (((LA6_0 >= '\t' && LA6_0 <= '\n') || LA6_0 == '\r' || LA6_0 == ' ')) {
						alt6 = 1;
					}

					switch (alt6) {
					case 1:
					// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:
					{
						if ((input.LA(1) >= '\t' && input.LA(1) <= '\n')
								|| input.LA(1) == '\r' || input.LA(1) == ' ') {
							input.consume();
						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							recover(mse);
							throw mse;
						}

					}
						break;

					default:
						if (cnt6 >= 1)
							break loop6;
						EarlyExitException eee = new EarlyExitException(6,
								input);
						throw eee;
					}
					cnt6++;
				} while (true);

				skip();

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "WS"

	public void mTokens() throws RecognitionException {
		// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:1:8: ( T__17
		// | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 |
		// T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | ID | NUMBER |
		// NEWLINE | WS )
		int alt7 = 20;
		switch (input.LA(1)) {
		case '!': {
			int LA7_1 = input.LA(2);

			if ((LA7_1 == '=')) {
				alt7 = 2;
			} else {
				alt7 = 1;
			}
		}
			break;
		case '&': {
			alt7 = 3;
		}
			break;
		case '(': {
			alt7 = 4;
		}
			break;
		case ')': {
			alt7 = 5;
		}
			break;
		case '*': {
			alt7 = 6;
		}
			break;
		case '+': {
			alt7 = 7;
		}
			break;
		case ',': {
			alt7 = 8;
		}
			break;
		case '-': {
			alt7 = 9;
		}
			break;
		case '/': {
			alt7 = 10;
		}
			break;
		case '<': {
			int LA7_10 = input.LA(2);

			if ((LA7_10 == '=')) {
				alt7 = 12;
			} else {
				alt7 = 11;
			}
		}
			break;
		case '=': {
			alt7 = 13;
		}
			break;
		case '>': {
			int LA7_12 = input.LA(2);

			if ((LA7_12 == '=')) {
				alt7 = 15;
			} else {
				alt7 = 14;
			}
		}
			break;
		case '|': {
			alt7 = 16;
		}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z': {
			alt7 = 17;
		}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9': {
			alt7 = 18;
		}
			break;
		case '\r': {
			int LA7_16 = input.LA(2);

			if ((LA7_16 == '\n')) {
				int LA7_17 = input.LA(3);

				if (((LA7_17 >= '\t' && LA7_17 <= '\n') || LA7_17 == '\r' || LA7_17 == ' ')) {
					alt7 = 20;
				} else {
					alt7 = 19;
				}
			} else {
				alt7 = 20;
			}
		}
			break;
		case '\n': {
			int LA7_17 = input.LA(2);

			if (((LA7_17 >= '\t' && LA7_17 <= '\n') || LA7_17 == '\r' || LA7_17 == ' ')) {
				alt7 = 20;
			} else {
				alt7 = 19;
			}
		}
			break;
		case '\t':
		case ' ': {
			alt7 = 20;
		}
			break;
		default:
			NoViableAltException nvae = new NoViableAltException("", 7, 0,
					input);

			throw nvae;

		}

		switch (alt7) {
		case 1:
		// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:1:10: T__17
		{
			mT__17();

		}
			break;
		case 2:
		// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:1:16: T__18
		{
			mT__18();

		}
			break;
		case 3:
		// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:1:22: T__19
		{
			mT__19();

		}
			break;
		case 4:
		// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:1:28: T__20
		{
			mT__20();

		}
			break;
		case 5:
		// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:1:34: T__21
		{
			mT__21();

		}
			break;
		case 6:
		// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:1:40: T__22
		{
			mT__22();

		}
			break;
		case 7:
		// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:1:46: T__23
		{
			mT__23();

		}
			break;
		case 8:
		// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:1:52: T__24
		{
			mT__24();

		}
			break;
		case 9:
		// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:1:58: T__25
		{
			mT__25();

		}
			break;
		case 10:
		// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:1:64: T__26
		{
			mT__26();

		}
			break;
		case 11:
		// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:1:70: T__27
		{
			mT__27();

		}
			break;
		case 12:
		// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:1:76: T__28
		{
			mT__28();

		}
			break;
		case 13:
		// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:1:82: T__29
		{
			mT__29();

		}
			break;
		case 14:
		// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:1:88: T__30
		{
			mT__30();

		}
			break;
		case 15:
		// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:1:94: T__31
		{
			mT__31();

		}
			break;
		case 16:
		// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:1:100: T__32
		{
			mT__32();

		}
			break;
		case 17:
		// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:1:106: ID
		{
			mID();

		}
			break;
		case 18:
		// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:1:109:
		// NUMBER
		{
			mNUMBER();

		}
			break;
		case 19:
		// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:1:116:
		// NEWLINE
		{
			mNEWLINE();

		}
			break;
		case 20:
		// C:\\Documents and Settings\\Administrator\\桌面\\Formula.g:1:124: WS
		{
			mWS();

		}
			break;

		}

	}

}
