package com.root.app.exceptions;

import java.util.Scanner;

public class ExceptionMain1 {

	public static void main(String[] args) {
		
		StudyException1 se = new StudyException1();
		
		Scanner sc = new Scanner(System.in);
		
		try {
			se.m1(sc);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
