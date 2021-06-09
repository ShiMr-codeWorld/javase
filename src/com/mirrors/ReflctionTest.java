package com.mirrors;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.junit.Test;


public class ReflctionTest {
	@Test
	public void test01() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		Class clazz = Person.class;
		// 获取构造方法 里面的参数是Person构造器中的参数类型
		Constructor cons = clazz.getConstructor(Integer.class,String.class);
		
		// 通过构造器创建对象
		Object obj = cons.newInstance(1,"tom");
		System.out.println(obj.toString());
		
	
	}
}
