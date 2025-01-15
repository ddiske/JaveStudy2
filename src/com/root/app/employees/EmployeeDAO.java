package com.root.app.employees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.root.app.utils.DBConnection;

public class EmployeeDAO {
	
	public List<EmployeeDTO> getList(String search) throws Exception {
		
		List<EmployeeDTO> ar = new ArrayList<>();
		
		Connection connection = DBConnection.getConnection();
		
		String sql = "SELECT EMPLOYEE_ID, LAST_NAME, JOB_ID FROM EMPLOYEES"
				+ " WHERE LAST_NAME LIKE '%?%'";
		
		PreparedStatement st = connection.prepareStatement(sql);
		
		st.setString(1, search);
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			EmployeeDTO employeeDTO = new EmployeeDTO();
			employeeDTO.setEmployee_id(rs.getInt("EMPLOYEE_ID"));
			employeeDTO.setLast_name(rs.getString("LAST_NAME"));
			employeeDTO.setJob_id(rs.getString("JOB_ID"));
			ar.add(employeeDTO);
		}
		
		DBConnection.disConnect(rs, st, connection);
		
		return ar;
	}
	
	
	
	
	
	
	

}
