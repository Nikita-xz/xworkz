package com.xworkz.methods;
import java.util.Arrays;

import  com.xworkz.methods.theater.MovieHub;

public class MovieHubTester {

	public static void main(String[] args) {
		String[] movieNames= {"Edge of tomorrow","Yajamana","PK","Chhichhore","Dil Bechara","KGF"};
		MovieHub movieHub=new MovieHub("Sangam", 400, movieNames);
         System.out.println("Theater name is: "+movieHub.getTheaterName());
         System.out.println("No of tickets available: "+movieHub.getTotalTickets());
         String names=Arrays.toString(movieHub.getMovieNames());
         System.out.println(names);
         movieHub.bookTickets("PK",5,"Nikita");
         movieHub.bookTickets("KGF",446,"Xworkz");
         movieHub.bookTickets("3 idots",2,"Nikita");
         
	}
}


	


