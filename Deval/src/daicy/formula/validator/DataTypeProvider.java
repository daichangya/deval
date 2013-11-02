package daicy.formula.validator;

import daicy.formula.ActiveOperand;
import daicy.formula.function.FunctionException;

/**
 * @Title: DataTypeProvider.java
 * @Package daicy.formula.validator
 * @Description: TODO(�������)
 * @author ������
 * @date 2013-11-2 ����8:58:24
 * @version V1.0
 */
public interface DataTypeProvider {
	/**
	 * @Title: getArguments
	 * @Description:TODO(������һ�仰�����������������)
	 * @return
	 * @throws FunctionException
	 *             ActiveOperand[] ��������
	 * @throws
	 * @date 2013-11-2 ����8:50:15
	 */

	public ActiveOperand[] getArguments() throws ValidatorException;

	/**
	 * @Title: getResult
	 * @Description:TODO(������һ�仰�����������������)
	 * @return
	 * @throws ValidatorException
	 *             ActiveOperand ��������
	 * @throws
	 * @date 2013-11-2 ����9:20:59
	 */

	public ActiveOperand getResult() throws ValidatorException;
}
