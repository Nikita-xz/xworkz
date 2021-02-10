package com.xworkz.cosmetic.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dao.CosmeticDAO;
import com.xworkz.cosmetic.dto.CosmeticDTO;

public class CosmeticDAOImpl implements CosmeticDAO {
	List<CosmeticDTO> cosmetic = new ArrayList<CosmeticDTO>();

	@Override
	public boolean save(CosmeticDTO dto) {
		boolean added = false;
		boolean contains = this.cosmetic.contains(dto);
		if (!contains) {
			added = this.cosmetic.add(dto);
		}
		if (added)
			System.out.println("Cosmetic added");
		else
			System.out.println("Cosmetic not added");

		return added;
	}

	@Override
	public CosmeticDTO findByBrandName(String brand) {
		System.out.println("invoked findByBrandName");
		System.out.println("brand:" + brand);
		for (CosmeticDTO cosmeticDTO : cosmetic) {
			String brandName = cosmeticDTO.getBrand();
			if (brandName.equals(brand))
				System.out.println("Costemic brand is found");
			return cosmeticDTO;
		}
		return null;
	}

	@Override
	public boolean updatePriceAndQuantityByBrand(double price, int quantity, String brand) {
		System.out.println("invoked updatePriceAndQuantityByBrand");
		System.out.println("price:" + price);
		System.out.println("quantity:" + quantity);
		System.out.println("brand:" + brand);
		CosmeticDTO cosmeticDTO = this.findByBrandName(brand);
		if (cosmeticDTO != null) {
			System.out.println("can update, cosmetic is found");
			cosmeticDTO.setPrice(price);
			cosmeticDTO.setQuantity(quantity);
			System.out.println("after update " + cosmeticDTO);

			// cosmeticDTO.setBrand(brand);
			return true;
		} else {
			System.out.println("cannot update, cosmetic is not found");
		}
		return false;
	}

	@Override
	public boolean updatePriceByBrandType(double price, String brand, CosmeticType type) {
		System.out.println("invoked updatePriceByBrandType");
		System.out.println("type:" + type);
		System.out.println("price:" + price);
		System.out.println("brand:" + brand);
		CosmeticDTO cosmeticDTO = this.findByBrandName(brand);
		if (cosmeticDTO != null) {
			System.out.println("can update, cosmetic is found");
			cosmeticDTO.setPrice(price);
			cosmeticDTO.setType(type);
			// cosmeticDTO.setBrand(brand);
			return true;

		} else {
			System.out.println("cannot update, cosmetic is not found");
		}

		return false;
	}

	@Override
	public boolean deleteByBrand(String brand) {
		CosmeticDTO deleteFromDTO = this.findByBrandName(brand);
		if (deleteFromDTO != null) {
			this.cosmetic.remove(deleteFromDTO);
		}

		return false;
	}

	@Override
	public void deleteAll() {
		cosmetic.clear();
		// System.out.println(deleted);

	}

	@Override
	public List<CosmeticDTO> getAll() {

		return this.cosmetic;
	}

	@Override
	public int totalSize() {
		int value = cosmetic.size();
		System.out.println(value);
		return cosmetic.size();
	}

}
