package com.root.app.users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.root.app.utils.DBConnection;

public class UserDAO {
//	1. 추가 (회원가입) join
	
	public int join(UserDTO userDTO) throws Exception {
		Connection connection = DBConnection.getConnection();
		String sql = "INSERT INTO USERS (USERNAME, PASSWORD, NAME, PHONE, EMAIL)"
					+ " VALUES (?, ?, ?, ?, ?)";
		PreparedStatement st = connection.prepareStatement(sql);
		
		
		
		
		
		st.setString(1, userDTO.getUsername());
		st.setString(2, userDTO.getPassword());
		st.setString(3, userDTO.getName());
		st.setString(4, userDTO.getPhone());
		st.setString(5, userDTO.getEmail());
		
		
		int result = st.executeUpdate();
		
		DBConnection.disConnect(st, connection);
		
		
		return result;
		
		
	}
	
	
//	2. 회원들의 목록을 조회 - 단, password는 빼고 조회
	public List<UserDTO> getList() throws Exception {
		Connection connection = DBConnection.getConnection();
		String sql = "SELECT USERNAME, NAME, PHONE, EMAIL"
				+ " FROM USERS";
		
		PreparedStatement st = connection.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		List<UserDTO> users = new ArrayList<>();
		
		while(rs.next()) {
			UserDTO userDTO = new UserDTO();
			userDTO.setUsername(rs.getString("USERNAME"));
			userDTO.setName(rs.getString("NAME"));
			userDTO.setEmail(rs.getString("EMAIL"));
			userDTO.setPhone(rs.getString("PHONE"));
			users.add(userDTO);
		}
		
		
		DBConnection.disConnect(rs, st, connection);
		
		
		
		return users;
	}
	
	
//	3. 회원의 USERNAME으로 회원 1명의 모든 정보를 조회
	public UserDTO getDetail(UserDTO userDTO) throws Exception {
		Connection connection = DBConnection.getConnection();
		String sql = "SELECT *"
				+ " FROM USERS WHERE USERNAME = ?";
		PreparedStatement st = connection.prepareStatement(sql);
		st.setString(1, userDTO.getUsername());
		
		ResultSet rs = st.executeQuery();
		
		UserDTO userGetDetail = new UserDTO();
		
		if(rs.next()) {
			userGetDetail.setUsername(rs.getString("USERNAME"));
			userGetDetail.setPassword(rs.getString("PASSWORD"));
			userGetDetail.setName(rs.getString("NAME"));
			userGetDetail.setPhone(rs.getString("PHONE"));
			userGetDetail.setEmail(rs.getString("EMAIL"));
			
		}
		
		DBConnection.disConnect(rs, st, connection);
		
		return userGetDetail;
	}
	
	
	

}
