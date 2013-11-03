package daicy.formula.evaluator;

import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.BaseTree;

import daicy.formula.ActiveOperand;
import daicy.formula.FormulaLexer;
import daicy.formula.FormulaParser;
import daicy.formula.function.Function;
import daicy.formula.function.GreaterThan;
import daicy.formula.function.IfElse;
import daicy.formula.function.max.Add;
import daicy.formula.function.max.Max;
import daicy.formula.function.max.Min;

public class ExpressionEvaluator extends ExpressionAnalysis {

	public ExpressionEvaluator(Map variables) {

		super(variables); // TODO Auto-generated constructor stub
		this.putFunction(new Max());
		this.putFunction(new Min());
		this.putFunction(new Add());
		this.putFunction(new IfElse());
		this.putFunction(new GreaterThan());
	}

	// Contains all of the functions in use.
	private Map functions = new HashMap();

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

	// call has two oprands ,e.g. call max 2
	public ActiveOperand eval(String functionName, ActiveOperand[] arguments)
			throws Exception {

		Function function = this.getFunction(functionName);
		return function.execute(arguments);

		// stack.push(frame);
		// asn 赋值 assign 一个操作数 栈顶元素出栈，存储于数据存储器中
	}

	public static void main(String[] args) throws Exception {
		String[] testStr = { "max(3,max(1,2))", "ifelse(a>b,2,88)",
				"a + b + 3", "a - (b + 3)" // "a + (b * 3",
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
		variables.put("a", Integer.valueOf(5));
		variables.put("b", Integer.valueOf(3));

		ExpressionEvaluator evaluator = new ExpressionEvaluator(variables);

		System.out.println(evaluator.eval((((BaseTree) ret.getTree()))));
		// System.out.println(((BaseTree)ret.getTree()).toStringTree());
		// toStringTree(((BaseTree)ret.getTree()));
	}
}
