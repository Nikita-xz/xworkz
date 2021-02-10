package com.xworkz.cosmetic;

import com.xworkz.cosmetic.constants.CosmeticShades;
import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dao.impl.CosmeticDAOImpl;
import com.xworkz.cosmetic.dto.CosmeticDTO;
import com.xworkz.cosmetic.service.CosmeticService;
import com.xworkz.cosmetic.service.CosmeticServiceImpl;

public class ServiceTester {

	public static void main(String[] args) {
		CosmeticDTO cosmetic=new CosmeticDTO();
		
		cosmetic.setPrice(200);
		cosmetic.setBrand("MAC");
		cosmetic.setQuantity(2);
		cosmetic.setShades(CosmeticShades.DARK);
		cosmetic.setType(CosmeticType.FOUNDATION);
		
		CosmeticService service=new CosmeticServiceImpl();
		service.serviceAndSave(cosmetic);
		

	}

}
