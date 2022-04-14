package com.zensar.training.bean;

public class C {
	
	public void printSum(double a, int... arr) { 
		int sum=0;
		for(int element:arr)
			sum+=element;
		System.out.println(sum);
	}
}
