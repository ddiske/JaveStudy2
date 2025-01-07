package com.root.app.langs.ex1;

import java.util.Scanner;

public class PersonInfo {
	
	private String data;
	

	
	
	public PersonInfo() {
		this.data = "iu, 010-1234-5678, iu@naver.com, 93-05-05,";
		this.data = this.data + "winter, 010-2222-2222, winter@gmail.com, 01-01-01,";
		this.data = this.data + "suji, 010-3333-3333, suji@naver.com, 99-12-24";
		
	}
	
//	메서드명 init
//	data의 변수의 값을 파싱
	
	public Person [] init() {
		String [] datas = this.data.split(",");
		
		
		
		//Person 객체에 데이터를 대입

		Person [] persons = new Person[datas.length/4];
		int idx = 0;
		for(int i = 0; i < datas.length; i++) {

			Person person = new Person();
			
			person.setName(datas[i]);
			person.setPhone(datas[++i]);
			person.setEmail(datas[++i]);
			person.setBirth(datas[++i]);
			
			persons[idx] = person;
			idx++;
		}
		
		
		//Person 객체들을 리턴
		return persons;
		
		
		
	}
	
	public Person findByName(Person [] persons, Scanner sc) {
		System.out.println("이름을 입력하세요");
		String find = sc.next();
		
		
		for(int i = 0; i < persons.length; i++) {
			if(persons[i].getName().equals(find)) {
				return persons[i];
			}
		}
		
		
		
		
		return null;
	}
	
	
	public Person [] add(Person [] persons, Scanner sc) {
		Person [] adds = new Person [persons.length+1];
		Person addpersons = new Person();
		
		for(int i = 0; i < persons.length; i++) {
			adds[i] = persons[i];
		}
		
		System.out.println("이름");
		addpersons.setName(sc.next());
		System.out.println("전화번호");
		addpersons.setPhone(sc.next());
		System.out.println("이메일");
		addpersons.setEmail(sc.next());
		System.out.println("생년월일");
		addpersons.setBirth(sc.next());
		
		adds[adds.length-1] = addpersons;
		
		
		
		
		return adds;
	}
	
	
	
	
	
	
}
