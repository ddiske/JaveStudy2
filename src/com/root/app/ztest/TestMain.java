package com.root.app.ztest;

public class TestMain {

	public static void main(String[] args) {
		try {
			
//			DBConnectionTest test = new DBConnectionTest();
//			test.getConnectionTest();
			
//			UserTest test = new UserTest();
//			test.testGetDetail();
			
			ProductTest test = new ProductTest();
			test.updateTest();
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
