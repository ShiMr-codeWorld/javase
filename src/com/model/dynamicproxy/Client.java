package com.model.dynamicproxy;

public class Client {
	public static void main(String[] args) {
		// ����Ŀ�����
	  	ITeacherDao target = new TeacherDao();
	  	
	  	// ��Ŀ����󴴽�������󣬿���ת��ITeacherDao
	  	ITeacherDao proxyInstance = (ITeacherDao)new ProxyFactory(target).getProxyInstance();
	  	
	  	proxyInstance.teach();
	}
}	
