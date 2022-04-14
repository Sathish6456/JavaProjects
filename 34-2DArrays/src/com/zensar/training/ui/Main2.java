package com.zensar.training.ui;

import java.util.Arrays;

public class Main2 {

	public static void main(String[] args) {
		int[][]data = {
				{10,20},
				{30,40},
				{50,60}
		};
		
		for(int[] row: data) {
			for(int elementdata: row)
			{
				System.out.print(elementdata+",");
			}
			System.out.println();
		}
		
		for(int[] row: data) {
			System.out.println(Arrays.toString(row));
			
		}
		
		
		
		data=null;

	}

}
