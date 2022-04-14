package com.zensar.training;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.zensar.training.bean.pack5.IPLTeam;
import com.zensar.training.bean.pack5.Player;
import com.zensar.training.util.HibernateUtil;



public class Main5 {

	private static void insertTesting() {
		
		IPLTeam iplTeam=new IPLTeam("Kolkata Knight Riders", "Kolkata", null);
		Player player1=new Player("Dinesh Karthick", "Wicket Keeper", 28);
		Player player2=new Player("Venkatesh Iyer","All rounder", 26);
		Set<Player> players=new HashSet<>();
		players.add(player1);
		players.add(player2);
		iplTeam.setPlayers(players);
		
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		
		Transaction tx=session.beginTransaction();
		session.save(iplTeam);
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
