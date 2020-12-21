package com.xworkz.bakery;

import com.xworkz.bakery.cake.Design;
import com.xworkz.bakery.cake.FashionShow;

public class DesignTester {

	public static void main(String[] args) {
		System.out.println("invoked main");
		
		Design design=new Design();
		design.setTheams("Metal Magic");
		design.setSource("Organza");
		design.setNumOfModels(4);
		
		System.out.println(design.getTheams());
		System.out.println(design.getSource());
		System.out.println(design.getNumOfModels());
		
		design.fashionShow();
		
		FashionShow fashionshow=new FashionShow();
		fashionshow.ramp="Grament Presentation";
		System.out.println(fashionshow.ramp);
		design.fashionShow();

	}

}
