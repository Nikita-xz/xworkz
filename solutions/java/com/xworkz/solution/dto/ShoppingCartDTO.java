package com.xworkz.solution.dto;

public class ShoppingCartDTO {
	private String itemName;
	private double price;
	private int quantity;
	
	public ShoppingCartDTO() {
		System.out.println("invoked shoppingCartDTO");
	}

	@Override
	public String toString() {
		return "ShoppingCartDTO [itemName=" + itemName + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals on shopping cart dto");
		if(obj==null) {
			return false;
		}
		if(obj instanceof ShoppingCartDTO) {
			ShoppingCartDTO casted=(ShoppingCartDTO )obj;
			if(this.itemName.equals(casted.itemName)&& this.price==casted.price) {
				System.out.println("item is matching"+casted.itemName);
				return true;
			}
		}


		return false;
	}

	public String getIteamName() {
		return itemName;
	}

	public void setIteamName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
