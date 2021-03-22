package com.xworkz.temple.repository;

import java.util.List;

import com.xworkz.temple.entity.MachineEntity;

public interface MachineRepository {
	
	public void persist(MachineEntity entity);

	public Object findByName(String name);

	public void deleteById(int id);

	public List<MachineEntity> getAll();

}
