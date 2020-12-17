package com.xworkz.coffeeShop;

import com.xworkz.coffeeShop.appliances.CoffeeMachine;

import com.xworkz.coffeeShop.appliances.Power;

public class CoffeeMachineTester {

	public static void main(String[] args) {

		CoffeeMachine coffeeMachine = new CoffeeMachine(new Power());

		boolean process = coffeeMachine.grind("Arabica");
		if (process) {
			System.out.println("Grinding is done");
		} else {
			System.out.println("Grinding is not done");
		}

	}

}
