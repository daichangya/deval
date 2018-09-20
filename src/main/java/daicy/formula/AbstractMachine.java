package daicy.formula;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Stack;

import daicy.formula.function.Function;
import daicy.formula.function.FunctionException;


public class AbstractMachine {
	
	private static String[] instructions = {"add","and","asn","call","div","dup","eq","ge","gt","halt","jmp","jz","ldc","ldv","le","lt","mul","neq","not","or","rem","ret","sub"};

	private Stack<Frame> stack = new Stack<Frame>();	
	private Map<String, List<Instruction>> functionMap;

	public AbstractMachine(Map<String, List<Instruction>> functionMap) {
		super();
		List<Instruction> insList = functionMap.get("main");
		Frame mainFrame = new Frame("main");
		mainFrame.setInslist(insList);
		stack.push(mainFrame);
		this.functionMap = functionMap;
	}
	
	public AbstractMachine(List<Instruction> insList) {
		super();
		//List<Instruction> insList = functionMap.get("main");
		Frame mainFrame = new Frame("main");
		mainFrame.setInslist(insList);
		stack.push(mainFrame);
		Map<String, List<Instruction>> functionMap = new HashMap<String, List<Instruction>>();
		functionMap.put("main", insList);
		this.functionMap = functionMap;
	}

	public Object compute() {
		//Object o = null;
		while (currentFrame().isNotEndOfInstructions()) {
			Instruction ins = currentFrame().getInstruction();	
			int index = Arrays.binarySearch(instructions, ins.getNam());
			switch(index){
				case 0: add(ins); break;
				case 1: and(ins); break;
				case 2: asn(ins); break;
				case 3: call(ins); break;
				case 4: div(ins); break;
				case 5: dup(ins); break;
				case 6: eq(ins); break;
				case 7: ge(ins); break;
				case 8: gt(ins); break;
				case 9: halt(ins); break;
				case 10: jmp(ins); break;
				case 11: jz(ins); break;
				case 12: ldc(ins); break;
				case 13: ldv(ins); break;
				case 14: le(ins); break;
				case 15: lt(ins); break;
				case 16: mul(ins); break;
				case 17: neq(ins); break;
				case 18: not(ins); break;
				case 19: or(ins); break;
				case 20: rem(ins); break;
				case 21: ret(ins); break;
				case 22: sub(ins); break;
				default : break;
			}			
		}
		ActiveOperand ao = currentFrame().popActiveOperand();
		return ao;
	}
	
    private Frame currentFrame(){
    	return stack.peek();
    }
	
	// ldv has only one operand ,e.g. ldv t1
	private void ldv(Instruction ins) {
		String s = ins.getOprand1();
		ActiveOperand ao = currentFrame().getActiveOperand(s);
		if(null == ao){
			Random rand = new Random();
			ao = new ActiveOperand(Integer.class,  rand.nextInt(10));
			System.out.println("rand value :" +s + " "+ao.getValue());
			currentFrame().putActiveOperand(s, ao);
		}
		currentFrame().pushActiveOperand(ao);
		currentFrame().incIr();
	}

	// ldc has two oprands ,e.g. ldc t1 4.5
	private void ldc(Instruction ins) {
		String s1 = ins.getOprand1();
		ActiveOperand ao = null;
		if (s1.indexOf(".") != -1) {
			ao = new ActiveOperand(Double.class, Double.parseDouble(s1));
		} else {
			ao = new ActiveOperand(Integer.class, Integer.parseInt(s1));
		}
		currentFrame().pushActiveOperand(ao);
		currentFrame().incIr();
	}

	// halt has no operand
	private Object halt(Instruction ins) {
		ActiveOperand ao = currentFrame().popActiveOperand();
		System.out.println("compute result : " + ao.getValue());
		currentFrame().setIr(Integer.MAX_VALUE);
		return ao.getValue();
	}

	// jmp has only one operand
	private void jmp(Instruction ins) {
		String s = ins.getOprand1();
		currentFrame().setIr(Integer.parseInt(s));
	}

	// jz has only one operand
	private void jz(Instruction ins) {
		String s = ins.getOprand1();
		if ((Boolean)currentFrame().popActiveOperand().getValue()) {
			currentFrame().incIr();
		} else {
			currentFrame().setIr(Integer.parseInt(s));
		}
	}
	
