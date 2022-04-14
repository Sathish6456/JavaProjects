package com.zensar.training.ui;

import com.zensar.training.bean.CarLoan;
import com.zensar.training.bean.HomeLoan;
import com.zensar.training.bean.Loan;

public class LoanClient {

	public static void main(String[] args) {
		Loan loan;
		
		loan=new CarLoan(300000, 24, "TN-47 1543");
		System.out.println(loan.getInterestAmount());
		
		
		loan=new HomeLoan(300000, 24, "Mumbai");
		System.out.println(loan.getInterestAmount());

	}

}
