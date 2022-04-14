package com.zensar.training.bean;

public class BGradeSalaryCalculator implements SalaryCalculator{

	@Override
	public double computeAllowance(double basicSalary) {
		
		return basicSalary*0.30;
	}

	@Override
	public double computeTax(double basicSalary) {
		
		return basicSalary*0.20;
	}

	@Override
	public double computeNetSalary(double basicSalary) {
		
		return basicSalary+this.computeAllowance(basicSalary)-this.computeTax(basicSalary);
	}

}
