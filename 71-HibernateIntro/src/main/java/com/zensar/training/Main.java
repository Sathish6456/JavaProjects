package com.zensar.training;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

import com.zensar.training.bean.Contact;



public class Main {
	
	static void insert(){
		
		Contact contact=new Contact(3, "Raj", 24, "765611898");
		
		ServiceRegistry registry;
		SessionFactory sessionFactory;
		registry = new StandardServiceRegistryBuilder().configure().build();
		MetadataSources metaSources = new MetadataSources(registry);
		Metadata metaData = metaSources.getMetadataBuilder().build();
		sessionFactory = metaData.getSessionFactoryBuilder().build();
		
		Session session=sessionFactory.openSession();
		
		Transaction tx=session.beginTransaction();
		
		session.save(contact);
		
		tx.commit();
		
		System.out.println("Contact Stored successfully");
		
		session.close();
		sessionFactory.close();
		
	}
	
	static void read(){
		ServiceRegistry registry;
		SessionFactory sessionFactory;
		registry = new StandardServiceRegistryBuilder().configure().build();
		MetadataSources metaSources = new MetadataSources(registry);
		Metadata metaData = metaSources.getMetadataBuilder().build();
		sessionFactory = metaData.getSessionFactoryBuilder().build();
		
		Session session=sessionFactory.openSession();
		
		Contact contact=session.load(Contact.class, 2);
		
		System.out.println(contact);
		
		session.close();
		sessionFactory.close();
	}
	
	static void readAll(){
		ServiceRegistry registry;
		SessionFactory sessionFactory;
		registry = new StandardServiceRegistryBuilder().configure().build();
		MetadataSources metaSources = new MetadataSources(registry);
		Metadata metaData = metaSources.getMetadataBuilder().build();
		sessionFactory = metaData.getSessionFactoryBuilder().build();
		
		Session session=sessionFactory.openSession();
		
		String str="from Contact";
		
		Query query=session.createQuery(str);
		
		System.out.println(query.list());
		
		session.close();
		sessionFactory.close();
		
	}
	
	static void update(){
		ServiceRegistry registry;
		SessionFactory sessionFactory;
		registry = new StandardServiceRegistryBuilder().configure().build();
		MetadataSources metaSources = new MetadataSources(registry);
		Metadata metaData = metaSources.getMetadataBuilder().build();
		sessionFactory = metaData.getSessionFactoryBuilder().build();
		
		Session session=sessionFactory.openSession();
		
		Contact contact=new Contact(2, "David", 25, "987654569");
		
		Transaction tx=session.beginTransaction();
		session.update(contact);
		tx.commit();
		
		System.out.println("updated ......");
		session.close();
		sessionFactory.close();
		
	}
	
	static void delete(){
		ServiceRegistry registry;
		SessionFactory sessionFactory;
		registry = new StandardServiceRegistryBuilder().configure().build();
		MetadataSources metaSources = new MetadataSources(registry);
		Metadata metaData = metaSources.getMetadataBuilder().build();
		sessionFactory = metaData.getSessionFactoryBuilder().build();
		
		Session session=sessionFactory.openSession();
		
		Contact c=session.load(Contact.class, 2);
		
		Transaction tx=session.beginTransaction();
		session.delete(c);
		tx.commit();
		
		System.out.println("Deleted....");
		session.close();
		sessionFactory.close();
	}
	
	public static void main(String[] args) {
		insert();
	}

}
