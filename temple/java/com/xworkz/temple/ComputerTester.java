package com.xworkz.temple;

import java.util.List;

import com.xworkz.temple.entity.ComputerEntity;
import com.xworkz.temple.repository.ComputerRepository;
import com.xworkz.temple.repository.ComputerRepositoryImpl;

public class ComputerTester {

	public static void main(String[] args) {
		ComputerEntity entity=new ComputerEntity(1, "HP", 59300, "Main frame", "HP");
		ComputerEntity entity1=new ComputerEntity(2, "DELL", 60000, "Super frame", "DELL");
		ComputerEntity entity2=new ComputerEntity(3, "Lenova", 55600, "Tablet ", "Lenova");
		ComputerEntity entity3=new ComputerEntity(4, "Asuss", 65000, "Mini ", "Asuss");
		
		ComputerRepository comp=new ComputerRepositoryImpl();
	//	comp.persist(entity);
	//	comp.persist(entity1);
	//	comp.persist(entity2);
	//	comp.persist(entity3);
		
		//Object obj= comp.findByName("HP");
		//System.out.println(obj);
		
		//comp.deleteById(4);
		
		List<ComputerEntity> ref=comp.getAll();
		System.out.println(ref);

		
	}

}
