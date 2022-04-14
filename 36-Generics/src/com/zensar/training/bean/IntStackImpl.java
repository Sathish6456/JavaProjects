package com.zensar.training.bean;

public class IntStackImpl {
	
	private int[]array;
	private int currentIndex=0;
	
	public IntStackImpl(int n) {
		this.array=new int[n];
	}
	
	public void push(int n) {
		this.array[currentIndex]=n;
		currentIndex++;
	}
	
	public int pop() {
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
