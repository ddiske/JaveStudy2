package com.root.app.countries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.root.app.utils.DBConnection;

public class CountryDAO {
	
	public List<CountryDTO> getList() throws Exception {
		Connection connection = DBConnection.getConnection();
		String sql = "SELECT * FROM COUNTRIES ORDER BY COUNTRY_NAME ASC";
		PreparedStatement st = connection.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		
		List<CountryDTO> ar = new ArrayList<>();
		
		while(rs.next()) {
			CountryDTO countryDTO = new CountryDTO();
			countryDTO.setCountry_id(rs.getString("COUNTRY_ID"));
			countryDTO.setCountry_name(rs.getString("COUNTRY_NAME"));
			countryDTO.setRegion_id(rs.getInt("REGION_ID"));
			ar.add(countryDTO);
		}
		
		DBConnection.disConnect(rs, st, connection);
		
		return ar;
		
	}
	
	public CountryDTO getDetail(CountryDTO countryDTO2) throws Exception {
		Connection connection = DBConnection.getConnection();
		String sql = "SELECT * FROM COUNTRIES WHERE COUNTRY_ID = ?";
		PreparedStatement st = connection.prepareStatement(sql);
		st.setString(1, countryDTO2.getCountry_id().toUpperCase());
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
