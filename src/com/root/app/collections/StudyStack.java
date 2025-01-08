package com.root.app.collections;

public class StudyStack {
	
	private int [] ar;
	
	
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
