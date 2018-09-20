// $ANTLR 3.4 C:\\Documents and Settings\\daicy\\桌面\\FormulaComplier.g 2013-10-30 14:38:13

    package daicy.formula;
	import java.util.Map;
	import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class FormulaComplier extends TreeParser {
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
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public FormulaComplier(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public FormulaComplier(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected StringTemplateGroup templateLib =
  new StringTemplateGroup("FormulaComplierTemplates", AngleBracketTemplateLexer.class);

public void setTemplateLib(StringTemplateGroup templateLib) {
  this.templateLib = templateLib;
}
public StringTemplateGroup getTemplateLib() {
  return templateLib;
}
/** allows convenient multi-value initialization:
 *  "new STAttrMap().put(...).put(...)"
 */
public static class STAttrMap extends HashMap {
  public STAttrMap put(String attrName, Object value) {
    super.put(attrName, value);
    return this;
  }
  public STAttrMap put(String attrName, int value) {
    super.put(attrName, new Integer(value));
    return this;
  }
}
    public String[] getTokenNames() { return FormulaComplier.tokenNames; }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\daicy\\桌面\\FormulaComplier.g"; }


    	private int seqNum = 0;
    	private int tempNum = 0;
    	private Map<String, String> paramRenameMap = new HashMap<String, String>();
    	
    	private List<Instruction> insList = new ArrayList<Instruction>();
    	private void addInstruction(Instruction inc){
    		insList.add(inc);
    	}
    	
    	public List<Instruction> getInstruction(){
    		return insList;
    	}
         
        
        private int level = 0;


    public static class prog_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "prog"
    // C:\\Documents and Settings\\daicy\\桌面\\FormulaComplier.g:33:1: prog : expr ;
    public final FormulaComplier.prog_return prog() throws RecognitionException {
        FormulaComplier.prog_return retval = new FormulaComplier.prog_return();
        retval.start = input.LT(1);


        try {
            // C:\\Documents and Settings\\daicy\\桌面\\FormulaComplier.g:33:5: ( expr )
            // C:\\Documents and Settings\\daicy\\桌面\\FormulaComplier.g:33:7: expr
            {
            pushFollow(FOLLOW_expr_in_prog50);
            expr();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class expr_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "expr"
    // C:\\Documents and Settings\\daicy\\桌面\\FormulaComplier.g:36:1: expr : ( ^(t= ( '+' ) e1= expr e2= expr ) | ^(t= ( '-' ) e1= expr e2= expr ) | ^(t= ( '*' ) e1= expr e2= expr ) | ^(t= ( '/' ) e1= expr e2= expr ) | atom );
    public final FormulaComplier.expr_return expr() throws RecognitionException {
        FormulaComplier.expr_return retval = new FormulaComplier.expr_return();
        retval.start = input.LT(1);


        CommonTree t=null;
        FormulaComplier.expr_return e1 =null;

        FormulaComplier.expr_return e2 =null;


        try {
            // C:\\Documents and Settings\\daicy\\桌面\\FormulaComplier.g:37:6: ( ^(t= ( '+' ) e1= expr e2= expr ) | ^(t= ( '-' ) e1= expr e2= expr ) | ^(t= ( '*' ) e1= expr e2= expr ) | ^(t= ( '/' ) e1= expr e2= expr ) | atom )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt1=1;
                }
                break;
            case 20:
                {
                alt1=2;
                }
                break;
            case 17:
                {
                alt1=3;
                }
                break;
            case 21:
                {
                alt1=4;
                }
                break;
            case CALL:
            case NUM:
            case VAR:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // C:\\Documents and Settings\\daicy\\桌面\\FormulaComplier.g:37:6: ^(t= ( '+' ) e1= expr e2= expr )
                    {
                    // C:\\Documents and Settings\\daicy\\桌面\\FormulaComplier.g:37:10: ( '+' )
                    // C:\\Documents and Settings\\daicy\\桌面\\FormulaComplier.g:37:11: '+'
                    {
                    match(input,18,FOLLOW_18_in_expr69); 

                    }


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr74);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr78);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    addInstruction(new Instruction(seqNum++, "add"));

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\daicy\\桌面\\FormulaComplier.g:38:7: ^(t= ( '-' ) e1= expr e2= expr )
                    {
                    // C:\\Documents and Settings\\daicy\\桌面\\FormulaComplier.g:38:11: ( '-' )
                    // C:\\Documents and Settings\\daicy\\桌面\\FormulaComplier.g:38:12: '-'
                    {
                    match(input,20,FOLLOW_20_in_expr98); 

                    }


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr103);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr107);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    addInstruction(new Instruction(seqNum++, "sub"));

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\daicy\\桌面\\FormulaComplier.g:39:7: ^(t= ( '*' ) e1= expr e2= expr )
                    {
                    // C:\\Documents and Settings\\daicy\\桌面\\FormulaComplier.g:39:11: ( '*' )
                    // C:\\Documents and Settings\\daicy\\桌面\\FormulaComplier.g:39:12: '*'
                    {
                    match(input,17,FOLLOW_17_in_expr126); 

                    }


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr131);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr135);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    addInstruction(new Instruction(seqNum++, "mul"));

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\daicy\\桌面\\FormulaComplier.g:40:7: ^(t= ( '/' ) e1= expr e2= expr )
                    {
                    // C:\\Documents and Settings\\daicy\\桌面\\FormulaComplier.g:40:11: ( '/' )
                    // C:\\Documents and Settings\\daicy\\桌面\\FormulaComplier.g:40:12: '/'
                    {
                    match(input,21,FOLLOW_21_in_expr155); 

                    }


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr160);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr164);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    addInstruction(new Instruction(seqNum++, "div"));

                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\daicy\\桌面\\FormulaComplier.g:41:4: atom
                    {
                    pushFollow(FOLLOW_atom_in_expr189);
                    atom();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class atom_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "atom"
    // C:\\Documents and Settings\\daicy\\桌面\\FormulaComplier.g:44:1: atom : ( ^( NUM n= NUMBER ) | ^( CALL v= ID el= exprList ) | ^( VAR v= ID ) );
    public final FormulaComplier.atom_return atom() throws RecognitionException {
        FormulaComplier.atom_return retval = new FormulaComplier.atom_return();
        retval.start = input.LT(1);


        CommonTree n=null;
        CommonTree v=null;
        FormulaComplier.exprList_return el =null;


        try {
            // C:\\Documents and Settings\\daicy\\桌面\\FormulaComplier.g:45:5: ( ^( NUM n= NUMBER ) | ^( CALL v= ID el= exprList ) | ^( VAR v= ID ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case NUM:
                {
                alt2=1;
                }
                break;
            case CALL:
                {
                alt2=2;
                }
                break;
            case VAR:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // C:\\Documents and Settings\\daicy\\桌面\\FormulaComplier.g:46:5: ^( NUM n= NUMBER )
                    {
                    match(input,NUM,FOLLOW_NUM_in_atom205); 

                    match(input, Token.DOWN, null); 
                    n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_atom209); 

                    match(input, Token.UP, null); 


                    addInstruction(new Instruction(seqNum++, "ldc", n.getText())); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\daicy\\桌面\\FormulaComplier.g:47:5: ^( CALL v= ID el= exprList )
                    {
                    match(input,CALL,FOLLOW_CALL_in_atom222); 

                    match(input, Token.DOWN, null); 
                    v=(CommonTree)match(input,ID,FOLLOW_ID_in_atom226); 

                    pushFollow(FOLLOW_exprList_in_atom230);
                    el=exprList();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    addInstruction(new Instruction(seqNum++, "call", v.getText(), (el!=null?el.paramNum:null).toString())); 

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\daicy\\桌面\\FormulaComplier.g:48:5: ^( VAR v= ID )
                    {
                    match(input,VAR,FOLLOW_VAR_in_atom244); 

                    match(input, Token.DOWN, null); 
                    v=(CommonTree)match(input,ID,FOLLOW_ID_in_atom248); 

                    match(input, Token.UP, null); 


                    String var =paramRenameMap.get(v.getText()); if(null==var){String temp="t"+ tempNum++; paramRenameMap.put(v.getText(),temp);var=temp;} addInstruction(new Instruction(seqNum++, "ldv", var));

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"


    public static class exprList_return extends TreeRuleReturnScope {
        public Integer paramNum;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "exprList"
    // C:\\Documents and Settings\\daicy\\桌面\\FormulaComplier.g:51:1: exprList returns [Integer paramNum] : (vars+= expr )* ;
    public final FormulaComplier.exprList_return exprList() throws RecognitionException {
        FormulaComplier.exprList_return retval = new FormulaComplier.exprList_return();
        retval.start = input.LT(1);


        List list_vars=null;
        RuleReturnScope vars = null;

        retval.paramNum =0;

        try {
            // C:\\Documents and Settings\\daicy\\桌面\\FormulaComplier.g:55:3: ( (vars+= expr )* )
            // C:\\Documents and Settings\\daicy\\桌面\\FormulaComplier.g:55:3: (vars+= expr )*
            {
            // C:\\Documents and Settings\\daicy\\桌面\\FormulaComplier.g:55:3: (vars+= expr )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==CALL||LA3_0==NUM||LA3_0==VAR||(LA3_0 >= 17 && LA3_0 <= 18)||(LA3_0 >= 20 && LA3_0 <= 21)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Documents and Settings\\daicy\\桌面\\FormulaComplier.g:55:4: vars+= expr
            	    {
            	    pushFollow(FOLLOW_expr_in_exprList271);
            	    vars=expr();

            	    state._fsp--;

            	    if (list_vars==null) list_vars=new ArrayList();
            	    list_vars.add(vars.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            retval.paramNum =list_vars.size();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "exprList"

    // Delegated rules


 

    public static final BitSet FOLLOW_expr_in_prog50 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_expr69 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr74 = new BitSet(new long[]{0x0000000000362210L});
    public static final BitSet FOLLOW_expr_in_expr78 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_20_in_expr98 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr103 = new BitSet(new long[]{0x0000000000362210L});
    public static final BitSet FOLLOW_expr_in_expr107 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_17_in_expr126 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr131 = new BitSet(new long[]{0x0000000000362210L});
    public static final BitSet FOLLOW_expr_in_expr135 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_21_in_expr155 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr160 = new BitSet(new long[]{0x0000000000362210L});
    public static final BitSet FOLLOW_expr_in_expr164 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_atom_in_expr189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_atom205 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NUMBER_in_atom209 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CALL_in_atom222 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_atom226 = new BitSet(new long[]{0x0000000000362218L});
    public static final BitSet FOLLOW_exprList_in_atom230 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_in_atom244 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_atom248 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_exprList271 = new BitSet(new long[]{0x0000000000362212L});

}
