package com.zensar.training.ui;

import java.util.function.ToDoubleFunction;

import com.zensar.training.bean.Gender;
import com.zensar.training.bean.Student;

public class Main5 {

	public static void main(String[] args) {
		ToDoubleFunction<Student> function1;
		function1=(s)->s.getAverageMark();
		System.out.println(function1.applyAsDouble(new Student(111,"Rahul", Gender.MALE, 45.0, "ECE")));
		

	}

}
