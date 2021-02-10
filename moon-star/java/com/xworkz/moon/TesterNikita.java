package com.xworkz.moon;

import java.text.CollationKey;
import java.util.Collections;

import com.xworkz.moon.dto.MenuDTO;
import com.xworkz.moon.service.Finder;
import com.xworkz.moon.service.FinderImpl;
import com.xworkz.moon.service.RestauranrServiceImpl;
import com.xworkz.moon.service.RestaurantService;
import com.xworkz.moon.service.VegFinderImpl;

public class TesterNikita {

	public static void main(String[] args) {
		RestaurantService restaurantService = new RestauranrServiceImpl();
		restaurantService.displayItemGreaterThan(200);

		// Finder finder new= FinderImpl();
		// finder=new VegFinderImpl();

		restaurantService.findAndDisplay(new Finder() {

			@Override
			public boolean test(MenuDTO dto) {

				if (dto.getPrice() < 200) {
					return true;
				}
				return false;
			}
		});
		
		restaurantService.findAndDisplay(d->d.getPrice()>300);
		//Collections.sort(list);
	}

}
