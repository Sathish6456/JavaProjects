package com.zensar.training.bean;

public class CircleStackImpl {
	private Circle[]array;
	private int currentIndex=0;
	
	public CircleStackImpl(int n) {
		this.array=new Circle[n];
	}
	
	public void push(Circle n) {
		this.array[currentIndex]=n;
		currentIndex++;
	}
	
	public Circle pop() {
		currentIndex--;
		return this.array[currentIndex];
		
	}
	
	@Override
	public String toString() {
		String str="[";
		for(int i=0; i< currentIndex ;i++)
			str=str+this.array[i].toString()+",";
		str=str+"]";
		return str;
	}
}
