package com.zensar.training.bean;

import org.springframework.stereotype.Component;

@Component(value="bGradeSalCal")
public class BGradeSalaryCalculator implements SalaryCalculator{

	@Override
	public double computeAllowance(double basic) {
		return basic*30;
	}

	@Override
	public double computeTax(double basic) {
		return basic*10;
	}

}
