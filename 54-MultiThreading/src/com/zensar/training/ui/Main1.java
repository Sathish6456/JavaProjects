package com.zensar.training.ui;

public class Main1 {
	public static void main(String[] args) throws InterruptedException {
		Thread t=Thread.currentThread();
		
		Thread t1=new CityPrintingThread();
		t1.setName("City Printing Thread");
		t1.start();
		
		CountryPrintingTask countryPrintingTask=new CountryPrintingTask();
		Thread t2=new Thread(countryPrintingTask);
		t2.setName("Country PT");
		t2.start();
		
		
		
		System.out.println("Program Begins");
		for(int i=1;i<=10; i++) {
			System.out.println(t.getName()+" : "+i);
			t.sleep(2000);
		}
		System.out.println("Program Ends");
	}
}
