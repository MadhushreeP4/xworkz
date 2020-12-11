package com.xworkz.dto;

import com.xworkz.dto.company.CompanyDTO;

public class DTOCompanyTester {

	public static void main(String[] args) {
		
		CompanyDTO company=new CompanyDTO("2002");
		System.out.println(company.getFounded());
		System.out.println(company.getName());
		System.out.println(company.getLocation());
		System.out.println(" ");
		
		CompanyDTO company2=new CompanyDTO("SpaceX","Elon Musk","California","Space Transportation Service");
		System.out.println(company2.getType());
		System.out.println(company2.getName());
		System.out.println(company2.getLocation());
		System.out.println(company2.getCeo());
		
		company2.setWebSite("www.spacex.com");
		System.out.println(company2.getWebSite());
		

	}

}
