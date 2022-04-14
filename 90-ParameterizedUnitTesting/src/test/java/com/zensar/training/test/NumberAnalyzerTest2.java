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
public class NumberAnalyzerTest2 {

	private int inputNumber;
	private boolean expectedResult;

	private NumberAnalyzer analyzer;

	public NumberAnalyzerTest2(int inputNumber, boolean expectedResult) {
		super();
		this.inputNumber = inputNumber;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection testData() {
		Object[][] data = { 
				{ 13, true }, 
				{ 17, true }, 
				{ 27, false }, 
				{ 28, false } 
			};
		return Arrays.asList(data);
	}

	@Before
	public void init() {
		this.analyzer = new NumberAnalyzer();
	}

	@Test
	public void f2() {
		this.analyzer.setNumber(this.inputNumber);
		assertEquals(this.expectedResult, this.analyzer.isPrimeNumber());
	}

	@After
	public void destroy() {
		this.analyzer = null;
	}

}
