package com.xworkz.temple;

import java.util.List;

import com.xworkz.temple.entity.TempleEntity;
import com.xworkz.temple.repository.TempleRepository;
import com.xworkz.temple.repository.TempleRepositoryImpl;

public class TempleTester {
	public static void main(String[] args) {
		TempleEntity entity=new TempleEntity(1, "Sai Baba", "Rajajinagar", 100, 5);
		TempleEntity entity1=new TempleEntity(2, "Ganesha", "Dharwad", 200, 6);
		TempleEntity entity2=new TempleEntity(3, "Lord Shiva", "Hubli", 300, 7);
		TempleEntity entity3=new TempleEntity(4, "Lakshmi", "Gadag", 400, 8);
		
		TempleRepository temple=new TempleRepositoryImpl();
		//temple.persist(entity);
		//temple.persist(entity1);
		//temple.persist(entity2);
		//temple.persist(entity3);
		
		//Object obj= temple.findByName("Ganesha");
		//System.out.println(obj);
		
		//temple.deleteById(3);
		
		List<TempleEntity> rep=temple.getAll();
		System.out.println(rep);
		
	}

}
