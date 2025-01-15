package com.root.app.locations;

import java.util.List;

public class LocationView {
	
	public void view(String message) {
		System.out.println(message);
		
	}
	
	
	public void view(LocationDTO locationDTO) {
		System.out.println("지역ID\t주소\t우편번호\t도시\t주/도\t국가ID");
		
		System.out.print(locationDTO.getLocation_id()+"\t");
		System.out.print(locationDTO.getStreet_address()+"\t");
		System.out.print(locationDTO.getPostal_code()+"\t");
		System.out.print(locationDTO.getCity()+"\t");
		System.out.print(locationDTO.getState_province()+"\t");
		System.out.println(locationDTO.getCountry_id());
	}
	
	public void view(List<LocationDTO> ar) {
		System.out.println("지역ID\t주소\t우편번호\t도시\t주/도\t국가ID");
		
		for(LocationDTO locationDTO : ar) {
			System.out.print(locationDTO.getLocation_id()+"\t");
			System.out.print(locationDTO.getStreet_address()+"\t");
			System.out.print(locationDTO.getPostal_code()+"\t");
			System.out.print(locationDTO.getCity()+"\t");
			System.out.print(locationDTO.getState_province()+"\t");
			System.out.println(locationDTO.getCountry_id());
		}
		
	}
	

}
