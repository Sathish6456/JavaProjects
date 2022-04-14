package com.zensar.training.ui;

import com.zensar.training.bean.NumberProcessing;

public class Main {

	public static void main(String[] args) {
		NumberProcessing processing;
		processing=new NumberProcessing(10);
		System.out.println(processing.toString());
		
		processing.add(34);
		processing.add(18);
		processing.add(44);
		processing.add(55);
		processing.add(61);
		processing.add(67);
		processing.add(86);
		processing.add(11);
		processing.add(98);
		processing.add(5);
		
		System.out.println(processing.toString());

	}

}
