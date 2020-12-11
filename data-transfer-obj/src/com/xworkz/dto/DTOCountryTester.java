package com.xworkz.dto;

import java.util.Arrays;

import com.xworkz.dto.country.CountryDTO;

public class DTOCountryTester {

	public static void main(String[] args) {

		CountryDTO countryDTO = new CountryDTO();
		System.out.println(" ");

		CountryDTO countryDTO2 = new CountryDTO("INDIA");
		System.out.println(countryDTO2.getName());
		countryDTO2.setName("India");
		System.out.println(countryDTO2.getName());
		System.out.println(" ");

		CountryDTO countryDTO3 = new CountryDTO("Bharath", "Asia", 1380004385);
		System.out.println(countryDTO3.getName());
		System.out.println(countryDTO3.getContinent());
		System.out.println(countryDTO3.getPopulation());
		countryDTO3.setPrimeMinister("Narendra Modi");
		System.out.println(countryDTO3.getPrimeMinister());
		System.out.println(" ");

		CountryDTO countryDTO4 = new CountryDTO("Narendra Modi", "RamNath Kovind");
		System.out.println(countryDTO4.getPrimeMinister());
		System.out.println(countryDTO4.getPresident());
		System.out.println(" ");

		String[] states = { "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat",
				"Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "Karnataka", "Kerala",
				"Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab",
				"Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", "Uttar Pradesh", "Uttarakhand",
				"West Bengal" };
		
		String[] languages = new String[8];
		languages[0] = "Kannada";
		languages[1] = "Hindi";
		languages[2] = "English";
		languages[3] = "Tamil";
		languages[4] = "Telugu";
		languages[5] = "Konkani";
		languages[6] = "Gujarati";
		languages[7] = "Malayalam";

		CountryDTO countryDTO5 = new CountryDTO(states, languages);
		System.out.println(Arrays.toString(countryDTO5.getStates()));
		System.out.println(" ");
		System.out.println(Arrays.toString(countryDTO5.getLanguages()));

	}

}
