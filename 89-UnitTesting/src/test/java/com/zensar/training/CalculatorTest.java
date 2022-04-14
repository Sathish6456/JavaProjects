package com.zensar.training;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.zensar.training.bean.Calculator;

public class CalculatorTest {
	Calculator calculator;

	@BeforeEach
	public void init() {
		calculator = new Calculator();
		System.out.println(".....init before test.......");
	}

	@Test
	public void addTestWithPositiveNumbers() {
		calculator.setNumber1(10);
		calculator.setNumber2(20);
		int expected = 30;
		int actual = calculator.sum();
		assertEquals(expected, actual);
	}

	@Test
	public void differenceTestingWithPositiveNumbers() {
		calculator.setNumber1(20);
		calculator.setNumber2(20);
		int expected = 0;
		int actual = calculator.difference();
		assertEquals(expected, actual);
	}

	@Test
	public void differenceTestingWithNegatvieNumbers() {
		calculator.setNumber1(20);
		calculator.setNumber2(30);
		int expected = -10;
		int actual = calculator.difference();
		assertEquals(expected, actual);
	}

	@Test
	public void addTestingWithNegativeNumbers() {
		calculator.setNumber1(-20);
		calculator.setNumber2(-10);
		int expected = -10;
		int actual = calculator.difference();
		assertEquals(expected, actual);
	}

	@Test
	public void productTestWithPositiveNumbers() {
		calculator.setNumber1(10);
		calculator.setNumber2(20);
		int expected = 200;
		int actual = calculator.product();
		assertEquals(expected, actual);
	}

	@Test
	public void productTestWithNegativeNumbers() {
		calculator.setNumber1(-10);
		calculator.setNumber2(20);
		int expected = -200;
		int actual = calculator.product();
		assertEquals(expected, actual);
	}

	@Test
	public void divideTestWithPositiveNumbers() {
		calculator.setNumber1(20);
		calculator.setNumber2(20);
		int expected = 1;
		int actual = calculator.divide();
		assertEquals(expected, actual);
	}

	@Test
	public void divideTestWithNegativeNumbers() {
		calculator.setNumber1(-200);
		calculator.setNumber2(20);
		int expected = -10;
		int actual = calculator.divide();
		assertEquals(expected, actual);
	}

	@AfterEach
	public void destroy() {
		calculator=null;
		System.out.println(".....init after test.......");
	}
}
