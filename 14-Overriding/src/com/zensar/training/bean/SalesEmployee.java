package com.zensar.training.bean;

public class SalesEmployee extends Employee{

	public double salesCommission;
	
	@Override
	public double computeNetSalary() {
		System.out.println("Sales Employee Compute Net Salary");
		return this.basicSalary+ this.basicSalary*0.35+salesCommission;
	}
}
