package com.root.app.collections;

public class StudyStack {
	
	private int [] ar;
	
	public int pop() {
//		ar 배열의 0번을 리턴하고
//		0번의 값을 삭제
		
		int idx = 0;
		idx = ar[0];
		
		int [] copy = new int [ar.length-1];
		
		for(int i = 0; i < copy.length; i++) {
			copy[i] = ar[i+1];
		}
		
		ar = copy;
		
		return idx;
		
	}
	
	public void set(int num) {
//		ar이 null이면 1칸 배열을 만들고 num을 대입
//		아니면 num의 값과 ar의 값들 중 일치하는게 있다면 대입하지 않음
//		일치하는게 없으면
//		기존 배열에 하나 더 큰 배열을 생성하고
//		num의 값을 마지막에 대입
		
		boolean flag = true;
		
		if(ar == null) {
			ar = new int [1];
			ar[0] = num;
		}else {
			for(int i = 0; i < ar.length; i++) {
				if(num == ar[i]) {
					flag = false;
					break;
				}else {
					continue;
				}
			}
			
			if(flag) {
				int [] copy = new int [ar.length+1];
				copy[copy.length-1] = num;
				
				for(int i = 0; i < ar.length; i++) {
					copy[i] = ar[i];
					
				}
				
				ar = copy;
				
			}
		
		}
		
		
	}
	
	
	
	public void add(int num) {
//		ar 이 null이면 1칸 배열을 만들고 num을 대입
//		ar이 null이 아니면 기존 배열에 하나 더 큰 배열을 생성하고 
//		num의 값을 0번 index에 대입
		
		if(ar == null) {
			ar = new int [1];
			ar[0] = num;
		}else if(ar != null) {
			
			int [] copy = new int [ar.length+1];
			copy[0] = num;
			
			for(int i = 0; i < ar.length; i++) {
				copy[i+1] = ar[i];
				
			}
			
			ar = copy;
			
		}
		
		
		
	}
	
	
	
	public void info() {
		for(int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
			
		}
	}
	
	
	
	
	
	
}
