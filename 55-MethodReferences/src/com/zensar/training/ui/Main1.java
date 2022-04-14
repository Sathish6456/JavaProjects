package com.zensar.training.ui;

import com.zensar.training.bean.pack1.Addition;
import com.zensar.training.bean.pack1.Multiplication;
import com.zensar.training.bean.pack1.Task;

public class Main1 {

	public static void main(String[] args) {
		
		Task task;
		task=Addition::add; //(a,b)->a+b; method reference of static method
		System.out.println(task.execute(10, 10));
		
		task=Multiplication::multiply;
		System.out.println(task.execute(2, 3));

	}

}
