package com.root.app.utils.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class SetMain2 {

	public static void main(String[] args) {
		
		Member m1 = new Member();
		m1.setName("winter");
		m1.setAge(24);
		
		Member m2 = new Member();
		m2.setName("iu");
		m2.setAge(32);
		
		
		ArrayList<Member> ar = new ArrayList<>();
		ar.add(m1);
		ar.add(m2);
		
		HashSet<Member> hashSet = new HashSet<>();
		hashSet.add(m1);
		hashSet.add(m2);
		
		
		Member m3 = new Member();
		m3.setName("winter");
		m3.setAge(24);
		
		ar.add(m1);
		hashSet.add(m1);
		
		
		System.out.println(ar.size());
		System.out.println(hashSet.size());
		
		
		System.out.println(ar.contains("winter"));
		System.out.println(hashSet.contains("winter"));
		

	}

}
