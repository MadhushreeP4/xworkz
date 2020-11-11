package com.xworkz.basics.CreditCard;

public class CreditCardEstimator {
	private static double balance=25000;
	
	public static void expenditure(double amount){
		if(amount<=1000){
			System.out.println("amount: "+amount);
			balance=balance-amount;
			System.out.println("remaining balance: "+balance);
		}
		else{
			System.out.println("amount: "+amount);
			System.out.println("cannot process, limit is 1000");
		}
	}
	public static double getbalance(){
		return balance;
	}

}
