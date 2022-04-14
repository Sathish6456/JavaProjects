package com.zensar.training.ui;

public class Main2 {

	public static void main(String[] args) {
		String s1="are";
		String s2="Welcome";
		String s3="are";
		
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
		String s4=new String("are");
		System.out.println(s1==s4);
		System.out.println(s1.equals(s4));

	}

}
