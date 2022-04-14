package com.zensar.training.ui;

import java.util.function.Predicate;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Square;

public class Main3 {
	
	static void demo1(Predicate<Square> predicate, Square s) {
		System.out.println(predicate.test(s));
	}
	
	static void demo2(Predicate<Square> predicate, Square s) {
		System.out.println(predicate.test(s));
	}
	

	public static void main(String[] args) {
		Predicate<Circle> predicate1;
		predicate1=(Circle c)->c.getRadius()>100? true: false;
		System.out.println(predicate1.test(new Circle(125)));
		
		Predicate<String> predicate2;
		predicate2=(s)-> s.length()>10? true: false;
		System.out.println(predicate2.test("zensar training"));
		
		demo1((s)->s.getSize()>5 ? true:false, new Square(10));
      //demo2
	}

}
