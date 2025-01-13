package com.root.app.thread;

public class StudyThread1 extends Thread {
	
	@Override
	public void run() {
		// 동시에 실행할 내용을 오버라이딩
		this.m1();
	}
	
	private void m1() {
		
		for(int i = 'a'; i <= 'z'; i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	

}
