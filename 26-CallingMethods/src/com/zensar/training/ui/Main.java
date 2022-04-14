package com.zensar.training.ui;

import java.util.Arrays;

import com.zensar.training.bean.Square;

public class Main {
	
	 
	

	public static void main(String[] args) {
		Demo obj=new Demo();
		
		
		long a=80L;
		System.out.println("Before Invocation " + a);
		obj.demo1(a);
		
		System.out.println("After Invocation " + a);
		System.out.println("-----------------------------------------");
		
		int[] arr=new int[] {1,2,3};
		System.out.println("Before Invocation "+ Arrays.toString(arr));
		obj.demo2(arr);
		System.out.println("After Invocation "+ Arrays.toString(arr));
		System.out.println("--------------------------------------------");
		
		Square square=new Square(5);
		System.out.println("Before Invocation "+ square);
		Demo.demo3(square);
		System.out.println("After Invocation "+ square);
		
		
	}

}
