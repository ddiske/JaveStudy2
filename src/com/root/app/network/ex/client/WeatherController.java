package com.root.app.network.ex.client;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class WeatherController {
	
	
	
	public void start(String message, String data) {
//		1. 날씨 정보 출력
//		2. 종료
		
		
//		while(true) {
			if(message.equals("1")) {
				ArrayList<WeatherDTO> ar = new ArrayList<>();
				StringTokenizer st = new StringTokenizer(data, ",");
				WeatherView wv = new WeatherView();
				
				while(st.hasMoreTokens()) {
					WeatherDTO weatherDTO = new WeatherDTO();
					
					weatherDTO.setCity(st.nextToken().trim());
					weatherDTO.setGion(Integer.parseInt(st.nextToken().trim()));
					weatherDTO.setHumidity(Double.parseDouble(st.nextToken().trim()));
					weatherDTO.setStatus(st.nextToken().trim());
					
					ar.add(weatherDTO);
					
				}
				
				System.out.println("날씨 정보를 출력합니다");
				
				wv.view(ar);
				
				
			}else if(message.equals("2")) {
				System.out.println("종료");
				
				
				
			}else {
				System.out.println("다시 입력하세요");
			}
			
//		}
		
		
		
		
		
		
		
	}
	
	

}
