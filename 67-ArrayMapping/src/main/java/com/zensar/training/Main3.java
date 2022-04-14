package com.zensar.training;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zensar.training.bean.Developer;
import com.zensar.training.util.HibernateUtil;
public class Main3 {
	
	static void insertTest() {
		
		Developer developer=new Developer();
		developer.setName("Sathish");
		developer.addSkill("java");
		developer.addSkill("python");
		developer.addSkill("mysql");
		developer.addSkill("html");
		developer.addSkill("sql");
		
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();
		Transaction transaction = session.beginTransaction();

		Integer genId = (Integer) session.save(developer);

		transaction.commit();
		
		HibernateUtil.cleanUp();
	}

	public static void main(String[] args) {
		insertTest();	
}
}