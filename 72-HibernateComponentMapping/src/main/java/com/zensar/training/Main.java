package com.zensar.training;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zensar.training.bean.Address;
import com.zensar.training.bean.Employee;
import com.zensar.training.util.HibernateUtil;


public class Main {

	static void insert(){
		HibernateUtil.init();
		
		Session session=HibernateUtil.getSession();
		
		Transaction tx=session.beginTransaction();
		
		Address address=new Address();
		address.setDoorNumber("F2");
		address.setAreaName("Vincent Colony");
		address.setCityName("Hyderabad");
		
		Employee employee=new Employee(102, "Rahul", 10000.00, address);
		
		session.save(employee);
		
		tx.commit();
		
		HibernateUtil.cleanUp();
	}
	
	
	public static void main(String[] args) {
		insert();
	}
}
