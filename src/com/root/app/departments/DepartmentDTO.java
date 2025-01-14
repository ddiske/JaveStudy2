package com.root.app.departments;

public class DepartmentDTO {
//	DTO를 선언하는 규칙
//	모든 멤버변수의 접근 지정자는 private
//	getter, setter
//	기본 생성자는 필수
//	멤버변수명은 대응하는 테이블의 컬럼명과 동일
//	데이터타입도 대응하는 테이블의 타입과 동일
	
	
	private int department_id;
	private String department_name;
	private int manager_id;
	private int location_id;
	
	
	
	
	
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	public int getManager_id() {
		return manager_id;
	}
	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}
	public int getLocation_id() {
		return location_id;
	}
	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}
	
	
	
	

}
