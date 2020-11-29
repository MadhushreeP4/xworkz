package com.xworkz.constructor.country;

public class Country {
	
	public String countryName;
	public String capitalName;
	public int noOfStates;
	public String primeMinister;
	public String president;
	public String population;
	public String famousThing;
	public String spaceAgency;
	
	public Country(String country,String capital,int states,String minister,String presidentName,String citizens,String famous,String agency){
		countryName = country;
		capitalName = capital;
		noOfStates = states;
		primeMinister = minister;
		president = presidentName;
		population = citizens;
		famousThing = famous;
		spaceAgency = agency;
	}
	
}
