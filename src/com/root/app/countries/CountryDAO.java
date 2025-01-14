package com.root.app.countries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.root.app.utils.DBConnection;

public class CountryDAO {
	
	public void getList() throws Exception {
		Connection connection = DBConnection.getConnection();
		String sql = "SELECT * FROM COUNTRIES ORDER BY COUNTRY_NAME ASC";
		PreparedStatement st = connection.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getString("COUNTRY_NAME"));
			
		}
		
		DBConnection.disConnect(rs, st, connection);
		
	}
	
	public CountryDTO getDetail() throws Exception {
		Connection connection = DBConnection.getConnection();
		String sql = "SELECT * FROM COUNTRIES WHERE REGION_ID = 3";
		PreparedStatement st = connection.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		
		CountryDTO countryDTO = null;

		if(rs.next()) {
			countryDTO = new CountryDTO();
			countryDTO.setCountry_id(rs.getString("COUNTRY_ID"));
			countryDTO.setCountry_name(rs.getString("COUNTRY_NAME"));
			countryDTO.setRegion_id(rs.getInt("REGION_ID"));
		}
		
		DBConnection.disConnect(rs, st, connection);
		
		return countryDTO;
		
	}

}
