package daicy.formula.validator;

import daicy.formula.ActiveOperand;
import daicy.formula.function.FunctionException;

/**
 * @Title: DataTypeProvider.java
 * @Package daicy.formula.validator
 * @Description: TODO(添加描述)
 * @author 代长亚
 * @date 2013-11-2 下午8:58:24
 * @version V1.0
 */
public interface DataTypeProvider {
	/**
	 * @Title: getArguments
	 * @Description:TODO(这里用一句话描述这个方法的作用)
	 * @return
	 * @throws FunctionException
	 *             ActiveOperand[] 返回类型
	 * @throws
	 * @date 2013-11-2 下午8:50:15
	 */

	public ActiveOperand[] getArguments() throws ValidatorException;

	/**
	 * @Title: getResult
	 * @Description:TODO(这里用一句话描述这个方法的作用)
	 * @return
	 * @throws ValidatorException
	 *             ActiveOperand 返回类型
	 * @throws
	 * @date 2013-11-2 下午9:20:59
	 */

	public ActiveOperand getResult() throws ValidatorException;
}
