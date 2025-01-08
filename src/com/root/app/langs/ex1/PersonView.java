package com.root.app.langs.ex1;

import java.util.ArrayList;

public class PersonView {
	
	
	
	
	public void view(Person person) {
		System.out.print(person.getName().trim() + "\t");
		System.out.print(person.getPhone().trim()+ "\t");
		System.out.print(person.getEmail().trim()+ "\t");
		System.out.print(person.getBirth().trim()+ "\n");
		
	}
	
	public void view(ArrayList<Person> ar) {
		
		for(int i = 0; i < ar.size(); i++) {
			System.out.print(ar.get(i).getName().trim() + "\t");
			System.out.print(ar.get(i).getPhone().trim()+ "\t");
			System.out.print(ar.get(i).getEmail().trim()+ "\t");
			System.out.print(ar.get(i).getBirth().trim()+ "\n");
			
		}
		
		
	}
	


}
