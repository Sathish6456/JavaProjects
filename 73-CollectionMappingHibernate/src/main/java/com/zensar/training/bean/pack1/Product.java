package com.zensar.training.bean.pack1;

import java.util.LinkedList;
import java.util.List;

public class Product {
	int productId;
	String productName;
	List<Double> plannedOffersPrices;
	
	private void init() {
		if(this.plannedOffersPrices==null)
		this.plannedOffersPrices=new LinkedList<Double>();
	}
	
	public Product() {
		super();
		init();
	}
	
	public Product(String productName) {
		super();
		this.productName = productName;
		}
	
	
	public Product(int productId) {
		super();
		this.productId = productId;
		init();
	}



	public Product(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
		init();
	}



	public Product(int productId, String productName, List<Double> plannedOffersPrices) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.plannedOffersPrices = plannedOffersPrices;
	}



	public int getProductId() {
		return productId;
	}



	public void setProductId(int productId) {
		this.productId = productId;
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public List<Double> getPlannedOffersPrices() {
		return plannedOffersPrices;
	}



	public void setPlannedOffersPrices(List<Double> plannedOffersPrices) {
		this.plannedOffersPrices = plannedOffersPrices;
	}



	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", plannedOffersPrices="
				+ plannedOffersPrices + "]";
	}
	
	public boolean addPlannedOfferPrice(Double offerPrice) {
		return this.plannedOffersPrices.add(offerPrice);
	}
	
	public boolean removePlannedOfferPrice(Double offerPrice) {
		return this.plannedOffersPrices.remove(offerPrice);
	}

	public void clearOfferPrices() {
		this.plannedOffersPrices.clear();
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + productId;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (productId != other.productId)
			return false;
		return true;
	}
	
	
	
	
}
