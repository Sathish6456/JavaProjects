package com.zensar.training;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorServiceTest {
	
	@Mock
	CalculatorService calculatorService;
	
	@BeforeEach
	public void init() {
		 //calculatorService=Mockito.mock(CalculatorService.class);
	}

	@Test
	public void f1() {
		
		
		
		Mockito.when(calculatorService.add(10,20)).thenReturn(30);
		assertEquals(30, calculatorService.add(10,20));
	}
	
	@Test
	public void f2() {
	
		
		Mockito.when(calculatorService.substract(3,2)).thenReturn(1);
		
		int actualResult=calculatorService.substract(3,2);
		int expectedResult=1;
		
		assertEquals(expectedResult, actualResult);

	}
	
	@Test
	public void f3() {
		
		
		Mockito.when(calculatorService.product(5,6)).thenReturn(30);
		
		int actualResult=calculatorService.product(5, 6);
		int expectedResult=30;
		
		assertEquals(expectedResult, actualResult);
	}
	
	@AfterEach
	public void destroy() {
		//calculatorService=null;
	}
	
}
