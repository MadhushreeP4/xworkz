package com.xworkz.rocket.component;

public class RocketComponent {
	
	private String fuelType;
	private String country;
	
	public RocketComponent(String country) {
		super();
		System.out.println("created RocketComponent with country parameter "+country);
		this.country = country;
	}

	public RocketComponent(String fuelType, String country) {
		super();
		System.out.println("created RocketComponent with all field parameters "+fuelType+" "+country);
		this.fuelType = fuelType;
		this.country = country;
	}

}
