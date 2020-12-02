package com.xworkz.copies.init;

public class Temple {
	private String name;
	private String location;
	private float openTime;
	private String prasada;
	private float closeTime;

	public Temple(String name, String location, float openTime, String prasada, float closeTime) {
		this.name = name;
		this.location = location;
		this.openTime = openTime;
		this.prasada = prasada;
		this.closeTime = closeTime;

	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public float getOpenTime() {
		return openTime;
	}

	public String getPrasada() {
		return prasada;
	}
	public void setPrasada(String prasada) {
		this.prasada = prasada;
	}

	public float getCloseTime() {
		return closeTime;
	}

}
