package com.xworkz.solution.dto;

public class ShoppingCartDTO {

	private String itemName;
	private double price;
	private int quantity;

	public ShoppingCartDTO() {
		System.out.println("created ShoppingCartDTO");
	}

	public ShoppingCartDTO(String itemName, double price, int quantity) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "ShoppingCartDTO [itemName=" + itemName + ", price=" + price + ", quantity=" + quantity + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals");

		if (obj == null)
			return false;
		if (obj instanceof ShoppingCartDTO) {
			ShoppingCartDTO cart = (ShoppingCartDTO) obj;
			// if (this.itemName.equals(cart.getItemName()) && this.price <=
			// cart.getPrice() && this.quantity>=5) {
			if (this.itemName.equals(cart.getItemName()) && this.price == cart.getPrice()) {

				System.out.println("item is matching " + cart.getItemName());
				return true;
			}
		}

		return false;
	}

	public String getItemName() {
		return itemName;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

}
