package com.zensar.training.bean;

import java.io.Serializable;
import java.util.Objects;

public class Circle implements Comparable<Circle>, Serializable{
	private int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public Circle() {
		super();
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public int hashCode() {
		return Objects.hash(radius);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Circle))
			return false;
		Circle other = (Circle) obj;
		return radius == other.radius;
	}

	@Override
	public String toString() {
		return "\nCircle [radius=" + radius + "]";
	}

	@Override
	public int compareTo(Circle o) {
		if(this.radius<o.radius)
			return -1;
		if(this.radius>o.radius)
			return 1;
		return 0;
	}
	
	public double computeArea() {
		return 3.14*this.radius*this.radius;
	}
	
	public int getDiameter() {
		return 2*this.radius;
	}
	
	
}
