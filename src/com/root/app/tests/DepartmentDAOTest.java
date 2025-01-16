package com.root.app.tests;

import com.root.app.departments.DepartmentDAO;
import com.root.app.departments.DepartmentDTO;

public class DepartmentDAOTest {
	
	private DepartmentDAO departmentDAO; 
	
	public DepartmentDAOTest() {
		departmentDAO = new DepartmentDAO();
	}
	
	public void getNameTest() throws Exception{
		DepartmentDTO departmentDTO = departmentDAO.getName();
		System.out.println(departmentDTO.getDepartment_name());
	}
	
	

}
