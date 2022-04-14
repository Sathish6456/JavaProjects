package com.zensar.training.ui;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.CircleStackImpl;

public class Main4 {

	public static void main(String[] args) {
		Circle c1,c2,c3,c4;
		c1=new Circle(6);
		c2=new Circle(7);
		c3=new Circle(3);
		c4=new Circle(10);
		
		CircleStackImpl impl=new CircleStackImpl(10);
		impl.push(c1);
		impl.push(c2);
		impl.push(c3);
		impl.push(c4);
		impl.push(new Circle(25));
		impl.push(new Circle(30));
		
		System.out.println(impl);
		
		System.out.println(impl.pop());
		
		System.out.println(impl);

	}

}
