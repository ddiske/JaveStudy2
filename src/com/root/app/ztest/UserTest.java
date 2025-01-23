package com.root.app.ztest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.root.app.users.UserDAO;
import com.root.app.users.UserDTO;

import oracle.jdbc.driver.parser.util.Array;

public class UserTest {
	
	private Scanner sc;
	private UserDAO userDAO;
	private UserDTO userDTO;
	
	
	public void test() throws Exception {
		this.sc = new Scanner(System.in);
		
		userDAO = new UserDAO();
		
		userDTO = new UserDTO();
		
		System.out.println("ID, PW, 이름, 전화번호, 이메일 입력");
		userDTO.setUsername(sc.next());
		userDTO.setPassword(sc.next());
		userDTO.setName(sc.next());
		userDTO.setPhone(sc.next());
		userDTO.setEmail(sc.next());
		
		int result = userDAO.join(userDTO);
		if(result == 1) {
		System.out.println(userDTO.getUsername());
		System.out.println(userDTO.getPassword());
		System.out.println(userDTO.getName());
		System.out.println(userDTO.getPhone());
		System.out.println(userDTO.getEmail());
		}
	}
	
	public void testGetList() throws Exception {
		userDAO = new UserDAO();
		
		List<UserDTO> users = new ArrayList<>();
		
		
		users = userDAO.getList();
		
		for(UserDTO userDTO : users) {
			System.out.print(userDTO.getUsername()+"\t");
			System.out.print(userDTO.getPassword()+"\t");
			System.out.print(userDTO.getName()+"\t");
			System.out.print(userDTO.getPhone()+"\t");
			System.out.print(userDTO.getEmail()+"\n");
		}
		
		
	}
	
	public void testGetDetail() throws Exception {
		this.sc = new Scanner(System.in);
		userDAO = new UserDAO();
		userDTO = new UserDTO();
		
		System.out.println("USERNAME 입력");
		userDTO.setUsername(sc.next());
		
		UserDTO userGetDetail = userDAO.getDetail(userDTO);
		
		if(userGetDetail.getUsername() != null) {
			System.out.print(userGetDetail.getUsername()+"\t");
			System.out.print(userGetDetail.getPassword()+"\t");
			System.out.print(userGetDetail.getName()+"\t");
			System.out.print(userGetDetail.getPhone()+"\t");
			System.out.print(userGetDetail.getEmail()+"\t");
		}else {
			System.out.println("해당 회원 없음");
		}
		
		
	}
	
	
	

}
