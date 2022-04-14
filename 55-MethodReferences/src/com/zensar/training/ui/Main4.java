package com.zensar.training.ui;

import com.zensar.training.bean.pack3.Circle;
import com.zensar.training.bean.pack3.Geometry;

public class Main4 {
	
	public static void main(String[] args) {
		Geometry geometry;
		geometry=Circle::new; //method reference to a constructor
		
		Circle circle=geometry.doPrepare(10);
		System.out.println(circle);
	}

}
