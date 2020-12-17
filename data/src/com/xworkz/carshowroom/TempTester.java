package com.xworkz.carshowroom;
import java.util.Arrays;

import com.xworkz.carshowroom.car.CarShowRoom;
import com.xworkz.carshowroom.carEnum.CarVarient;
import com.xworkz.carshowroom.dto.CarDTO;

public class TempTester {

	public static void main(String[] args) {

		// Creating a new object and assigning the values to that object using
		// constructor
		CarShowRoom cars = new CarShowRoom();
		CarDTO dto = new CarDTO("Maruthi 800", 150000, CarVarient.BASE);
		cars.addCars(dto);

		CarDTO dto2 = new CarDTO("JEEP", 3000000d, CarVarient.MIDDLE);
		cars.addCars(dto2);

		CarDTO dto3 = new CarDTO("Duster", 2500000d, CarVarient.TOP);
		cars.addCars(dto3);

		CarDTO dto4 = new CarDTO("Swift", 500000d, CarVarient.BASE);
		cars.addCars(dto4);

		CarDTO dto5 = new CarDTO("BMW", 70000000d, CarVarient.TOP);
		cars.addCars(dto5);

		CarDTO dto6 = new CarDTO("Scoda", 30000d, CarVarient.MIDDLE);
		cars.addCars(dto6);

		cars.displayCar();
		cars.updateCarVarient(CarVarient.BASE, 2);

		cars.displayByModel("JEEP");

		cars.carAtIndex(2);

	}

}