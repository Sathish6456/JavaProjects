package com.zensar.training;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.zensar.training.bean.pack3.Department;
import com.zensar.training.bean.pack3.Employee;
import com.zensar.training.bean.pack3.Gender;
import com.zensar.training.util.HibernateUtil;



public class Main3 {

	private static void insertTesting() {
		
		Department department=new Department(101, "HR");
		department.addEmployee(new Employee("Rashmi", 'A', Gender.FEMALE));
		department.addEmployee(new Employee("Anitha", 'B', Gender.FEMALE));
		department.addEmployee(new Employee("Udhay", 'A', Gender.MALE));
		
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		session.save(department);
		tx.commit();
		
		HibernateUtil.cleanUp();
		
		System.out.println("\t\t !>>>>>>>>>>> Department Saved <<<<<<<<<<<<<<!");
	}

	private static void loadTesting() {
		
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		
		HibernateUtil.cleanUp();


	}

	private static void editTesting() {
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		
		
		tx.commit();
		HibernateUtil.cleanUp();

	}

	private static void deleteTesting() {
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		
		
		tx.commit();
		HibernateUtil.cleanUp();

	}

	private static void loadAllTesting() {

		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		
		HibernateUtil.cleanUp();

	}

	public static void main(String[] args) {
		insertTesting();

	}

}
