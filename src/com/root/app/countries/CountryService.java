package com.root.app.countries;

import java.util.List;
import java.util.Scanner;

public class CountryService {
	
	private CountryDAO countryDAO = new CountryDAO();
	
	public List<CountryDTO> getList() throws Exception {
		
		return countryDAO.getList();
		
	}
	
	
	public CountryDTO getDetail(Scanner sc) throws Exception {
		System.out.println("조회할 국가ID 입력");
		
		CountryDTO countryDTO = new CountryDTO();
		
		countryDTO.setCountry_id(sc.next());
		
		countryDTO = countryDAO.getDetail(countryDTO);
		
		
		return countryDTO;
	}
	
	

}
