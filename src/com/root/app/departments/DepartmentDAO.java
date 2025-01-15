package com.root.app.departments;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.root.app.utils.DBConnection;

public class DepartmentDAO {
//	DAO -> Data Access Object
//	DB에 접근 -> Data 조회하거나, 입력, 수정, 삭제
	

//	3. SQL문 생성
//	4. 미리 보내기
//	5. ? 세팅
//	6. 최종 전송 및 결과 처리
	
	public List<DepartmentDTO> getList() throws Exception {
		Connection connection = DBConnection.getConnection();
		
		String sql = "SELECT * FROM DEPARTMENTS ORDER BY 2 DESC";
		
		PreparedStatement st = connection.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		List<DepartmentDTO> ar = new ArrayList<>();
		
		while(rs.next()) {
			DepartmentDTO departmentDTO = new DepartmentDTO();
			departmentDTO.setDepartment_id(rs.getInt("DEPARTMENT_ID"));
			departmentDTO.setDepartment_name(rs.getString("DEPARTMENT_NAME"));
			departmentDTO.setManager_id(rs.getInt("MANAGER_ID"));
			departmentDTO.setLocation_id(rs.getInt("LOCATION_ID"));
			ar.add(departmentDTO);
		}
		
		DBConnection.disConnect(rs, st, connection);
		
		return ar;
		
	}
	
	
	
	
	public DepartmentDTO getDetail(DepartmentDTO departmentDTO2) throws Exception {
		DepartmentDTO departmentDTO = null;
		
		Connection connection = DBConnection.getConnection();
		
		String sql = "SELECT * FROM DEPARTMENTS WHERE DEPARTMENT_ID = ?";
		
		PreparedStatement st = connection.prepareStatement(sql);
		
		// ? 값을 세팅
		st.setInt(1, departmentDTO2.getDepartment_id());
		
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			departmentDTO = new DepartmentDTO();
			departmentDTO.setDepartment_id(rs.getInt("DEPARTMENT_ID"));
			departmentDTO.setDepartment_name(rs.getString("DEPARTMENT_NAME"));
			departmentDTO.setManager_id(rs.getInt("MANAGER_ID"));
			departmentDTO.setLocation_id(rs.getInt("LOCATION_ID"));
		}
		
//		rs.close();
//		st.close();
//		connection.close();
		DBConnection.disConnect(rs, st, connection);
		
		return departmentDTO;
		
	}
	
	

}
