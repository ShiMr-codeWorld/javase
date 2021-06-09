package com.model.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
	
	// ά��һ��Ŀ����󣬽�������
	private Object target;

	// ����������target���г�ʼ��
	public ProxyFactory(Object target) {
		super();
		this.target = target;
	}
	
	// ��Ҫ����Ŀ���������һ���������
	public Object getProxyInstance() {
		/**
		 * ��һ����������Ŀ�������������
		 * �ڶ�����������Ŀ�����ĵĽӿ�����
		 * ��������������ִ��Ŀ����󷽷�
		 */
		return Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(), 
				new InvocationHandler() {
					
					@Override
					// ��ô������Ŀ�����ķ�����invoke
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("jdkִ�д���ʼ����");
						
						// ������Ƶ���Ŀ�����ķ���
						Object returnVal = method.invoke(target, args);
						System.out.println("jdk����ִ�н���������");
						return returnVal;
					}
				});
	}	
}
