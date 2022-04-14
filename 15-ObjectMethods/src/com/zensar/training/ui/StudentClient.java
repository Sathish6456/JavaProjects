package com.zensar.training.ui;

import com.zensar.training.bean.Student;

public class StudentClient {

	public static void main(String[] args) {
		Student student=new Student();
		student.name="John";
		student.mark=80;
		student.grade='A';
		
		System.out.println(student.toString());
		
		Student student1=new Student();
		student1.name="Ravi";
		student1.mark=80;
		student1.grade='A';
		
		System.out.println(student.equals(student1));
		
		student=null;
		System.gc();

	}

}
