package com.zensar.training.ui;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main1 {
	public static void main(String[] args) {
		
		IntStream stream=IntStream.rangeClosed(1, 10);
		
		//stream=Arrays.stream(arr);
		stream.forEach((i)->System.out.println(i));
		
		//IntStream stream2=Arrays.stream(arr);
		//OptionalInt optionalInt =stream2.max();
		//if(optionalInt.isPresent())
		//	System.out.println(optionalInt.getAsInt());
		//else
		//	System.out.println("Source is Empty");
		
		
		//OptionalInt optionalInt=stream.min();
		//if(optionalInt.isPresent())
		///	System.out.println(optionalInt.getAsInt());
		//else
		//	System.out.println("Source Empty");
		
		//long cnt=stream.count();
		//System.out.println(cnt);
		//OptionalDouble optionalDouble=	stream.average();
		//if(optionalDouble.isPresent())
		//	System.out.println(optionalDouble.getAsDouble());
			
		//stream.distinct().forEach((i)->System.out.println(i));
		stream.filter((i)->i%2==0).distinct().forEach((i)->System.out.println(i));
		//int total=stream.filter((i)->i%2==0).distinct().sum();
		//System.out.println(total);
		
		//boolean result=stream.noneMatch((i)->i%2!=0);
		//System.out.println(result);
		
		//OptionalInt  optionalInt=stream.reduce((i,j)->i+j);
		//System.out.println(optionalInt.getAsInt());
		//List<Integer> list=stream.boxed().collect(Collectors.toList());
		//System.out.println(list);
	}
}
