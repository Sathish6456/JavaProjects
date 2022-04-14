package com.zensar.training.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main1 {

	public static void main(String[] args) {
		Collection<String> collection;
		collection=new ArrayList<String>();
		
		collection.add("Welcome");
		collection.add("Hello");
		collection.add("Zensar");
		collection.add("Training");
		collection.add("Welcome");
		System.out.println(collection);
		
		collection.remove("Hello");
		System.out.println(collection);
		
		System.out.println(collection.size());
		System.out.println(collection.contains("Zensar"));
		System.out.println(collection.contains("Hello"));
		System.out.println(collection.isEmpty());
		
		//collection.clear();
		
		Iterator<String> it=collection.iterator();
		while(it.hasNext()) {
			String str=it.next();
			System.out.println(str.toUpperCase());
		}
		
		//modern way for each loop
		for(String str:collection) {
			System.out.println(str.toLowerCase());
		}
	
		System.out.println(collection.isEmpty());
		System.out.println(collection.size());
		
	}

}
