package com.zensar.training.ui;

import java.util.LinkedList;
import java.util.List;

public class Main3 {

	public static void main(String[] args) {
		List<String> names=new LinkedList<>();
		names.add("david");
		names.add("john");
		names.add("meena");
		
		names.stream().map(String::toUpperCase).forEach((s)->System.out.println(s));
		//method reference for a methods in  arbitrary objects of particular type 
		

	}

}
