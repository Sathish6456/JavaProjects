package com.zensar.training.bean;

public class D {

	public static void main(String[] args) {
		C obj=new C();
		int[] ages= {24, 21, 56, 33,67,77, 87};
		obj.printSum(ages);
		
		obj.printSum(new int[] {1,2,3});
		obj.printSum(new int[] {});
		
		obj.printSum(12,22);
		obj.printSum(12,22,33,44,55);
		obj.printSum();
	}

}
