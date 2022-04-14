package com.zensar.training.ui;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Square;

public class Main6 {

	public static void main(String[] args) {
		Circle c1=new Circle(22);
		
		Circle c2=new Circle(22);
		
		System.out.println(c1.compareTo(c2));
		
		Square s1=new Square(5);
		Square s2=new Square(10);
		
		if(s1.compareTo(s2)<0)
			System.out.println("s2 is greater than s1");
		
		if(s1.compareTo(s2)==0)
			System.out.println("Both Same");
		
		if(s1.compareTo(s2)>0)
			System.out.println("s1 is greater than s2");
		
		
		
		Integer obj1=new Integer(20);
		Integer obj2=new Integer(25);
		System.out.println(obj1.compareTo(obj2));
		
		
	}
	
	

}
