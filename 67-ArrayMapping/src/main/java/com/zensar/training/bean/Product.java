package com.zensar.training.bean;

public class Product {

	int id;
	String name;
	int [] discounts=new int[4];
	
	
	public void setDiscount(int index, int discount) {
		this.discounts[index]=discount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getDiscounts() {
		return discounts;
	}
	public void setDiscounts(int[] discounts) {
		this.discounts = discounts;
	}
	
	
}
