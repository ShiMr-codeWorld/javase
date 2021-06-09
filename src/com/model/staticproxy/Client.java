package com.model.staticproxy;

public class Client {
	
	public static void main(String[] args) {
		// ����Ŀ�����
		TeacherDao teacherDao = new TeacherDao();
		
		// �����������
		TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
		
		// ͨ���������ִ�б��������ķ���
		teacherDaoProxy.teach();
	}
}
