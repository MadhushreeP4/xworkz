package com.xworkz.resort.dto;

public class ResortDTO {
	
	private String name;
	private String location;
	private String managerName;
	private boolean offers;
	private double pricePerHead;
	private float rating;
	private long phoneNo;
	private int noOfEmployees;

	public ResortDTO() {
		System.out.println("created default resortDTO");
	}

	public ResortDTO(String name, String location, String managerName, float rating) {
		super();
		this.name = name;
		this.location = location;
		this.managerName = managerName;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "ResortDTO [name=" + name + ", location=" + location + ", managerName=" + managerName + ", offers="
				+ offers + ", pricePerHead=" + pricePerHead + ", rating=" + rating + ", phoneNo=" + phoneNo
				+ ", noOfEmployees=" + noOfEmployees + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null){

			return false;
		}
		if(obj instanceof ResortDTO){
			ResortDTO converted=(ResortDTO) obj;
			if(converted.getName()!=null && converted.getLocation()!=null){
				if(converted.getName().equals(this.name) && converted.getLocation().equals(this.location)){
					System.out.println("objects are equal");
					return true;
				}else{
					System.out.println("objects are not equal");
					return false;
				}
			}
		}
		return false;
	}

	public boolean isOffers() {
		return offers;
	}

	public void setOffers(boolean offers) {
		this.offers = offers;
	}

	public double getPricePerHead() {
		return pricePerHead;
	}

	public void setPricePerHead(double pricePerHead) {
		this.pricePerHead = pricePerHead;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getNoOfEmployees() {
		return noOfEmployees;
	}

	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public String getManagerName() {
		return managerName;
	}

	public float getRating() {
		return rating;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

}
