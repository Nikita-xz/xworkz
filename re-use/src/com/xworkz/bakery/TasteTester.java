package com.xworkz.bakery;

import com.xworkz.bakery.cake.Cake;
import com.xworkz.bakery.cake.HoneyCake;

public class TasteTester {

	public static void main(String[] args) {
		System.out.println("invoked main");
		
		Cake cake=new Cake();
		cake.setFlavour("Chocolate");
		cake.setShape("Square");
		cake.setSize(1.6);
		
		System.out.println(cake.getFlavour());
		System.out.println(cake.getShape());
		System.out.println(cake.getSize());
		
		cake.taste();
		
		HoneyCake honeycake=new HoneyCake();
		honeycake.setFlavour("Honey");
		honeycake.setShape("Round");
		honeycake.setSize(1.0);
		
		System.out.println(honeycake.getFlavour());
		System.out.println(honeycake.getShape());
		System.out.println(honeycake.getSize());
		
		
		honeycake.taste();

	}

}
