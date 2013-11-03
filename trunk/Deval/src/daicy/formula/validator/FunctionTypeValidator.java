package daicy.formula.validator;

import daicy.formula.ActiveOperand;
import daicy.formula.function.Function;
import daicy.formula.function.FunctionException;

/**
 * A function that can be specified in an expression.
 */
public class FunctionTypeValidator {

	public Function function;

	public DataTypeProvider dataTypeProvider;

	public Function getFunction() {

		return function;
	}

	public void setFunction(Function function) {

		this.function = function;
	}

	public DataTypeProvider getDataTypeProvider() {

		return dataTypeProvider;
	}

	public void setDataTypeProvider(DataTypeProvider dataTypeProvider) {

		this.dataTypeProvider = dataTypeProvider;
	}

	/**
	 * @Title: validate
	 * @Description:TODO(这里用一句话描述这个方法的作用)
	 * @param arguments
	 * @return
	 * @throws ValidatorException
	 * @throws FunctionException
	 *             ActiveOperand 返回类型
	 * @throws
	 * @date 2013-11-2 下午10:51:27
	 */

	public ActiveOperand validate(ActiveOperand[] arguments)
			throws ValidatorException, FunctionException {
		ActiveOperand[] argumentsType = this.getDataTypeProvider()
				.getArguments();
		ActiveOperand resultType = this.getDataTypeProvider().getResult();
		if (null == arguments || arguments.length != argumentsType.length) {
			throw new ValidatorException(this.getFunction().getName()
					+ "参数个数不对！");
		}
		for (int i = 0; i < argumentsType.length; i++) {
			if (!argumentsType[i].getClazz().isAssignableFrom(
					arguments[i].getClazz())) {
				throw new ValidatorException(this.getFunction().getName()
						+ "的第" + (i + 1) + "个参数的类型不对！");
			}
		}
		ActiveOperand result = this.getFunction().execute(arguments);
		if (!resultType.getClazz().isAssignableFrom(result.getClazz())) {
			throw new ValidatorException(this.getFunction().getName()
					+ "的返回值类型不对！");
		}

		return result;
	}

}