package com.zensar.training.ui;

import java.util.Arrays;
import static java.util.Arrays.sort;
import static java.util.Arrays.binarySearch;

public class Main1 {

	public static void main(String[] args) {
		int[]arr1= {10,20,45,30, 12, 28};
		
		String str=Arrays.toString(arr1);
		System.out.println(str);
		
		sort(arr1);
		
		str=Arrays.toString(arr1);
		System.out.println(str);
		
		System.out.println(binarySearch(arr1, 70));

	}

}
