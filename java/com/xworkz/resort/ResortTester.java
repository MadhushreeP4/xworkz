package com.xworkz.resort;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.resort.dao.ResortDAO;
import com.xworkz.resort.dao.ResortDAOImpl;
import com.xworkz.resort.dto.ResortDTO;

public class ResortTester {

	public static void main(String[] args) {

		ResortDAO dao = new ResortDAOImpl();
		System.out.println(dao.totalResortSize());
		System.out.println(dao.getAll());

		ResortDTO dto = new ResortDTO("Kutir", "Gadag", "Kartik", 4.8f);
		dto.setOffers(true);
		dto.setPricePerHead(1200);
		dto.setNoOfEmployees(20);
		dto.setPhoneNo(8887776660l);

		ResortDTO dto2 = new ResortDTO("Kutir", "Hubli", "Kartik", 4.5f);
		dto2.setNoOfEmployees(15);
		dto2.setOffers(true);
		dto2.setPricePerHead(1500);
		dto.setPhoneNo(8886664440l);

		ResortDTO dto1 = new ResortDTO("Brundavan", "Hubli", "Krishna", 5);
		dto1.setNoOfEmployees(22);
		dto1.setOffers(true);
		dto1.setPricePerHead(1800);
		dto1.setPhoneNo(7778889990l);

		dao.save(dto);
		dao.save(dto1);
		dao.save(dto2);
		System.out.println(dao.totalResortSize());
		System.out.println(dao.getAll());
		System.out.println(" ");

		dao.updateLocationByName("Mysore", "Brundavan");
		System.out.println(dao.totalResortSize());
		System.out.println(dao.getAll());
		System.out.println(" ");

		dao.updateLocationByNameAndRating("Bangalore", "Brundavan", 5);
		System.out.println(dao.totalResortSize());
		System.out.println(dao.getAll());
		System.out.println(" ");
		
		List<ResortDTO> copies=new ArrayList<ResortDTO>();
		copies.add(dto);
		copies.add(dto1);
		
		dao.addMultipleResorts(copies);
		System.out.println(dao.getAll());
		System.out.println(dao.totalResortSize());

	}

}
