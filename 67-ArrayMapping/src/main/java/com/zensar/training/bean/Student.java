package com.zensar.training.bean;

import java.util.Arrays;
import java.util.List;

public class Student {
	int rollNo;
	String name;
	double[] marks=new double[3];
	
	int index;
	
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
	
	
	
	public double[] getMarks() {
		return marks;
	}
	public void setMarks(double[] marks) {
		this.marks = marks;
	}
	
	public void setMark(int position, double mark){
		marks[position]=mark;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks="
				+ Arrays.toString(marks)+"]";
	}
	
	

}
