package com.zensar.training.bean;

public class DoubleStackImpl {
	private double[]array;
	private int currentIndex=0;
	
	public DoubleStackImpl(int n) {
		this.array=new double[n];
	}
	
	public void push(double n) {
		this.array[currentIndex]=n;
		currentIndex++;
	}
	
	public double pop() {
		currentIndex--;
		return this.array[currentIndex];
		
	}
	
	@Override
	public String toString() {
		String str="[";
		for(int i=0; i< currentIndex ;i++)
			str=str+this.array[i]+",";
		str=str+"]";
		return str;
	}
}
