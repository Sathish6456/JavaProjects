package com.zensar.training.bean;

public interface SalaryCalculator {
	
	
	double computeAllowance(double basicSalary);
	double computeTax(double basicSalary);
	double computeNetSalary(double basicSalary);
}
