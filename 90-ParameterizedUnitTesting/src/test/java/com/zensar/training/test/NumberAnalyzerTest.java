package com.zensar.training.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.zensar.training.bean.NumberAnalyzer;

public class NumberAnalyzerTest {
	NumberAnalyzer analyzer;

	@BeforeEach
	public void f1() {
		this.analyzer = new NumberAnalyzer();
	}

	@Test
	public void test1() {
		boolean expected = true;
		this.analyzer.setNumber(13);
		boolean actual = this.analyzer.isPrimeNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void test2() {
		boolean expected = false;
		this.analyzer.setNumber(27);
		boolean actual = this.analyzer.isPrimeNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void test3() {
		boolean expected = true;
		this.analyzer.setNumber(17);
		boolean actual = this.analyzer.isPrimeNumber();
		assertEquals(expected, actual);
	}

	@AfterEach
	public void f2() {
		analyzer = null;
	}
}
