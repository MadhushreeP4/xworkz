package com.xworkz.resort;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.resort.dao.ResortDAO;
import com.xworkz.resort.dao.ResortDAOImpl;
import com.xworkz.resort.dto.ResortDTO;
import com.xworkz.resort.service.ResortService;
import com.xworkz.resort.service.ResortServiceImpl;

public class ValidationTester {

	public static void main(String[] args) {

		ResortDTO dto = new ResortDTO("Kutir", "Gadag", "Kartik", 4.8f);
		dto.setOffers(true);
		dto.setPricePerHead(2499);
		dto.setNoOfEmployees(20);
		dto.setPhoneNo(8887776660l);
		
		ResortDTO dto2 = new ResortDTO("ShanBhag", "Udupi", "Rajashree", 4.4f);
		dto2.setOffers(false);
		dto2.setPricePerHead(2000);
		dto2.setNoOfEmployees(10);
		dto2.setPhoneNo(8884446660l);
		
		ResortDAO dao=new ResortDAOImpl();
		
		ResortService service=new ResortServiceImpl(dao);
		service.validateAndSave(dto);
		System.out.println(" ");
		service.validateAndSave(dto2);
		System.out.println(" ");
		service.validateAndUpdateLocationByName("Hubli", "Kutir");
		System.out.println(" ");
		service.validateAndUpdateLocationByNameAndRating("Bangalore", "Kutir", 4.8f);
		System.out.println(" ");
		service.validateAndDeleteByNameAndLocation("Kutir", "Belgaum");
		System.out.println(" ");
		
		List<ResortDTO> dtos=new ArrayList<>();
		ResortDTO dto3 = new ResortDTO("Nakshatra", "Udupi", "Rajashree", 4.4f);
		dto3.setOffers(false);
		dto3.setPricePerHead(2000);
		dto3.setNoOfEmployees(10);
		dto3.setPhoneNo(8884446660l);
		dtos.add(dto);
		System.out.println(service.validateAndAddMultipleResorts(dtos));
		System.out.println(service.validateAndGetTotalResortSize());
		System.out.println(" ");
		System.out.println(service.validateAndGetAll());
	}

}
