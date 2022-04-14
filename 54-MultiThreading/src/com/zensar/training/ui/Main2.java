package com.zensar.training.ui;

public class Main2 {

	public static void main(String[] args) throws InterruptedException {
		Thread t1=new CityPrintingThread(); //new
		t1.start();                         // runnable
		
		
		//t1.join();
		for(int i=1;i<=25;i++) {
			System.out.println(i);
		} // current running thread main
		
		// t1-> running
		System.out.println(t1.isAlive());
	}

}
