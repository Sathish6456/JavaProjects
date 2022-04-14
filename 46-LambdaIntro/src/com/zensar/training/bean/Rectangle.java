package com.zensar.training.bean;

import java.util.Objects;

public class Rectangle {
	private int height;
	private int width;
	public Rectangle(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}
	public Rectangle() {
		super();
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	@Override
	public int hashCode() {
		return Objects.hash(height, width);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Rectangle))
			return false;
		Rectangle other = (Rectangle) obj;
		return height == other.height && width == other.width;
	}
	@Override
	public String toString() {
		return "\nRectangle [height=" + height + ", width=" + width + "]";
	}
	
	public int getArea() {
		return this.height*this.width;
	}
}
