package com.zensar.training.bean;

public class Manager extends Employee{
	public double incentive;
	
	public Manager(){
		System.out.println("Manager");
	}
	
	@Override
	public double computeNetSalary() {
		System.out.println("Manager Compute Net Salary");
		return this.basicSalary+this.basicSalary*0.35+incentive;
	}
	
	
	
	
}
