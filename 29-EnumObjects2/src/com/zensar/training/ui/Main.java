package com.zensar.training.ui;

import com.zensar.training.bean.Gender;
import com.zensar.training.bean.Scale;

public class Main {

	public static void main(String[] args) {
		Gender gender=Gender.MALE;
		System.out.println(gender.getValue());
		System.out.println(gender.getAverageHeight());
		System.out.println(gender.getAverageWeight());
		
		Scale scale=Scale.FULL;
		System.out.println(scale.getQuantity());
		System.out.println(scale);
		
		Scale[] arr=Scale.values();
		for(Scale s: arr) {
			System.out.println(s);
		}
		// Gender enums should be printed

	}

}
