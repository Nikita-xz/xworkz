package com.xworkz.temple.repository;

import java.util.List;

import com.xworkz.temple.entity.VendorEntity;

public interface VendorRepository {

	public void persist(VendorEntity entity);

	public Object finfByName(String name);

	public void deleteById(int id);

	public List<VendorEntity> getAll();

}
