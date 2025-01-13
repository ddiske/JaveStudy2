package com.root.app.thread;

public class ThreadMain {

	public static void main(String[] args) {
		
		StudyThread1 st1 = new StudyThread1();
		StudyThread2 st2 = new StudyThread2();
		
		Thread thread = new Thread(st2);
		
		// OS 실행 부탁
		st1.start();
		thread.start();
		

	}

}
