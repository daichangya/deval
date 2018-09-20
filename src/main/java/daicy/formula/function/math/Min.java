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

package daicy.formula.function.math;

import daicy.formula.ActiveOperand;
import daicy.formula.function.Function;
import daicy.formula.function.FunctionException;

/**
 * This class is a function that executes within Evaluator. The function returns
 * the greater of two Integer values. See the Math.min(Integer) method in the
 * JDK for a complete description of how this function works.
 */
public class Min implements Function {
	/**
	 * 
	 * @return The name of this function class.
	 */
	public String getName() {
		return "min";
	}

	@Override
	public ActiveOperand execute(ActiveOperand[] arguments)
			throws FunctionException {
		// TODO Auto-generated method stub
		Object result = null;

		if (null == arguments || arguments.length != 2) {
			throw new FunctionException("Two numeric arguments are required.");
		}

		try {
			if ((arguments[0].getValue() instanceof Double)) {
				Double argumentOne = ((Double) arguments[0].getValue());
				Double argumentTwo = ((Double) arguments[1].getValue());
				result = new Double(Math.min(argumentOne, argumentTwo));
			} else if ((arguments[0].getValue() instanceof Float)) {
				Float argumentOne = ((Float) arguments[0].getValue());
				Float argumentTwo = ((Float) arguments[1].getValue());
				result = new Float(Math.min(argumentOne, argumentTwo));
			} else if ((arguments[0].getValue() instanceof Integer)) {
				Integer argumentOne = ((Integer) arguments[0].getValue());
				Integer argumentTwo = ((Integer) arguments[1].getValue());
				result = new Integer(Math.min(argumentOne, argumentTwo));
			} else if ((arguments[0].getValue() instanceof Long)) {
				Long argumentOne = ((Long) arguments[0].getValue());
				Long argumentTwo = ((Long) arguments[1].getValue());
				result = new Long(Math.min(argumentOne, argumentTwo));
			} else if ((arguments[0].getValue() instanceof Short)) {
				Short argumentOne = ((Short) arguments[0].getValue());
				Short argumentTwo = ((Short) arguments[1].getValue());
				result = new Integer(Math.min(argumentOne, argumentTwo));
			}

		} catch (Exception e) {
			throw new FunctionException("Two numeric arguments are required.",
					e);
		}

		return new ActiveOperand(result.getClass(), result);
	}
}
