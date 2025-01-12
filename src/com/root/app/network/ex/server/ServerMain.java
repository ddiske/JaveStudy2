package com.root.app.network.ex.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;

public class ServerMain {

	public static void main(String[] args) throws IOException {
		System.out.println("Server Start");

//		클라이언트에서 데이터 받기
//		1이 오면 sample.txt 내용을 읽어서
//		한 줄로 만든 다음에 client로 전송
		ServerSocket ss = new ServerSocket(8282);
		System.out.println("클라이언트의 접속을 기다리는 중");
		
		Socket socket = ss.accept();
		System.out.println("클라이언트와 연결 성공");
		
		
		InputStream is = socket.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		while(true) {
			
			String message = br.readLine();
			
			if(message.equals("1")) {
				
				String data = new String();
				File file = new File("C:\\test", "sample.txt");
				FileReader fr = new FileReader(file);
				BufferedReader fbr = new BufferedReader(fr);
				StringBuffer sb = new StringBuffer();
				
				
				while(data != null) {
					data = fbr.readLine();
					
					if(data == null) {
						break;
					}
					sb.append(data);
					sb.append(",");
					
				}
				data = sb.toString().replace("*", ",").trim();
				System.out.println(data);
				bw.write(data);
				bw.write("\r\n");
				bw.flush();
				break;
			}
		
		}

	}

}
