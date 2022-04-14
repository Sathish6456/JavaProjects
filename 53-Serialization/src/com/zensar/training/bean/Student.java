package com.zensar.training.bean;

import java.util.Objects;

public class Student implements Comparable<Student> {
	private int rollNo;
	private String name;
	private Gender gender;
	private double averageMark;
	private String department;
	
	public Student(int rollNo, String name, Gender gender, double averageMark, String department) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.gender = gender;
		this.averageMark = averageMark;
		this.department = department;
	}

	public Student() {
		super();
	}

	public Student(int rollNo) {
		super();
		this.rollNo = rollNo;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public double getAverageMark() {
		return averageMark;
	}

	public void setAverageMark(double averageMark) {
		this.averageMark = averageMark;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public int hashCode() {
		return Objects.hash(rollNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		return rollNo == other.rollNo;
	}

	@Override
	public String toString() {
		return "\nStudent [rollNo=" + rollNo + ", name=" + name + ", gender=" + gender + ", averageMark=" + averageMark
				+ ", department=" + department + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.rollNo-o.rollNo;
	}
	
	public char computeGrade() {
		if(this.averageMark>90.0)
			return 'A';
		if(this.averageMark>70.0)
			return 'B';
		if(this.averageMark>50.0)
			return 'C';
		
		return 'D';
		
		
	}
}
