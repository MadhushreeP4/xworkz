package com.xworkz.basics.pocket;

public class PocketMoneyEstimator {
	private static double totalAmount;
	
	public static void request(double amount,String day){
		System.out.println("requested amount: "+amount);
		System.out.println("day: "+day);
		
		totalAmount=totalAmount+amount;
		System.out.println("total amount: "+totalAmount);
	}
	
	public static void expenditure(double amount){
		System.out.println("Spending amount: "+amount);
		
		totalAmount=totalAmount-amount;
		System.out.println("remaining: "+totalAmount);
	}
	
	public static double getTotalAmount(){
		return totalAmount;
	}
}
