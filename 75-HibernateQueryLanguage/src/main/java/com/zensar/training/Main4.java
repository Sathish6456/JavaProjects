package com.zensar.training;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.zensar.training.util.HibernateUtil;

public class Main4 {
	
	static void aggregate1() {
		String str="select sum(fees) from Doctor";

		HibernateUtil.init();
		Session session=HibernateUtil.getSession();

		Query<Double> query=session.createQuery(str);
		Double totalFees=query.getSingleResult();

		System.out.println("TOTAL FEES :"+ totalFees);

		HibernateUtil.cleanUp();
	}
	
	static void aggregate2() {
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		String HQL="select avg(fees) from Doctor";
		Query<Double> query=session.createQuery(HQL);
		Double avgFees=query.getSingleResult();
		System.out.println(avgFees);
		HibernateUtil.cleanUp();
		
	}
	
	static void aggregate3() {
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		String HQL="select count(fees) from Doctor";
		Query<Long> query=session.createQuery(HQL);
		Long feeCount=query.getSingleResult();
		System.out.println(feeCount);
		HibernateUtil.cleanUp();
	}
	

	public static void main(String[] args) {
		//aggregate1();
		//aggregate2();
			aggregate3();
	
	}

}
