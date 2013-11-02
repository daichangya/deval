tree grammar FormulaComplier;

options{
	tokenVocab=Formula;  
	ASTLabelType=CommonTree;
	output = template;	
}

@header {
    package formula;
	import java.util.Map;
	import java.util.HashMap;
}

@members{
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
}

prog: expr; 

	
expr 
:    ^(t=('+') e1=expr e2=expr) {addInstruction(new Instruction(seqNum++, "add"));}     
    | ^(t=('-') e1=expr e2=expr) {addInstruction(new Instruction(seqNum++, "sub"));}    
    | ^(t=('*') e1=expr e2=expr) {addInstruction(new Instruction(seqNum++, "mul"));}     
    | ^(t=('/') e1=expr e2=expr) {addInstruction(new Instruction(seqNum++, "div"));}               		
	| atom 
;

atom 
:
	   ^(NUM n=NUMBER)   {addInstruction(new Instruction(seqNum++, "ldc", n.getText())); } 
	|  ^(CALL v=ID el=exprList)    {addInstruction(new Instruction(seqNum++, "call", v.getText(), $el.paramNum.toString())); } 
	|  ^(VAR v=ID)	{String var =paramRenameMap.get(v.getText()); if(null==var){String temp="t"+ tempNum++; paramRenameMap.put(v.getText(),temp);var=temp;} addInstruction(new Instruction(seqNum++, "ldv", var));}
;

exprList returns[Integer paramNum]
@init {
$paramNum =0;
}
:	(vars+=expr)* {$paramNum =$vars.size();}
;