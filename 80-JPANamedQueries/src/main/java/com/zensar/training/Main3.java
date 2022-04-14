package com.zensar.training;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.zensar.training.bean.Doctor;
import com.zensar.training.util.JPAUtil;

public class Main3 {
	
	static void test1() {
		EntityManager em=JPAUtil.createEntityManager("PU");
		Query query=em.createNamedQuery("readAll", Doctor.class);
		List doctors=query.getResultList();
		System.out.println(doctors);
		JPAUtil.shutDown();
	}
	
	static void test2() {
		EntityManager em=JPAUtil.createEntityManager("PU");
		TypedQuery<Doctor> query=em.createNamedQuery("readById", Doctor.class);
		query.setParameter(0, 4);
		Doctor doctor=query.getSingleResult();
		System.out.println(doctor);
		JPAUtil.shutDown();
	}

	public static void main(String[] args) {
		//test1();
		test2();

	}

}
 