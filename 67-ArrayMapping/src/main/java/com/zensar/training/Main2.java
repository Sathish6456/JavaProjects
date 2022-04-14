package com.zensar.training;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.zensar.training.bean.Product;
import com.zensar.training.util.HibernateUtil;

public class Main2 {

	public static void main(String[] args) {

		insertTesting();
		// loadTesting(2);

		// loadAllTesting();

		// updateTesting(1);
		// deleteTesting(2);

	}

	private static void insertTesting() {
		Product product = new Product();
		product.setId(1);
		product.setName("Shirt");
		product.setDiscount(0, 10);
		
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();
		Transaction transaction = session.beginTransaction();

		Integer genId = (Integer) session.save(product);

		transaction.commit();

		System.out.println("Student Object Saved with ID " + genId);
	}

	private static void loadTesting(int id) {
		Product product = null;
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();

		product= (Product) session.load(Product.class, id);

		System.out.println("Product Object Loaded with ID " + id);

		System.out.println(product);
	}

	private static void loadAllTesting() {
		 List<Product> products=null;

		HibernateUtil.init();
		Session session = HibernateUtil.getSession();

		Query query = session.createQuery("from Student");

		products = query.list();

		for (Product s : products)
			System.out.println(s);

		System.out.println("All Student Objects Loaded ");

	}

	private static void updateTesting(int id) {

		Product product = null;
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();

		Transaction transaction = session.beginTransaction();

		product= (Product) session.load(Product.class, id);

		System.out.println("Product Object Loaded with ID " + id);

		System.out.println(product);

		product.setName("TShirt");
		product.setDiscount(0, 40);
		product.setDiscount(1, 50);
		product.setDiscount(2, 60);
		product.setDiscount(3, 70);
		product.setDiscount(4, 80);
		
		session.update(product);

		transaction.commit();

		System.out.println("After updation :" + product);

		System.out.println("Project Object updated ");

	}

	private static void deleteTesting(int id) {
		Product product=null;
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();
		Transaction transaction = session.beginTransaction();

		product = (Product) session.load(Product.class, id);

		System.out.println("Product Object Loaded with ID " + id);

		System.out.println(product);
		System.out.println("Trying to Delete ....");

		session.delete(product);

		transaction.commit();
		System.out.println("Product deleted");

	}

}
