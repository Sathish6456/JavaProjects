package com.zensar.training.ui;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Student;

public class CircleClient {

	public static void main(String[] args) {
		Circle c1;
		c1=new Circle();
		c1.setRadius(100);
		System.out.println(c1);
		
		Circle c2=new Circle();
		c2.setRadius(10);
		System.out.println(c2);
		
		int a=10, b=10;
		System.out.println(a==b);
		
		c2=null;
		
		System.out.println(c1.equals(c1));
	}

}
