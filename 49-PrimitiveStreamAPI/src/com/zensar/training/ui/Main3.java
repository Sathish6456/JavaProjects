package com.zensar.training.ui;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import com.zensar.training.bean.CollectionFactory;
import com.zensar.training.bean.Student;
import com.zensar.training.bean.comparator.StudentMarkComparator;

public class Main3 {

	public static void main(String[] args) {
		List<Student> students=CollectionFactory.getStudentList();
		
		Stream<Student> studStream=students.stream();
		
		/*studStream.sorted(new StudentMarkComparator()).filter((s)->s.getAverageMark()>80.0 ).forEach((s)-> {
			System.out.println(s.getRollNo()+ "\t"+ s.getName()+"\t"+ s.getAverageMark());
		});*/
		
		//DoubleStream ds= studStream.mapToDouble((s)->s.getAverageMark());
		//OptionalDouble opd=ds.max();
		//if(opd.isPresent()) {
		//	System.out.println(opd.getAsDouble());
		//}
		
		//Optional<Student>minStud=studStream.min(new StudentMarkComparator());
		//if(minStud.isPresent()) {
		//	System.out.println(minStud.get());
		//}
		Optional<Student> optionalStud=studStream.findAny();
		if(optionalStud.isPresent())
			System.out.println(optionalStud.get());
	}

}
