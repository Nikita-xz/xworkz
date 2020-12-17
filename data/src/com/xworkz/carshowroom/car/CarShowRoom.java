package com.xworkz.carshowroom.car;

import java.util.Arrays;

import com.xworkz.carshowroom.carEnum.CarVarient;
import com.xworkz.carshowroom.dto.CarDTO;
import com.xworkz.carshowroom.dto.ManagerDTO;

public class CarShowRoom {
	private String name;
	private long location;
	private ManagerDTO managerDTO;
	private CarDTO[] cars = new CarDTO[5];
	private int currentIndex = 0;

	// This is a default constructor
	public CarShowRoom() {
		super();
		System.out.println("Created default Constructor");
	}

	// this is the Constructor with 2 parameters
	public CarShowRoom(String name, long location) {
		super();
		this.name = name;
		this.location = location;
	}

	// It is the method to add the manager details and it has some validation also
	public void addManager(String name, long contactNo) {
		if (name != null || contactNo > 0) {
			this.managerDTO = new ManagerDTO(name, contactNo);
			System.out.println("Manager added");
		} else {
			System.out.println("please provide proper details");
		}
	}

	// Display method is used for displaying the details of the manager
	public void displayManager() {
		if (this.managerDTO != null) {
			System.out.println("Name is" + this.managerDTO.getName());
			System.out.println("Contact number is " + this.managerDTO.getContactNo());
		} else {
			System.out.println("Value is Null");
		}
	}

	// This method will update the manager details only contactNo is update here
	public void updateManager(long contactNo) {
		if (contactNo > 0) {
			this.managerDTO.setContactNo(contactNo);

		}
	}

	// delete method will delete the details of the Manager
	public void deleteManager() {
		this.managerDTO = null;
		System.out.println("Delete the values");
	}

	// This method creates the addCar method to add the cars to the Array and here I
	// have done some validation
	public void addCars(CarDTO dto) {
		if (dto != null && this.currentIndex < 5) {

			this.cars[currentIndex] = dto;
			currentIndex++;
			System.out.println("Current Index" + this.currentIndex);

		} else {
			if (dto == null) {
				System.out.println("We can not an empty or null");
			}
			if (dto != null) {
				System.out.println("Cannot add more cars,total " + this.currentIndex);
			}
			System.out.println("Current index :" + this.currentIndex);
		}
	}

	// displayCar() method is used to display the car details that are stored in an
	// array
	public void displayCar() {
		CarDTO[] tempCars = this.cars;
		for (int i = 0; i < tempCars.length; i++) {
			CarDTO dto = tempCars[i];
			System.out.println(dto);
			System.out.println(dto.getModel());
			System.out.println(dto.getPrice());
			System.out.println(dto.getVarient());
		}
	}

	public void updateCarVarient(CarVarient newVarient, int indexToUpdate) {
		if (newVarient != null && indexToUpdate >= 0 && indexToUpdate < 5) {
			System.out.println("Car is at :" + indexToUpdate);
			System.out.println(newVarient);
			CarDTO carDTO = this.cars[indexToUpdate];
			System.out.println("Name of car is " + carDTO.getModel());
			carDTO.setVarient(newVarient);
		}
	}

	public void carAtIndex(int index) {
		if (index >= 0 && index < 5) {
			System.out.println("Index value is" + index);
			CarDTO cars = this.cars[index];
			System.out.println(cars.getModel());
		}

	}

	public void displayByModel(String model) {
		if (model != null) {
			System.out.println("car name is:" + model);
			for (int index = 0; index < this.cars.length; index++) {
				String localModel = cars[index].getModel();
				if (localModel.equals(model)) {
					System.out.println(cars[index].getPrice());
					System.out.println(cars[index].getVarient());
				}
			}
		}
	}
	public void deleteByIndex(int index) {
		if(index >=0 && index <5) {
			System.out.println("Index is found");
			this.cars[index]=null;
		}else {
			System.out.println("Index is not found");
		}
	}
	public void deleteByModel(String model) {
		boolean carFound=false;
		if (model !=null) {
			for(int index=0; index < cars.length; index++) {
				CarDTO carDTO=this.cars[index];
				String refOfCar=carDTO.getModel();
				if(refOfCar.contentEquals(model)) {
					this.cars[index]=null;
					System.out.println("car is deleted");
					carFound=true;
					break;
					}
			}
		}
		if(carFound==false) {
			System.out.println("car is not deleted");
		}
		
	}
}