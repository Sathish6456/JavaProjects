package com.zensar.training.bean;

public class A {
	
	private int x;
	private static int y;
	
	public A(){
		System.out.println("No Argument Constructor");
	}
	
	public A(int x) {
		this();
		System.out.println("1 argument constructor");
		this.x=x;
		
		this.test1();
		test2();
	}
	
	public void test1() {
		System.out.println(x);
		System.out.println(y);
		test3();
		test4();
		new A();
	}
	
	public static void test2() {
		//System.out.println(x);
		System.out.println(y);
		//test3();
		test4();
		new A();
	}
	
	public void test3() {
		System.out.println("test3");
	}

	public static void test4() {
		System.out.println("test4 static ");
	}
}
