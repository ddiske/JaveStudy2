package com.root.app.departments;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.root.app.utils.DBConnection;

public class DepartmentDAO {
//	DAO -> Data Access Object
//	DB에 접근 -> Data 조회하거나, 입력, 수정, 삭제
	

//	3. SQL문 생성
//	4. 미리 보내기
//	5. ?
//	6. 최종 전송 및 결과 처리
	
	public void getList() throws Exception {
		Connection connection = DBConnection.getConnection();
		
		String sql = "SELECT * FROM DEPARTMENTS ORDER BY 2 DESC";
		
		PreparedStatement st = connection.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getString("DEPARTMENT_NAME"));
		}
		
		DBConnection.disConnect(rs, st, connection);
		
	}
	
	
	
	
	public void getDetail() throws Exception {
		Connection connection = DBConnection.getConnection();
		
		String sql = "SELECT * FROM DEPARTMENTS WHERE DEPARTMENT_ID = 10";
		
		PreparedStatement st = connection.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			System.out.println(rs.getString("DEPARTMENT_NAME"));
			
		}else {
			System.out.println("데이터 없음");
		}
		
//		rs.close();
//		st.close();
//		connection.close();
		DBConnection.disConnect(rs, st, connection);
		
	}
	
	

}
