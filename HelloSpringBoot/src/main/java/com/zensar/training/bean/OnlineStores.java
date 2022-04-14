package com.zensar.training.bean;

public class OnlineStores {
	
	int id;
	String name;
	String CEO;
	public OnlineStores(int id, String name, String cEO) {
		super();
		this.id = id;
		this.name = name;
		CEO = cEO;
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
	public String getCEO() {
		return CEO;
	}
	public void setCEO(String cEO) {
		CEO = cEO;
	}
	@Override
	public String toString() {
		return "OnlineStores [id=" + id + ", name=" + name + ", CEO=" + CEO + "]";
	}
	
	

}
