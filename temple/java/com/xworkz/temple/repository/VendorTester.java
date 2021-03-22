package com.xworkz.temple.repository;

import java.util.List;

import com.xworkz.temple.entity.VendorEntity;

public class VendorTester {

	public static void main(String[] args) {
		VendorEntity entity=new VendorEntity(1, "Google", "Bangalore", 2500);
		VendorEntity entity1=new VendorEntity(2, "FaceBook", "Chenni", 2000);
		VendorEntity entity2=new VendorEntity(3, "Yahoo", "US", 3000);
		VendorEntity entity3=new VendorEntity(4, "Instagram", "Mysore", 4000);
		
		VendorRepository ved=new VendorRepositoryImpl();
		//ved.persist(entity);
		//ved.persist(entity1);
		//ved.persist(entity2);
		//ved.persist(entity3);
		
		//Object obj=ved.finfByName("US");
		//System.out.println(obj);
		
		//ved.deleteById(4);
		
		List<VendorEntity> ref=ved.getAll();
		System.out.println(ref);
	}

}
