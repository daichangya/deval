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

package daicy.formula.function;

import daicy.formula.ActiveOperand;

/**
 * This class is a function that executes within Evaluator. The function returns
 * the greater of two Integer values. See the Math.max(Integer) method in the
 * JDK for a complete description of how this function works.
 */
public class IfElse implements Function {
	/**
	 * Returns the name of the function - "ifelse".
	 * 
	 * @return The name of this function class.
	 */
	public String getName() {
		return "ifelse";
	}

	@Override
	public ActiveOperand execute(ActiveOperand[] arguments)
			throws FunctionException {
		// TODO Auto-generated method stub
		Object result = null;

		if (null == arguments || arguments.length != 3) {
			throw new FunctionException("Three numeric arguments are required.");
		}

		try {
			Boolean argumentOne = ((Boolean) arguments[0].getValue());
			if (argumentOne) {
				result = arguments[1];
			} else {
				result = arguments[2];
			}

		} catch (Exception e) {
			throw new FunctionException("Two numeric arguments are required.",
					e);
		}

		return (ActiveOperand) result;
	}
}
