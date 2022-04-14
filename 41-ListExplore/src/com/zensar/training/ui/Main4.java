package com.zensar.training.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main4 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		
		list.add("Welcome");
		list.add("Hello");
		list.add("Zensar");
		list.add("Training");
		list.add("Welcome");
		
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
		// List Specific Methods
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1));
		list.set(1, "Mumbai");
		System.out.println(list.indexOf("Zensar"));
		
		list.add(2, "Chennai");
		
		System.out.println(list);
		
		
		
		
		
		
		
	}

}
