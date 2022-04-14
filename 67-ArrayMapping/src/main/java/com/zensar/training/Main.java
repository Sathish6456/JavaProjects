package com.zensar.training;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.zensar.training.bean.Student;
import com.zensar.training.util.HibernateUtil;

public class Main {

	public static void main(String[] args) {

		insertTesting();
		// loadTesting(2);

		// loadAllTesting();

		// updateTesting(1);
		// deleteTesting(2);

	}

	private static void insertTesting() {
		Student student = new Student();
		student.setRollNo(5052);
		student.setName("Suresh");
		student.setMark(0, 97.00);
		student.setMark(1, 98.55);
		student.setMark(2, 66.00);
		
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();
		Transaction transaction = session.beginTransaction();

		Integer genId = (Integer) session.save(student);

		transaction.commit();

		System.out.println("Student Object Saved with ID " + genId);
	}

	private static void loadTesting(int id) {
		Student student = null;
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();

		student = (Student) session.load(Student.class, id);

		System.out.println("Student Object Loaded with ID " + id);

		System.out.println(student);
	}

	private static void loadAllTesting() {
		List<Student> students = null;

		HibernateUtil.init();
		Session session = HibernateUtil.getSession();

		Query query = session.createQuery("from Student");

		students = query.list();

		for (Student s : students)
			System.out.println(s);

		System.out.println("All Student Objects Loaded ");

	}

	private static void updateTesting(int id) {

		Student student = null;
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();

		Transaction transaction = session.beginTransaction();

		student = (Student) session.load(Student.class, id);

		System.out.println("Student Object Loaded with ID " + id);

		System.out.println(student);

		student.setName("Dev");
		student.setMark(0, 80);
		student.setMark(1, 90);
		student.setMark(2, 97);

		session.update(student);

		transaction.commit();

		System.out.println("After updation :" + student);

		System.out.println("Student Object updated ");

	}

	private static void deleteTesting(int id) {
		Student student = null;
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();
		Transaction transaction = session.beginTransaction();

		student = (Student) session.load(Student.class, id);

		System.out.println("Student Object Loaded with ID " + id);

		System.out.println(student);
		System.out.println("Trying to Delete ....");

		session.delete(student);

		transaction.commit();
		System.out.println("Student deleted");

	}

}