	// call has two oprands ,e.g. call max 2
	private void call(Instruction ins) {
		currentFrame().incIr();	
		
		String fun = ins.getOprand1();
		//List<Instruction> insList = functionMap.get(fun);
				
		//Frame frame = new Frame(fun);
		//frame.setInslist(insList);
		
		Integer paramNum = Integer.parseInt(ins.getOprand2());
		ActiveOperand[] objs = new ActiveOperand[paramNum];
		for(int i= paramNum-1; i>=0 ; i--){
			ActiveOperand ao = currentFrame().popActiveOperand();
			objs[i] = ao;
		}
		Function function;
		try {
			function = (Function) Class.forName("formula.function.Max").newInstance();
			currentFrame().pushActiveOperand(function.execute(objs));
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FunctionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//stack.push(frame);
		//asn	 赋值 assign	 一个操作数	 栈顶元素出栈，存储于数据存储器中 
	}
	
 	// ret has no operand
	private void ret(Instruction ins) {
		ActiveOperand ao = currentFrame().popActiveOperand();
		stack.pop();
		currentFrame().pushActiveOperand(ao);
	}

 	// rem has only one operand
	private void rem(Instruction ins) {
		currentFrame().incIr();
	}
 
	private void add(Instruction ins) {
		ActiveOperand ao1 = currentFrame().popActiveOperand();
		ActiveOperand ao2 = currentFrame().popActiveOperand();
		ActiveOperand ao = null;
		
		if(ao1.getClazz() == Integer.class && ao2.getClazz() == Integer.class)	{	
		    ao = new ActiveOperand(Integer.class, (Integer)ao2.getValue() + (Integer)ao1.getValue());
        }else {
        	ao = new ActiveOperand(Double.class, Double.parseDouble(ao2.getValue().toString()) + Double.parseDouble(ao1.getValue().toString()));	
        }
		currentFrame().pushActiveOperand(ao);
		currentFrame().incIr();		
	}
	
	private void sub(Instruction ins) {
		ActiveOperand ao1 = currentFrame().popActiveOperand();
		ActiveOperand ao2 = currentFrame().popActiveOperand();
		ActiveOperand ao = null;
		
		if(ao1.getClazz() == Integer.class && ao2.getClazz() == Integer.class)	{	
		    ao = new ActiveOperand(Integer.class, (Integer)ao2.getValue() - (Integer)ao1.getValue());
        }else {
        	ao = new ActiveOperand(Double.class, Double.parseDouble(ao2.getValue().toString()) - Double.parseDouble(ao1.getValue().toString()));	
        }
		
		currentFrame().pushActiveOperand(ao);
		currentFrame().incIr();		
	}
	
	private void mul(Instruction ins) {
		ActiveOperand ao1 = currentFrame().popActiveOperand();
		ActiveOperand ao2 = currentFrame().popActiveOperand();
		ActiveOperand ao = null;
		
		if(ao1.getClazz() == Integer.class && ao2.getClazz() == Integer.class)	{	
		    ao = new ActiveOperand(Integer.class, (Integer)ao2.getValue() * (Integer)ao1.getValue());
        }else {
        	ao = new ActiveOperand(Double.class, Double.parseDouble(ao2.getValue().toString()) * Double.parseDouble(ao1.getValue().toString()));	
        }
		
		currentFrame().pushActiveOperand(ao);
		currentFrame().incIr();		
	}
	
	private void div(Instruction ins) {
		ActiveOperand ao1 = currentFrame().popActiveOperand();
		ActiveOperand ao2 = currentFrame().popActiveOperand();
		ActiveOperand ao = null;
		
		if(ao1.getClazz() == Integer.class && ao2.getClazz() == Integer.class)	{	
		    ao = new ActiveOperand(Integer.class, (Integer)ao2.getValue() / (Integer)ao1.getValue());
        }else {
        	ao = new ActiveOperand(Double.class, Double.parseDouble(ao2.getValue().toString()) / Double.parseDouble(ao1.getValue().toString()));	
        }
		
		currentFrame().pushActiveOperand(ao);
		currentFrame().incIr();		
	}
	
	private void gt(Instruction ins) {
		ActiveOperand ao1 = currentFrame().popActiveOperand();
		ActiveOperand ao2 = currentFrame().popActiveOperand();
		ActiveOperand ao = null;
        if(ao1.getClazz() == Integer.class && ao2.getClazz() == Integer.class)	{	
		    ao = new ActiveOperand(Boolean.class, (Integer)ao2.getValue() > (Integer)ao1.getValue());
        }else {
        	ao = new ActiveOperand(Boolean.class, Double.parseDouble(ao2.getValue().toString()) > Double.parseDouble(ao1.getValue().toString()));	
        }
		currentFrame().pushActiveOperand(ao);
		currentFrame().incIr();		
	}
	
	private void ge(Instruction ins) {
		ActiveOperand ao1 = currentFrame().popActiveOperand();
		ActiveOperand ao2 = currentFrame().popActiveOperand();
		ActiveOperand ao = null;
        if(ao1.getClazz() == Integer.class && ao2.getClazz() == Integer.class)	{	
		    ao = new ActiveOperand(Boolean.class, (Integer)ao2.getValue() >= (Integer)ao1.getValue());
        }else {
        	ao = new ActiveOperand(Boolean.class, Double.parseDouble(ao2.getValue().toString()) >= Double.parseDouble(ao1.getValue().toString()));	
        }
		currentFrame().pushActiveOperand(ao);
		currentFrame().incIr();		
	}
	
	private void lt(Instruction ins) {
		ActiveOperand ao1 = currentFrame().popActiveOperand();
		ActiveOperand ao2 = currentFrame().popActiveOperand();
		ActiveOperand ao = null;
        if(ao1.getClazz() == Integer.class && ao2.getClazz() == Integer.class)	{	
		    ao = new ActiveOperand(Boolean.class, (Integer)ao2.getValue() < (Integer)ao1.getValue());
        }else {
        	ao = new ActiveOperand(Boolean.class, Double.parseDouble(ao2.getValue().toString()) < Double.parseDouble(ao1.getValue().toString()));	
        }
		currentFrame().pushActiveOperand(ao);
		currentFrame().incIr();		
	}
	
	private void le(Instruction ins) {
		ActiveOperand ao1 = currentFrame().popActiveOperand();
		ActiveOperand ao2 = currentFrame().popActiveOperand();
		ActiveOperand ao = null;
        if(ao1.getClazz() == Integer.class && ao2.getClazz() == Integer.class)	{	
		    ao = new ActiveOperand(Boolean.class, (Integer)ao2.getValue() <= (Integer)ao1.getValue());
        }else {
        	ao = new ActiveOperand(Boolean.class, Double.parseDouble(ao2.getValue().toString()) <= Double.parseDouble(ao1.getValue().toString()));	
        }
		currentFrame().pushActiveOperand(ao);
		currentFrame().incIr();		
	}
	
	private void eq(Instruction ins) {
		ActiveOperand ao1 = currentFrame().popActiveOperand();
		ActiveOperand ao2 = currentFrame().popActiveOperand();
		ActiveOperand ao = null;
        if(ao1.getClazz() == Integer.class && ao2.getClazz() == Integer.class)	{	
		    ao = new ActiveOperand(Boolean.class, ((Integer)ao2.getValue()).equals((Integer)ao1.getValue()));
        }else {
        	ao = new ActiveOperand(Boolean.class, Double.parseDouble(ao2.getValue().toString()) == Double.parseDouble(ao1.getValue().toString()));	
        }
		currentFrame().pushActiveOperand(ao);
		currentFrame().incIr();		
	}
	
	private void neq(Instruction ins) {
		ActiveOperand ao1 = currentFrame().popActiveOperand();
		ActiveOperand ao2 = currentFrame().popActiveOperand();
		ActiveOperand ao = null;
        if(ao1.getClazz() == Integer.class && ao2.getClazz() == Integer.class)	{	
		    ao = new ActiveOperand(Boolean.class, !((Integer)ao2.getValue()).equals((Integer)ao1.getValue()));
        }else {
        	ao = new ActiveOperand(Boolean.class, Double.parseDouble(ao2.getValue().toString()) != Double.parseDouble(ao1.getValue().toString()));	
        }
		currentFrame().pushActiveOperand(ao);
		currentFrame().incIr();		
	}
	
	private void and(Instruction ins) {
		ActiveOperand ao1 = currentFrame().popActiveOperand();
		ActiveOperand ao2 = currentFrame().popActiveOperand();
		ActiveOperand ao = new ActiveOperand(Boolean.class, (Boolean)ao2.getValue() && (Boolean)ao1.getValue());      
		currentFrame().pushActiveOperand(ao);
		currentFrame().incIr();		
	}
	
	private void or(Instruction ins) {
		ActiveOperand ao1 = currentFrame().popActiveOperand();
		ActiveOperand ao2 = currentFrame().popActiveOperand();
		ActiveOperand ao = new ActiveOperand(Boolean.class, (Boolean)ao2.getValue() || (Boolean)ao1.getValue());      
		currentFrame().pushActiveOperand(ao);
		currentFrame().incIr();		
	}
	
	private void not(Instruction ins) {
		ActiveOperand ao1 = currentFrame().popActiveOperand();
		ActiveOperand ao = new ActiveOperand(Boolean.class, !(Boolean)ao1.getValue()); 
		currentFrame().pushActiveOperand(ao);
		currentFrame().incIr();		
	}
	
	// asn has only one operand ,e.g. asn t1
	private void asn(Instruction ins) {
		String s = ins.getOprand1();
		ActiveOperand ao = currentFrame().popActiveOperand(); 
		currentFrame().putActiveOperand(s, ao); 
		currentFrame().incIr();
	}
	
	// dup has no operand
	private void dup(Instruction ins) {		
		ActiveOperand ao = currentFrame().peekActiveOperand(); 
		currentFrame().pushActiveOperand(ao); 
		currentFrame().incIr();
	}
}
