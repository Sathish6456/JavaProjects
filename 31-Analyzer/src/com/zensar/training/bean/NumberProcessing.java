package com.zensar.training.bean;

import java.util.Arrays;

public class NumberProcessing {
	
	private int[] array;
	private int currentIndex=0;
	
	public NumberProcessing(int n) {
		this.array=new int[n];
	}
	
	public void add(int numberdata) {
		this.array[this.currentIndex]=numberdata;
		this.currentIndex++;
	}
	
	public int getMaximum() {
		return 0;// logic to find maximum
	}
	
	public int getMinimum() {
		return 0; // logic to find minimum
	}
	
	public int getSum() {
		return 0; // logic to find sum
	}
	
	@Override
	public String toString() {
		return Arrays.toString(this.array);
	}
	
}
