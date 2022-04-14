package com.zensar.training.ui;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.zensar.training.bean.Customer;
import com.zensar.training.bean.CustomerBalanceComparator;
import com.zensar.training.bean.CustomerIdComparator;

public class Main9 {

	public static void main(String[] args) {
		
		//CustomerBalanceComparator balanceComparator=new CustomerBalanceComparator();
		
		CustomerIdComparator customerIdComparator=new CustomerIdComparator();
		Set<Customer> customers=new TreeSet<>(customerIdComparator);
		
		Customer customer1=new Customer(1011, "Ravi", 1500.00);
		Customer customer2=new Customer(1044, "John", 500.00);
		Customer customer3=new Customer(1010, "Kiran", 3500.00);
		Customer customer4=new Customer(1008, "Manoj", 2500.00);
		Customer customer5=new Customer();
		customer5.setId(1044);
		
		System.out.println(customers.add(customer1));
		System.out.println(customers.add(customer2));
		System.out.println(customers.add(customer3));
		System.out.println(customers.add(customer4));
		//System.out.println(customers.add(customer5));
		
		System.out.println(customers);

	}

}
