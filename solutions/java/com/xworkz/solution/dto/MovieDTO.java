package com.xworkz.solution.dto;

public class MovieDTO {
	private String name;
	private double duration;
	private int ratings;
	private String genre;
	
	public MovieDTO() {
		System.out.println("invoked MovieDTO");
	}

	public MovieDTO(String name, double duration, int ratings, String genre) {
		super();
		this.name = name;
		this.duration = duration;
		this.ratings = ratings;
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "MovieDTO [name=" + name + ", duration=" + duration + ", ratings=" + ratings + ", genre=" + genre + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public int getRatings() {
		return ratings;
	}

	public void setRatings(int ratings) {
		this.ratings = ratings;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	

}
