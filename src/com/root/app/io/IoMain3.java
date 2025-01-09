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
//		for(String s:list) {
//			if(s.contains(".")) {
//				System.out.println(s);
//			}
//		}
		
		for(String s:list) {
			File file1 = new File(file, s);
			if(file1.isDirectory()) {
				System.out.print(s);
				System.out.println("\t폴더");
			}else if(file1. isFile()) {
				System.out.print(s);
				System.out.println("\t파일");
			}else {
				System.out.print(s);
				System.out.println("\t모름");
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
