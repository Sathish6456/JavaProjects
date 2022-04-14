package com.zensar.training.bean;

public class Employee {
	
	public double basicSalary;
	
	public Employee(){
		System.out.println("Emp");
	}
	
	public double computeNetSalary() {
		System.out.println("Employee Compute Net Salary");
		return this.basicSalary+ this.basicSalary*0.35;
	}
	
	

}
