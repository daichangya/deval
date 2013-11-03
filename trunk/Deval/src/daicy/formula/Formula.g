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

expr : orExpr;

orExpr	:	andExpr ('||'^ andExpr)*
;

andExpr	:	equalityExpr ('&&'^ equalityExpr)*
;

equalityExpr
	:	comparisonExpr (('=='|'!=')^ comparisonExpr)*
;

comparisonExpr 
	:	additiveExpr (('>'|'<'|'<='|'>=')^ additiveExpr)*  
;

additiveExpr 
	:	multExpr (('+' |'-' )^ multExpr )* 
;	

multExpr 
	:   notExpr (('*' |'/' )^ notExpr )*  
;

notExpr
	:	(op='!')? negationExpr 	-> {$op != null}? ^(NOT negationExpr)
						        -> negationExpr
;

negationExpr
	:	(op='-')? primary 	-> {$op != null}? ^(NEGATE primary)
					-> primary
;
primary 
	:   atom  			
	|  '(' expr ')' -> expr  
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

