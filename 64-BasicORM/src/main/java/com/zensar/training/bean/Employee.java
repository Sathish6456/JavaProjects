package com.zensar.training.bean;

import java.time.LocalDate;

public class Employee {
	private int employeeId;
    private String name;
    private LocalDate dateOfJoining;
    private double basicSalary;
    private Gender gender;
	
    public Employee() {
		super();
	}

	public Employee(int employeeId, String name, LocalDate dateOfJoining, double basicSalary, Gender gender) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.dateOfJoining = dateOfJoining;
		this.basicSalary = basicSalary;
		this.gender = gender;
	}
    
	public Employee(String name, LocalDate dateOfJoining, double basicSalary, Gender gender) {
		super();
		this.name = name;
		this.dateOfJoining = dateOfJoining;
		this.basicSalary = basicSalary;
		this.gender = gender;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", dateOfJoining=" + dateOfJoining
				+ ", basicSalary=" + basicSalary + ", gender=" + gender + "]";
	}
	
}