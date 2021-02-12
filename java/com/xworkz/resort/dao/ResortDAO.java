package com.xworkz.resort.dao;

import java.util.List;

import com.xworkz.resort.dto.ResortDTO;

public interface ResortDAO {
	
	void save(ResortDTO dto);
	
	boolean updateLocationByName(String location,String name);
	
	boolean updateLocationByNameAndRating(String location,String name,float rating);
	
	boolean deleteByNameAndLocation(String name,String location);
	
	boolean addMultipleResorts(List<ResortDTO> dtos);
	
	int totalResortSize();
	
	List<ResortDTO> getAll();
	
	
	
	

}
