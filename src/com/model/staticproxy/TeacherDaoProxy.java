package com.model.staticproxy;

// �������  ��̬����
public class TeacherDaoProxy implements ITeacherDao{

	// �������ۺϱ����������ͨ���ӿڽ��оۺϵģ�����Ŀ�����
	private ITeacherDao target;
	 
	// �������ۼ����������
	public TeacherDaoProxy(ITeacherDao target) {
		this.target = target;
	}

	public void teach() {
		System.out.println("��ʼ����");
		target.teach();
		System.out.println("�ύ");
	}
	
}
