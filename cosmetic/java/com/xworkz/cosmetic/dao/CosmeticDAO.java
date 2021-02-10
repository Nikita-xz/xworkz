package com.xworkz.cosmetic.dao;

import java.util.List;

import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dto.CosmeticDTO;

public interface CosmeticDAO {
	public boolean save(CosmeticDTO dto);
	
	public CosmeticDTO findByBrandName(String brand);

	boolean updatePriceAndQuantityByBrand(double price, int quantity, String brand);

	boolean updatePriceByBrandType(double price, String brand, CosmeticType type);

	boolean deleteByBrand(String brand);

	void deleteAll();

	List<CosmeticDTO> getAll();

	int totalSize();

}
