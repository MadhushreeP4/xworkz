package com.xworkz.car.manager;

import com.xworkz.car.carconstants.CarVariant;

public class CarDTO {

	private String model;
	private double price;
	private CarVariant variant;

	public CarDTO(String model, double price, CarVariant variant) {
		super();
		this.model = model;
		this.price = price;
		this.variant = variant;
		
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public CarVariant getVariant() {
		return variant;
	}

	public void setVariant(CarVariant variant) {
		this.variant = variant;
	}

}
