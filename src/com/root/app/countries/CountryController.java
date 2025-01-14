package com.root.app.countries;

import java.util.Scanner;

public class CountryController {
	
	private CountryDAO countryDAO;
	
	public CountryController() {
		countryDAO = new CountryDAO();
	}
	
	public void start() throws Exception {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		
		
		while(check) {
			System.out.println("1. 국가 리스트 출력");
			System.out.println("2. 국가 상세정보 출력");
			System.out.println("3. 종료");
			int select = sc.nextInt();

			if(select == 1) {
				countryDAO.getList();
			}else if(select == 2) {
				CountryDTO countryDTO = new CountryDTO();
				countryDTO = countryDAO.getDetail();
				CountryView countryView = new CountryView();
				if(countryDTO != null) {
					countryView.view(countryDTO);
				}else {
					countryView.view("없는 국가입니다");
				}
			}else if(select == 3) {
				check = !check;
			}else {
				System.out.println("다시");
			}
		}
		
		
	}

}
