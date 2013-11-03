package daicy.formula.evaluator;

import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.BaseTree;

import daicy.formula.ActiveOperand;
import daicy.formula.FormulaLexer;
import daicy.formula.FormulaParser;
import daicy.formula.function.FunctionException;
import daicy.formula.function.GreaterThan;
import daicy.formula.function.IfElse;
import daicy.formula.function.max.Add;
import daicy.formula.function.max.Max;
import daicy.formula.function.max.Min;
import daicy.formula.validator.DataTypeProvider;
import daicy.formula.validator.FunctionTypeValidator;
import daicy.formula.validator.IfElseDataTypeProvider;
import daicy.formula.validator.TowNOneBDataTypeProvider;
import daicy.formula.validator.TowNOneNDataTypeProvider;
import daicy.formula.validator.ValidatorException;

public class ExpressionValidator extends ExpressionEvaluator {

	public ExpressionValidator(Map variables) {

		super(variables); // TODO Auto-generated constructor stub
		validators.put(new Max().getName(), new TowNOneNDataTypeProvider());
		validators.put(new Min().getName(), new TowNOneNDataTypeProvider());
		validators.put(new Add().getName(), new TowNOneNDataTypeProvider());
		validators.put(new IfElse().getName(), new IfElseDataTypeProvider());
		validators.put(new GreaterThan().getName(),
				new TowNOneBDataTypeProvider());
	}

	// Contains all of the validators in use.
	private Map<String, DataTypeProvider> validators = new HashMap();

	// call has two oprands ,e.g. call max 2
	public ActiveOperand eval(String functionName, ActiveOperand[] arguments)
			throws ValidatorException, FunctionException {
		FunctionTypeValidator functionTypeValidator = new FunctionTypeValidator();
		functionTypeValidator.setFunction(this.getFunction(functionName));
		functionTypeValidator.setDataTypeProvider(this.validators
				.get(functionName));
		return functionTypeValidator.validate(arguments);

		// stack.push(frame);
		// asn 赋值 assign 一个操作数 栈顶元素出栈，存储于数据存储器中
	}

	public static void main(String[] args) throws Exception {
		String[] testStr = { "max(3,max(1,2))", "ifelse(a<b,2,88)",
				"a + b + 3", "a - (b + 3)"
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
		variables.put("false", Boolean.FALSE);

		ExpressionValidator evaluator = new ExpressionValidator(variables);

		System.out.println(evaluator.eval((((BaseTree) ret.getTree()))));
		// System.out.println(((BaseTree)ret.getTree()).toStringTree());
		// toStringTree(((BaseTree)ret.getTree()));
	}
}
