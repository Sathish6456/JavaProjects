package com.zensar.training.ui;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main8 {

	public static void main(String[] args) {
		Set<String> myset=new HashSet<>();
		
		myset.add("Welcome");
		myset.add("Zensar");
		myset.add("Training");
		myset.add("Mumbai");
		myset.add("Welcome");
		
		System.out.println(myset);
		//System.out.println(myset.size());
		//System.out.println(myset.contains("Welcome"));
		//System.out.println(myset.isEmpty());
		//myset.remove("Mumbai");
		//myset.clear();
		System.out.println(myset.isEmpty());
		
		/*Iterator<String> it=myset.iterator();
		while(it.hasNext()) {
			String str=it.next();
			System.out.println(str.toUpperCase());
		}

		for(String str:myset) {
			System.out.println(str.toLowerCase());
		}*/
	}

}
