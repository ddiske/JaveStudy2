package com.root.app.langs.ex2;

public class Ex2Main {

	public static void main(String[] args) {
		
//		WeatherInfo wi = new WeatherInfo();
//		WeatherView wv = new WeatherView();
//		WeatherDTO [] weatherDTOs = wi.init();
//		
//		wv.view(weatherDTOs);

		WeatherController wc = new WeatherController();
		wc.start();
		
		
		
	}

}
