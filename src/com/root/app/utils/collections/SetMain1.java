package com.root.app.utils.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class SetMain1 {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		HashSet<Integer> hashSet = new HashSet<>();
		
		ar.add(1);
		ar.add(2);
		ar.add(1);
		boolean check = hashSet.add(10);
		hashSet.add(20);
		hashSet.add(10);
		
		
		
		System.out.println(ar);
		System.out.println(hashSet);

	}

}
