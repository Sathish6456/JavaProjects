package com.zensar.training.ui;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Square;

public class Main3 {

	public static void main(String[] args) {
		Object obj;
		obj=new Circle(5); //upcasting... implicit
		
		Circle temp=(Circle)obj; //downcasting ...explicit
		
		System.out.println(temp.getRadius()+", "+temp.computeArea());
		
		
		
		obj=new Square(10);
		Square tempSquare=(Square)obj;
		System.out.println(tempSquare.getSize()+", "+tempSquare.calculateArea());
		
		obj=new String("Welcome");
		String tempString=(String) obj;
		System.out.println(tempString.toUpperCase());
		
		obj=new Integer(10);
		Integer tempInteger=(Integer) obj;
		System.out.println(tempInteger.doubleValue());
		
		obj=new Double(90.00);
		Double tempDouble=(Double) obj;
		System.out.println(tempDouble.intValue());
		
		Object obj1=new Square(90);
		
		//System.out.println(obj1 instanceof Circle);
		if(obj1 instanceof Circle) {   // safe type conversions
			Circle tmp=(Circle) obj1;
			System.out.println(tmp);
		}
		
		if(obj1 instanceof Square) {
			Square tmp=(Square)obj1;
			System.out.println(tmp.calculateArea());
		}
		
		if(obj1 instanceof String) {
			String tmp=(String)obj1;
			System.out.println(tmp.toUpperCase());
		}
		

	}

}
