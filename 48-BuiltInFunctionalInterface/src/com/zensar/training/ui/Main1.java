package com.zensar.training.ui;

import java.time.LocalDate;
import java.util.function.Consumer;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Employee;
import com.zensar.training.bean.Gender;

public class Main1 {
	public static void main(String[] args) {
		Consumer<String> consumer1;
		consumer1=(s)->{
			System.out.println(s.length());
		};
		consumer1.accept("Zensar");
		
		Consumer<String> consumer2=(s)-> System.out.println(s.toUpperCase());
		consumer2.accept("training");
		
		Consumer<Integer> consumer3=(i)-> System.out.println(i.doubleValue());
		consumer3.accept(new Integer(45));
		
		Consumer<Circle> consumer4=(c)-> System.out.println(c.computeArea());
		consumer4.accept(new Circle(10));
		
		Consumer<Employee> consumer6=(e)-> System.out.println(e.toString());
		Employee employee=new Employee(5001, "Rahul", 'A', LocalDate.now(), 1000, Gender.MALE);
		consumer6.accept(employee);
		
		
		
		
		
		
		
		
	}
}
