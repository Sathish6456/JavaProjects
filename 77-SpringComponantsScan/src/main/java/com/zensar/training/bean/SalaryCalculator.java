package com.zensar.training.bean;

import org.springframework.stereotype.Component;

@Component
public interface SalaryCalculator {
			double computeAllowance(double basic);
			double  computeTax(double basic);
}
