package com.root.app.langs.wrapper;

import java.util.Scanner;

public class Wrapper2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 입력");
		String birth = sc.next(); //971224-1234567
		
		//6자리 중 앞 2자리 뽑기
		System.out.println(birth.substring(0, 2));
		String s = birth.substring(7, 8);
		
		
		//앞 2자리 숫자로 바꾸기
		System.out.println(Integer.valueOf(birth.substring(0, 2)));
		
		//계산
		int age = 0;
		
		if(Integer.parseInt(s) == 1 || Integer.parseInt(s) == 2) {
			age = 125 - Integer.valueOf(birth.substring(0, 2));
		}else if(Integer.parseInt(s) == 3 || Integer.parseInt(s) == 4) {
			age = 25 - Integer.valueOf(birth.substring(0, 2));
		}
		
		System.out.println(age);
		
		
		//월, 3-5 : 봄, 6-8 : 여름, 9-11 : 가을, 12-2 : 겨울
		
		String season = birth.substring(2, 4);
		int m = Integer.parseInt(season);
		
		
		if(m >= 3 && m <= 5) {
			System.out.println("봄");
		}else if(m >= 6 && m <= 8) {
			System.out.println("여름");
		}else if(m >= 9 && m <= 11) {
			System.out.println("가을");
		}else {
			System.out.println("겨울");
		}
		
		
		
		
	}

}
