package com.root.app.network.ex.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MainController {
	
	public void mainStart() throws Exception {
		Scanner sc = new Scanner(System.in);
		
		

		System.out.println("1.접속 2.종료");	
		String select = sc.next();
		
		if(select.equals("1")) {
			Socket socket = new Socket("127.0.0.1", 8282);//127.0.0.1 이나 localhost는 자동으로 내 컴퓨터ip와 연결
			System.out.println("서버와 접속 성공");
				
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter ow = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(ow);
				
			InputStream is = socket.getInputStream();
			InputStreamReader ir = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(ir);
				
			bw.write(select+"\r\t");
			bw.flush();
				
			String data = null;
			data = br.readLine();
			
			WeatherController weatherController = new WeatherController();
			weatherController.start(data);
			
			
			br.close();
			ir.close();
			is.close();
			bw.close();
			ow.close();
			os.close();
			socket.close();
			
			}else {
				System.out.println("종료");
				
				
			}
			
		
		
		}
		
		
		
	
	
	

}
