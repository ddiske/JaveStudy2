package com.root.app.employees;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
		System.out.println("검색어 입력");
		String search = sc.next();
		
		
		
		List<EmployeeDTO> ar = employeeDAO.getList(search);
		
		return ar;
		
	}
	
	public void getInfo() throws Exception {
		Map<String, Object> map = employeeDAO.getInfo();
		
		Iterator<String> keys = map.keySet().iterator();
		
//		System.out.println(keys.hasNext());
//		System.out.println(map.get(keys.next()));
		while(keys.hasNext()) {
			
			System.out.println(map.get(keys.next()));
			
		}
		
	}

}
