package com.zensar.training;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class HelloTester {
	
	@Test
	public void f1() {
	Hello mockedHello=Mockito.mock(Hello.class);
	
	Mockito.doNothing().when(mockedHello).sayHello("Sathish");

	mockedHello.sayHello("Sathish");
}
	@Test
	public void f2() {
		Hello mockedHello=Mockito.mock(Hello.class);
		Mockito.doCallRealMethod().when(mockedHello).sayHello("Sathish");
		mockedHello.sayHello("Sathish");
	}
	
	@Test
	public void f3() {
		Hello mockedHello=Mockito.mock(Hello.class);
		Mockito.doAnswer((invocation)->{
			String param=invocation.getArgument(0);
			System.out.println(param);
			return null;
		}).when(mockedHello).sayHello(Mockito.anyString());
		mockedHello.sayHello("Sathish");
	}
	@Test
	public void f4() {
		Hello mockedHello=Mockito.mock(Hello.class);
		Mockito.doAnswer((invocation)->{
			 int a=invocation.getArgument(0);
			 double b=invocation.getArgument(1);
			 System.out.println(a);
			 System.out.println(b);
			 return invocation.callRealMethod();

		}).when(mockedHello).printCalculate(Mockito.anyInt(),Mockito.anyDouble());
		mockedHello.printCalculate(10, 20);
	}
	
	@Test
	public void f5() {
		Hello mockedHello=Mockito.mock(Hello.class);
		Mockito.doAnswer((invocation)->{
			 int n=invocation.getArgument(0);
			 System.out.println(n);
			 invocation.callRealMethod();
			return null;
		}).when(mockedHello).printFactorial(5);
		
		mockedHello.printFactorial(5);
	}
	@Test(expected=IllegalArgumentException.class)
	public void f6() {
		Hello mockedHello=Mockito.mock(Hello.class);
		Mockito.doThrow(IllegalArgumentException.class).when(mockedHello).printFactorial(-5);
		//Mockito.doCallRealMethod().when(mockedHello).printFactorial(-5);
		mockedHello.printFactorial(-5);
}
	@Test
	public void f7() {
		Hello mockedHello=Mockito.mock(Hello.class);
		//mockedHello.sayHello("Sathish");
		//mockedHello.sayHello("Ravi");
		
		//Mockito.verify(mockedHello,Mockito.times(2).sayHello(Mockito.anyString()));
		Mockito.verify(mockedHello, Mockito.never()).sayHello(Mockito.anyString());
	}
	
}