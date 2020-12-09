package com.xworkz.booking.movie;

public class buySnackTester {

	public static void main(String[] args) {
		
String[] movies={"Inception","Interstellar","The Martian","Gravity","Arrival","Cargo","Predesination","Lucy"};
		
		MovieHub movieHub=new MovieHub("INOX",400,movies);
		double money=movieHub.buySnacks("Chips", 5, true,"5");
		System.out.println("cost: "+money);

	}

}
