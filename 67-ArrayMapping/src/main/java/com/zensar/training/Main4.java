package com.zensar.training;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zensar.training.bean.Bill;
import com.zensar.training.bean.BillItem;
import com.zensar.training.util.HibernateUtil;

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
		
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();
		Transaction transaction = session.beginTransaction();

		Integer genId = (Integer) session.save(bill);

		transaction.commit();
		
		HibernateUtil.cleanUp();
	
	
	}

}
