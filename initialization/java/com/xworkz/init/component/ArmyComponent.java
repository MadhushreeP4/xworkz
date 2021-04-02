package com.xworkz.init.component;

public class ArmyComponent {
	
	private String countryName;
	private int strength;
	private String type;
	
	public ArmyComponent(String countryName) {
		super();
		System.out.println("created ArmyComponent "+countryName);
		this.countryName = countryName;
	}
	
	public void setStrength(int strength) {
		System.out.println("invoked setStrength");
		this.strength = strength;
	}
	
	public void setType(String type) {
		System.out.println("invoked getType");
		this.type = type;
	}
	
	public int getStrength() {
		System.out.println("invoked getStrength");
		return strength;
	}
	
	public String getType() {
		System.out.println("invoked getType");
		return type;
	}
	

	
}
