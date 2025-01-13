package com.root.app.thread;

public class StudyThread2 implements Runnable {
	
	@Override
	public void run() {
		this.m2();
	}
	
	private void m2() {
		
		for(int i = 0; i < 25; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
