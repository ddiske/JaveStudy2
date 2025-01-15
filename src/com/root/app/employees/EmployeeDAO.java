package com.root.app.employees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.root.app.utils.DBConnection;

public class EmployeeDAO {
	
	public Map<String, Object> getInfo() throws Exception {
		Map<String, Object> map = new HashMap<>();
		
		// 부서별, 부서번호, 평균월급, 사원수
		Connection connection = DBConnection.getConnection();
		String sql = "SELECT AVG(SALARY), COUNT(EMPLOYEE_ID)"
				+ "FROM EMPLOYEES"
				+ "GROUP BY DEPARTMENT_ID\r\n"
				+ "ORDER BY DEPARTMENT_ID ASC";
		
		PreparedStatement st = connection.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		List<Map<String, Object>> ar = new ArrayList();
		
		while(rs.next()) {
//		map.put("department_id", rs.getInt("DEPARTMENT_ID"));
			map = new HashMap<>();
			map.put("avg", rs.getDouble("AVG(SALARY)"));
			map.put("count", rs.getInt(2));
			ar.add(map);
		}
		DBConnection.disConnect(rs, st, connection);
		
		return map;
	}
	
	
	public List<EmployeeDTO> getList(String search) throws Exception {
		
		List<EmployeeDTO> ar = new ArrayList<>();
		
		Connection connection = DBConnection.getConnection();
		
		String sql = "SELECT EMPLOYEE_ID, LAST_NAME, JOB_ID FROM EMPLOYEES"
				+ " WHERE LAST_NAME LIKE '%'||?||'%'";
		
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
