package com.xworkz.basics.pocket;

public class PocketMoneyTester {

	public static void main(String[] args) {
		PocketMoneyEstimator.request(150, "monday");
		PocketMoneyEstimator.request(400, "tuesday");
		
		PocketMoneyEstimator.expenditure(120);
		
		PocketMoneyEstimator.request(80, "wednesday");
		
		double money=PocketMoneyEstimator.getTotalAmount();
		System.out.println("total pocket money: "+money);
	}

}
