package com.zensar.training;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.zensar.training.bean.Contact;
import com.zensar.training.util.JPAUtil;

public class Main1 {
	
	static void insert() {
		EntityManager em=JPAUtil.createEntityManager("JPAIntro");
	
	
		Contact contact=new Contact();
		contact.setName("Jhon");
		contact.setEmail("jhon@yahoo.com");
		em.getTransaction().begin();
		em.persist(contact);
		em.getTransaction().commit();
		JPAUtil.shutDown();
	}

	static void load() {
		EntityManager em=JPAUtil.createEntityManager("JPAIntro");
		Contact contact=em.find(Contact.class, 1);
		System.out.println(contact);
		
		JPAUtil.shutDown();
	}
	
	static void update() {
		EntityManager em=JPAUtil.createEntityManager("JPAIntro");
		Contact contact=em.find(Contact.class, 1);
		contact.setName(contact.getName().toUpperCase());
		em.getTransaction().begin();
		em.merge(contact);
		em.getTransaction().commit();
		JPAUtil.shutDown();
	}
	
	static void delete() {
		EntityManager em=JPAUtil.createEntityManager("JPAIntro");
		Contact contact=em.find(Contact.class, 1);
		//contact.setName(contact.getName().toUpperCase());
		em.getTransaction().begin();
		em.remove(contact);
		em.getTransaction().commit();
		JPAUtil.shutDown();
	}
	public static void main(String[] args) {
		//insert();
		 //load();
		//update();
		delete();
	
	}

}
