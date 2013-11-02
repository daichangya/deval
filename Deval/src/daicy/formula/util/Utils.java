package daicy.formula.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import daicy.formula.ActiveOperand;

/**
 * @ClassName: Utils
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 代长亚
 * @date 2013-11-2 下午8:30:44
 */

public class Utils {

	/**
	 * @Title: hasOwnMethod
	 * @Description:TODO(这里用一句话描述这个方法的作用)
	 * @param classSt
	 * @param functionName
	 * @return boolean 返回类型
	 * @throws
	 * @date 2013-11-2 下午8:32:15
	 */

	public static boolean hasOwnMethod(Class classSt, String functionName) {
		Method[] methods = classSt.getMethods();
		for (int i = 0; i < methods.length; i++) {
			if (methods[i].getName().equals(functionName)) {
				return true;
			}
		}

		return false;
	}

	public static boolean hasOwnProperty(Class classSt, String functionName) {
		Field[] fields = classSt.getFields();
		for (int i = 0; i < fields.length; i++) {
			if (fields[i].getName().equals(functionName)) {
				return true;
			}
		}

		return false;
	}

	public static Method getOwnMethod(Class classSt, String functionName,
			int size) {
		// Method[] methods = classSt.getMethods();
		// for (int i = 0; i < methods.length; i++) {
		// if(methods[i].getName().equals(functionName)){
		// return methods[i];
		// }
		// }

		Class[] classs = new Class[size];
		for (int i = 0; i < classs.length; i++) {
			classs[i] = double.class;
		}

		try {
			return classSt.getMethod(functionName, classs);
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static Method getOwnMethod(Class classSt, String functionName,
			ActiveOperand[] objs) {
		// Method[] methods = classSt.getMethods();
		// for (int i = 0; i < methods.length; i++) {
		// if(methods[i].getName().equals(functionName)){
		// return methods[i];
		// }
		// }

		Class[] classs = new Class[objs.length];
		for (int i = 0; i < classs.length; i++) {
			classs[i] = objs.getClass();
		}

		try {
			return classSt.getMethod(functionName, classs);
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static Object getOwnPropertyValue(Class classSt, String functionName) {
		Field[] fields = classSt.getFields();
		for (int i = 0; i < fields.length; i++) {
			if (fields[i].getName().equals(functionName)) {
				try {
					return fields[i].get(null);
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	public static boolean isNumeric(String str) {
		boolean result = true;
		try {
			Double.valueOf(str);
		} catch (NumberFormatException e) {
			result = false;
		}

		// for (int i = str.length();--i>=0;){
		// if (!Character.isDigit(str.charAt(i))){
		// return false;
		// }
		// }
		return result;
	}

	public static void main(String[] args) {
		Method[] methods = Math.class.getMethods();
		for (int i = 0; i < methods.length; i++) {
			System.out.println(methods[i].getName());
		}

		Field[] fields = Math.class.getFields();
		for (int i = 0; i < fields.length; i++) {
			try {
				System.out.println(fields[i].get(null));
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
