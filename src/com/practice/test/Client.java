package com.practice.test;

public class Client {
	public static void main(String[] args) {
		// 创建目标对象
		ITeacherDao  target = new TeacherDao();
		// 创建代理对象
		ITeacherDao proxyDao = (ITeacherDao) new TeacherDaoProxy(target).getProxyInstance();
		
		// 通过代理对象调用目标对象的方法
		proxyDao.teach();
	}
}
