package com.root.app.employees;

import java.util.List;

public class EmployeeView {
	
	public void view(List<EmployeeDTO> ar) {
		
		System.out.println("사원번호\t\t사원이름\t\t직종");
		
		for(EmployeeDTO employeeDTO : ar) {
			System.out.print(employeeDTO.getEmployee_id()+"\t\t");
			System.out.print(employeeDTO.getLast_name()+"\t\t");
			System.out.println(employeeDTO.getJob_id());
		}
		
	}
	

}
