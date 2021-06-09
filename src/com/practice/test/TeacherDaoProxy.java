package com.practice.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TeacherDaoProxy {
	
	// 维护一个目标对象，方便代理类代理哪一个目标对象
	private Object target;

	public TeacherDaoProxy(Object target) {
		super();
		this.target = target;
	}
	
	// 给目标对象生成一个代理对象
	public Object getProxyInstance() {
		// 创建一个新的代理对象
		/*
		 * 第一个参数是目标对象的类加载器
		 * 第二个参数是目标对象的接口类型
		 * 第三个参数是执行目标对象的方法
		 * */
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), 
				new InvocationHandler() {
					
					@Override
					// 
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("jdk动态代理开始。。。");
						Object obj = method.invoke(target, args);
						System.out.println("jdk动态代理结束。。。");
						return obj;
					}
				});
	}
}
