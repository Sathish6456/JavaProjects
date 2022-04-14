package com.zensar.training.bean.pack6;

public class Customer {
	private String name;
	private String city;
	private double balance;
	public Customer(String name, String city, double balance) {
		super();
		this.name = name;
		this.city = city;
		this.balance = balance;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", city=" + city + ", balance=" + balance + "]";
	}
	
	
}
