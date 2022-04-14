package com.zensar.training;

import java.util.List;



import com.zensar.training.bean.Product;

public class Main2 {

	

	private static void insertTesting() {
		Product product = new Product();
		product.setId(1);
		product.setName("Shirt");
		product.setDiscount(0, 10);
		
	
	}

	private static void loadTesting(int id) {
		
	}

	private static void loadAllTesting() {
		

	}

	private static void updateTesting(int id) {


	}

	private static void deleteTesting(int id) {
		
	}
	
	public static void main(String[] args) {

		insertTesting();
		// loadTesting(2);

		// loadAllTesting();

		// updateTesting(1);
		// deleteTesting(2);

	}

}
