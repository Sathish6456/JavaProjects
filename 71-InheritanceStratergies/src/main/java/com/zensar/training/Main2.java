package com.zensar.training;

import java.util.Date;

import javax.persistence.EntityManager;

import com.zensar.training.bean.pack2.CarLoan;
import com.zensar.training.bean.pack2.HomeLoan;
import com.zensar.training.bean.pack2.Loan;
import com.zensar.training.util.JPAUtil;



public class Main2 {

		static void insert() {
			
			Loan loan=new Loan();
			loan.setLoanId(1);
			loan.setCustomerName("Sai");
			loan.setLoanAmt(220000.00);
			loan.setLoanDate(new Date());
			
			CarLoan carloan=new CarLoan();
			carloan.setLoanId(2);
			carloan.setCarDetails("Dezire");
			carloan.setCustomerName("Ganesh");
			carloan.setLoanAmt(23099.76);
			carloan.setLoanDate(new Date());
			carloan.setRegisteredState("Andrapradesh");
			
			HomeLoan homeloan=new HomeLoan();
			homeloan.setLoanId(3);
			homeloan.setCustomerName("Pardhu");
			homeloan.setHomeAddress("Guntur");
			homeloan.setLoanAmt(20002323.345);
			homeloan.setLoanDate(new Date());
			homeloan.setOwnedBy("Gopi");
		
			EntityManager em=JPAUtil.createEntityManager("IS");		
			em.getTransaction().begin();
			em.persist(loan);
			em.persist(homeloan);
			em.persist(carloan);;
			em.getTransaction().commit();
			JPAUtil.shutDown();
		}

		public static void main(String[] args) {

			insert();

	}

}
