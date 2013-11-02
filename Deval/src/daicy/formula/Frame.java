package daicy.formula;



import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Frame {

	private String functionName;

	private int ir = 0;  //指令指针

	private List<Instruction> inslist; // 指令序列

	private Stack<ActiveOperand> stack = new Stack<ActiveOperand>();  //运算堆栈

	private Map<String, ActiveOperand> opdMap = new HashMap<String, ActiveOperand>(); // 局部变量

	public Frame(String functionName) {
		super();
		this.functionName = functionName;
	}
	
	public Frame(String functionName,Map<String, ActiveOperand> opdMap) {
		super();
		this.functionName = functionName;
		this.opdMap = opdMap;
	}
	
	public String getFunctionName() {
		return functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public List<Instruction> getInslist() {
		return inslist;
	}

	public void setInslist(List<Instruction> inslist) {
		this.inslist = inslist;
	}


	public int getIr() {
		return ir;
	}

	public void setIr(int ir) {
		this.ir = ir;
	}
	
	public void incIr() {
		this.ir += 1;
	}
	
	public boolean isNotEndOfInstructions(){
		return ir < this.inslist.size();
	}
	
	public Instruction getInstruction(){
		return this.inslist.get(ir);
	}
	
	public void pushActiveOperand(ActiveOperand ao){
		this.stack.push(ao);
	}
	
	public ActiveOperand popActiveOperand(){
		return this.stack.pop();
	}
	
	public ActiveOperand peekActiveOperand(){
		return this.stack.peek();
	}
	
	public ActiveOperand getActiveOperand(String variable){
		return this.opdMap.get(variable);
	}
	
	public void putActiveOperand(String variable, ActiveOperand ao){
		this.opdMap.put(variable, ao);
	}
}
