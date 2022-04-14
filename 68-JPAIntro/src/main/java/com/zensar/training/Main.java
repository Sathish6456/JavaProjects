package com.zensar.training;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.zensar.training.bean.Contact;


public class Main {

	private static void insertTesting() {

		Contact contact = new Contact(1001, "Aakash", "ak@yahoo.com");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAIntro");
		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(contact);
		tx.commit();

		em.close();
		emf.close();

		System.out.println("Contact Stored..............");

	}

	private static void deleteTesting() {
		

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAIntro");
		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		
		Contact contact=em.find(Contact.class, 1001);
		tx.begin();
		
		em.remove(contact);
		
		tx.commit();

		em.close();
		emf.close();

		System.out.println("Contact Removed..............");
	}
	
	private static void editTesting() {
		

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAIntro");
		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		Contact contact=em.find(Contact.class, 1001);
		contact.setEmail("");
			
		em.merge(contact);
		
		tx.commit();

		em.close();
		emf.close();

		System.out.println("Contact Updated..............");
	}
	
	
	private static void loadAllTesting() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAIntro");
		EntityManager em = emf.createEntityManager();

		String q="from Contact";
		
		Query query=em.createQuery(q);
		List<Contact> contacts=query.getResultList();
		
		System.out.println(contacts);
		
		
		

		em.close();
		emf.close();

		
	}

	public static void main(String[] args) {
		insertTesting();

	}

}
