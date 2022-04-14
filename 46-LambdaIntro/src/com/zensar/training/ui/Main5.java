package com.zensar.training.ui;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Executable;

public class Main5 {

	public static void main(String[] args) {
		Executable<String> executable1;
		
		executable1=(s)->{
			return s.length();
		};
		
		System.out.println(executable1.execute("zensar"));
		
		Executable<Double> executable2;
		executable2=(obj)-> obj.intValue();
		System.out.println(executable2.execute(200.0));
		
		Executable<Circle> executable3;
		executable3=(obj)->obj.getRadius();
		System.out.println(executable3.execute(new Circle(45)));
		
		

	}

}
