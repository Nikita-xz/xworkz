package com.xworkz.coupling;

public class DriverTester {

	public static void main(String[] args) {
		Vehicle vehicle=new TruckVehicle();
		
		Driver driver= new Driver("Ram", vehicle);
		driver.driver();

	}

}
