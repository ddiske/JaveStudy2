package com.root.app.accounts;

import java.util.Calendar;

public class AccountService {
	
	private AccountDAO accountDAO;
	
	public AccountService() {
		accountDAO = new AccountDAO();
	}
	
	
	private static long count = 1;
	
	
	//가입
	public int add(AccountDTO accountDTO) throws Exception {
		
		// 중복 X
		// 날짜
		Calendar calendar = Calendar.getInstance();
		
		
		
		
		
		
	}
	
	
	

}
