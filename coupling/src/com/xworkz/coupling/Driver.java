package com.xworkz.coupling;

public class Driver {
	private String name;
	private Vehicle vechicle=new TruckVehicle();
	
	public Driver(String name,Vehicle vehicle) {
		this.name=name;
		this.vechicle=vechicle;
	}
	
	public void driver() {
		System.out.println("driving by"+this.name);
		this.vechicle.move();
	}
	

}
