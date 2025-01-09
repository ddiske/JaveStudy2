package com.root.app.utils.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class SetMain4 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		HashSet<Integer> nums = new HashSet<>();
		
		
		while(nums.size() != 6) {
			int num = random.nextInt(45)+1;
			nums.add(num);
		}
		
		Iterator<Integer> it = nums.iterator();
		
		System.out.println(nums);
		
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		

	}

}
