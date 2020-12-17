package com.xworkz.coffeeShop.appliances;

public class CoffeeMachine {

	private Power power;

	public CoffeeMachine(Power power) {
		System.out.println("coffee machine initialized");
		this.power = power;
	}

	public boolean grind(String bean) {
		if (bean != null) {
			boolean genPower = this.power.generatePower();
			if (genPower) {
				System.out.println("grinding");
				return true;
			} else {
				System.out.println("not grinding");
				return false;
			}
		} else {
			System.out.println("grinding is not possible");
			return false;
		}
	}

}
