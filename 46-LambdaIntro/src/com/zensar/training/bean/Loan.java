package com.zensar.training.bean;

abstract public class Loan {
	
	double amount;
	int duration;
	
	public abstract double getInterestRate();

}
