package com.zensar.training.ui;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.ObjectStackImpl;
import com.zensar.training.bean.Square;

public class Main6 {

	public static void main(String[] args) {
		
		Circle c1=new Circle(6);
		Square s1=new Square(7);
		String s2=new String("Welcome");
		Double d1=new Double(300.00);
		Boolean b1=new Boolean(true);
		
		ObjectStackImpl impl=new ObjectStackImpl(10);
		impl.push(s1);
		impl.push(c1);
		
		impl.push(s2);
		impl.push(d1);
		impl.push(b1);
		
		Boolean popped=(Boolean) impl.pop();
		System.out.println(popped);
		
		impl.pop();
		impl.pop();
		impl.pop();
		
		Object obj=impl.pop();
		
		
		System.out.println(impl);

	}

}
