package com.root.app.io;

import java.io.File;

public class IoMain2 {

	public static void main(String[] args) {
//		파일을 다루는 클래스
		File file = new File("C:\\test");
		
		boolean check = file.exists();
		System.out.println(check);
		
		check = file.isDirectory();
		System.out.println(check);
		check = file.isFile();
		System.out.println(check);
		File file2 = new File(file, "study2\\sub2");
		if(!file2.exists()) {
			file2.mkdirs();
		}
		
		File file3 = new File(file, "study2");
		file3.delete();
		
		

	}

}
