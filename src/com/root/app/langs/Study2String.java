package com.root.app.langs;


public class Study2String {

	public static void main(String[] args) {
		System.out.println(String.CASE_INSENSITIVE_ORDER);
		
		
		String name = "winter";//String 객체 생성
		System.out.println(name.charAt(5));
		
		int i = 0;
		i = name.length();
		System.out.println(i);
		
		
		for(i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
		}
		
		//ch -> char
		int idx = name.indexOf('t');
		System.out.println(idx);
		idx = name.indexOf("it");
		System.out.println(idx);
		idx = name.indexOf('t', 5);
		System.out.println(idx);
		
		name = "Goodee Academy";
		String find = "e";
		System.out.println(find.charAt(0));
		
		System.out.println(name);
		
		idx = 0;
		i = 0;
		while(idx != -1) {
			idx = name.indexOf(find, idx+1);
			if(idx != -1) {
				i++;
				System.out.print(idx + "\t");
				System.out.println(i);
			}
		}
		
		
		

	}

}
