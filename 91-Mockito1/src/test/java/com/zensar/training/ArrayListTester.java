package com.zensar.training;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

public class ArrayListTester {

	@Test
	public void test1() {
		List<String> mockedList=Mockito.mock(ArrayList.class);
		mockedList.add("One");
		mockedList.add("Two");
		
		Mockito.when(mockedList.size()).thenReturn(2);
		assertEquals(2, mockedList.size());
	}
	
	@Test
	public void test2() {
		List spyList=Mockito.spy(ArrayList.class);
		
		spyList.add("One");
		spyList.add("Two");
		Mockito.verify(spyList).add("One");
		
		assertEquals(1, spyList.size());
	}
}
