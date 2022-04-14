package com.zensar.training.bean;

public class Client1 {

	public static void main(String[] args) {
		Circle c1=new Circle(25);
		System.out.println(c1.getArea());
		
		Circle c2=c1.enLarge(5);
		System.out.println(c2.getRadius());
		
		Circle c3=c2.enLarge(100);
		System.out.println(c3.getRadius());
		

		Circle c4=c3.enLarge(40);
		
		System.out.println(c4.getRadius());
	}

}
