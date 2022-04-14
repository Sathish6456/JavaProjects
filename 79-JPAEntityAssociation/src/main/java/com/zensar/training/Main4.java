package com.zensar.training;

import java.time.LocalDate;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zensar.training.bean.pack4.ContactInfo;
import com.zensar.training.bean.pack4.Person;
import com.zensar.training.util.JPAUtil;


public class Main4 {
	static void test1() {
		Person person=new Person(101, "John", LocalDate.of(1998, 2, 20), 'M', null);
		
		ContactInfo contactInfo=new ContactInfo("John@gmail.com", "9764736738");
		person.setContactInfo(contactInfo);
	
		
		EntityManager em=JPAUtil.createEntityManager("PU");
		
		em.getTransaction().begin();
		em.persist(person);
		em.getTransaction().commit();
		JPAUtil.shutDown();
		
	}
	
	static void test2() {
		ContactInfo contactInfo=new ContactInfo("Jeya2001@gmail.com", "8765819103");
		
		EntityManager em=JPAUtil.createEntityManager("PU");
		
		//Person person=em.find(Person.class, 102);
		
		em.getTransaction().begin();
		em.persist(contactInfo);
		em.getTransaction().commit();
		JPAUtil.shutDown();
		
	}
	
	static void test3() {
		Person person=new Person(102,"Jeya", LocalDate.of(2002, 2, 12), 'F', null);
		
		EntityManager em=JPAUtil.createEntityManager("PU");
		ContactInfo contactInfo=em.find(ContactInfo.class, 2);
		person.setContactInfo(contactInfo);
		
		em.getTransaction().begin();
		em.persist(person);
		em.getTransaction().commit();
		JPAUtil.shutDown();
		
	}
	
	

	static void test4() {
		
		
		EntityManager em=JPAUtil.createEntityManager("PU");
		
		
		ContactInfo contactInfo=em.find(ContactInfo.class, 2);
		
	
		
		System.out.println(contactInfo);
		
		JPAUtil.shutDown();
		
	}
	
	static void test5() {
		
		
		EntityManager em=JPAUtil.createEntityManager("PU");
		
		Person person=em.find(Person.class, 102);
		
		
		
		
		
		System.out.println(person);
		System.out.println(person.getContactInfo());
		JPAUtil.shutDown();
		
	}
	
	
	static void test6() {
		
		
		EntityManager em=JPAUtil.createEntityManager("PU");
		
		Person person=em.find(Person.class, 101);
		
		
		em.getTransaction().begin();
		em.remove(person);
		em.getTransaction().commit();
		
		
		
		JPAUtil.shutDown();
		
	}
	

	public static void main(String[] args) {
		//test1();
		//test2();
		//test3();
		//test4();
		//test5();
		test6();
	}

}
