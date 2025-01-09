package com.root.app.utils.date;

import java.util.Calendar;

public class CalendarMain3 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		ca.set(Calendar.DATE, 30);
		
		//3일 뒤 도착 예정
		System.out.println(ca.getTime());
		ca.set(Calendar.DATE, ca.get(Calendar.DATE)+3);
		System.out.println(ca.getTime());

		
		System.out.println("==========");
		//
		ca = Calendar.getInstance();
		System.out.println(ca.getTime());
		
		long time = 1000*60*60*24*3;
		long now = ca.getTimeInMillis();
		now = now + time;
		
		ca.setTimeInMillis(now);
		System.out.println(ca.getTime());
		
		
		ca = Calendar.getInstance();
		ca.set(Calendar.DATE, 30);
		ca.add(Calendar.DATE, 3);
		System.out.println(ca.getTime());
		
		
		System.out.println("==========");
		
		ca = Calendar.getInstance();
		
		ca.set(Calendar.DATE, 30);
		ca.roll(Calendar.DATE, 3);
		System.out.println(ca.getTime());
		
		
		
		
		
	}

}
