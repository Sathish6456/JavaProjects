package com.zensar.training.ui;

import com.zensar.training.bean.Customer;

public class Main4 {

	public static void main(String[] args){
		Customer customer=null;
		try {
			customer = new Customer(1,"John", -1000);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		System.out.println(customer);
	}

}
