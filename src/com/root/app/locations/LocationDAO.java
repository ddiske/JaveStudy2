package com.root.app.locations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.root.app.utils.DBConnection;


public class LocationDAO {
//	3. SQL문 생성
//	4. 미리 보내기
//	5. ?
//	6. 최종 전송 및 결과 처리

	public void getList() throws Exception {
		Connection connection = DBConnection.getConnection();
		String sql = "SELECT * FROM LOCATIONS ORDER BY CITY ASC";
		PreparedStatement st = connection.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getString("CITY"));
			
		}
		
		DBConnection.disConnect(rs, st, connection);
		
	}
	
	
	
	
	
	public LocationDTO getDetail() throws Exception {
		LocationDTO locationDTO = null;
		
		Connection connection = DBConnection.getConnection();
		
		String sql = "SELECT * FROM LOCATIONS WHERE LOCATION_ID = 1000";
		
		PreparedStatement st = connection.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			locationDTO = new LocationDTO();
			locationDTO.setLocation_id(rs.getInt("LOCATION_ID"));
			locationDTO.setStreet_address(rs.getString("STREET_ADDRESS"));
			locationDTO.setPostal_code(rs.getString("POSTAL_CODE"));
			locationDTO.setCity(rs.getString("CITY"));
			locationDTO.setState_province(rs.getString("STATE_PROVINCE"));
			locationDTO.setCountry_id(rs.getString("COUNTRY_ID"));
		}
		
		
//		rs.close();
//		st.close();
//		connection.close();
		DBConnection.disConnect(rs, st, connection);
		
		return locationDTO;
	}
	
	
}
