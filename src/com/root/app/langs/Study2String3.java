package com.root.app.langs;

public class Study2String3 {

	public static void main(String[] args) {
		String num = "010-1234-5678";
		
		//subString(idx) : idx부터 끝까지
		//문자열에서 일부분을 추출할 때 사용
		String n = num.substring(9);
		System.out.println(n);
		
		//subString(idx1, idx2) : idx1부터 idx2미만까지
		n = num.substring(4, 8);
		System.out.println(n);
		String name = "win.ter.gif";
		String find = ".";
		
		System.out.println(name.lastIndexOf(find));
		n = name.substring(name.lastIndexOf(find)+1);
		System.out.println(name);
		System.out.println(n);
		
		name = "990123-1234567";
		find = "-";
		char s = name.charAt(name.indexOf(find)+1);
		System.out.println(name.charAt(name.indexOf(find)+1));
		System.out.println(s);
		System.out.println(name.substring(name.indexOf(find)+1, name.indexOf(find)+2));
		
		
		if(s == '1' || s == '3') {
			System.out.println("Male");
		}else if(s == '2' || s == '4') {
			System.out.println("Female");
		}
		
	
		
		
	}

}
