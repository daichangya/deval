package daicy.formula.evaluator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK��̬���������
 * 
 * @author daicy
 * 
 */
public class ExpressionFacadeProxy implements InvocationHandler {
	private Object target;

	/**
	 * ��ί�ж��󲢷���һ��������
	 * 
	 * @param target
	 * @return
	 */
	public Object bind(Object target) {
		this.target = target;
		// ȡ�ô������
		return Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(), this); // Ҫ�󶨽ӿ�(����һ��ȱ�ݣ�cglib�ֲ�����һȱ��)
	}

	@Override
	/** 
	 * ���÷��� 
	 */
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object result = null;
		System.out.println("���￪ʼ");
		// ִ�з���
		result = method.invoke(target, args);
		System.out.println("�������");
		return result;
	}

}
