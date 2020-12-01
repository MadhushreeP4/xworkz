package com.xworkz.constructor;

import com.xworkz.constructor.aquarium.Aquarium;

public class AquariumTester {

	public static void main(String[] args) {
		
		Aquarium aquarium=new Aquarium();
		
		Aquarium aquarium2=new Aquarium("Square");
		System.out.println(aquarium2.aquariumShape);
		
		Aquarium aquarium3=new Aquarium(4);
		System.out.println(aquarium3.totalFishes);
		
		Aquarium aquarium4=new Aquarium("Square",4,"Gold fish","gold");
		System.out.println(aquarium4.aquariumShape);
		System.out.println(aquarium4.totalFishes);
		System.out.println(aquarium4.fishType);
		System.out.println(aquarium4.fishColor);

	}

}
