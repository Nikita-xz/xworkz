package com.xworkz.cosmetic.service;

import com.xworkz.cosmetic.constants.CosmeticShades;
import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dao.CosmeticDAO;
import com.xworkz.cosmetic.dto.CosmeticDTO;

public class CosmeticServiceImpl implements CosmeticService {
	

	@Override
	public boolean serviceAndSave(CosmeticDTO cosmeticDTO) {
		boolean validData = false;
		if (cosmeticDTO != null) {
			System.out.println("can vaildData,dto is not null");
			String brand = cosmeticDTO.getBrand();
			if (brand != null && brand.length() >= 3 && !brand.isEmpty() && !brand.contains(" ")) {
				System.out.println("brand is valid");
				validData = true;
			} else {
				System.out.println("brand is invalid");
				validData = false;
			}
			if (validData) {
				CosmeticShades shades = cosmeticDTO.getShades();
				if (shades != null) {
					System.out.println("shade is valid");
					validData = true;
				} else {
					System.out.println("shade is invalid");
					validData = false;
				}
			}
			if (validData) {
				CosmeticType type = cosmeticDTO.getType();
				if (type != null) {
					System.out.println("type is valid");
					validData = true;
				} else {
					System.out.println("type is invalid");
					validData = false;
				}
			}
			if (validData) {
				double price = cosmeticDTO.getPrice();
				if (price > 0) {
					System.out.println("price is vaid");
					validData = true;
				} else {
					System.out.println("price is invalid");
					validData = false;
				}
			}
			if (validData) {
				int quantity = cosmeticDTO.getQuantity();
				if (quantity > 0 && quantity <= 100) {
					System.out.println("quamtity is valid");
					validData = true;
				} else {
					System.out.println("quantity is invalid");
					validData = false;
				}
			}

		}
		return false;

	}
}
