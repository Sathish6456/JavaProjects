package com.zensar.training.ui;

import com.zensar.training.bean.Square;

public class Demo {
	void demo1(long a) {
		System.out.println("During Execution of demo1 "+a);
		a++;
		System.out.println("During Execution of demo1 "+a);
	}
	
	 void demo2(int[] elements) {
		elements[0]++;
		elements[1]=elements[1]*2;
		elements[2]=1000;
	}
	
	 static void demo3(Square s) {
		s.setSize(4000);
	}
}
