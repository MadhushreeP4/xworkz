package com.xworkz.resort.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.resort.dto.ResortDTO;

public class ResortDAOImpl implements ResortDAO {

	private List<ResortDTO> resortList;

	public ResortDAOImpl() {
		System.out.println("created ResortDAOImpl");
		this.resortList = new ArrayList<ResortDTO>();
	}

	@Override
	public void save(ResortDTO dto) {
		System.out.println("invoked save");
		System.out.println("arg: " + dto);
		if (!this.resortList.contains(dto)) {
			this.resortList.add(dto);
			System.out.println("resort is not there, added");
		} else {
			System.out.println("resort is already there");
		}
	}

	@Override
	public boolean updateLocationByName(String location, String name) {

		System.out.println("invoked updateLocationByName");
		System.out.println("arg1: " + location);
		System.out.println("arg2: " + name);
		for (ResortDTO resortDTO : resortList) {
			String rName = resortDTO.getName();
			if (rName.equals(name)) {
				System.out.println("name is present");
				System.out.println("location before: " + resortDTO.getLocation());
				resortDTO.setLocation(location);
				System.out.println("location updated");
				System.out.println("location after: " + resortDTO.getLocation());
				return true;
			}else{
				System.out.println("name is not there, cannot update");
			}
		}
		return false;
	}

	@Override
	public boolean updateLocationByNameAndRating(String location, String name, float rating) {
		Iterator<ResortDTO> iterator = resortList.iterator();
		System.out.println("invoked updateLocationByNameAndRating");
		System.out.println("arg1: " + location);
		System.out.println("arg2: " + name);
		System.out.println("arg3: " + rating);
		while (iterator.hasNext()) {
			ResortDTO dto = iterator.next();
			if (dto.getName().equals(name) && dto.getRating() == rating) {
				System.out.println("location before: " + dto.getLocation());
				dto.setLocation(location);
				System.out.println("location updated");
				System.out.println("location after: " + dto.getLocation());
				return true;
			}else{
				System.out.println("data is not matching");
			}
		}
		return false;
	}

	@Override
	public boolean deleteByNameAndLocation(String name, String location) {
		Iterator<ResortDTO> iterator = resortList.iterator();
		System.out.println("invoked deleteByNameAndLocation");
		System.out.println("arg1: " + name);
		System.out.println("arg2: " + location);
		while (iterator.hasNext()) {
			ResortDTO dto = iterator.next();
			if (dto.getName().equals(name) && dto.getLocation().equals(location)) {
				iterator.remove();
				System.out.println("deleted");
				return true;
			}else{
				System.out.println("data is not matching");
			}
		}
		return false;
	}

	@Override
	public boolean addMultipleResorts(List<ResortDTO> dtos) {

	return this.resortList.addAll(dtos);
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
