package com.zensar.training.ui;

import com.zensar.training.bean.Circle;

public class Main1 {

	public static void main(String[] args) {
		Circle[] circles=new Circle[3];
		
		circles[0]=new Circle(5);
		circles[1]=new Circle(6);
		circles[2]=new Circle(7);
		
		for(int i=0;i<circles.length; i++) {
			System.out.println(circles[i].getRadius() +", " + circles[i].computeArea());
		}
		
		for(Circle circle:circles) {
			System.out.println(circle);
			System.out.println(circle.getRadius()+", "+ circle.computeArea());
		}
		
		circles=null;

	}

}
