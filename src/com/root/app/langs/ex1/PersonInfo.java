package com.root.app.langs.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PersonInfo {
	
	private String data;
	

	
	
	public PersonInfo() {
		this.data = "iu, 010-1234-5678, iu@naver.com, 93-05-05,";
		this.data = this.data + "winter, 010-2222-2222, winter@gmail.com, 01-01-01,";
		this.data = this.data + "suji, 010-3333-3333, suji@naver.com, 99-12-24";
		
	}
	
//	메서드명 init
//	data의 변수의 값을 파싱
	
	public ArrayList<Person> init() {
		
		StringTokenizer st = new StringTokenizer(this.data, ",");
		
		//Person 객체에 데이터를 대입

		ArrayList<Person> ar = new ArrayList<>();
		
		while(st.hasMoreTokens()) {
			Person person = new Person();
			person.setName(st.nextToken().trim());
			person.setPhone(st.nextToken().trim());
			person.setEmail(st.nextToken().trim());
			person.setBirth(st.nextToken().trim());
			ar.add(person);
		}
		
		//Person 객체들을 리턴
		
		return ar;
		
		
	}
	
	public Person findByName(ArrayList<Person> ar, Scanner sc) {
		System.out.println("이름을 입력하세요");
		String find = sc.next();
		
		for(int i = 0; i < ar.size(); i++) {
			if(ar.get(i).getName().equals(find)) {
				
				return ar.get(i);
				
			}
		}
		
		return null;
	}
	
	
	public void add(ArrayList<Person> ar, Scanner sc) {
		Person person = new Person();
		
		System.out.println("이름 입력");
		person.setName(sc.next());
		
		System.out.println("번호 입력");
		person.setPhone(sc.next());
		
		System.out.println("이메일 입력");
		person.setEmail(sc.next());
		
		System.out.println("생년월일 입력");
		person.setBirth(sc.next());
		
		ar.add(person);
		
	}
	
	
	public void delete(ArrayList<Person> ar, Scanner sc) {
		System.out.println("삭제할 정보의 이름을 입력하세요");
		String select = sc.next();
		
		
		for(int i = 0; i < ar.size(); i++) {
			if(ar.get(i).getName().equals(select)) {
				
				ar.remove(i);
				
			}
		}
		
	}
	
	
	
	
	
	
	
}
