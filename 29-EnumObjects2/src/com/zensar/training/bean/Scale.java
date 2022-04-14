package com.zensar.training.bean;

public enum Scale {
	QUARTER(0.250),HALF(0.500),FULL(1.0);
	
	private double quantity;
	
	

	private Scale(double quantity) {
		this.quantity = quantity;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
	
}
