package com.model.staticproxy;

public class Client {
	
	public static void main(String[] args) {
		// 创建目标对象
		TeacherDao teacherDao = new TeacherDao();
		
		// 创建代理对象
		TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
		
		// 通过代理对象执行被代理对象的方法
		teacherDaoProxy.teach();
	}
}
