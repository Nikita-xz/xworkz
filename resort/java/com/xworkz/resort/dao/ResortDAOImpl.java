package com.xworkz.resort.dao;

import java.util.Iterator;
import java.util.List;

import com.xworkz.resort.dto.ResortDTO;

public class ResortDAOImpl implements ResortDAO {
	private List<ResortDTO> resortList;

	public ResortDAOImpl(List<ResortDTO> resortDTOs) {
		System.out.println("created ResortDAOImpl");
		this.resortList = resortDTOs;
	}

	@Override
	public boolean save(ResortDTO dto) {
		System.out.println("invoked save in dao");
		boolean added = this.resortList.add(dto);
		System.out.println("added" + added);
		return added;
	}

	@Override
	public boolean updateLocationByName(String location, String name) {
		System.out.println("Invoked updateLocationByName");
		System.out.println(resortList.size());
		for (ResortDTO resortDTO : resortList) {
			System.out.println(resortDTO.getName());
			String resortName = resortDTO.getName();
			if (resortName != null && resortName.equals(name)) {
				System.out.println("Name is found can update location");
				resortDTO.setLocation(location);
				System.out.println("update location is:" + location);
			} else {
				System.out.println("Name is not found");
			}
		}

		return false;
	}

	@Override
	public boolean updateLocationByNameandRating(String location, String name, float rating) {
		System.out.println("Invoked updateLocationByNameandRating");
		for (ResortDTO resortDTO : resortList) {
			String resortName = resortDTO.getName();
			float ratingOfResort = resortDTO.getRating();
			if (resortName != null && ratingOfResort != 0 && resortName.equals(name) && ratingOfResort == rating) {
				System.out.println("Name rating is found can update the location");
				resortDTO.setLocation(location);
				System.out.println("updated location is:" + location);
			} else {
				System.out.println("Name and rating is not found");
			}
		}
		// System.out.println("No elements is found in the list");
		return false;
	}

	@Override
	public boolean deleteByNameAndLocation(String name, String location) {
		Iterator<ResortDTO> iterator = this.resortList.iterator();
		while (iterator.hasNext()) {
			ResortDTO resort = iterator.next();
			if (resort.getName().equals(name) && resort.getLocation().equals(location)) {
				iterator.remove();
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean addMultipleResorts(List<ResortDTO> dtos) {
		if (dtos != null) {
			boolean added = dtos.addAll(resortList);
			System.out.println("multiple data added: " + added);
			System.out.println("dtos");
			return true;
		}

		return false;
	}

	@Override
	public int totalResortSize() {
		return this.resortList.size();

	}

	@Override
	public List<ResortDTO> getAll() {

		return this.resortList;
	}

}
