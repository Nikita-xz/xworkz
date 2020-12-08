package com.xworkz.methods;
import java.util.Arrays;
import com.xworkz.methods.theater.MovieHub;

import  com.xworkz.methods.theater.MovieHub;

public class MovieHubTester {

	public static void main(String[] args) {
		String[] movieNames = { "PK", "Chennai Express", "KGF", "Departed", "Zodiac", "KGF2", "Inception",
				"Interstellar", "Yajamana" };

		MovieHub movieHub = new MovieHub("Navrang", 500, movieNames);
		System.out.println(movieHub.getTheaterName());
		System.out.println(movieHub.getTotalTickets());
		String convertedMovieNames = Arrays.toString(movieHub.getMovieNames());
		System.out.println(convertedMovieNames);

		double price = movieHub.bookTicketsAndGetTotalPrice("KGF", 4, "Rajashree");
		System.out.println("************"+price);
		// add logic for max 10 ticktes
		movieHub.bookTicketsAndGetTotalPrice("PK", 493, "Vishalakshi");

		movieHub.bookTicketsAndGetTotalPrice("KGF2", 4, "X-workz");

	}

}
