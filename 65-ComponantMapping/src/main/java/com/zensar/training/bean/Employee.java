package com.zensar.training.bean;

public class Employee {
	int id;
	String name;
	double basicSalary;
	Address address;
	public Employee(int id, String name, double basicSalary, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		this.address = address;
	}
	public Employee() {
		super();
	}
	public Employee(String name, double basicSalary, Address address) {
		super();
		this.name = name;
		this.basicSalary = basicSalary;
		this.address = address;
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
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", basicSalary=" + basicSalary + ", address=" + address + "]";
	}
	
	
	
	
}
