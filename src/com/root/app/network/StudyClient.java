package com.root.app.network;

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

public class StudyClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
//		ip:port
//		java ip+port -> socket
//		서버에 접속
		Scanner sc = new Scanner(System.in);
		Socket socket = new Socket("192.168.200.54", 8282);
		System.out.println("서버와 접속 성공");
		
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		System.out.println("서버로 보낼 메세지 입력");
		String message = sc.next();
		
		bw.write(message);
		bw.write("\r\n");
		bw.flush();
		
		
		InputStream is = socket.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		String re = br.readLine();
		System.out.println("Server : " + re);
		
		br.close();
		ir.close();
		is.close();
		bw.close();
		ow.close();
		os.close();
		socket.close();
		sc.close();
		
		
		System.out.println("클라이언트 종료");

	}

}
