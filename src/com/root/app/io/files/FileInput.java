package com.root.app.io.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class FileInput {
	
	
	
	public ArrayList<Weather> input() throws FileNotFoundException, IOException {
		File file = new File("C:\\test\\sample.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		ArrayList<Weather> ar = new ArrayList<>();
		
		
		boolean check = true;
		while(check) {
			String data = br.readLine();
			
			
			
			if(data == null) {
				check = !check;
				break;
			}
			
			StringTokenizer st = new StringTokenizer(data, "-");
			
			while(st.hasMoreTokens()) {
				
				//Weather에 Data 입력하고
				//Weather들을 모아서 리턴
				//Main 메서드에 모든 내용을 출력
				Weather wt = new Weather();
				
				
				
				wt.setCity(st.nextToken());
				wt.setGion(Integer.parseInt(st.nextToken()));
				wt.setHumidity(Double.parseDouble(st.nextToken()));
				wt.setStatus(st.nextToken());
				
				ar.add(wt);
				
				
				
			}
			
			
//			System.out.println(datas);
		}
		
		
		
		
		br.close();
		fr.close();
		
		return ar;
	}
	

}
