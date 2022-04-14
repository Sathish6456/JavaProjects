package com.zensar.training.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.zensar.training.bean.NumberAnalyzer;

@RunWith(Parameterized.class)
public class NumberAnalyzerTest3 {
	@Parameterized.Parameters
	public static Collection testData() {
		Object[][] data = { 
				{ 12, false }, 
				{ 11, true }, 
				{ 20, false }, 
				{ 30, false } 
			};
		return Arrays.asList(data);
	}
	
	int inputNumber;
	boolean expectedValue;
	NumberAnalyzer analyzer;
	
	public NumberAnalyzerTest3(int inputNumber, boolean expectedValue) {
		super();
		this.inputNumber = inputNumber;
		this.expectedValue = expectedValue;
		
	}
	@Before
	public void f1() {
		this.analyzer=new NumberAnalyzer();
	}
	
	
	@Test
	public void test() {
		this.analyzer.setNumber(inputNumber);
		assertEquals(expectedValue, this.analyzer.isOdd());
	}	
	
	@After
	public void destroy() {
		this.analyzer=null;
	}
}
