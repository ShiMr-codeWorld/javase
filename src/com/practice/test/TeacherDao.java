package com.practice.test;

// 被代理的类
public class TeacherDao implements ITeacherDao{

	@Override
	public void teach() {
		System.out.println("老师在授课。。。");
	}
	
}
