package com.root.app.langs.wrapper;

public class Wrapper4 {

	public static void main(String[] args) {
		//10진수
		int num = 16;
		
		//2진수
		String str = Integer.toBinaryString(num);
		
		System.out.println(str);
		
		
		//16진수
		str = Integer.toHexString(num);
		
		System.out.println(str);
		
		
		//8진수
		str = Integer.toOctalString(num);

	}

}
