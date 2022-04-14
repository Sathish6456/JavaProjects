package com.zensar.training.bean;

public class Customer implements Comparable<Customer>{
	int id;
	String name;
	double balance;
	
	
	
	
	public Customer(int id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}




	@Override
	public int compareTo(Customer o) {
		int res=this.name.compareTo(o.name);
			return res;
	}




	@Override
	public String toString() {
		return "\n Customer [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
	
	
	
	
}
