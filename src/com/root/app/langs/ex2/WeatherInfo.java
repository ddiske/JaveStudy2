package com.root.app.langs.ex2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WeatherInfo {
	
	private StringBuffer info;
	
	
	public WeatherInfo() {
		this.info = new StringBuffer();
		this.info.append("seoul, 10, 0.3, 맑음,");
		this.info.append("일산, -12, 0.56, 흐림,");
		this.info.append("인천* 32* 0.95* 무더위,");
		this.info.append("제주* 56* 0.02* 건조");
	}
	
	
	public WeatherDTO [] init() {
		String data = this.info.toString().replace("*", ",");
		StringTokenizer st = new StringTokenizer(data, ",");
		WeatherDTO [] dtos = new WeatherDTO[st.countTokens()/4];
		
		
				
		for(int i = 0; i < dtos.length; i++) {
			WeatherDTO weatherDTO = new WeatherDTO();
			
			dtos[i] = weatherDTO;
			
			dtos[i].setCity(st.nextToken().trim());
			dtos[i].setGion(Integer.parseInt(st.nextToken().trim()));
			dtos[i].setHumidity(Double.parseDouble(st.nextToken().trim()));
			dtos[i].setStatus(st.nextToken().trim());
			
		}
		
		
		
		return dtos;
	}
	
	
	
	
	
	public WeatherDTO [] init_old() {
//		info의 정보를 파싱해서
//		WeatherDTO에 담아서
//		WeatherDTO들을 리턴
		
		String data = this.info.toString();
		String [] datas = data.replace("*", ",").split(",");
		
		
		
		WeatherDTO [] dtos = new WeatherDTO[datas.length/4];
		
		
		
	
		
		int idx = 0;
		for(int i = 0; i < datas.length; i++) {
			WeatherDTO weatherDTO = new WeatherDTO();
			
			dtos[i/4] = weatherDTO;
			
			weatherDTO.setCity(datas[i].trim());
			weatherDTO.setGion(Integer.parseInt(datas[++i].trim()));
			weatherDTO.setHumidity(Double.parseDouble(datas[++i].trim()));
			weatherDTO.setStatus(datas[++i].trim());
			
			
		}
		
		return dtos;
		
	}
	
	
	
//	public void find(WeatherDTO [] dtos) {
//		System.out.println("도시 이름 입력");
//		Scanner sc = new Scanner(System.in);
//		String select = sc.next();
//		
//		
//		
//		
//		for(int i = 0; i < dtos.length; i++) {
//			if(dtos[i].getCity().equals(select)) {
//				System.out.println("도시명\t기온\t습도\t날씨");
//				System.out.print(dtos[i].getCity()+"\t");
//				System.out.print(dtos[i].getGion()+"\t");
//				System.out.print(dtos[i].getHumidity()+"\t");
//				System.out.print(dtos[i].getStatus()+"\n");
//				break;
//			}else {
//				System.out.println("찾으시는 정보가 없습니다");
//				break;
//			}
//				
//		}
//		
//		
//	}
	
	
	
	public WeatherDTO findByName(WeatherDTO [] dtos, Scanner sc) {
		System.out.println("도시 이름 입력");
		String name = sc.next();
		
		for(int i = 0; i < dtos.length; i++) {
			if(name.equals(dtos[i].getCity())) {
				return dtos[i];
			}
		}
		
		
		
		
		return null;
	}
	
	
	public WeatherDTO [] addInfo(WeatherDTO [] dtos, Scanner sc) {
		WeatherDTO addinfo = new WeatherDTO();
		WeatherDTO [] addinfos = new WeatherDTO[dtos.length+1];
		System.out.println("정보를 추가합니다");
		for(int i = 0; i < dtos.length; i++) {
			addinfos[i] = dtos[i];
		}
		
		
		System.out.println("도시 입력");
		addinfo.setCity(sc.next());
		System.out.println("온도 입력");
		addinfo.setGion(sc.nextInt());
		System.out.println("습도 입력");
		addinfo.setHumidity(sc.nextDouble());
		System.out.println("상태 입력");
		addinfo.setStatus(sc.next());
		
		
		addinfos[dtos.length] = addinfo;
		
		return addinfos;
	}
	
	public WeatherDTO [] delete(WeatherDTO [] dtos, Scanner sc) {
		System.out.println("도시를 입력하세요");
		String select = sc.next();
		WeatherDTO [] copy = new WeatherDTO[dtos.length-1];
		
		for(int i = 0; i < dtos.length; i++) {
			if(dtos[i].getCity().equals(select)) {
				int idx = 0;
				for(int j = 0; j < dtos.length; j++) {
					if(i == j) {
						continue;
					}
					copy[idx] = dtos[j];
					idx++;
				}
			}
		}		
		
		
		
		
		return copy;
	}
	
	
	
	
	
	
	

}
