package com.xworkz.temple.repository;

import java.util.List;

import com.xworkz.temple.entity.TempleEntity;

public interface TempleRepository {
	public void persist(TempleEntity entity);

	public Object findByName(String name);

	public void deleteById(int id);

	public List<TempleEntity> getAll();

}
