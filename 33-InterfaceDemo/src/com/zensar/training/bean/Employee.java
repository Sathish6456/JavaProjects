package com.zensar.training.bean;

public class Employee {
	String name;
	double basicSalary;
	char grade;
	
	SalaryCalculator salaryCalculator;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
		if(this.grade=='A')
			this.salaryCalculator=new AGradeSalaryCalculator();
		if(this.grade=='B')
			this.salaryCalculator=new BGradeSalaryCalculator();
		if(this.grade=='C')
			this.salaryCalculator=new CGradeSalaryCalculator();
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", basicSalary=" + basicSalary + ", grade=" + grade + "]";
	}
	
	public double getAllowance() {
		double res=this.salaryCalculator.computeAllowance(basicSalary);
		return res;
	}
	
	public double getDeduction() {
		double res=this.salaryCalculator.computeTax(basicSalary);
		return res;
	}
	
	
	
	
	
	
	
	
	
	
	
}
