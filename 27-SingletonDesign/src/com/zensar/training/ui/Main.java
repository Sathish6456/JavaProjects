package com.zensar.training.ui;

import com.zensar.training.bean.IdGenerator;

public class Main {

	public static void main(String[] args) {
		IdGenerator g1=IdGenerator.getInstance();
		System.out.println(g1.getNextId());
		System.out.println(g1.getNextId());
		System.out.println(g1.getNextId());
		System.out.println(g1.getNextId());
		
		IdGenerator g2=IdGenerator.getInstance();
		System.out.println(g2.getNextId());
		System.out.println(g2.getNextId());
		System.out.println(g2.getNextId());
		System.out.println(g2.getNextId());
		
		IdGenerator g3=IdGenerator.getInstance();
		System.out.println(g3.getNextId());
		System.out.println(g3.getNextId());
		System.out.println(g3.getNextId());
		System.out.println(g3.getNextId());
		

	}

}
