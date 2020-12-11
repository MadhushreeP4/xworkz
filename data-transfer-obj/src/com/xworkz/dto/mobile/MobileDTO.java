package com.xworkz.dto.mobile;

public class MobileDTO {
	private String name;
	private String color;
	private String version;
	private String company;
	private int price;
	private String intStorage;
	private double size;
	private int RAMInGb;

	public MobileDTO(String name, String intStorage, double size, int rAMInGb) {
		super();
		this.name = name;
		this.intStorage = intStorage;
		this.size = size;
		RAMInGb = rAMInGb;
	}

	public MobileDTO(String color, String version, String company) {
		this.color = color;
		this.version = version;
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getIntStorage() {
		return intStorage;
	}

	public void setIntStorage(String intStorage) {
		this.intStorage = intStorage;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public int getRAMInGb() {
		return RAMInGb;
	}

	public void setRAMInGb(int rAMInGb) {
		RAMInGb = rAMInGb;
	}

}
