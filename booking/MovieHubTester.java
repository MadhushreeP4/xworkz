package com.xworkz.booking;

import java.util.Arrays;

import com.xworkz.booking.movie.MovieHub;

public class MovieHubTester {

	public static void main(String[] args) {
		
		String[] movies={"Inception","Interstellar","The Martian","Gravity","Arrival","Cargo","Predesination","Lucy"};
		
		MovieHub movieHub=new MovieHub("INOX",400,movies);
		System.out.println(movieHub.getTheaterName());
		System.out.println(movieHub.getTotalTickets());
		String convertedMovies=Arrays.toString(movieHub.getMovieNames());
		System.out.println(convertedMovies);
		
		movieHub.ticketAndPrice("Cargo", 4, "Madhu");
		
		movieHub.ticketAndPrice("KGF", 8, "Madhvi");
		
		movieHub.ticketAndPrice("Inception", 8, "Rekha");
	}

}
