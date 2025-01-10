package com.root.app.io.files;

import java.util.ArrayList;
import java.util.Iterator;

public class Weather {
	
	private String city;
	private int gion;
	private double humidity;
	private String status;
	
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getGion() {
		return gion;
	}
	public void setGion(int gion) {
		this.gion = gion;
	}
	public double getHumidity() {
		return humidity;
	}
	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	public void info(ArrayList<Weather> ar) {
		//멤버변수의 값을 출력하는 메서드
		
		System.out.println("도시\t기온\t습도\t상태");
		
		for(int i = 0; i < ar.size(); i++) {
			System.out.print(ar.get(i).getCity()+"\t");
			System.out.print(ar.get(i).getGion()+"\t");
			System.out.print(ar.get(i).getHumidity()+"\t");
			System.out.print(ar.get(i).getStatus()+"\n");
		}
		
		
		
	}
	

}
