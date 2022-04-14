package com.zensar.training.bean;

public class A {
	
	static void m1(boolean a) {
		
	}
	
static void m1(boolean a, int c) {
		
	}
	public void m1(double a) {}
	
	protected void m1(int a) {
		System.out.println("A class m1 with 1 parameter "+a);
	}
	
	public void m1(int a, int b) {
		System.out.println("A class m1 with 2 parameter "+a+","+b);
	}
	
	public void m1(byte a) {
		System.out.println("A class m1 with 1 byte parameter "+a);
	}
	
	public void m1(float f, boolean b) {
		
	}
	
	public int  m1(boolean f, float b) {
		return 0;
	}
	
}