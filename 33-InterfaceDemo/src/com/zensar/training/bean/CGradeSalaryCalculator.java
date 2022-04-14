package com.zensar.training.bean;

public class CGradeSalaryCalculator implements SalaryCalculator{

	@Override
	public double computeAllowance(double basicSalary) {
		return basicSalary*0.18;
	}

	@Override
	public double computeTax(double basicSalary) {
		return basicSalary*0.08;
	}

	@Override
	public double computeNetSalary(double basicSalary) {
		
		return basicSalary+this.computeAllowance(basicSalary)-this.computeTax(basicSalary);
	}

}
