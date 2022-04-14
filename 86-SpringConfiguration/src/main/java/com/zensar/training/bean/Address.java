package com.zensar.training.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Address {

	String doorNo;
	String areaName;
	String city;
	public Address(String doorNo, String areaName, String city) {
		super();
		this.doorNo = doorNo;
		this.areaName = areaName;
		this.city = city;
	}
	public Address() {
		super();
	}
	public String getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", areaName=" + areaName + ", city=" + city + "]";
	}
	
	@PostConstruct
	public void doInit() {
		System.out.println("Address is created and initialize");
	}
	@PreDestroy
	public void cleanUp() {
		System.out.println("Address to be removed now");
	}
	
	
	
}
