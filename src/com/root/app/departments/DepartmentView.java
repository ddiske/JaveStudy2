package com.root.app.departments;

public class DepartmentView {
	
	public void view(String message) {
		System.out.println(message);
		
	}
	
	
	
	public void view(DepartmentDTO departmentDTO) {
		
		System.out.println("부서번호\t부서명\t관리자\t지역ID");
		
		System.out.print(departmentDTO.getDepartment_id()+"\t");
		System.out.print(departmentDTO.getDepartment_name()+"\t");
		System.out.print(departmentDTO.getManager_id()+"\t");
		System.out.println(departmentDTO.getLocation_id());
		
		
	}
	

}
