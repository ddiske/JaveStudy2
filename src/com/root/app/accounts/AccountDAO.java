package com.root.app.accounts;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.root.app.utils.DBConnection;

public class AccountDAO {
	
	public int add(AccountDTO accountDTO) throws Exception {
		Connection connection = DBConnection.getConnection();
		String sql = "INSERT INTO ACCOUNTS (ACCOUNTNUM, USERNAME, PRODUCTNUM)"
				+ " VALUES (?, ?, ?)";
		PreparedStatement st = connection.prepareStatement(sql);
		
		st.setString(1, accountDTO.getAccountnum());
		st.setString(2, accountDTO.getUsername());
		st.setLong(3, accountDTO.getProductnum());
		
		int result = st.executeUpdate();
		
		
		DBConnection.disConnect(st, connection);
		
		return result;
		
	}
	
	
	

}
