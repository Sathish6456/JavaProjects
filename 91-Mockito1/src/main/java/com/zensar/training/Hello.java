package com.zensar.training;

public class Hello {

	public void sayHello(String name) {
		System.out.println("Hello" + name + "How are you");
	}
	
	public void printCalculate(int a, double b) {
		System.out.println(a+b);
	}
	
	public void printFactorial(int n) {
		if(n<0)
			throw new IllegalArgumentException("Not a valid value");
		long result=1;
		for(int i=1; i<=n; i++) {
			result=result*i;
		}
		
		System.out.println("Factorial is"+ result);
	}
}
