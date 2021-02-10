package com.xworkz.cosmetic;

import java.util.List;

import com.xworkz.cosmetic.constants.CosmeticShades;
import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dao.CosmeticDAO;
import com.xworkz.cosmetic.dao.impl.CosmeticDAOImpl;
import com.xworkz.cosmetic.dto.CosmeticDTO;

public class CosmeticTester {

	public static void main(String[] args) {
		CosmeticDTO cosmeticDTO = new CosmeticDTO("Lakme", CosmeticShades.LIGHT, CosmeticType.EYELINER, 250, 1);
		CosmeticDTO cosmeticDTO1 = new CosmeticDTO("Maybelline", CosmeticShades.MEDIUM, CosmeticType.MASCARA, 200, 2);
		CosmeticDTO cosmeticDTO2 = new CosmeticDTO("Loreal", CosmeticShades.DARK, CosmeticType.PRIMER, 100, 3);
		CosmeticDTO cosmeticDTO3 = new CosmeticDTO("MAC", CosmeticShades.DARK, CosmeticType.TONER, 150, 2);
		CosmeticDAO dao = new CosmeticDAOImpl();
		dao.save(cosmeticDTO);
		dao.save(cosmeticDTO1);
		dao.save(cosmeticDTO2);
		dao.save(cosmeticDTO3);
	
		System.out.println(dao.totalSize());
		dao.findByBrandName("MAC");
		System.out.println("********************************************");
		dao.updatePriceByBrandType(400, "Lakme", CosmeticType.TONER);
		 System.out.println(cosmeticDTO);
		System.out.println("********************************************");
		dao.deleteByBrand("MAC");
		System.out.println(cosmeticDTO3);

		 System.out.println("********************************************");
		 dao.updatePriceAndQuantityByBrand(400, 1, "MAC");
		System.out.println(cosmeticDTO3);

		System.out.println("********************************************");

		dao.totalSize();

		System.out.println("********************************************");
		List<CosmeticDTO> list = dao.getAll();
		System.out.println(list);
		System.out.println("*************************8");
		dao.deleteAll();
		System.out.println(dao.totalSize());

	}

}
