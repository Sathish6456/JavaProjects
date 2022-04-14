package com.zensar.training.bean;

public class Square implements Shape{
	private int size;

	public Square(int size) {
		super();
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	@Override
	public void setSize(int size) {
		this.size = size;
	}
	
	public double computeArea() {
		return this.size*this.size;
	}

	@Override
	public double getArea() {
		
		return this.computeArea();
	}
	

}
