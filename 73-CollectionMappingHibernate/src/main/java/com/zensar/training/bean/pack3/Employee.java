package com.zensar.training.bean.pack3;

public class Employee {
	
	private String employeeName;
	private char grade;
	private Gender gender;
	
	
	
	public Employee() {
		super();
	}
	
	
	
	public Employee(String employeeName, char grade, Gender gender) {
		super();
		this.employeeName = employeeName;
		this.grade = grade;
		this.gender = gender;
	}



	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}



	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", grade=" + grade + ", gender=" + gender + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
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
		Employee other = (Employee) obj;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		return true;
	}
	
	
	
}
