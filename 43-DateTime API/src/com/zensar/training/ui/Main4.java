package com.zensar.training.ui;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main4 {

	public static void main(String[] args) {
		LocalTime localTime=LocalTime.now();
		System.out.println(localTime);
		System.out.println(localTime.getHour());
		System.out.println(localTime.getMinute());
		System.out.println(localTime.getSecond());
		
		LocalTime lunchbreak=localTime.plusMinutes(45);
		System.out.println(lunchbreak);
		
		LocalTime resumeTime=lunchbreak.plus(1, ChronoUnit.HOURS);
		System.out.println(resumeTime);
		
		String str=resumeTime.format(DateTimeFormatter.ofPattern("hh:mm:ss"));
		System.out.println(str);
		
	}

}
