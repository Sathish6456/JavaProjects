package com.zensar.training.ui;

import com.zensar.training.bean.SalaryCalculator;

public class Main2 {

	public static void main(String[] args) {
		SalaryCalculator salaryCalculator;
		
		salaryCalculator=new SalaryCalculator() {
			
			@Override
			public double computeTax(double basic) {
				// TODO Auto-generated method stub
				return basic*0.10;
			}
			
			@Override
			public double computeAllowance(double basic) {
				// TODO Auto-generated method stub
				return basic*0.40;
			}
		};
		
		System.out.println(salaryCalculator.computeAllowance(1000));
		System.out.println(salaryCalculator.computeTax(1000));
		
		salaryCalculator=new SalaryCalculator() {
			
			@Override
			public double computeTax(double basic) {
				// TODO Auto-generated method stub
				return 0.06*basic;
			}
			
			@Override
			public double computeAllowance(double basic) {
				// TODO Auto-generated method stub
				return 0.30*basic;
			}
		
		};
		System.out.println(salaryCalculator.computeAllowance(1000));
		System.out.println(salaryCalculator.computeTax(1000));
		
		
		
		
		
		
		

	}

}
