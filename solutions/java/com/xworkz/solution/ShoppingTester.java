package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.solution.dto.ShoppingCartDTO;

public class ShoppingTester {

	public static void main(String[] args) {
		ShoppingCartDTO cartDTO1 = new ShoppingCartDTO();
		cartDTO1.setIteamName("salwar");
		cartDTO1.setPrice(2000);
		cartDTO1.setQuantity(1);

		ShoppingCartDTO cartDTO2 = new ShoppingCartDTO();
		cartDTO2.setIteamName("shoe");
		cartDTO2.setPrice(1500);
		cartDTO2.setQuantity(1);
		Collection<ShoppingCartDTO> cartDTOs = new ArrayList<ShoppingCartDTO>();
		cartDTOs.add(cartDTO2);
		cartDTOs.add(cartDTO1);

		ShoppingCartDTO cartDTO3 = new ShoppingCartDTO();
		cartDTO3.setIteamName("Shoe");
		cartDTO3.setPrice(1600);
		cartDTO3.setQuantity(1);

		boolean contain = cartDTOs.contains(cartDTO3);
		System.out.println("Contains" + contain);

		if (contain) {
			System.out.println("shoe is in cart");
		} else {
			System.out.println("adding shoe to cart");
			cartDTOs.add(cartDTO3);
		}
		System.out.println("after adding shoe" + cartDTOs.size());

		Collection<String> countrys = new ArrayList<String>();
		countrys.add("INDIA");
		countrys.add("AUSTRALIA");

		countrys.contains("INDIA");

	}

}
