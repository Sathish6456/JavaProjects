package com.zensar.training.ui;

import com.zensar.training.bean.Gender;

public class Main {

	public static void main(String[] args) {
		
		int age;
		
		Gender gender=Gender.MALE;
		//gender=Gender.FEMALE;
		
		System.out.println(gender.getAverageHeight());
		System.out.println(gender.getAverageWeight());

	}

}
