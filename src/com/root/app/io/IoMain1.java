package com.root.app.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IoMain1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		키보드로부터 입력
//		0과 1로 된 신호 -> h, e, l, l, o -> hello
//		0, 1 관리
		InputStream is = System.in;
		
//		문자 관리
		InputStreamReader isr = new InputStreamReader(is);
		
//		보조 스트림(문자열)
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("입력하세요");
		
		try {
			String str = br.readLine();
			System.out.println(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//예외가 발생하든 안하든 무조건 하는 영역
			try {
				sc.close();
				br.close();
				isr.close();
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("종료");

	}

}
