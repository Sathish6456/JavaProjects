package com.zensar.training.bean;

public class B extends A{

	@Override
	public int demo1() {
		return 1;
	}
	
	@Override
	public Car demo2() {
		return new Car();
	}
}
