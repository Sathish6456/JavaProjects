package com.zensar.training;

import java.util.Map;
import java.util.TreeMap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.zensar.training.bean.pack4.TeamMember;
import com.zensar.training.util.HibernateUtil;



public class Main4 {

	private static void insertTesting() {
	
		TeamMember teamMember=new TeamMember("Dinesh");
		
		Map<String, Integer> skillMap=new TreeMap<>();
		skillMap.put("HTML", 8);
		skillMap.put("Angular", 6);
		
		teamMember.setSkillDetails(skillMap);
		
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		session.save(teamMember);
		tx.commit();
		
		HibernateUtil.cleanUp();
	}

	private static void loadTesting() {
		
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		
		HibernateUtil.cleanUp();


	}

	private static void editTesting() {
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		
		
		tx.commit();
		HibernateUtil.cleanUp();

	}

	private static void deleteTesting() {
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		
		
		tx.commit();
		HibernateUtil.cleanUp();

	}

	private static void loadAllTesting() {

		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		
		HibernateUtil.cleanUp();

	}

	public static void main(String[] args) {
		insertTesting();

	}

}
