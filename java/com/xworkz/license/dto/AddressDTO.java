package com.xworkz.license.dto;

public class AddressDTO {

	private int doorNo;
	private String street;
	private String buildingName;
	private String area;
	private int pinCode;
	private String city;
	private String state;

	public AddressDTO() {
		super();
	}

	public AddressDTO(int doorNo, String street, String buildingName, String area, int pinCode, String city,
			String state) {
		super();
		this.doorNo = doorNo;
		this.street = street;
		this.buildingName = buildingName;
		this.area = area;
		this.pinCode = pinCode;
		this.city = city;
		this.state = state;
	}

	public int getDoorNo() {
		return doorNo;
	}

	public String getStreet() {
		return street;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public String getArea() {
		return area;
	}

	public int getPinCode() {
		return pinCode;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

}
