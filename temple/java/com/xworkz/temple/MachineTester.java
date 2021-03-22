package com.xworkz.temple;

import java.util.List;

import com.xworkz.temple.entity.MachineEntity;
import com.xworkz.temple.repository.MachineRepository;
import com.xworkz.temple.repository.MachineRepositoryImpl;

public class MachineTester {
	public static void main(String[] args) {
		MachineEntity entity=new  MachineEntity(1, "Refrigerator", "Electronic", "whirlpool");
		MachineEntity entity1=new  MachineEntity(2, "Laptop", "Electronic", "HP");
		MachineEntity entity2=new  MachineEntity(3, "Grainder", "Electronic", "Prestige");
		MachineEntity entity3=new  MachineEntity(4, "Fan", "Electronic", "Usha Fan");
		
		MachineRepository mach=new MachineRepositoryImpl();
		//mach.persist(entity);
		//mach.persist(entity1);
		//mach.persist(entity2);
		//mach.persist(entity3);
		
		//Object obj=mach.findByName("Laptop");
		//System.out.println(obj);
		
	//	mach.deleteById(4);
		
		List<MachineEntity> mech=mach.getAll();
		System.out.println(mech);
		
		
	}

}
