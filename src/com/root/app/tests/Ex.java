package com.root.app.tests;

import java.util.*;

public class Ex {
	public static void main(String[] args) {
		  Ex t = new Ex();
		  int a = 20;
		  int b[] = { 100, 200, 300 };
		  t.change(a, b);
		  t.display(a, b);
		 }

		 void change(int a, int b[]) {
		  a += 10;
		  b[1] += 10;
		 }

		 void display(int a, int b[]) {
		  System.out.println(a);
		  System.out.println(b[1]);
		 }
}