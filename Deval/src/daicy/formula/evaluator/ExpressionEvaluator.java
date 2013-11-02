package daicy.formula.evaluator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.BaseTree;

import daicy.formula.ActiveOperand;
import daicy.formula.FormulaLexer;
import daicy.formula.FormulaParser;
import daicy.formula.FormulaParser.prog_return;
import daicy.formula.function.Add;
import daicy.formula.function.Function;
import daicy.formula.function.FunctionException;
import daicy.formula.function.Max;


public class ExpressionEvaluator {

	// Contains all of the functions in use.
	private Map functions = new HashMap();

	// Contains all of the variables in use.
	private Map variables = new HashMap();

	public ExpressionEvaluator(Map variables) {
		// TODO Auto-generated constructor stub
		this.variables = variables;
		this.putFunction(new Max());
		this.putFunction(new Add());
	}

	/**
	 * Adds a function to the list of functions to use when evaluating
	 * expressions.
	 * 
	 * @param function
	 *            The function being added.
	 * 
	 * @exception IllegalArgumentException
	 *                Thrown when the function name is not valid or the function
	 *                name is already in use.
	 */
	public void putFunction(final Function function) {
		// Make sure the function name is valid.

		// Make sure the function name isn't already in use.
		final Function existingFunction = (Function) functions.get(function
				.getName());

		if (existingFunction == null) {
			functions.put(function.getName(), function);
		} else {
			throw new IllegalArgumentException("A function with the same name "
					+ "already exists.");
		}
	}

	/**
	 * Returns a funtion from the list of functions. If the function can not be
	 * found in the list of functions, then null will be returned.
	 * 
	 * @param functionName
	 *            The name of the function to retrieve the value for.
	 * 
	 * @return The value for a function in the list of function.
	 */
	public Function getFunction(final String functionName) {
		return (Function) functions.get(functionName);
	}

	/**
	 * Removes the function from the list of functions to use when evaluating
	 * expressions.
	 * 
	 * @param functionName
	 *            The name of the function to remove.
	 */
	public void removeFunction(final String functionName) {
		if (functions.containsKey(functionName)) {
			functions.remove(functionName);
		} else {
			throw new IllegalArgumentException("The function does not exist.");
		}
	}

	/**
	 * Rturns the map of functions currently set on this object.
	 * 
	 * @return the map of functions currently set on this object.
	 */
	public Map getFunctions() {
		return functions;
	}

	/**
	 * Sets the map of functions for this object.
	 * 
	 * @param functions
	 *            The map of functions for this object.
	 */
	public void setFunctions(Map functions) {
		this.functions = functions;
	}

	public ActiveOperand eval(BaseTree tree) throws FunctionException {
		ActiveOperand result = null;
		switch (tree.getType()) {
		case FormulaLexer.NUM:
			Integer temp = Integer.valueOf(tree.getChild(0).toStringTree());
			result = new ActiveOperand(temp.getClass(), temp);
			break;
		case FormulaLexer.CALL:
			result = evalFunction(tree);
			break;
		case FormulaLexer.T__18:
			result = addFunction(tree);
			break;
		case FormulaLexer.VAR:
			String varName = tree.getChild(0).toStringTree();
			Object varValue = variables.get(varName);
			result = new ActiveOperand(varValue.getClass(), varValue);
			break;
		}

		return result;
	}

	// call has two oprands ,e.g. call max 2
	private ActiveOperand addFunction(BaseTree tree) throws FunctionException {
		List<Object> children = tree.getChildren();
		if (null == children || children.size() != 2) {
			throw new FunctionException("Two numeric arguments are required.");
		}
		Integer paramNum = children.size();
		ActiveOperand[] arguments = new ActiveOperand[paramNum];
		for (int i = 0; i < paramNum; i++) {
			BaseTree t = (BaseTree) children.get(i);
			arguments[i] = eval(t);
		}
		return evalFunction("add", arguments);

		// stack.push(frame);
		// asn 赋值 assign 一个操作数 栈顶元素出栈，存储于数据存储器中
	}

	// call has two oprands ,e.g. call max 2
	private ActiveOperand evalFunction(BaseTree tree) throws FunctionException {
		List<Object> children = tree.getChildren();
		Integer paramNum = children.size() - 1;
		ActiveOperand[] arguments = new ActiveOperand[paramNum];
		for (int i = 0; i < paramNum; i++) {
			BaseTree t = (BaseTree) children.get(i + 1);
			arguments[i] = eval(t);
		}

		return evalFunction(((BaseTree) children.get(0)).toStringTree(),
				arguments);

		// stack.push(frame);
		// asn 赋值 assign 一个操作数 栈顶元素出栈，存储于数据存储器中
	}

	// call has two oprands ,e.g. call max 2
	private ActiveOperand evalFunction(String functionName,
			ActiveOperand[] arguments) throws FunctionException {

		Function function = this.getFunction(functionName);
		return function.execute(arguments);

		// stack.push(frame);
		// asn 赋值 assign 一个操作数 栈顶元素出栈，存储于数据存储器中
	}

	public static void main(String[] args) throws Exception {
		String[] testStr = { "max(3,max(1,2))", "2", "a + b + 3", "a - (b + 3)"
		// "a + (b * 3",
		// "11.1+12b+a*b",

		};

		for (String s : testStr) {
			System.out.println("Input expr: " + s);
			run(s);
		}

	}

	public static void run(String expr) throws Exception {
		ANTLRStringStream in = new ANTLRStringStream(expr);
		// 词法分析器
		FormulaLexer lexer = new FormulaLexer(in);

		CommonTokenStream tokens = new CommonTokenStream(lexer);
		// 语法分析器
		FormulaParser parser = new FormulaParser(tokens);

		FormulaParser.prog_return ret = parser.prog();

		Map variables = new HashMap();
		variables.put("a", Integer.valueOf(2));
		variables.put("b", Integer.valueOf(3));

		ExpressionEvaluator evaluator = new ExpressionEvaluator(variables);

		System.out.println(evaluator.eval((((BaseTree) ret.getTree()))));
		// System.out.println(((BaseTree)ret.getTree()).toStringTree());
		// toStringTree(((BaseTree)ret.getTree()));
	}
}
