package com.root.app.ztest;

import java.sql.Connection;

import com.root.app.utils.DBConnection;

public class DBConnectionTest {
	
	public void getConnectionTest() throws Exception {
		// DBConnection의 Connection 메서드 테스트
		
		Connection connection = DBConnection.getConnection();
		
		if(connection != null) {
			System.out.println("테스트 성공");
		}else {
			System.out.println("실패");
		}
		
	}
	

}
