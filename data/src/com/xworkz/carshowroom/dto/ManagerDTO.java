package com.xworkz.carshowroom.dto;


public class ManagerDTO {

	private String name;
	private long contactNo;

	public ManagerDTO() {
		super();
		System.out.println("Craeted manager");
	}

	public ManagerDTO(String name, long contactNo) {
		super();
		this.name = name;
		this.contactNo = contactNo;
	}

	public String getName() {
		return name;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

}