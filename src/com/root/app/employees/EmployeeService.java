package com.root.app.employees;

import java.util.List;
import java.util.Scanner;

public class EmployeeService {
	
	// 의존성(Dependency)
	private EmployeeDAO employeeDAO;
	
	public EmployeeService() {
		// 의존성 주입(Dependency Injection : DI)
		employeeDAO = new EmployeeDAO();
	}
	
	
//	list
	public List<EmployeeDTO> getList(Scanner sc) throws Exception{
		
		List<EmployeeDTO> ar = employeeDAO.getList();
		
		return ar;
		
	}
	

}
