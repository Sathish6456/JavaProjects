package com.zensar.training;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.zensar.training.bean.SimpleCalculator;

public class SimpleCalculatorTest {

	@Test
	public void testingAddFunction() {
		SimpleCalculator sc=new SimpleCalculator();
		int expectedResult=30;
		int actual=sc.add(10,20);
		assertEquals(expectedResult, actual);
		sc=null;
	}
	
	@Test
	public void testingMultiply() {
		SimpleCalculator sc=new SimpleCalculator();
		int expectedResult=30;
		int actual=sc.multiply(5,6);
		assertEquals(expectedResult, actual);	
		sc=null;
	}
	
	@Test
	public void testingSubtract() {
		SimpleCalculator sc=new SimpleCalculator();
		int expectedResult=30;
		int actual=sc.subtract(40,10);
		assertEquals(expectedResult, actual);	
		sc=null;
	}
	
	@Test
	public void testingDivide() {
		SimpleCalculator sc=new SimpleCalculator();
		int expectedResult=10;
		int actual=sc.divide(50,5);
		assertEquals(expectedResult, actual);	
		sc=null;
	}
	
}