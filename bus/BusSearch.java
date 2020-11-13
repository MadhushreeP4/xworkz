package com.xworkz.bus;

public class BusSearch {
	
	private static String[] places={"Gadag","Hubli","Haveri","Belgaum","Bangalore","Mysore","Goa"};
	
	public static void search(String place) {
		System.out.println("Total places available " + places.length);
		System.out.println("arg1 :" + place);
		
		boolean placeFound = false;
		for (int count = 0; count < places.length; count++) {
			String place1 = places[count];
			if (place1.equals(place)) {
				placeFound = true;
				break;
			} 
			else {
				placeFound = false;
			}
		}
		if (placeFound) {
			System.out.println("place is found ");
		}
		else {
			System.out.println("place is not found");
		}
	}
	public static int totalPlaces() {
		return places.length;
	}
}
