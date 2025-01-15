package com.root.app.employees;

import java.util.List;
import java.util.Scanner;

public class EmployeeController {
	
	private EmployeeService employeeService;
	private EmployeeView employeeView;
	
	public EmployeeController() {
		employeeService = new EmployeeService();
		employeeView = new EmployeeView();
	}
	
	
	public void start() throws Exception {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		
		while(check) {
			System.out.println("1. 사원 리스트 출력");
			System.out.println("2. 종료");
			int select = sc.nextInt();
			
			if(select == 1) {
				List<EmployeeDTO> ar = employeeService.getList();
				employeeView.view(ar);
			}else {
				break;
			}
			
		}
		
		
		
	}
	
	

}
