package com.xworkz.solution.dto;

public class MovieDTO {

	private String name;
	private double ratings;
	private double duration;
	private String genre;

	public MovieDTO() {
		System.out.println("Created default MovieDTO");
	}

	public MovieDTO(String name, double ratings, double duration, String genre) {
		super();
		this.name = name;
		this.ratings = ratings;
		this.duration = duration;
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "MovieDTO [name=" + name + ", ratings=" + ratings + ", duration=" + duration + ", genre=" + genre + "]";
	}

	public String getName() {
		return name;
	}

	public double getRatings() {
		return ratings;
	}

	public double getDuration() {
		return duration;
	}

	public String getGenre() {
		return genre;
	}

}
