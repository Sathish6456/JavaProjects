package com.zensar.training.bean.pack3;

import java.util.LinkedList;
import java.util.List;

public class Department {
	private int departmentId;
	private String departmentName;
	private List<Employee> employees;
	
	private void init() {
		if(this.employees==null)
			this.employees=new LinkedList<Employee>();
	}
	
	public Department() {
		super();
		init();
	}

	public Department(int departmentId) {
		super();
		this.departmentId = departmentId;
		init();
	}
	
	

	public Department(int departmentId, String departmentName) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		init();
	}

	public Department(int departmentId, String departmentName, List<Employee> employees) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.employees = employees;
	}
	
	

	public Department(String departmentName) {
		super();
		this.departmentName = departmentName;
		init();
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	public boolean addEmployee(Employee employee) {
		return this.employees.add(employee);
	}
	
	public boolean removeEmployee(Employee employee) {
		return this.employees.remove(employee);
	}
	

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", employees="
				+ employees + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + departmentId;
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
		Department other = (Department) obj;
		if (departmentId != other.departmentId)
			return false;
		return true;
	}
	
	
	
}
