package com.zensar.training.bean;

import java.util.Objects;

public class Student {
	public String name;
	public int mark;
	public char grade;
	
	@Override
	public String toString() {
		return "Student [name=" + this.name + ", mark=" + this.mark + ", grade=" + this.grade + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(grade);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		return grade == other.grade;
	}

	
	public void finalize() {
		System.out.println("Object is removed");
	}
	
	
	
}
