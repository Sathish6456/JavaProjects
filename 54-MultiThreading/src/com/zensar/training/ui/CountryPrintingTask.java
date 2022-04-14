package com.zensar.training.ui;

public class CountryPrintingTask implements Runnable {

	@Override
	public void run() {
		String countries[]= {"India", "German","France","USA"};
		for(String country:countries) {
			Thread temp=Thread.currentThread();
			String name=temp.getName();
			System.out.println("\t\t" + name +" : "+ country);
		}
	}

}
