package com.zensar.training.bean;

public class Manager extends Employee{
	
	private double houseRentAllowance;

	public Manager(String name, double salary, double houseRentAllowance) {
		super(name, salary);
		this.houseRentAllowance = houseRentAllowance;
	}

	public Manager() {
		super();
	}
	
	
	

}
