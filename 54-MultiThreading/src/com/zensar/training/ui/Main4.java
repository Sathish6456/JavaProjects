package com.zensar.training.ui;

public class Main4 {

	public static void main(String[] args) throws InterruptedException {
		Runnable countryPrintingRunnable;
		countryPrintingRunnable=()->{
			String countries[]= {"India", "German","France","USA"};
			for(String country:countries) {
				Thread temp=Thread.currentThread();
				String name=temp.getName();
				System.out.println("\t\t" + name +" : "+ country);
			}
		};
		
		Thread t1=new Thread(countryPrintingRunnable);
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		
		Thread t2=new Thread(
				()->{
					String countries[]= {"India", "German","France","USA"};
					for(String country:countries) {
						Thread temp=Thread.currentThread();
						String name=temp.getName();
						System.out.println("\t\t" + name +" : "+ country);
					}	
				});
		
		t2.setPriority(3);
		t2.start();

	}

}
