package com.root.app.collections;

public class CollectionMain {

	public static void main(String[] args) {
		
		StudyStack ss = new StudyStack();
		ss.add(0);
		ss.add(1);
		ss.add(2);
		ss.add(3);
		ss.add(4);
		ss.add(5);
		ss.add(6);
		ss.info();
		
		System.out.println("=======");
		
		System.out.println(ss.pop());
		
		System.out.println("=======");
		
		ss.info();
		
		System.out.println("==========");
		
		ss.set(1);
		ss.set(3);
		ss.set(5);
		ss.set(7);
		ss.set(9);
		
		ss.info();

	}

}
