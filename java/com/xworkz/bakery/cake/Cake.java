package com.xworkz.bakery.cake;

public class Cake {

	protected String flavour;
	protected String shape;
	protected double size;

	public boolean taste() {
		System.out.println("Invoking Taste");
		boolean tasteIsGood = true;
		return tasteIsGood;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

}
