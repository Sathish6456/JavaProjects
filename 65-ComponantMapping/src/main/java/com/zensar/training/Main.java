package com.zensar.training;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.zensar.training.bean.Address;
import com.zensar.training.bean.Employee;
import com.zensar.training.util.HibernateUtil;


public class Main {

	static void insert(){
		HibernateUtil.init();

		Session session=HibernateUtil.getSession();

		Transaction tx=session.beginTransaction();

		Address address=new Address();
		address.setDoorNumber("F1");
		address.setAreaName("Indira Nagar");
		address.setCityName("Guntur");

		Employee employee=new Employee("Pardhu", 28000.00, address);

		session.save(employee);

		tx.commit();

		HibernateUtil.cleanUp();
		}
	static void read() {
    HibernateUtil.init();
    Session session =HibernateUtil.getSession();

    Employee employee=session.load(Employee.class, 1);
    System.out.println(employee);

    HibernateUtil.cleanUp();

}

static void readAll() {
    HibernateUtil.init();
    Session session =HibernateUtil.getSession();

    String str="from Employee";    //hibernate query language

    Query query =session.createQuery(str);
    List<Employee> allEmployees=query.list();
    System.out.println(allEmployees);

    session.close();
    HibernateUtil.cleanUp();
}

static void update() {
    HibernateUtil.init();
    Session session =HibernateUtil.getSession();

    Employee employee= session.load(Employee.class, 5);
    employee.setName(employee.getName().toUpperCase());
   

    Transaction tx=session.beginTransaction();
    session.update(employee);

    tx.commit();

    HibernateUtil.cleanUp();


}

static void delete() {
    HibernateUtil.init();
    Session session =HibernateUtil.getSession();

    Employee employee= session.load(Employee.class, 1);
    Transaction tx=session.beginTransaction();
    session.delete(employee);

    tx.commit();

    HibernateUtil.cleanUp();

}

		public static void main(String[] args) {
		//insert();
		//read();
		//readAll();
		delete();
		
		}
}