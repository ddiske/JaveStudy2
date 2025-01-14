package com.root.app.regions;

import java.util.Scanner;

public class RegionController {
	
	public void start() throws Exception {
		
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		
		while(check) {
			System.out.println("1. 대륙 리스트 출력");
			System.out.println("2. 대륙 상세정보 출력");
			System.out.println("3. 종료");
			
			int select = sc.nextInt();
			
			RegionDAO regionDAO = new RegionDAO();
			RegionDTO regionDTO = new RegionDTO();
			RegionView regionView = new RegionView();
			
			if(select == 1) {
				regionDAO.getList();
			}else if(select == 2) {
				regionDTO = regionDAO.getDetail();
				if(regionDTO != null) {
					regionView.view(regionDTO);
				}else {
					regionView.view("없는 대륙입니다");
				}
			}else if(select == 3) {
					break;
			}else {
				System.err.println("다시");
			}
			
			
		}
		
		
		
	}
	
	

}
