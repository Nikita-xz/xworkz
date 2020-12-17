package com.xworkz.carshowroom.dto;
import com.xworkz.carshowroom.carEnum.CarVarient;

public class CarDTO {
	private String model;
	private double price;
	private CarVarient varient;

	public CarDTO() {
		System.out.println("Created CarDTO");
	}

	public CarDTO(String model, double price, CarVarient varient) {
		this.model = model;
		this.price = price;
		this.varient = varient;
	}

	public String getModel() {
		return model;
	}

	public double getPrice() {
		return price;
	}

	public CarVarient getVarient() {
		return varient;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setVarient(CarVarient varient) {
		this.varient = varient;
	}

}

