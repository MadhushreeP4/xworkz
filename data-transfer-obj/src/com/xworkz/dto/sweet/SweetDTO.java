package com.xworkz.dto.sweet;

public class SweetDTO {
	private String name;
	private double price;
	private String popularState;
	private String[] color;
	private Shape shape;

	public SweetDTO() {
		System.out.println("default constructor");
	}

	public SweetDTO(String name, String popularState, String[] color, Shape shape) {
		super();
		this.name = name;
		this.popularState = popularState;
		this.color = color;
		this.shape = shape;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPopularState() {
		return popularState;
	}

	public void setPopularState(String popularState) {
		this.popularState = popularState;
	}

	public String[] getColor() {
		return color;
	}

	public void setColor(String[] color) {
		this.color = color;
	}

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

}
