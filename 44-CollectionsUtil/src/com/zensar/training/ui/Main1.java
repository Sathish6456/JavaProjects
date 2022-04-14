package com.zensar.training.ui;

import java.util.Collections;
import java.util.List;

import com.zensar.training.bean.CollectionFactory;
import com.zensar.training.bean.Student;
import com.zensar.training.bean.comparator.StudentDepartmentComparator;
import com.zensar.training.bean.comparator.StudentMarkComparator;

public class Main1 {
	public static void main(String[] args) {
		List<Student> students;
		students=CollectionFactory.getStudentList();
		System.out.println(students);
		System.out.println("-----------------------------------------------------");
		Collections.sort(students);
		System.out.println(students);
		System.out.println("-----------------------------------------------------");
		
		StudentDepartmentComparator sdc=new StudentDepartmentComparator();
		Collections.sort(students, sdc);
		System.out.println(students);
		
		//task
		
		Student s1=new Student();
		//Collections.addAll(students, new Student(), new Student(), s1);
		System.out.println(students);
		Collections.sort(students);
		System.out.println(Collections.binarySearch(students, new Student(2503)));
		
		System.out.println(Collections.max(students));  //Comparable
		System.out.println(Collections.max(students, new StudentMarkComparator())); // Comparator
		
		//task
		
		Collections.rotate(students, 3);
		System.out.println(students);
		
		Collections.shuffle(students);
		System.out.println(students);
		
		Collections.reverse(students);
		System.out.println(students);
		
		
	} 
}
