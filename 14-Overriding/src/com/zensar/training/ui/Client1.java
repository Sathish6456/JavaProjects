package com.zensar.training.ui;

import com.zensar.training.bean.A;
import com.zensar.training.bean.B;

public class Client1 {

	public static void main(String[] args) {
		A obj1=new A();
		obj1.compute(10);
		
		B obj2=new B();
		obj2.compute(10);
		
		A obj3=new B();
		obj3.compute(10);

	}

}
