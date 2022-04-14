package com.zensar.training;

import java.time.LocalDate;

import javax.persistence.EntityManager;

import com.zensar.training.bean.Employee;
import com.zensar.training.util.JPAUtil;

public class Main {
	
	static void insert() {
		EntityManager em=JPAUtil.createEntityManager("BasicORM");
		
		Employee employee=new Employee();
		employee.setName("Sathish");
		employee.setGrade('D');
		employee.setDateOfJoining(LocalDate.of(2022, 1, 4));
		employee.setBasicSalary(30000.00);
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
		JPAUtil.shutDown();
	}
	static void load() {
		EntityManager em=JPAUtil.createEntityManager("BasicORM");
		Employee employee=em.find(Employee.class, 2);
		System.out.println(employee);
		
		JPAUtil.shutDown();
	}
	
	static void update() {
		EntityManager em=JPAUtil.createEntityManager("BasicORM");
		Employee employee=em.find(Employee.class, 2);
		employee.setName(employee.getName().toUpperCase());
		em.getTransaction().begin();
		em.merge(employee);
		em.getTransaction().commit();
		JPAUtil.shutDown();
	}
	
	static void delete() {
		EntityManager em=JPAUtil.createEntityManager("BasicORM");
		Employee employee=em.find(Employee.class, 1);
		em.getTransaction().begin();
		em.remove(employee);
		em.getTransaction().commit();
		JPAUtil.shutDown();
	}
	public static void main(String[] args) {
		
		//insert();
		//load();
		update();
		//delete();
	}

}
