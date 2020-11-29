package com.xworkz.constructor;

import com.xworkz.constructor.country.Country;

public class CountryTester {

	public static void main(String[] args) {

		Country country = new Country("INDIA", "New Delhi", 29, "Narendra Modi", "Ram Nath Kovind", "1.3 billion",
				"Taj Mahal", "ISRO");
		
		Country country2 = new Country("NORWAY", "Oslo", 11, "Erna Solberg", "No President, only One Ruler",
				"53.3 lakhs", "Land Of Midnight Sun", "NOSA");

		System.out.println(country.countryName);
		System.out.println(country.capitalName);
		System.out.println(country.noOfStates);
		System.out.println(country.primeMinister);
		System.out.println(country.president);
		System.out.println(country.population);
		System.out.println(country.famousThing);
		System.out.println(country.spaceAgency);
		
		System.out.println(" ");
		
		System.out.println(country2.countryName);
		System.out.println(country2.capitalName);
		System.out.println(country2.noOfStates);
		System.out.println(country2.primeMinister);
		System.out.println(country2.president);
		System.out.println(country2.population);
		System.out.println(country2.famousThing);
		System.out.println(country2.spaceAgency);

	}

}
