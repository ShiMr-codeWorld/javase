package com.mirrors;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.junit.Test;


public class ReflctionTest {
	@Test
	public void test01() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		Class clazz = Person.class;
		// ��ȡ���췽�� ����Ĳ�����Person�������еĲ�������
		Constructor cons = clazz.getConstructor(Integer.class,String.class);
		
		// ͨ����������������
		Object obj = cons.newInstance(1,"tom");
		System.out.println(obj.toString());
		
	
	}
}
