package com.root.app.regions;

import java.util.List;
import java.util.Scanner;

public class RegionService {
	
	private RegionDAO regionDAO = new RegionDAO();
	
	public List<RegionDTO> getList() throws Exception {
		
		List<RegionDTO> ar = regionDAO.getList();
		
		return ar;
		
	}
	
	
	public RegionDTO getDetail(Scanner sc) throws Exception {
		System.out.println("대륙번호를 입력하세요");
		
		RegionDTO regionDTO = new RegionDTO();
		
		regionDTO.setRegion_id(sc.nextInt());
		
		regionDTO = regionDAO.getDetail(regionDTO);
		
		return regionDTO;
		
		
	}
	
	

}
