package com.root.app.langs.wrapper;

import java.util.Scanner;

public class Wrapper3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호 입력");
		String jumin = sc.next();//971226-1234567
		
//		 9 7 1 2 2 6 - 1 2 3 4 5 6 7
//		*2 3 4 5 6 7   8 9 2 3 4 5  마지막 번호는 검증용 번호
//		18 21 ...                   총합계 구하기
//		ex) 122
//		11로 나눈 나머지 값 구하기 ex) 1 (0 ~ 10)
//		11-나머지 결과값 구하기
//		결과값이 두자리 수라면 
//		결과값을 다시 10으로 나눈 나머지값을 구하기
//		나머지값을 검증용 번호와 일치하는지 확인
		
//		int s = 9*2+3*3+0+8*5+0+9*7+1*8+1*9+8*2+3*3+3*4+1*5;
//		int a = 11 - (s % 11);
//		System.out.println(s);
//		System.out.println(a);
		
//		int a = Integer.valueOf(jumin.substring(0, 1))*2;
//		int b = Integer.valueOf(jumin.substring(1, 2))*3;

		jumin = jumin.replace("-", "");
		
		int idx = 0;
		int sum = 0;
		int j = 2;
		
		for(int i = 0; i < jumin.toCharArray().length-1; i++) {
			
			if(j == 10) {
				j = 2;
			}
			
				idx = Integer.valueOf(jumin.substring(i, i+1))*(j);
				sum = sum + idx;
				
				j++;
		}
		
		int result = 11 - (sum % 11);
		
		if(result >= 10) {
			result = result % 10;
		}
		
		int check = Integer.valueOf(jumin.substring(12));
		
		if(result == check) {
			System.out.println("O");
		}else {
			System.out.println("X");
		}
		
		
	}

}
