package com.xworkz.dto.country;

public class CountryDTO {
	private String name;
	private String continent;
	private String[] states;
	private int population;
	private String primeMinister;
	private String president;
	private String[] languages;

	public CountryDTO() {
		System.out.println("default constructor");
	}

	public CountryDTO(String name) {
		this.name = name;
	}

	public CountryDTO(String name, String continent, int population) {
		this.name = name;
		this.continent = continent;
		this.population = population;
	}

	public CountryDTO(String[] states, String[] languages) {
		this.states = states;
		this.languages = languages;
	}

	public CountryDTO(String primeMinister, String president) {
		this.primeMinister = primeMinister;
		this.president = president;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String[] getStates() {
		return states;
	}

	public void setStates(String[] states) {
		this.states = states;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public String getPrimeMinister() {
		return primeMinister;
	}

	public void setPrimeMinister(String primeMinister) {
		this.primeMinister = primeMinister;
	}

	public String getPresident() {
		return president;
	}

	public void setPresident(String president) {
		this.president = president;
	}

	public String[] getLanguages() {
		return languages;
	}

	public void setLanguages(String[] languages) {
		this.languages = languages;
	}

}
