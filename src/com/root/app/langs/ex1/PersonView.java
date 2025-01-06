package com.root.app.langs.ex1;

public class PersonView {
	
	public void view(Person [] persons) {
		System.out.println("이름"+"\t"+"\t"+"전화번호"+"\t"+"\t"+"이메일"+"\t"+"\t"+"생년월일");
		for(int i = 0; i < persons.length; i++) {
			System.out.print(persons[i].getName().trim() + "\t");
			System.out.print(persons[i].getPhone().trim()+ "\t");
			System.out.print(persons[i].getEmail().trim()+ "\t");
			System.out.print(persons[i].getBirth().trim()+ "\n");
			
		}
		
		
	}

}
