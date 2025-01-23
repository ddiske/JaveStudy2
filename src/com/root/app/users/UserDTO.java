package com.root.app.users;

public class UserDTO {
//	선언
//	접근지정자 private
//	데이터타입과 변수명은 테이블과 동일하게
//	GETTER/SETTER
//	생성자는 기본 생성자가 필수
	
	private String username;
	private String password;
	private String name;
	private String phone;
	private String email;
	

	
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	

}
