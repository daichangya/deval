// $ANTLR 3.4 C:\\Documents and Settings\\daicy\\桌面\\Formula.g 2013-10-30 14:27:39
package daicy.formula;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class FormulaParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CALL", "EXPR", "FUNCTION", "ID", "NEWLINE", "NUM", "NUMBER", "PARAM", "PARAMATERS", "VAR", "WS", "'('", "')'", "'*'", "'+'", "','", "'-'", "'/'"
    };

    public static final int EOF=-1;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int CALL=4;
    public static final int EXPR=5;
    public static final int FUNCTION=6;
    public static final int ID=7;
    public static final int NEWLINE=8;
    public static final int NUM=9;
    public static final int NUMBER=10;
    public static final int PARAM=11;
    public static final int PARAMATERS=12;
    public static final int VAR=13;
    public static final int WS=14;

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
    public String[] getTokenNames() { return FormulaParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\daicy\\桌面\\Formula.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // C:\\Documents and Settings\\daicy\\桌面\\Formula.g:15:1: prog : expr ;
    public final FormulaParser.prog_return prog() throws RecognitionException {
        FormulaParser.prog_return retval = new FormulaParser.prog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        FormulaParser.expr_return expr1 =null;



        try {
            // C:\\Documents and Settings\\daicy\\桌面\\Formula.g:15:5: ( expr )
            // C:\\Documents and Settings\\daicy\\桌面\\Formula.g:15:7: expr
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_prog72);
            expr1=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr1.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // C:\\Documents and Settings\\daicy\\桌面\\Formula.g:18:1: expr : multExpr ( ( '+' | '-' ) ^ multExpr )* ;
    public final FormulaParser.expr_return expr() throws RecognitionException {
        FormulaParser.expr_return retval = new FormulaParser.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set3=null;
        FormulaParser.multExpr_return multExpr2 =null;

        FormulaParser.multExpr_return multExpr4 =null;


        CommonTree set3_tree=null;

        try {
            // C:\\Documents and Settings\\daicy\\桌面\\Formula.g:18:6: ( multExpr ( ( '+' | '-' ) ^ multExpr )* )
            // C:\\Documents and Settings\\daicy\\桌面\\Formula.g:18:8: multExpr ( ( '+' | '-' ) ^ multExpr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_multExpr_in_expr83);
            multExpr2=multExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr2.getTree());

            // C:\\Documents and Settings\\daicy\\桌面\\Formula.g:18:17: ( ( '+' | '-' ) ^ multExpr )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18||LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Documents and Settings\\daicy\\桌面\\Formula.g:18:18: ( '+' | '-' ) ^ multExpr
            	    {
            	    set3=(Token)input.LT(1);

            	    set3=(Token)input.LT(1);

            	    if ( input.LA(1)==18||input.LA(1)==20 ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
            	        (CommonTree)adaptor.create(set3)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_multExpr_in_expr93);
            	    multExpr4=multExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr4.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class multExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multExpr"
    // C:\\Documents and Settings\\daicy\\桌面\\Formula.g:21:1: multExpr : atom ( ( '*' | '/' ) ^ atom )* ;
    public final FormulaParser.multExpr_return multExpr() throws RecognitionException {
        FormulaParser.multExpr_return retval = new FormulaParser.multExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set6=null;
        FormulaParser.atom_return atom5 =null;

        FormulaParser.atom_return atom7 =null;


        CommonTree set6_tree=null;

        try {
            // C:\\Documents and Settings\\daicy\\桌面\\Formula.g:21:10: ( atom ( ( '*' | '/' ) ^ atom )* )
            // C:\\Documents and Settings\\daicy\\桌面\\Formula.g:21:12: atom ( ( '*' | '/' ) ^ atom )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_atom_in_multExpr104);
            atom5=atom();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, atom5.getTree());

            // C:\\Documents and Settings\\daicy\\桌面\\Formula.g:21:17: ( ( '*' | '/' ) ^ atom )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17||LA2_0==21) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Documents and Settings\\daicy\\桌面\\Formula.g:21:18: ( '*' | '/' ) ^ atom
            	    {
            	    set6=(Token)input.LT(1);

            	    set6=(Token)input.LT(1);

            	    if ( input.LA(1)==17||input.LA(1)==21 ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
            	        (CommonTree)adaptor.create(set6)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_atom_in_multExpr114);
            	    atom7=atom();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, atom7.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "multExpr"


    public static class atom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // C:\\Documents and Settings\\daicy\\桌面\\Formula.g:24:1: atom options {backtrack=true; } : ( '(' ! expr ')' !| NUMBER -> ^( NUM NUMBER ) | ID '(' exprList ')' -> ^( CALL ID exprList ) | ID -> ^( VAR ID ) );
    public final FormulaParser.atom_return atom() throws RecognitionException {
        FormulaParser.atom_return retval = new FormulaParser.atom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal8=null;
        Token char_literal10=null;
        Token NUMBER11=null;
        Token ID12=null;
        Token char_literal13=null;
        Token char_literal15=null;
        Token ID16=null;
        FormulaParser.expr_return expr9 =null;

        FormulaParser.exprList_return exprList14 =null;


        CommonTree char_literal8_tree=null;
        CommonTree char_literal10_tree=null;
        CommonTree NUMBER11_tree=null;
        CommonTree ID12_tree=null;
        CommonTree char_literal13_tree=null;
        CommonTree char_literal15_tree=null;
        CommonTree ID16_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
        RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
        RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            // C:\\Documents and Settings\\daicy\\桌面\\Formula.g:27:3: ( '(' ! expr ')' !| NUMBER -> ^( NUM NUMBER ) | ID '(' exprList ')' -> ^( CALL ID exprList ) | ID -> ^( VAR ID ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case NUMBER:
                {
                alt3=2;
                }
                break;
            case ID:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==15) ) {
                    alt3=3;
                }
                else if ( (LA3_3==EOF||(LA3_3 >= 16 && LA3_3 <= 21)) ) {
                    alt3=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // C:\\Documents and Settings\\daicy\\桌面\\Formula.g:28:3: '(' ! expr ')' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal8=(Token)match(input,15,FOLLOW_15_in_atom138); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_atom141);
                    expr9=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr9.getTree());

                    char_literal10=(Token)match(input,16,FOLLOW_16_in_atom143); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\daicy\\桌面\\Formula.g:29:4: NUMBER
                    {
                    NUMBER11=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_atom150); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NUMBER.add(NUMBER11);


                    // AST REWRITE
                    // elements: NUMBER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 29:12: -> ^( NUM NUMBER )
                    {
                        // C:\\Documents and Settings\\daicy\\桌面\\Formula.g:29:15: ^( NUM NUMBER )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(NUM, "NUM")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_NUMBER.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\daicy\\桌面\\Formula.g:30:4: ID '(' exprList ')'
                    {
                    ID12=(Token)match(input,ID,FOLLOW_ID_in_atom168); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID12);


                    char_literal13=(Token)match(input,15,FOLLOW_15_in_atom170); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_15.add(char_literal13);


                    pushFollow(FOLLOW_exprList_in_atom172);
                    exprList14=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprList.add(exprList14.getTree());

                    char_literal15=(Token)match(input,16,FOLLOW_16_in_atom174); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_16.add(char_literal15);


                    // AST REWRITE
                    // elements: exprList, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 30:24: -> ^( CALL ID exprList )
                    {
                        // C:\\Documents and Settings\\daicy\\桌面\\Formula.g:30:27: ^( CALL ID exprList )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(CALL, "CALL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_exprList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\daicy\\桌面\\Formula.g:31:4: ID
                    {
                    ID16=(Token)match(input,ID,FOLLOW_ID_in_atom193); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID16);


                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 31:7: -> ^( VAR ID )
                    {
                        // C:\\Documents and Settings\\daicy\\桌面\\Formula.g:31:10: ^( VAR ID )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(VAR, "VAR")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"


    public static class exprList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprList"
    // C:\\Documents and Settings\\daicy\\桌面\\Formula.g:35:1: exprList : ( expr ( ',' expr )* )? -> ( expr )* ;
    public final FormulaParser.exprList_return exprList() throws RecognitionException {
        FormulaParser.exprList_return retval = new FormulaParser.exprList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal18=null;
        FormulaParser.expr_return expr17 =null;

        FormulaParser.expr_return expr19 =null;


        CommonTree char_literal18_tree=null;
        RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // C:\\Documents and Settings\\daicy\\桌面\\Formula.g:35:9: ( ( expr ( ',' expr )* )? -> ( expr )* )
            // C:\\Documents and Settings\\daicy\\桌面\\Formula.g:35:11: ( expr ( ',' expr )* )?
            {
            // C:\\Documents and Settings\\daicy\\桌面\\Formula.g:35:11: ( expr ( ',' expr )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ID||LA5_0==NUMBER||LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Documents and Settings\\daicy\\桌面\\Formula.g:35:12: expr ( ',' expr )*
                    {
                    pushFollow(FOLLOW_expr_in_exprList212);
                    expr17=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr17.getTree());

                    // C:\\Documents and Settings\\daicy\\桌面\\Formula.g:35:17: ( ',' expr )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==19) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\daicy\\桌面\\Formula.g:35:18: ',' expr
                    	    {
                    	    char_literal18=(Token)match(input,19,FOLLOW_19_in_exprList215); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_19.add(char_literal18);


                    	    pushFollow(FOLLOW_expr_in_exprList217);
                    	    expr19=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expr.add(expr19.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
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
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 35:31: -> ( expr )*
            {
                // C:\\Documents and Settings\\daicy\\桌面\\Formula.g:35:35: ( expr )*
                while ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_0, stream_expr.nextTree());

                }
                stream_expr.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "exprList"

    // Delegated rules


 

    public static final BitSet FOLLOW_expr_in_prog72 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multExpr_in_expr83 = new BitSet(new long[]{0x0000000000140002L});
    public static final BitSet FOLLOW_set_in_expr86 = new BitSet(new long[]{0x0000000000008480L});
    public static final BitSet FOLLOW_multExpr_in_expr93 = new BitSet(new long[]{0x0000000000140002L});
    public static final BitSet FOLLOW_atom_in_multExpr104 = new BitSet(new long[]{0x0000000000220002L});
    public static final BitSet FOLLOW_set_in_multExpr107 = new BitSet(new long[]{0x0000000000008480L});
    public static final BitSet FOLLOW_atom_in_multExpr114 = new BitSet(new long[]{0x0000000000220002L});
    public static final BitSet FOLLOW_15_in_atom138 = new BitSet(new long[]{0x0000000000008480L});
    public static final BitSet FOLLOW_expr_in_atom141 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_atom143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_atom150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom168 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_atom170 = new BitSet(new long[]{0x0000000000018480L});
    public static final BitSet FOLLOW_exprList_in_atom172 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_atom174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList212 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_exprList215 = new BitSet(new long[]{0x0000000000008480L});
    public static final BitSet FOLLOW_expr_in_exprList217 = new BitSet(new long[]{0x0000000000080002L});

}