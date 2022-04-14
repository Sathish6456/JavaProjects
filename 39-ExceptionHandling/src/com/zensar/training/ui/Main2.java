package com.zensar.training.ui;

public class Main2 {

	public static void main(String[] args) {
		System.out.println("Program Begins....");

		int[] arr = { 10, 20, 30 };
		String str = "124";
		try {
			System.out.println(arr[0]);
			int x = Integer.parseInt(str);
			x++;
			System.out.println(x);
			System.out.println(12/0);
			String s=null;
			System.out.println(s.toUpperCase());
		} 
		
		catch(ArithmeticException e) {
			System.out.println("Some Arithmetic error occured");
		}
		catch(NumberFormatException e) {
			System.out.println("Invalid Data for conversion");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Accessing invalid Array element");
		}catch (Throwable  e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("finally runs always");
		}
		
		

		System.out.println("Program Ends....");

	}

}
