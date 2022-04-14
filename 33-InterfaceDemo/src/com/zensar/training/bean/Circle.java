package com.zensar.training.bean;

public class Circle implements Shape{
	private int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double calculateArea() {
		return 3.14*(this.radius*this.radius);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	@Override
	public void setSize(int size) {
		this.setRadius(size);
		
	}

	@Override
	public double getArea() {
		
		return this.calculateArea();
	}

	
	
}
