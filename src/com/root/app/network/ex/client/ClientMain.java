package com.root.app.network.ex.client;


public class ClientMain {

	public static void main(String[] args) {
		
		System.out.println("Client Start");
		
		MainController mainController = new MainController();
		try {
			mainController.mainStart();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		System.out.println("Client 종료");


	}

}
