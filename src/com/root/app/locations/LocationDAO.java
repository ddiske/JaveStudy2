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
	
	
	
	
	
	public void getDetail() throws Exception {
		
		Connection connection = DBConnection.getConnection();
		
		String sql = "SELECT * FROM LOCATIONS WHERE LOCATION_ID = 1000";
		
		PreparedStatement st = connection.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			System.out.println(rs.getString("CITY"));
			
		}else {
			System.out.println("데이터 없음");
		}
		
//		rs.close();
//		st.close();
//		connection.close();
		DBConnection.disConnect(rs, st, connection);
		
	}
	
	
}
