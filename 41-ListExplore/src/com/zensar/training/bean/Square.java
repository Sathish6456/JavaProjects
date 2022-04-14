package com.zensar.training.bean;

import java.util.Objects;

public class Square implements Comparable{
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

	public double calculateArea() {
		return this.size*this.size;
	}

	@Override
	public int compareTo(Object o) {
		Square s=(Square)o;
		if(this.size<s.size)
			return -1;
		if(this.size>s.size)
			return 1;
		return 0;
	}
}
