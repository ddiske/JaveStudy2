package com.root.app.ztest;

import java.util.Scanner;

import com.root.app.accounts.AccountDAO;
import com.root.app.accounts.AccountDTO;
import com.root.app.users.UserDAO;
import com.root.app.users.UserDTO;

public class AccountTest {
	
	private AccountDTO accountDTO;
	private AccountDAO accountDAO;
	private Scanner sc;
	
	
	
	public void addTest() throws Exception {
		accountDAO = new AccountDAO();
		accountDTO = new AccountDTO();
		sc = new Scanner(System.in);
		
		System.out.println("계좌번호, 회원아이디, 상품번호 입력");
		accountDTO.setAccountnum(sc.next());
		
		
		accountDTO.setUsername(sc.next());
		accountDTO.setProductnum(sc.nextInt());
		
		
		
		
		
		int result = accountDAO.add(accountDTO);
		
		if(result == 1) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		
	}
	
	public void userIdentify() throws Exception {
		sc = new Scanner(System.in);
		UserDAO userDAO = new UserDAO();
		UserDTO userDTO = new UserDTO();
		
		boolean check = true;
		
		
		while(check) {
			
			userDTO.setUsername(sc.next());
			
			UserDTO result = userDAO.getDetail(userDTO);
			
			
			if(result == null) {
				System.out.println("해당 회원 없음. 다시 입력하세요.");
			}
		
		}
	}
	

}
