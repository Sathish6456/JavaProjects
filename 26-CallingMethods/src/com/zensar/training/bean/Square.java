package com.zensar.training.bean;

public class Square {
	private int size;

	public Square(int size) {
		super();
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Square [size=" + size + "]";
	}
	
	
}
