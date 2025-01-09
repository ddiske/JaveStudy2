package com.root.app.utils.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFomatMain1 {

	public static void main(String[] args) throws Exception {
		
		Calendar calendar = Calendar.getInstance();
		//2025년 1월 9일
		//yyyy-mm-dd
		String pattern = "yyyy년 MM월 dd일 HH:mm:ss";
		
		SimpleDateFormat sd = new SimpleDateFormat(pattern);
		String st = sd.format(calendar.getTime());
		System.out.println(st);
		
		pattern = "yyyy-MM-dd";
		
		String d = "2050-10-30";
		
		sd.applyPattern(pattern);
		
		Date date = sd.parse(d);
		
		System.out.println(date);
		
		
		calendar.setTimeInMillis(date.getTime());
		
		System.out.println(calendar.getTime());
		
	}

}
