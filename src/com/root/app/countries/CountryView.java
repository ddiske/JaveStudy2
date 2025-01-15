package com.root.app.countries;

import java.util.List;

public class CountryView {
	
	public void view(String message) {
		System.out.println(message);
	}
	
	
	public void view(CountryDTO countryDTO) {
		
		System.out.println("국가ID\t국가이름\t대륙번호");
		
		System.out.print(countryDTO.getCountry_id()+"\t");
		System.out.print(countryDTO.getCountry_name()+"\t");
		System.out.println(countryDTO.getRegion_id());
		
	}
	
	
	public void view(List<CountryDTO> ar) {
		System.out.println("국가ID\t국가이름\t대륙번호");
		
		for(CountryDTO countryDTO : ar) {
			System.out.print(countryDTO.getCountry_id()+"\t");
			System.out.print(countryDTO.getCountry_name()+"\t");
			System.out.println(countryDTO.getRegion_id());
			
		}
		
		
	}
	
	

}
