package com.zensar.training.ui;

import com.zensar.training.bean.DoubleStackImpl;

public class Main3 {

	public static void main(String[] args) {
		byte v1=12;
		short v2=20;
		int v3=90;
		long v4=100;
		char v5='A';
		float v6=170.00f;
		double v7=200.0;
		
		DoubleStackImpl impl=new DoubleStackImpl(10);
		
		impl.push(v1);
		impl.push(v2);
		impl.push(v3);
		impl.push(v4);
		impl.push(v5);
		impl.push(v6);
		impl.push(v7);
		
		System.out.println(impl);
		
	}

}
