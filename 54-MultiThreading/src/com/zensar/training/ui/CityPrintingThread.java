package com.zensar.training.ui;

public class CityPrintingThread extends Thread{
	
	@Override
	public void run() {
		String []cityNames= {"Mumbai","Delhi","Kolkata"};
		for(String city:cityNames) {
			
			System.out.println(Thread.currentThread().getName()+" "+ city);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
