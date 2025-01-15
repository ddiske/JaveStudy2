package com.root.app.regions;

import java.util.List;
import java.util.Scanner;


public class RegionController {
	
	private RegionService regionService;
	private RegionView regionView;
	
	public RegionController() {
		regionService = new RegionService();
		regionView = new RegionView();
	}
	
	public void start() throws Exception {
		
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		
		while(check) {
			System.out.println("1. 대륙 리스트 출력");
			System.out.println("2. 대륙 상세정보 출력");
			System.out.println("3. 종료");
			
			int select = sc.nextInt();
			
			
			if(select == 1) {
				List<RegionDTO> ar = regionService.getList();
				regionView.view(ar);
			}else if(select == 2) {
				RegionDTO regionDTO = regionService.getDetail(sc);
				
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
