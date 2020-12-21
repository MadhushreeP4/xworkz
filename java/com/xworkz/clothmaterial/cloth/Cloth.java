package com.xworkz.clothmaterial.cloth;

public class Cloth {

	protected String brand;
	protected String fabric;
	protected double price=1000;

	public void design() {
		System.out.println("Invoked design");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getFabric() {
		return fabric;
	}

	public void setFabric(String fabric) {
		this.fabric = fabric;
	}

	public double getPrice() {
		return price;
	}

	private void setPrice(double price) {
		this.price = price;
	}

}
