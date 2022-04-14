package com.zensar.training.ui;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.ObjectStackImpl;
import com.zensar.training.bean.Square;

public class Main7 {

	public static void main(String[] args) {
		ObjectStackImpl<Circle> impl=new ObjectStackImpl<Circle>(10);
		
		impl.push(new Circle(25));
		impl.push(new Circle(15));
		impl.push(new Circle(20));
		
		System.out.println(impl);
		
		Circle c=impl.pop();
		System.out.println(c.getRadius()+", "+c.computeArea());
		
		ObjectStackImpl<String> impl1=new ObjectStackImpl<String>(10);
		impl1.push("welcome");
		impl1.push("Good Bye");
		impl1.push("Hello");
		
		String s1=impl1.pop();
		System.out.println(s1.toUpperCase());
		
		ObjectStackImpl<Square> impl2=new ObjectStackImpl<Square>(10);
		impl2.push(new Square(25));
		impl2.push(new Square(24));
		impl2.push(new Square(23));
		impl2.push(new Square(22));
		impl2.push(new Square(21));
		
		Square s=impl2.pop();
		System.out.println(s.getSize()+ ", "+ s.calculateArea());
	}

}
