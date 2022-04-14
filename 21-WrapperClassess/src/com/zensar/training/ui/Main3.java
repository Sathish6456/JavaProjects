package com.zensar.training.ui;

public class Main3 {

	public static void main(String[] args) {
		Number number;
		number=new Integer(250);
		System.out.println(number.doubleValue());
		System.out.println(number.floatValue());
		
		number=new Byte((byte)20);
		System.out.println(number.doubleValue());
		System.out.println(number.floatValue());
		
	}

}
