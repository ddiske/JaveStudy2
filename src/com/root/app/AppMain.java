package com.root.app;

import com.root.app.departments.DepartmentDAO;
import com.root.app.locations.LocationDAO;


public class AppMain {

	public static void main(String[] args) {
		
		System.out.println("프로그램 실행");
		
//		객체 생성
//		클래스명 변수명 = new 생성자();
		DepartmentDAO departmentDAO = new DepartmentDAO();
		LocationDAO locationDAO = new LocationDAO();
		
		
//		멤버 사용
//		참조변수(객체를 갖고 있는 주소를 담은 변수)명, 멤버명
		
		try {
			locationDAO.getList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		System.out.println("프로그램 종료");
		
	}

}
