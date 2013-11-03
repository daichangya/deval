package daicy.formula.validator;

import daicy.formula.ActiveOperand;

/**
 * @Title: TowNOneNDataTypeProvider.java
 * @Package daicy.formula.validator
 * @Description: TODO(�������)
 * @author ������
 * @date 2013-11-2 ����9:22:10
 * @version V1.0
 */
public class TowNOneBDataTypeProvider implements DataTypeProvider {

	@Override
	public ActiveOperand[] getArguments() throws ValidatorException {

		// TODO Auto-generated method stub return null;
		ActiveOperand[] arguments = new ActiveOperand[2];
		for (int i = 0; i < arguments.length; i++) {
			arguments[i] = new ActiveOperand(Number.class, 1);
		}
		return arguments;

	}

	@Override
	public ActiveOperand getResult() throws ValidatorException {

		ActiveOperand result = new ActiveOperand(Boolean.class, Boolean.TRUE);
		return result;

	}

}
