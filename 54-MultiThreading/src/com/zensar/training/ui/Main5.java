package com.zensar.training.ui;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
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
		t1.start();
		
		int age=10;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your age : ");
		age=scanner.nextInt();
		
		System.out.println(age);

	}

}
