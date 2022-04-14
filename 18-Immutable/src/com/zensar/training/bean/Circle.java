package com.zensar.training.bean;

public class Circle {
	
	private final int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}
	
	public double getArea() {
		return this.radius*this.radius*3.14;
	}
	
	Circle enLarge(int size) {
		Circle temp=new Circle(this.radius+size);
		return temp;
	}

	Circle reduce(int size) {
		Circle temp=new Circle(this.radius-size);
		return temp;
	}
}
