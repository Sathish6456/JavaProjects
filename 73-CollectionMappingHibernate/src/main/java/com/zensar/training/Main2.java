package com.zensar.training;

import java.util.Set;
import java.util.TreeSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.zensar.training.bean.pack2.Country;
import com.zensar.training.util.HibernateUtil;



public class Main2 {

	private static void insertTesting() {
		
		
		Country country=new Country();
		country.setCountryName("INDIA");
		Set<String> cityNames=new TreeSet<String>();
		cityNames.add("Delhi");
		cityNames.add("Mumbai");
		cityNames.add("Chennai");
		
		country.setCityNames(cityNames);
		HibernateUtil.init();
		
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		
		session.save(country);
		tx.commit();
		HibernateUtil.cleanUp();
		
		System.out.println("\t\t !>>>>>>>>>>> Country Data Saved <<<<<<<<<<<<<<!");
	}

	private static void loadTesting() {
		
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		
		HibernateUtil.cleanUp();


	}

	private static void editTesting() {
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		
		HibernateUtil.cleanUp();


	}

	private static void deleteTesting() {
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		
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
