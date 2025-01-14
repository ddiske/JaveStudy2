package com.root.app.regions;

public class RegionView {
	
	public void view(String message) {
		System.out.println(message);
	}
	
	
	public void view(RegionDTO regionDTO) {
		System.out.println("대륙번호\t대륙이름");
		
		System.out.print(regionDTO.getRegion_id()+"\t");
		System.out.println(regionDTO.getRegion_name()+"\t");
	}
	

}
