package com.zensar.training.bean;

import java.util.Arrays;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="students30")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int rollNo;
	
	@Column(name="S_NAME")
	String name;
	
	@ElementCollection
	@OrderColumn(name="idx")
	@CollectionTable(name="students30_marks30")
	double[] marks=new double[3];
	
	@Transient
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
