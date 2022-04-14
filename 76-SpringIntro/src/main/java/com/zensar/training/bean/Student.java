package com.zensar.training.bean;

public class Student {
		int rollno;
		String name;
		double avgMarks;
		public Student(int rollno, String name, double avgMarks) {
			super();
			this.rollno = rollno;
			this.name = name;
			this.avgMarks = avgMarks;
		}
		public Student() {
			super();
		}
		public int getRollno() {
			return rollno;
		}
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getAvgMarks() {
			return avgMarks;
		}
		public void setAvgMarks(double avgMarks) {
			this.avgMarks = avgMarks;
		}
		@Override
		public String toString() {
			return "Student [rollno=" + rollno + ", name=" + name + ", avgMarks=" + avgMarks + "]";
		}
		
		
}
