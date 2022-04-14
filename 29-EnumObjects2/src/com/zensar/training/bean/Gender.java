package com.zensar.training.bean;

public enum Gender {
	MALE(170,60,'M'),FEMALE(160,50,'F');
	
	int averageHeight;
	int averageWeight;
	char value;
	
	
	
	private Gender(int averageHeight, int averageWeight, char value) {
		this.averageHeight = averageHeight;
		this.averageWeight = averageWeight;
		this.value = value;
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
	public char getValue() {
		return value;
	}
	public void setValue(char value) {
		this.value = value;
	}
	
	
}
