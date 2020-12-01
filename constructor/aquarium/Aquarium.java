package com.xworkz.constructor.aquarium;

public class Aquarium {

	public int totalFishes;
	public String fishType;
	public String fishColor;
	public String aquariumShape;

	public Aquarium() {
		System.out.println("Invoked default constructor");
	}

	public Aquarium(String aquariumShape) {
		System.out.println("Constructor-shape");
		this.aquariumShape = aquariumShape;
	}

	public Aquarium(int totalFishes) {
		System.out.println("Constructor-total fishes");
		this.totalFishes = totalFishes;
	}

	public Aquarium(String fishType,String fishColor) {
		System.out.println("Constructor-type & color");
		this.fishType = fishType;
		this.fishColor = fishColor;
	}

	public Aquarium(String aquariumShape, int totalFishes, String fishType, String fishColor) {
		System.out.println("Constructor-all");
		this.aquariumShape = aquariumShape;
		this.totalFishes = totalFishes;
		this.fishType = fishType;
		this.fishColor = fishColor;
	}

}
