package com.zensar.training;

import java.time.LocalDate;

import javax.persistence.EntityManager;

import com.zensar.training.bean.Address;
import com.zensar.training.bean.Employee;
import com.zensar.training.util.JPAUtil;

public class Main {
	
	static void insert() {
		EntityManager em=JPAUtil.createEntityManager("PU");
		
	Address address=new Address("F-5","rajupeta","tiruvuru");	
		Employee employee=new Employee("sathish", 'G', 25743.82, LocalDate.of(2021, 12, 28), address);
		
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
		JPAUtil.shutDown();
	}
	static void load() {
		EntityManager em=JPAUtil.createEntityManager("PU");
		Employee employee=em.find(Employee.class, 3);
		System.out.println(employee);
		
		JPAUtil.shutDown();
	}
	
	static void update() {
		EntityManager em=JPAUtil.createEntityManager("PU");
		Employee employee=em.find(Employee.class, 3);
		employee.setName(employee.getName().toUpperCase());
		em.getTransaction().begin();
		em.merge(employee);
		em.getTransaction().commit();
		JPAUtil.shutDown();
	}
	
	static void delete() {
		EntityManager em=JPAUtil.createEntityManager("PU");
		Employee employee=em.find(Employee.class, 1);
		em.getTransaction().begin();
		em.remove(employee);
		em.getTransaction().commit();
		JPAUtil.shutDown();
	}
	public static void main(String[] args) {
		
		insert();
		//load();
		//update();
		//delete();
	}

}
