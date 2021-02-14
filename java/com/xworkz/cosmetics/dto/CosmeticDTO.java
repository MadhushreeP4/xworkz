package com.xworkz.cosmetics.dto;

import com.xworkz.cosmetics.constants.CosmeticShade;
import com.xworkz.cosmetics.constants.CosmeticType;

public class CosmeticDTO {

	private String brand;
	private CosmeticShade shade;
	private CosmeticType type;
	private double price;
	private int quantity;

	public CosmeticDTO() {
		System.out.println("Created CosmeticDTO");
	}

	public CosmeticDTO(String brand, CosmeticShade shade, CosmeticType type, double price, int quantity) {
		super();
		this.brand = brand;
		this.shade = shade;
		this.type = type;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "CosmeticDTO [brand=" + brand + ", shade=" + shade + ", type=" + type + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals");
		if(obj==null)
			return false;
		if(obj instanceof CosmeticDTO){
			CosmeticDTO converted=(CosmeticDTO)obj;
			if(converted.getBrand()!=null && converted.getType()!=null){
				if(converted.getBrand().equals(this.brand) && converted.getType().equals(this.type)){
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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public CosmeticShade getShade() {
		return shade;
	}

	public void setShade(CosmeticShade shade) {
		this.shade = shade;
	}

	public CosmeticType getType() {
		return type;
	}

	public void setType(CosmeticType type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
