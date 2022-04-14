package com.zensar.training.ui;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Student;

public class Test1 {

	public static void test(Object obj) {
		
	}
	
	public static void main(String[] args) {
		 
		test(new Circle());
		test(new Student());
		
		Circle c1=new Circle();
		test(c1);
		
		Student s=new Student();
		test(s);
	}

}
