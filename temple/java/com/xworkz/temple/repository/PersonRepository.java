package com.xworkz.temple.repository;

import java.util.List;

import com.xworkz.temple.entity.PersonEntity;

public interface PersonRepository {

	public void persist(PersonEntity entity);

	public Object findByName(String name);

	public void deleteById(int id);

	public List<PersonEntity> getAll();

}
