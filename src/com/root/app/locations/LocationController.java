package com.root.app.locations;

import java.util.Scanner;

public class LocationController {
	
	private LocationDAO locationDAO;
	
	public LocationController() {
		locationDAO = new LocationDAO();
	}
	
	
	public void start() throws Exception{
		
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		
		while(check) {
			System.out.println("1. 지역 리스트 출력");
			System.out.println("2. 지역 상세정보 출력");
			System.out.println("3. 종료");
			
			int select = sc.nextInt();
			
			if(select == 1) {
				locationDAO.getList();
			}else if(select == 2) {
				LocationDTO locationDTO = new LocationDTO();
				locationDTO = locationDAO.getDetail();
				LocationView locationView = new LocationView();
				if(locationDTO != null) {
					locationView.view(locationDTO);
				}else {
					locationView.view("없는 지역입니다");
				}
			}else if(select == 3) {
				check = !check;
			}else {
				System.out.println("다시");
			}
			
		}
		
		
	}
	

}
