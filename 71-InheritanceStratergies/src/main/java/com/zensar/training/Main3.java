package com.zensar.training;

import java.util.Date;

import javax.persistence.EntityManager;

import com.zensar.training.bean.pack3.CarLoan;
import com.zensar.training.bean.pack3.HomeLoan;
import com.zensar.training.bean.pack3.Loan;
import com.zensar.training.util.JPAUtil;

public class Main3 {

	static void insert() {
		
		Loan loan=new Loan();
		
		loan.setCustomerName("Narendra");
		loan.setLoanAmt(220000.00);
		loan.setLoanDate(new Date());
		
		CarLoan carloan=new CarLoan();
		
		carloan.setCarDetails("Alto");
		carloan.setCustomerName("Ravi");
		carloan.setLoanAmt(23099.76);
		carloan.setLoanDate(new Date());
		carloan.setRegisteredState("Andrapradesh");
		
		HomeLoan homeloan=new HomeLoan();
		
		homeloan.setCustomerName("Shiva");
		homeloan.setHomeAddress("Kodur");
		homeloan.setLoanAmt(20002323.345);
		homeloan.setLoanDate(new Date());
		homeloan.setOwnedBy("Dharma");
	
		EntityManager em=JPAUtil.createEntityManager("IS");		
		em.getTransaction().begin();
		
		em.persist(loan);
		em.persist(homeloan);
		em.persist(carloan);
		
		em.getTransaction().commit();
		JPAUtil.shutDown();
	}

	public static void main(String[] args) {

		insert();

}

}
