package com.zensar.training;

import javax.persistence.EntityManager;

import com.zensar.training.bean.Developer;
import com.zensar.training.util.JPAUtil;
public class Main3 {
	
	static void insertTest() {
		
		Developer developer=new Developer();
		developer.setName("Sathish");
		developer.addSkill("java");
		developer.addSkill("python");
		developer.addSkill("mysql");
		developer.addSkill("html");
		developer.addSkill("sql");
		
		EntityManager em=JPAUtil.createEntityManager("AP");
		em.getTransaction().begin();
		em.persist(developer);
		em.getTransaction();
		System.out.println("Developer skills updated");
	
	}

	public static void main(String[] args) {
		insertTest();	
}
}