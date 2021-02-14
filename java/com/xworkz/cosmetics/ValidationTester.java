package com.xworkz.cosmetics;

import com.xworkz.cosmetics.constants.CosmeticShade;
import com.xworkz.cosmetics.constants.CosmeticType;
import com.xworkz.cosmetics.dao.CosmeticDAO;
import com.xworkz.cosmetics.dao.impl.CosmeticDAOImpl;
import com.xworkz.cosmetics.dto.CosmeticDTO;
import com.xworkz.cosmetics.service.CosmeticService;
import com.xworkz.cosmetics.service.CosmeticServiceImpl;

public class ValidationTester {

	public static void main(String[] args) {

		CosmeticDTO dto = new CosmeticDTO();

		dto.setShade(CosmeticShade.PINK);
		dto.setBrand("Mac");
		dto.setType(CosmeticType.CONCEALER);
		dto.setPrice(300);
		dto.setQuantity(5);
		
		CosmeticDTO dto2=new CosmeticDTO("Elle", CosmeticShade.GRAY, CosmeticType.EYELINER, 1000, 2);
		
		CosmeticDAO cosmeticDAO=new CosmeticDAOImpl();
		
		CosmeticService service = new CosmeticServiceImpl(cosmeticDAO);
		service.serviceAndSave(dto);
		System.out.println(" ");
		service.serviceAndSave(dto2);
		System.out.println(" ");
		System.out.println(service.totalSizeI());
		service.deleteByBrand("Mac ");
		System.out.println(service.totalSizeI());
		service.deleteByBrand("Elle");
		System.out.println(service.totalSizeI());
		

	}

}
