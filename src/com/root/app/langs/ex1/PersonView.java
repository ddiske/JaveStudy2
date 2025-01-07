package com.root.app.langs.ex1;



public class PersonView {
	
	
	
	
	public void view(Person person) {
		System.out.print(person.getName().trim() + "\t");
		System.out.print(person.getPhone().trim()+ "\t");
		System.out.print(person.getEmail().trim()+ "\t");
		System.out.print(person.getBirth().trim()+ "\n");
		
	}
	
	public void view(Person [] persons) {
		
		for(int i = 0; i < persons.length; i++) {
			System.out.print(persons[i].getName().trim() + "\t");
			System.out.print(persons[i].getPhone().trim()+ "\t");
			System.out.print(persons[i].getEmail().trim()+ "\t");
			System.out.print(persons[i].getBirth().trim()+ "\n");
			
		}
		
		
	}
	


}
