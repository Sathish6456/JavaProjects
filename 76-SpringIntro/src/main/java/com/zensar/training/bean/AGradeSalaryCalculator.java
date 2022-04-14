package com.zensar.training.bean;

public class AGradeSalaryCalculator implements SalaryCalculator{

	@Override
	public double computeAllowance(double basic) {
		return basic*30;
	}

	@Override
	public double computeTax(double basic) {
		return basic*10;
	}
	

}
