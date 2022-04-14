package com.zensar.training.bean;

public class IdGenerator {  // Singleton class Design pattern
	
	private int number=0;
	private static IdGenerator generator;
	
	public static IdGenerator getInstance() {
		if(generator==null)
			generator=new IdGenerator();
		return generator;
	}
	
	private IdGenerator() {
		
	}
	
	public int getNextId() {
		return ++this.number;
	}

}
