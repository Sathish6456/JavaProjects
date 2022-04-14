package com.zensar.training.bean.comparator;

import java.util.Comparator;

import com.zensar.training.bean.Student;

public class StudentMarkComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getAverageMark()<o2.getAverageMark())
			return -1;
		if(o1.getAverageMark()>o2.getAverageMark())
			return 1;
		return 0;
	}

}
