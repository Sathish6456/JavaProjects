package com.zensar.training;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;
import java.util.List;

import com.zensar.training.bean.Contact;
import com.zensar.training.util.HibernateUtil;


public class Main1 {
	 static void insert()
	{
		Contact contact=new Contact("Sathish",23,"8688064566");
		Contact contact1=new Contact("Gopi",33,"9912648975");
		Contact contact2=new Contact("Sai",24,"9988776655");
		
		HibernateUtil.init();
		Session session =HibernateUtil.getSession();

        Transaction tx=session.beginTransaction();

        session.save(contact);
        session.save(contact1);
        session.save(contact2);

        tx.commit();
 
        System.out.println("Contact saved to DB");
 
        HibernateUtil.cleanUp();

        }

        static void read() {
            HibernateUtil.init();
            Session session =HibernateUtil.getSession();

            Contact contact=session.load(Contact.class, 1);
            System.out.println(contact);

            HibernateUtil.cleanUp();

        }

        static void readAll() {
            HibernateUtil.init();
            Session session =HibernateUtil.getSession();
 
            String str="from Contact";    //hibernate query language

            Query query =session.createQuery(str);
            List<Contact> allContacts=query.list();
            System.out.println(allContacts);

            session.close();
            HibernateUtil.cleanUp();
        }

        static void update() {
            HibernateUtil.init();
            Session session =HibernateUtil.getSession();

            Contact contact = session.load(Contact.class, 22);
            contact.setName(contact.getName().toUpperCase());
            contact.setAge(52);

            Transaction tx=session.beginTransaction();
            session.update(contact);

            tx.commit();

            HibernateUtil.cleanUp();


        }

        static void delete() {
            HibernateUtil.init();
            Session session =HibernateUtil.getSession();

            Contact contact = session.load(Contact.class, 22);
            Transaction tx=session.beginTransaction();
            session.delete(contact);

            tx.commit();

            HibernateUtil.cleanUp();

        }
        public static void main(String[] args) {

        //insert();
        //read();
        //readAll();
        //update();
        delete();

    }
 
}