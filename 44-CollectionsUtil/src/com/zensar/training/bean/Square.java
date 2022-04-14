package com.zensar.training.bean;

import java.util.Objects;

public class Square {
	private int size;

	public Square(int size) {
		super();
		this.size = size;
	}

	public Square() {
		super();
		
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public int hashCode() {
		return Objects.hash(size);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Square))
			return false;
		Square other = (Square) obj;
		return size == other.size;
	}

	@Override
	public String toString() {
		return "\nSquare [size=" + size + "]";
	}
	
	public int calculateArea() {
		return this.size*this.size;
	}
}
