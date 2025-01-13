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

public class ClientMain {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		System.out.println("Client Start");
		
		Socket socket = new Socket("192.168.200.54", 8282);//127.0.0.1 이나 localhost는 자동으로 내 컴퓨터ip와 연결
		System.out.println("서버와 접속 성공");
		
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		InputStream is = socket.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		WeatherController wc = new WeatherController();
		
		
		String data = null;

		data = br.readLine();
		wc.start(data);
		
//		if(wc.start(data).equals("1")) {
//			
//		}
//		
		
		
		System.out.println("서버와 연결을 끊습니다");
		br.close();
		ir.close();
		is.close();
		bw.close();
		ow.close();
		os.close();
		socket.close();

	}

}
