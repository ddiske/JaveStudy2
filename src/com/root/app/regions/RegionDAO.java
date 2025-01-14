package com.root.app.regions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.root.app.utils.DBConnection;

public class RegionDAO {
	
	public void getList() throws Exception {
		Connection connection = DBConnection.getConnection();
		String sql = "SELECT * FROM REGIONS ORDER BY REGION_ID asc";
		PreparedStatement st = connection.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getString("REGION_NAME"));
		}
		
		DBConnection.disConnect(rs, st, connection);
		
	}
	
	
	public RegionDTO getDetail() throws Exception {
		Connection connection = DBConnection.getConnection();
		String sql = "SELECT * FROM REGIONS WHERE REGION_ID = 1";
		PreparedStatement st = connection.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		
		RegionDTO regionDTO = null;
		
		if(rs.next()) {
			regionDTO = new RegionDTO();
			regionDTO.setRegion_id(rs.getInt("REGION_ID"));
			regionDTO.setRegion_name(rs.getString("REGION_NAME"));
		}
		return regionDTO;
	}
	
	

}
