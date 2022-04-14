package com.zensar.training.ui;

public class Main {

	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("abcd");
		
		s1.append(true);
		s1.append("xyz");
		
		s1.delete(3, 5);
		s1.deleteCharAt(1);
		
		s1.insert(4, " apple ");
		
		String str=s1.toString();
		
		System.out.println(s1);
		
		StringBuffer s2=new StringBuffer("zensar");
		System.out.println(s1.equals(s2));
		
		String s3="zensar";
		System.out.println(s2.equals(s3));
		
		s2.reverse();
		System.out.println(s2);
		

	}

}
