package com.zensar.training.ui;

import java.util.function.Function;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Square;
import com.zensar.training.bean.Student;

public class Main4 {

	public static void main(String[] args) {
		Function<Student, Circle> function1;
		function1=(s)->new Circle(s.getRollNo());
		System.out.println(function1.apply(new Student(1024)));
		
		
		Function<Circle, Square> function2;
		
		
 
	}

}
