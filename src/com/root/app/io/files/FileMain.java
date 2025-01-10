package com.root.app.io.files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class FileMain {

	public static void main(String[] args) {
		
//		FileOutput fileOutput = new FileOutput();
//		fileOutput.write();
		
		FileInput fileInput = new FileInput();
		FileOutput fileOutput = new FileOutput();
		ArrayList<Weather> ar = null;
		
		
		fileOutput.add();
		
		
		try {
			ar = fileInput.input();
//			for(Weather weather : ar) {
//				weather.info(ar);
//			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		Weather weather = new Weather();
		weather.info(ar);

	}

}
