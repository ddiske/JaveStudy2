package com.root.app.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class StudyServer {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
//		클라이언트의 접속을 기다림
		ServerSocket ss = new ServerSocket(8282);
		System.out.println("클라이언트의 접속을 기다리는 중");
		
//		클라이언트와 1:1 socket 연결
		Socket socket = ss.accept();
		System.out.println("클라이언트와 연결 성공");
		
		InputStream is = socket.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		String message = br.readLine();
		
		System.out.println("Client : " + message);
		
		//==================================================
		
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		System.out.println("서버로 보낼 메세지 입력");
		String re = sc.next();		
		
		bw.write(re);
		bw.write("\r\n");
		bw.flush();
		
		bw.close();
		ow.close();
		os.close();
		br.close();
		ir.close();
		is.close();
		socket.close();
		ss.close();
		sc.close();
		

	}

}
