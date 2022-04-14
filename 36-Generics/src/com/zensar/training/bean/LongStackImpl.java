package com.zensar.training.bean;

public class LongStackImpl {
	
	private long[]array;
	private int currentIndex=0;
	
	public LongStackImpl(int n) {
		this.array=new long[n];
	}
	
	public void push(long n) {
		this.array[currentIndex]=n;
		currentIndex++;
	}
	
	public long pop() {
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
