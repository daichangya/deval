package daicy.formula.evaluator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.tree.BaseTree;

import daicy.formula.ActiveOperand;
import daicy.formula.FormulaLexer;

public abstract class ExpressionAnalysis implements Evaluator {

	// Contains all of the variables in use.
	private Map variables = new HashMap();

	public ExpressionAnalysis(Map variables) {
		// TODO Auto-generated constructor stub
		this.variables = variables;

	}

	public ActiveOperand eval(BaseTree tree) throws Exception {
		ActiveOperand result = null;
		switch (tree.getType()) {
		case FormulaLexer.NUM:
			Integer temp = Integer.valueOf(tree.getChild(0).toStringTree());
			result = new ActiveOperand(temp.getClass(), temp);
			break;
		case FormulaLexer.CALL:
			result = evalFunction(tree);
			break;
		case FormulaLexer.T__23:
			result = twoOperatorFunction("add", tree);
			break;
		case FormulaLexer.T__30:
			result = twoOperatorFunction(">", tree);
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
	private ActiveOperand twoOperatorFunction(String operatorName, BaseTree tree)
			throws Exception {
		List<Object> children = tree.getChildren();
		if (null == children || children.size() != 2) {
			throw new Exception("Two numeric arguments are required.");
		}
		Integer paramNum = children.size();
		ActiveOperand[] arguments = new ActiveOperand[paramNum];
		for (int i = 0; i < paramNum; i++) {
			BaseTree t = (BaseTree) children.get(i);
			arguments[i] = eval(t);
		}
		return eval(operatorName, arguments);

		// stack.push(frame);
		// asn 赋值 assign 一个操作数 栈顶元素出栈，存储于数据存储器中
	}

	// call has two oprands ,e.g. call max 2
	private ActiveOperand evalFunction(BaseTree tree) throws Exception {
		List<Object> children = tree.getChildren();
		Integer paramNum = children.size() - 1;
		ActiveOperand[] arguments = new ActiveOperand[paramNum];
		for (int i = 0; i < paramNum; i++) {
			BaseTree t = (BaseTree) children.get(i + 1);
			arguments[i] = eval(t);
		}

		return eval(((BaseTree) children.get(0)).toStringTree(), arguments);

		// stack.push(frame);
		// asn 赋值 assign 一个操作数 栈顶元素出栈，存储于数据存储器中
	}

}
