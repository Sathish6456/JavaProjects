package com.zensar.training.ui;

import java.util.Arrays;

import com.zensar.training.bean.Customer;
import com.zensar.training.bean.CustomerBalanceComparator;
import com.zensar.training.bean.CustomerIdComparator;
import com.zensar.training.bean.CustomerNameComparator;

public class Main1 {

	public static void main(String[] args) {
		
		Customer customer1=new Customer(101, "John", 2000.00);
		Customer customer2=new Customer(99, "Ravi", 15000.00);
		Customer customer3=new Customer(98, "Kiran", 1700.00);
		Customer customer4=new Customer(93, "Abi", 2100.00);
		
		Customer[] customers= {customer1, customer2, customer3, customer4};
		
		System.out.println(Arrays.toString(customers));
		Arrays.sort(customers);
		System.out.println("-----------------------------------------");
		System.out.println(Arrays.toString(customers));
		
		CustomerIdComparator comparator1=new CustomerIdComparator();
		CustomerBalanceComparator comparator2=new CustomerBalanceComparator();
		CustomerNameComparator comparator3=new CustomerNameComparator();
		
		Arrays.sort(customers,comparator2);
	
		
		System.out.println("-----------------------------------------");
		System.out.println(Arrays.toString(customers));
		
	}
	}


