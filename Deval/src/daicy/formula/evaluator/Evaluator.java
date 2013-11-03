package daicy.formula.evaluator;

import daicy.formula.ActiveOperand;

/**
 * @Title: Evaluator.java
 * @Package daicy.formula.evaluator
 * @Description: TODO(�������)
 * @author ������
 * @date 2013-11-3 ����4:34:15
 * @version V1.0
 */
public interface Evaluator {

	// call has two oprands ,e.g. call max 2
	public abstract ActiveOperand eval(String functionName,
			ActiveOperand[] arguments) throws Exception;

}
