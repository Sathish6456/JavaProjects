package com.zensar.training;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.zensar.training.bean.Doctor;
import com.zensar.training.util.HibernateUtil;

public class Main3 {
	
	static void read1() {
		String str = "select d from Doctor d where d.gender='MALE'";

		HibernateUtil.init();
		Session session=HibernateUtil.getSession();

		Query<Doctor> query=session.createQuery(str, Doctor.class);
		List<Doctor> maleDoctors=query.getResultList();
		System.out.println(maleDoctors);

		HibernateUtil.cleanUp();
	}
	
	
	static void read2() {
		String str = "select d from Doctor d order by d.fees";

		HibernateUtil.init();
		Session session=HibernateUtil.getSession();

		Query<Doctor> query=session.createQuery(str, Doctor.class);
		List<Doctor> doctors=query.getResultList();
		System.out.println(doctors);

		HibernateUtil.cleanUp();
	}

	static void read3() {
		String str = "select d from Doctor d where d.id=:docId";

		HibernateUtil.init();
		Session session=HibernateUtil.getSession();

		Query<Doctor> query=session.createQuery(str, Doctor.class);

		query.setParameter("docId", 1);

		Doctor doctor=query.getSingleResult();
		System.out.println(doctor);

		HibernateUtil.cleanUp();



	}
	
	static void read4() {
		String str = "select d from Doctor d where d.gender=:gen and d.fees>:cutoff";



		HibernateUtil.init();
		Session session=HibernateUtil.getSession();

		Query<Doctor> query=session.createQuery(str, Doctor.class);
		query.setParameter("gen", "FEMALE");
		query.setParameter("cutoff", 500.00);

		List<Doctor> doctors=query.getResultList();
		System.out.println(doctors);

		HibernateUtil.cleanUp();
	}
	public static void main(String[] args) {
		read1();
		//read2();
		//read3();
		//read4();

	}

}
