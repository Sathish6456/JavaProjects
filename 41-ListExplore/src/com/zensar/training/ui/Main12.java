package com.zensar.training.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.zensar.training.bean.Customer;

public class Main12 {

	public static void main(String[] args) {
		Double obj1=new Double(99.0);
		Double obj2=new Double(40.0);
		Double obj3=new Double(68.71);
		
		Map<String, Double> results=new HashMap<>();
		
		results.put("maximum", obj1);
		results.put("minimum", obj2);
		results.put("average", obj3);
		
		System.out.println(results);
		
		
		
		Customer customer1=new Customer(1011, "Ravi", 1500.00);
		Customer customer2=new Customer(1044, "John", 500.00);
		Customer customer3=new Customer(1010, "Kiran", 3500.00);
		Customer customer4=new Customer(1008, "Manoj", 2500.00);
		Customer customer5=new Customer(1018, "Lalith", 500.00);
		Customer customer6=new Customer(1030, "Arvindh", 1300.00);
		
		List<Customer> bangaloreCustomers=new ArrayList<>();
		bangaloreCustomers.add(customer1);
		bangaloreCustomers.add(customer2);
		
		List<Customer> mumbaiCustomers=new ArrayList<>();
		mumbaiCustomers.add(customer3);
		mumbaiCustomers.add(customer4);
		mumbaiCustomers.add(customer5);
		mumbaiCustomers.add(customer6);
		
		Map<String, List<Customer>> cityMap=new TreeMap<>();
		cityMap.put("Bangalore", bangaloreCustomers);
		cityMap.put("Mumbai", mumbaiCustomers);
		
		System.out.println(cityMap);
		

	}

}


