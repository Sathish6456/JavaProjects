package com.zensar.training.ui;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Main3 {

	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		System.out.println(today);
		
		LocalDate tomorrow=LocalDate.of(2022, 2, 1);
		System.out.println(tomorrow);
		
		String str="2022-06-25";
		
		LocalDate other=LocalDate.parse(str);
		System.out.println(other);
		
		String str1="15-08-2022";
		LocalDate independenceDay=LocalDate.parse(str1, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		
		System.out.println(independenceDay);
		
		LocalDate localDate=independenceDay.plusDays(10);
		System.out.println(localDate);
		
		LocalDate localDate2=independenceDay.minusDays(10);
		System.out.println(localDate2);
		
		System.out.println(independenceDay.isLeapYear());
		System.out.println(localDate.isAfter(localDate2));
		System.out.println(localDate2.isBefore(localDate));
		System.out.println(localDate.isEqual(today));
		
		LocalDateTime firstDay=today.atStartOfDay();
		System.out.println(firstDay);
		
		LocalDate localDate3=today.with(TemporalAdjusters.firstDayOfMonth());
		
		LocalDate localDate4=LocalDate.of(1998, 2, 15);
		LocalDate localDate5=localDate4.with(TemporalAdjusters.firstDayOfYear());
		System.out.println(localDate5);
		
	}

}
