package com.xworkz.dtObj.player;

public class PlayerDTO {
	private String name;
	private String country;
	private String[] sports;
	private String[] awards;
	
	public PlayerDTO(){
		System.out.println("Invoked PlayerDTO");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String[] getSports() {
		return sports;
	}

	public void setSports(String[] sports) {
		this.sports = sports;
	}

	public String[] getAwards() {
		return awards;
	}

	public void setAwards(String[] awards) {
		this.awards = awards;
	}
	
	

}
