package com.zensar.training.bean;

import java.util.Objects;

public class Customer implements Comparable<Customer> {
	
	private String name;
	private double balanceAmount;
	private String city;
	
	public Customer(String name, double balanceAmount, String city) {
		super();
		this.name = name;
		this.balanceAmount = balanceAmount;
		this.city = city;
	}
	public Customer() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalanceAmount() {
		return balanceAmount;
	}
	public void setBalanceAmount(double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Customer))
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "\nCustomer [name=" + name + ", balanceAmount=" + balanceAmount + ", city=" + city + "]";
	}
	@Override
	public int compareTo(Customer o) {
		return this.name.compareTo(o.name);
	}
	
	public boolean isHealthy(double cutoff) {
		if(this.balanceAmount<cutoff)
			return true;
		return false;
	}
	
}
