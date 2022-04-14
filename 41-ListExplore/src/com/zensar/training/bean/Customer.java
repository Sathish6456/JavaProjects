package com.zensar.training.bean;

import java.util.Objects;

public class Customer implements Comparable<Customer>{
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Customer))
			return false;
		Customer other = (Customer) obj;
		return id == other.id;
	}




	int id;
	String name;
	double balance;
	
	
	
	
	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public double getBalance() {
		return balance;
	}




	public void setBalance(double balance) {
		this.balance = balance;
	}




	public Customer() {
		super();
	}




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
