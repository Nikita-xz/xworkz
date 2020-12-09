package com.xworkz.data;
import java.util.Arrays;

import com.xworkz.data.transfer.PlayerDTO;


public class PlayerTester {

	public static void main(String[] args) {
		PlayerDTO playerDTO=new PlayerDTO();
		playerDTO.setName("Sachin");
		playerDTO.setCountry("India");
		playerDTO.setSports(new String[] {"Cricket"});
		playerDTO.setAwards(new String[] {"Arjuna","Padma Shri and Padma Vibhusan","Rajiv Ghandhi Khel Ratna"});
		
		System.out.println(playerDTO.getName());
		System.out.println(playerDTO.getCountry());
		System.out.println(Arrays.toString(playerDTO.getSports()));
		System.out.println(Arrays.toString(playerDTO.getAwards()));
		System.out.println("**********************");
		
		PlayerDTO playerDTO2=new PlayerDTO();
		playerDTO2.setName("Virat Kohli");
		playerDTO2.setCountry("India");
		playerDTO2.setSports(new String[] {"Cricket","Badminton"});
		playerDTO2.setAwards(new String[] {"Padma Shri","Khel Ratna","Arjuna"});
		
		System.out.println(playerDTO2.getName());
		System.out.println(playerDTO2.getCountry());
		System.out.println(Arrays.toString(playerDTO2.getSports()));
		System.out.println(Arrays.toString(playerDTO2.getAwards()));
		System.out.println("*****************************");
		
		PlayerDTO playerDTO3=new PlayerDTO();
		playerDTO3.setName("AB de Villiers");
		playerDTO3.setCountry("SA");
		playerDTO3.setSports(new String[] {"Cricket"});
		playerDTO3.setAwards(new String[] {"ODI player of the year"});
		
		System.out.println(playerDTO3.getName());
		System.out.println(playerDTO3.getCountry());
		System.out.println(Arrays.toString(playerDTO3.getSports()));
		System.out.println(Arrays.toString(playerDTO3.getAwards()));
		System.out.println("*******************");
		
		PlayerDTO playerDTO4=new PlayerDTO();
		playerDTO4.setName("Manpreet Singh");
		playerDTO4.setCountry("Jamaica");
		playerDTO4.setSports(new String[] {"Hockey"});
		playerDTO4.setAwards(new String[] {"FIH player of the year"});
		
		System.out.println(playerDTO4.getName());
		System.out.println(playerDTO4.getCountry());
		System.out.println(Arrays.toString(playerDTO4.getSports()));
		System.out.println(Arrays.toString(playerDTO4.getAwards()));
		System.out.println("*****************************");
		
		PlayerDTO playerDTO5=new PlayerDTO();
		playerDTO5.setName("Shantha Rangaswamy");
		playerDTO5.setCountry("India");
		playerDTO5.setSports(new String[] {"Cricket"});
		playerDTO5.setAwards(new String[] {"Arjuna"});
		
		System.out.println(playerDTO5.getName());
		System.out.println(playerDTO5.getCountry());
		System.out.println(Arrays.toString(playerDTO5.getSports()));
		System.out.println(Arrays.toString(playerDTO5.getAwards()));
		

	}
}



		
		

	


