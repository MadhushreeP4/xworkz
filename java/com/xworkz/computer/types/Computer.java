package com.xworkz.computer.types;

public class Computer {

	protected String color;
	protected double price;
	protected boolean graphics;

	public void Updatecolor(String color) {
		this.color = color;
		System.out.println("updated color: "+this.color);
	}

	public void display() {
		System.out.println("Invoked display of class Computer");
	}

	public void setGraphics(boolean graphics) {
		this.graphics = graphics;
	}

	public boolean isGraphics() {
		return graphics;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
