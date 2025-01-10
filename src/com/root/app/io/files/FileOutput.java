package com.root.app.io.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOutput {
	
	private Scanner sc;
	
	public void add() {
		//도시명, 기온, 습도, 날씨상태를 입력 받아서
		//sample.txt에 추가
		StringBuffer sb = new StringBuffer();
		
		System.out.println("도시 입력");
//		String city = sc.next();
//		this.output2(city);
		sb.append(sc.next());
		sb.append("-");
		System.out.println("기온 입력");
//		String gion = sc.next();
//		this.output2(gion);
		sb.append(sc.next());
		sb.append("-");
		
		System.out.println("습도 입력");
//		String humidity = sc.next();
//		this.output2(humidity);
		sb.append(sc.next());
		sb.append("-");
		
		System.out.println("상태 입력");
//		String status = sc.next();
		sb.append(sc.next());
		
//		String result = city + "-" + gion + "-" + humidity + "-" + status;
		
		
		
		this.output(sb.toString());
		
		
		
		
	}
	
	
	
	
	
	public void write() {
		
		
		boolean check = true;
		
		while(check) {
			
			System.out.println("입력");
			String data = sc.next();
			
			
			if(data.equalsIgnoreCase("end")) {
				System.out.println("종료");
				check = !check;
				break;
			}
			
			this.output(data);
		}
		
		
		
	}
	
	
	
	
	
	
	
	private void output(String data) {
//		System.out.println("호출");
		//파일에 내용을 출력
		File file = new File("C:\\test\\sample.txt");
		file = new File("C:\\test", "sample.txt");
		FileWriter fw = null;
		
		
		try {
			//false : 기존의 파일을 삭제
			//true	: 기존의 파일에 내용 추가
			fw = new FileWriter(file, true);
//			System.out.println("check");
			fw.write(data);
			//buffer 초기화
			fw.write("\r\n");
			//buffer를 강제 비움
			fw.flush();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		sc.close();
//		System.out.println("종료");
	}

//	private void output2(String data) {
////		System.out.println("호출");
//		//파일에 내용을 출력
//		File file = new File("C:\\test\\sample.txt");
//		file = new File("C:\\test", "sample.txt");
//		FileWriter fw = null;
//		
//		
//		try {
//			//false : 기존의 파일을 삭제
//			//true	: 기존의 파일에 내용 추가
//			fw = new FileWriter(file, true);
////			System.out.println("check");
//			fw.write(data);
//			//buffer 초기화
//			fw.write("-");
//			//buffer를 강제 비움
//			fw.flush();
//			
//			
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			try {
//				fw.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		
//		
////		System.out.println("종료");
//	}
	
	

}
