package com.root.app.departments;

import java.util.List;
import java.util.Scanner;

public class DepartmentService {
	
	private DepartmentDAO departmentDAO = new DepartmentDAO();
	
	public void setDepartmentDAO(DepartmentDAO departmentDAO) {
		this.departmentDAO = departmentDAO;
	}
	
	{
		departmentDAO = new DepartmentDAO();
	}
	
	public DepartmentService() {
		departmentDAO = new DepartmentDAO();
	}
	
	public DepartmentService(DepartmentDAO departmentDAO) {
		this.departmentDAO = new DepartmentDAO();
	}
	
	public List<DepartmentDTO> getList() throws Exception {
	
		return departmentDAO.getList();
		
	}
	
	public DepartmentDTO getDetail(Scanner sc) throws Exception {
		System.out.println("조회할 부서 번호 입력");
		
		DepartmentDTO departmentDTO = new DepartmentDTO();
		
		departmentDTO.setDepartment_id(sc.nextInt());
		
		departmentDTO = departmentDAO.getDetail(departmentDTO);
		
		return departmentDTO;
		
	}
	
	
	

}
