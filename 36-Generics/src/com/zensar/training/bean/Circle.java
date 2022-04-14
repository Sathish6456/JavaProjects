package com.zensar.training.bean;

public class Circle implements Comparable{
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

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	public double computeArea() {
		return 3.14*this.radius*this.radius;
	}

	@Override
	public int compareTo(Object o) {
		Circle temp=(Circle) o;
		if(this.radius<temp.radius)
			return -1;
		if(this.radius>temp.radius)
			return 1;
		
		return 0;
	}
}
