package com.root.app.locations;

import java.util.List;
import java.util.Scanner;

public class LocationService {
	
	private LocationDAO locationDAO = new LocationDAO();
	
	public List<LocationDTO> getList() throws Exception {
		List<LocationDTO> ar = locationDAO.getList();
		return ar;
	}
	
	public LocationDTO getDetail(Scanner sc) throws Exception {
		System.out.println("조회할 지역 번호 입력");
		
		LocationDTO locationDTO = new LocationDTO();
		
		locationDTO.setLocation_id(sc.nextInt());
		
		locationDTO = locationDAO.getDetail(locationDTO);
		
		return locationDTO;
		
	}
	
	

}
