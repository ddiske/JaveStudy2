package com.root.app.langs;

public class Study2String4 {

	public static void main(String[] args) {
		//하나의 문자열을 여러개의 문자열로 분리
		//50-60-40-70 => 50, 60, 40, 70
		//parsing
		String data = "51-62,43,71";
		String [] datas = data.split("-");
		
		for(int i = 0; i < datas.length; i++) {
			System.out.println(datas[i]);
		}
		
		data = data.replace("-", ",");
		datas = data.split(",");
		
		for(int i = 0; i < datas.length; i++) {
			System.out.println(datas[i]);
		}

	}

}
