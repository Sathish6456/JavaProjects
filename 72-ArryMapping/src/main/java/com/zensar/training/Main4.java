package com.zensar.training;

import java.time.LocalDate;

import javax.persistence.EntityManager;

import com.zensar.training.bean.Bill;
import com.zensar.training.bean.BillItem;
import com.zensar.training.util.JPAUtil;

public class Main4 {

	public static void main(String[] args) {
		
		Bill bill=new Bill();
		bill.setCustomerName("Sathish");
		bill.setBillDate(LocalDate.of(2021, 8, 12));
		
		BillItem billitem1=new BillItem();
		billitem1.setProductname("Pencil");
		billitem1.setPrice(34);
		billitem1.setQuantity(2);
	
		BillItem billitem2=new BillItem();
		billitem2.setProductname("Pen");
		billitem2.setPrice(43);
		billitem2.setQuantity(3);
	
		BillItem billitem3=new BillItem();
		billitem3.setProductname("Sharpner");
		billitem3.setPrice(2);
		billitem3.setQuantity(1);
	
		bill.addBillItem(billitem1);
		bill.addBillItem(billitem2);
		bill.addBillItem(billitem3);

		
		EntityManager em=JPAUtil.createEntityManager("AP");
		
		em.getTransaction().begin();
		em.persist(bill);
		em.getTransaction().commit();
		
		
		
	}
	

}
