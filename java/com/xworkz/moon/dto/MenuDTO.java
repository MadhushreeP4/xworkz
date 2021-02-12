package com.xworkz.moon.dto;

public class MenuDTO {

	private String itemName;
	private double price;
	private Type type;

	public enum Type {
		VEG, NONVEG
	}

	public MenuDTO() {

	}

	public MenuDTO(String itemName, double price, Type type) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.type = type;
	}

	@Override
	public String toString() {
		return "MenuDTO [itemName=" + itemName + ", price=" + price + ", type=" + type + "]";
	}

	public String getItemName() {
		return itemName;
	}

	public double getPrice() {
		return price;
	}

	public Type getType() {
		return type;
	}

}
