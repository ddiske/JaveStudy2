package com.root.app.utils.tokens;

import java.util.StringTokenizer;

public class TokenMain {

	public static void main(String[] args) {
//		클래스 담을 변수 선언
//		같은 패키지 내에 있는가 또는 java.lang 에 있는가 찾음
//		import 안하고 사용
		
//		하나의 문자열을 여러개의 문자열로 분리 parsing
//		분리한 문자열 하나 하나를 Token
		String data = "iu-173.2-59.3-서울";
		StringTokenizer st = new StringTokenizer(data);
		int count = st.countTokens();
		System.out.println(count);
		
		
		boolean check = st.hasMoreTokens();
		System.out.println(check);
		
		while(st.hasMoreTokens()) {
			String t = st.nextToken("-");
			System.out.println(t);
			
//			t = st.nextToken("-");
//			System.out.println(t);
		}
		

	}

}
