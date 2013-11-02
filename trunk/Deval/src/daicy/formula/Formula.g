grammar Formula;

options{
	output = AST;
	ASTLabelType = CommonTree;
}

tokens{
	FUNCTION; PARAMATERS; PARAM;  EXPR; NUM; VAR; CALL; 
}

@header {package formula;}
@lexer::header{package formula;}

prog: expr 
; 

expr : multExpr (('+'|'-')^ multExpr)*
;

multExpr : atom (('*'|'/')^ atom)*
;

atom 
options{
	backtrack=true;
}	:
	 '('! expr ')'! 
	| NUMBER  -> ^(NUM NUMBER)    
	| ID '(' exprList ')' -> ^(CALL ID exprList)    
	| ID -> ^(VAR ID)
	
;

exprList:	(expr (',' expr)*)? ->  expr*
;


ID : ('a'..'z' |'A'..'Z' )('a'..'z' |'A'..'Z'|'0'..'9')* ;
NUMBER : ('0'..'9')+ ('.' ('0'..'9')+)? ;
NEWLINE:'\r' ? '\n' {skip();} ;
WS : (' ' |'\t' |'\n' |'\r' )+ {skip();} ;

