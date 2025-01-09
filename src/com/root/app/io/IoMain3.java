package com.root.app.io;

import java.io.File;

public class IoMain3 {

	public static void main(String[] args) {
		
		File file = new File("C:\\test", "Test.java");
		
		long size= file.length();
		System.out.println(size);
		
		file = new File("C:\\test");
		
		String [] list = file.list();
		
		
		System.out.println("==========");
		
		//향상된 for문
		for(String s:list) {
			if(s.contains(".")) {
				System.out.println(s);
			}
		}
		
		System.out.println("==========");
		
		File [] files = file.listFiles();
		
		for(File f:files) {
			if(f.isDirectory()) {
				System.out.println(f.getName());				
			}
		}
		

	}

}
