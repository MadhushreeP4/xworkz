package com.xworkz.coffeeShop.appliances;

public class Power {

	private int voltage = 0;

	public Power() {
		System.out.println("Power initialized");
	}

	public boolean generatePower() {
		this.voltage = 200;
		return true;
	}
}
