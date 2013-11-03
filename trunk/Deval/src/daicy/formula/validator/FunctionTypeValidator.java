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
	 * @Description:TODO(������һ�仰�����������������)
	 * @param arguments
	 * @return
	 * @throws ValidatorException
	 * @throws FunctionException
	 *             ActiveOperand ��������
	 * @throws
	 * @date 2013-11-2 ����10:51:27
	 */

	public ActiveOperand validate(ActiveOperand[] arguments)
			throws ValidatorException, FunctionException {
		ActiveOperand[] argumentsType = this.getDataTypeProvider()
				.getArguments();
		ActiveOperand resultType = this.getDataTypeProvider().getResult();
		if (null == arguments || arguments.length != argumentsType.length) {
			throw new ValidatorException(this.getFunction().getName()
					+ "�����������ԣ�");
		}
		for (int i = 0; i < argumentsType.length; i++) {
			if (!argumentsType[i].getClazz().isAssignableFrom(
					arguments[i].getClazz())) {
				throw new ValidatorException(this.getFunction().getName()
						+ "�ĵ�" + (i + 1) + "�����������Ͳ��ԣ�");
			}
		}
		ActiveOperand result = this.getFunction().execute(arguments);
		if (!resultType.getClazz().isAssignableFrom(result.getClazz())) {
			throw new ValidatorException(this.getFunction().getName()
					+ "�ķ���ֵ���Ͳ��ԣ�");
		}

		return result;
	}

}