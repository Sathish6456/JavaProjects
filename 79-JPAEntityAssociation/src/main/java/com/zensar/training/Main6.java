package com.zensar.training;

import java.util.Set;
import java.util.TreeSet;

import javax.persistence.EntityManager;



import com.zensar.training.bean.pack6.Course;
import com.zensar.training.bean.pack6.Subject;

import com.zensar.training.util.JPAUtil;



public class Main6 {

	private static void insertTesting() {
		EntityManager em=JPAUtil.createEntityManager("PU");
		
		Course course=new Course("Induction Training", 32000.00);
		
		course.addSubject(new Subject("Spring", 42));
		course.addSubject(new Subject("JPA", 18));
		course.addSubject(new Subject("JQuery", 20));
		course.addSubject(new Subject("Angular JS", 50));
		course.addSubject(new Subject("Ajax", 5));
		
		
		em.getTransaction().begin();
		em.persist(course);
		em.getTransaction().commit();
		
		System.out.println("\t\t !>>>>>>>>>>> course Data Saved <<<<<<<<<<<<<<!");
	}

	private static void loadTesting() {
		
		EntityManager em=JPAUtil.createEntityManager("PU");
		
		Course course=em.find(Course.class, 1);
		System.out.println(course);
		
		JPAUtil.shutDown();


	}

	private static void editTesting() {
		EntityManager em=JPAUtil.createEntityManager("PU");
		
		Course course=em.find(Course.class, 1);
		System.out.println(course);
		
		course.setFee(course.getFee()+3000);
		course.setCourseName(course.getCourseName().toUpperCase());
		
		course.getSubjects().remove(em.find(Subject.class, 2));
		course.getSubjects().add(new Subject(" React JS",24));
		
		em.getTransaction().begin();
		em.merge(course);
		
		em.getTransaction().commit();
		JPAUtil.shutDown();
	}

	private static void deleteTesting() {
		EntityManager em=JPAUtil.createEntityManager("PU");
		
		em.getTransaction().begin();
		Course course=em.find(Course.class, 1);
		em.remove(course);
		
		em.getTransaction().commit();
		JPAUtil.shutDown();

	}

	private static void loadAllTesting() {

		

	}

	public static void main(String[] args) {
		insertTesting();
		

	}

}
