package com.model.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
	
	// 维护一个目标对象，进行连接
	private Object target;

	// 构造器，对target进行初始化
	public ProxyFactory(Object target) {
		super();
		this.target = target;
	}
	
	// 重要：给目标对象生成一个代理对象
	public Object getProxyInstance() {
		/**
		 * 第一个参数：是目标对象的类加载器
		 * 第二个参数：是目标对象的的接口类型
		 * 第三个参数：是执行目标对象方法
		 */
		return Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(), 
				new InvocationHandler() {
					
					@Override
					// 怎么样调用目标对象的方法，invoke
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("jdk执行代理开始。。");
						
						// 反射机制调用目标对象的方法
						Object returnVal = method.invoke(target, args);
						System.out.println("jdk代理执行结束。。。");
						return returnVal;
					}
				});
	}	
}
