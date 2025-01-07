package com.root.app.langs.wrapper;

public class Wrapper1 {

	public static void main(String[] args) {
		
		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		
//		Integer integer = new Integer("3");
//		
//		Double double1 = new Double("1.23");
//		
//		int num = integer.intValue();
//		double d = double1.doubleValue();
//		
//		System.out.println(num);
//		System.out.println(d);
		
		
		//AutoBoxing
		int num = 1;
		Integer integer = num;
		
		
		
		//AutoUnBoxing
		num = integer;
		
		
		
//		byte <=> Byte
//		short <=> Short
//		int <=> Integer
//		long <=> Long
//		float <=> Float
//		double
//		boolean
//		char
		
		num = Integer.parseInt("123");
		System.out.println(num);
		
		

	}

}
