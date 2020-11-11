package com.xworkz.basics.CreditCard;

public class CreditCardTester {

	public static void main(String[] args) {
		
		CreditCardEstimator.expenditure(200);
		CreditCardEstimator.expenditure(800);
		CreditCardEstimator.expenditure(1200);
		
		double remain=CreditCardEstimator.getbalance();
		System.out.println("total balance: "+remain);
	}

}
