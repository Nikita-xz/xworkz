package com.xworkz.celebration;

import com.xworkz.celebration.service.DisplayService;
import com.xworkz.celebration.service.DisplayServiceImpl;

public class ServiceTester {
	public static void main(String[] args) {
DisplayService service=new DisplayServiceImpl();
		
		service.printString((l,t)->{
			System.out.println("validating"+l + " t"+t);
			if(l.contains("a") || l.contains("A"))
			{
				System.out.println(l+ " "+l.hashCode());
			}
		});
		
		
	
	}

}
