package com.root.app.langs;



public class Study1Object {

	

	public static void main(String[] args) {
		
		Object obj = new Object();
		//참조변수명.변수명, 메서드명
		
		String s = obj.toString();
		
		System.out.println(s);
		System.out.println(obj);
		ObjectTest ot = new ObjectTest();
		
		Object obj2 = new Object();
		
		boolean result = obj.equals(ot);
		System.out.println(obj == obj2);
		System.out.println(result);
		
		String name = "winter";
		String name2 = new String("winter");
		System.out.println(name=name2);
		result = name.equals(name2);
		System.out.println(result);
		
		//=================================
		ot.num1 = 10;
		ot.m1();
		String str = ot.toString();
		System.out.println(str);
		System.out.println(ot);
		System.out.println(name2);
		System.out.println(name2.hashCode());//10진수로 전환
		
	}

}
