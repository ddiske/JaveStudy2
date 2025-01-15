package com.root.app.regions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.root.app.utils.DBConnection;

public class RegionDAO {
	
	public List<RegionDTO> getList() throws Exception {
		Connection connection = DBConnection.getConnection();
		String sql = "SELECT * FROM REGIONS ORDER BY REGION_ID ASC";
		PreparedStatement st = connection.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		
		List<RegionDTO> ar = new ArrayList<>();
		
		while(rs.next()) {
			RegionDTO regionDTO = new RegionDTO();
			regionDTO.setRegion_id(rs.getInt("REGION_ID"));
			regionDTO.setRegion_name(rs.getString("REGION_NAME"));
			ar.add(regionDTO);
		}
		
		DBConnection.disConnect(rs, st, connection);
		
		return ar;
		
	}
	
	
	public RegionDTO getDetail(RegionDTO regionDTO2) throws Exception {
		RegionDTO regionDTO = null;
		Connection connection = DBConnection.getConnection();
		String sql = "SELECT * FROM REGIONS WHERE REGION_ID = ?";
		PreparedStatement st = connection.prepareStatement(sql);
		st.setInt(1, regionDTO2.getRegion_id());
		ResultSet rs = st.executeQuery();
		
		
		if(rs.next()) {
			regionDTO = new RegionDTO();
			regionDTO.setRegion_id(rs.getInt("REGION_ID"));
			regionDTO.setRegion_name(rs.getString("REGION_NAME"));
		}
		return regionDTO;
	}
	
	

}
