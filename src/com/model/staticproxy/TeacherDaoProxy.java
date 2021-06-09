package com.model.staticproxy;

// 代理对象  静态代理
public class TeacherDaoProxy implements ITeacherDao{

	// 代理对象聚合被代理对象，是通过接口进行聚合的，定义目标对象
	private ITeacherDao target;
	 
	// 构造器聚集了子类对象
	public TeacherDaoProxy(ITeacherDao target) {
		this.target = target;
	}

	public void teach() {
		System.out.println("开始处理");
		target.teach();
		System.out.println("提交");
	}
	
}
