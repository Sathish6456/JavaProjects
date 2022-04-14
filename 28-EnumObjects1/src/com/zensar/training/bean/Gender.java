package com.zensar.training.bean;

public class Gender {
	
	private int averageHeight;
	private int averageWeight;
	
	public static final Gender MALE=new Gender(170, 60);
	public static final Gender FEMALE=new Gender(160, 50);
	
	
	
	private Gender(int averageHeight, int averageWeight) {
		super();
		this.averageHeight = averageHeight;
		this.averageWeight = averageWeight;
	}
	public int getAverageHeight() {
		return averageHeight;
	}
	public void setAverageHeight(int averageHeight) {
		this.averageHeight = averageHeight;
	}
	public int getAverageWeight() {
		return averageWeight;
	}
	public void setAverageWeight(int averageWeight) {
		this.averageWeight = averageWeight;
	}
	
	
	
	
}
