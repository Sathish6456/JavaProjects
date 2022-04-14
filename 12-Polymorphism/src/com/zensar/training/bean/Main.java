package com.zensar.training.bean;

public class Main {

	public static void main(String[] args) {
		A obj=new A();
		obj.m1(10);
		obj.m1(10,20);
		
		byte b1=100;
		short b2=200;
		obj.m1(b1, b2);
		
		int x=100;
		int y=200;
		obj.m1(x,y);
		
		byte b3=100;
		obj.m1(b3);
		obj.m1(80);
		

	}

}
