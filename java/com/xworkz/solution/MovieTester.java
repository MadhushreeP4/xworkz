package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.solution.dto.MovieDTO;

public class MovieTester {

	public static void main(String[] args) {

		MovieDTO dto1 = new MovieDTO("Interstellar", 5, 3.2, "Sci-fi");
		MovieDTO dto2 = new MovieDTO("The Martian", 5, 3, "Sci-fi");
		MovieDTO dto3 = new MovieDTO("Arrival", 4.8, 2.5, "Sci-fi");
		MovieDTO dto4 = new MovieDTO("Happy new Year", 3, 2, "Comedy");
		MovieDTO dto5 = new MovieDTO("Om", 5, 3, "Crime");

		Collection<MovieDTO> movieDTOs = new ArrayList();
		movieDTOs.add(dto1);
		movieDTOs.add(dto2);
		movieDTOs.add(dto3);
		movieDTOs.add(dto4);
		movieDTOs.add(dto5);

		System.out.println(movieDTOs.size());

		Iterator<MovieDTO> iterator = movieDTOs.iterator();
		while (iterator.hasNext()) {
			MovieDTO movie = iterator.next();
			System.out.println(movie);
			if (movie.getGenre().equals("Comedy")) {
				iterator.remove();
			}
		}
		System.out.println(" ");
		System.out.println("after removing comedy " + movieDTOs.size());

		for (MovieDTO movie : movieDTOs) {
			System.out.println(movie);
		}
	}

}
