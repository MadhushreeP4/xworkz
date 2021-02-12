package com.xworkz.resort.service;

import java.util.List;

import com.xworkz.resort.dto.ResortDTO;

public interface ResortService {

	boolean validateAndSave(ResortDTO dto);
	
	boolean validateAndUpdateLocationByName(String location,String name);
	
	boolean validateAndUpdateLocationByNameAndRating(String location,String name,float rating);
	
	boolean validateAndDeleteByNameAndLocation(String name,String location);
	
	boolean validateAndAddMultipleResorts(List<ResortDTO> dtos);
	
	int validateAndGetTotalResortSize();
	
	List<ResortDTO> validateAndGetAll();

}
