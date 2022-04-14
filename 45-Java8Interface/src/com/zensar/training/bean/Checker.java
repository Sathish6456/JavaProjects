package com.zensar.training.bean;

public interface Checker {
	public static void checkInit() {
		System.out.println("Initializing");
	}
	
	default public void check(int i) {
		System.out.println(i);
	}
	
	public void greet(String s);
}
