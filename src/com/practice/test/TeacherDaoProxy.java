package com.practice.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TeacherDaoProxy {
	
	// ά��һ��Ŀ����󣬷�������������һ��Ŀ�����
	private Object target;

	public TeacherDaoProxy(Object target) {
		super();
		this.target = target;
	}
	
	// ��Ŀ���������һ���������
	public Object getProxyInstance() {
		// ����һ���µĴ������
		/*
		 * ��һ��������Ŀ�������������
		 * �ڶ���������Ŀ�����Ľӿ�����
		 * ������������ִ��Ŀ�����ķ���
		 * */
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), 
				new InvocationHandler() {
					
					@Override
					// 
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("jdk��̬����ʼ������");
						Object obj = method.invoke(target, args);
						System.out.println("jdk��̬�������������");
						return obj;
					}
				});
	}
}
