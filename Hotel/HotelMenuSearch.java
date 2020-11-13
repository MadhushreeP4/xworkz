package com.xworkz.Hotel;

public class HotelMenuSearch {
	
	private static String[] items = {"Soup","Salad","Snacks","Biryani","Curries","Rice items","Desserts"};
	
	public static void search(String item) {
		System.out.println("Total items available " + items.length);
		System.out.println("arg1 :" + item);
		boolean itemFound = false;
		
		for (int count = 0; count < items.length; count++) {
			String menuItem = items[count];
			if (menuItem.equals(item)) {
				itemFound = true;
				break;
			} 
			else {
				itemFound = false;
			}
		}
		if (itemFound) {
			System.out.println("item is found ");
		} 
		else {
			System.out.println("item is not found");
		}
	}
	public static int totalItems() {
	return items.length;
	}

}
