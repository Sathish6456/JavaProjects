package com.zensar.training;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zensar.training.bean.CarLoan;
import com.zensar.training.bean.HomeLoan;
import com.zensar.training.bean.Loan;
import com.zensar.training.util.HibernateUtil;



public class Main {
	
	static void insert(){
		Loan loan=new Loan();
		loan.setCustomerName("John");
		loan.setLoanAmt(10000);
		loan.setLoanDate(new Date());
		loan.setLoanId(101);
		
		CarLoan carLoan=new CarLoan();
		carLoan.setCustomerName("Akash");
		carLoan.setLoanAmt(60000);
		carLoan.setLoanDate(new Date());
		carLoan.setCarDetails("KL-31 2055");
		carLoan.setRegisteredState("Kerala");
		carLoan.setLoanId(102);
		
		HomeLoan homeLoan=new HomeLoan();
		homeLoan.setCustomerName("Santhosh");
		homeLoan.setLoanAmt(100000);
		homeLoan.setLoanDate(new Date());
		homeLoan.setHomeAddress("F2..Wilson Garden..Bangalore");
		homeLoan.setOwnedBy("Santhosh");
		homeLoan.setLoanId(103);
		
		
		HibernateUtil.init();
		
		Session session=HibernateUtil.getSession();
		
		Transaction tx=session.beginTransaction();
		
		session.save(loan);
		session.save(carLoan);
		session.save(homeLoan);
		
		tx.commit();
		System.out.println("Loan Objects Saved");
		
		HibernateUtil.cleanUp();
		
		
	}

	public static void main(String[] args) {
		
		
		insert();

	}

}
