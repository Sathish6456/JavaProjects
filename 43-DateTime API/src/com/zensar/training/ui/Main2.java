package com.zensar.training.ui;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Main2 {

	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		System.out.println(calendar);
		
		System.out.println(calendar.getTime());
		calendar.add(Calendar.HOUR, 12);
		calendar.add(Calendar.MINUTE, 40);
		
		System.out.println(calendar.getTime());
		
		Date date=calendar.getTime();
		SimpleDateFormat sdf=new SimpleDateFormat("dd MMM yyyy", Locale.ITALY);
		String str=sdf.format(date);
		System.out.println(str);
	
	}

}
