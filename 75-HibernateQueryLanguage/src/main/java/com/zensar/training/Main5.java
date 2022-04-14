package com.zensar.training;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.zensar.training.bean.Doctor;
import com.zensar.training.util.HibernateUtil;

public class Main5 {
	
	static void delete1() {
		String str = "delete from Doctor where id=:id";

		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		Query query=session.createQuery(str);
		query.setParameter("id", 2);
		
		int r=query.executeUpdate();
		
		System.out.println(r);
		HibernateUtil.cleanUp();
		
	}
	static void update1() {
		String str = "update Doctor set fees=:fees where id=:id";

		HibernateUtil.init();
		Session session = HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		Query query=session.createQuery(str);
		query.setParameter("fees", 2500.00);
		query.setParameter("id", 3);

		int r =query.executeUpdate();
		System.out.println(r);
		HibernateUtil.cleanUp();
	}
	public static void main(String[] args) {
		//delete1();
			update1();

	}

}
