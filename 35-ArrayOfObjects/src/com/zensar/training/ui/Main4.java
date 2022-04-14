package com.zensar.training.ui;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Square;

public class Main4 {

	public static void main(String[] args) {
		Object[] objects=new Object[5];
		
		objects[0]=new Circle(5);
		objects[1]=new Square(10);
		objects[2]=new String("Welcome");
		objects[3]=75;
		objects[4]=new Double(90.0);
		
		for(Object obj:objects) {
			if(obj instanceof Circle) {
				Circle circle=(Circle) obj;
				System.out.println(circle.getRadius()+", "+ circle.computeArea());
			}
			if(obj instanceof Square) {
				Square square=(Square) obj;
				System.out.println(square.getSize()+", "+ square.calculateArea());
			}
			if(obj instanceof String) {
				String str=(String) obj;
				System.out.println(str.toUpperCase());
			}
			
			if(obj instanceof Integer) {
				Integer temp=(Integer) obj;
				System.out.println(temp.doubleValue());
			}
			
			if(obj instanceof Double) {
				Double temp=(Double) obj;
				System.out.println(temp.intValue());
			}
			
		}
		
	}

}
