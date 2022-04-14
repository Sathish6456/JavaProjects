package com.zensar.training.ui;

public class Main1 {

	public static void main(String[] args) {
		
		int[][] data;
		data=new int[3][2];
		
		for(int i=0; i< data.length; i++) {
			
			for(int j=0; j<data[i].length; j++)
			{
				System.out.print(data[i][j]+",");
			}
			
			System.out.println();
		}
		
		data[0][0]=90;
		data[0][1]=80;
		
		data[1][0]=66;
		data[1][1]=71;
		
		data[2][0]=40;
		data[2][1]=50;
		
		for(int i=0; i< data.length; i++) {
			
			for(int j=0; j<data[i].length; j++)
			{
				System.out.print(data[i][j]+",");
			}
			
			System.out.println();
		}
		
		data=null;

	}

}
