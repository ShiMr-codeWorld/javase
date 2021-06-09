package com.practice.test;

public class Client {
	public static void main(String[] args) {
		// ����Ŀ�����
		ITeacherDao  target = new TeacherDao();
		// �����������
		ITeacherDao proxyDao = (ITeacherDao) new TeacherDaoProxy(target).getProxyInstance();
		
		// ͨ������������Ŀ�����ķ���
		proxyDao.teach();
	}
}
