package com.xworkz.booking.movie;

import java.util.Arrays;

public class MovieHub {

	private String theaterName;
	private int totalTickets;
	private String[] movieNames;
	private double ticketPrice = 100;
	private String[] snacksList = { "Chips", "Cool drinks", "Pop corn", "Samosa", "Bonda" };
	private double snackPrice = 75;
	private int totalSnacks = 5000;

	public MovieHub(String theaterName, int totalTickets, String[] movieNames) {
		System.out.println("arg1: " + theaterName);
		System.out.println("arg2: " + totalTickets);
		System.out.println("arg3: " + Arrays.toString(movieNames));
		this.theaterName = theaterName;
		this.totalTickets = totalTickets;
		this.movieNames = movieNames;

	}

	public double ticketAndPrice(String movie, int tickets, String ownedBy) {
		System.out.println(movie);
		System.out.println(tickets);
		System.out.println(ownedBy);

		double price = 0;
		for (int t = 0; t < movieNames.length; t++) {
			String movieN = movieNames[t];

			if (movie.equals(movieN)) {
				System.out.println(movieN + " :movie found");

				if (tickets <= totalTickets) {
					System.out.println(totalTickets + " tickets are available");
					this.totalTickets = this.totalTickets - tickets;
					System.out.println("reamaining tickets: " + this.totalTickets);
					price = this.ticketPrice * tickets;
					System.out.println("total price of tickets: " + price);
				} else {
					System.out.println("tickets are not available");
				}
				break;
			} else {
				System.out.println("movie not found");
			}
		}
		return price;
	}

	public double buySnacks(String snackName, int quantity, boolean selfService, String seatNo) {
		double price = 0;
		System.out.println("arg1: " + snackName);
		System.out.println("arg2: " + quantity);
		System.out.println("arg3: " + selfService);
		System.out.println("arg4: " + seatNo);

		for (int s = 0; s < this.snacksList.length; s++) {
			System.out.println("snack list: " + this.snacksList[s]);
			String snack = this.snacksList[s];
			if (snack.equals(snackName)) {
				if (quantity <= this.totalSnacks) {
					System.out.println("snacks quantity available");
					this.totalSnacks = this.totalSnacks - quantity;
					System.out.println("total snacks remaining: " + this.totalSnacks);
					price = quantity * this.snackPrice;
					System.out.println("price of snacks: " + price);
				} else {
					System.out.println("snacks quantity not available");
				}
				break;

			} else {
				System.out.println("snack is not available");

			}

		}
		return price;
	}

	public String getTheaterName() {
		return theaterName;
	}

	public int getTotalTickets() {
		return totalTickets;
	}

	public String[] getMovieNames() {
		return movieNames;
	}
	
	public double getTicketPrice() {
		return ticketPrice;
	}
	
	public String[] getSnacksList() {
		return snacksList;
	}

}
