package com.root.app.users;

import java.util.Scanner;

public class UserController {
	
	private Scanner sc;
	
	
	
	public void start(Scanner sc) throws Exception {
		
		boolean check = true;
		
		while(check) {
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원목록");
			System.out.println("4. 종료");
		}
		
		int select = sc.nextInt();
		
		if(select == 1) {
			// 회원가입
			UserDTO userDTO = UserInput.join(sc);
			int result = userService.join(userDTO);
		}else if(select == 2) {
			// 로그인
			
		}
		
		
		
	}
	
	

}
