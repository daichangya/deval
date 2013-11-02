/*
 * Copyright 2002-2007 Robert Breidecker.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
	 * Executes the function for the specified argument. This method is called
	 * internally by Evaluator.
	 * 
	 * @param evaluator
	 *            An instance of Evaluator.
	 * @param arguments
	 *            The arguments that will be evaluated by the function. It is up
	 *            to the function implementation to break the string into one or
	 *            more arguments.
	 * 
	 * @return The value of the evaluated argument and its type.
	 * 
	 * @exception ValidatorException
	 *                Thrown if the argument(s) are not valid for this function.
	 * @throws FunctionException
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