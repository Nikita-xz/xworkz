package com.xworkz.temple.repository;

import java.util.List;

import com.xworkz.temple.entity.ComputerEntity;

public interface ComputerRepository {

	public void persist(ComputerEntity entity);

	public Object findByName(String name);

	public void deleteById(int id);

	public List<ComputerEntity> getAll();

}
