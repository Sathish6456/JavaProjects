package com.zensar.training;

import java.util.List;

import javax.persistence.EntityManager;

import com.zensar.training.bean.Student;
import com.zensar.training.util.JPAUtil;

public class Main {

	

	private static void insertTesting() {
		Student student = new Student();
		
		student.setName("Suresh");
		student.setMark(0, 97.00);
		student.setMark(1, 98.55);
		student.setMark(2, 66.00);
		
	EntityManager em=JPAUtil.createEntityManager("AP");

		em.getTransaction().begin();
		em.persist(student);
		em.getTransaction().commit();
		
		System.out.println("student object is created");
	}

	private static void loadTesting() {
		
		
	}

	private static void loadAllTesting() {
		


	}

	private static void updateTesting() {

	
	
	}

	private static void deleteTesting() {
		
	}
	
	public static void main(String[] args) {

		insertTesting();
		// loadTesting(2);

		// loadAllTesting();

		// updateTesting(1);
		// deleteTesting(2);

	}

}
