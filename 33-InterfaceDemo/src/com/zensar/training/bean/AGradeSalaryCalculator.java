package com.zensar.training.bean;

public class AGradeSalaryCalculator implements SalaryCalculator{

	@Override
	public double computeAllowance(double basicSalary) {
		Calculator calculator=new Calculator();
		return calculator.multiply(basicSalary, 0.40);
	}

	@Override
	public double computeTax(double basicSalary) {
		Calculator calculator=new Calculator();
		return calculator.multiply(basicSalary, 0.25);
	}

	@Override
	public double computeNetSalary(double basicSalary) {
		Calculator calculator=new Calculator();
		double sum=calculator.add(basicSalary, this.computeAllowance(basicSalary));
		double res=calculator.subtract(sum, this.computeTax(basicSalary));
		return res;
	}

}
