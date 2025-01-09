package com.root.app.utils.collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetMain3 {

	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(21);
		hs.add(23);
		hs.add(22);
		
		Iterator<Integer> it = hs.iterator();
		
		System.out.println(it);
		System.out.println(it.getClass());
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
