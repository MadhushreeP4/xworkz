package com.xworkz.cosmetics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.cosmetics.constants.CosmeticShade;
import com.xworkz.cosmetics.constants.CosmeticType;
import com.xworkz.cosmetics.dao.CosmeticDAO;
import com.xworkz.cosmetics.dao.impl.CosmeticDAOImpl;
import com.xworkz.cosmetics.dto.CosmeticDTO;

public class CosmeticTester {

	public static void main(String[] args) {
		
		List<CosmeticDTO> list=new ArrayList<CosmeticDTO>();
		
		CosmeticDAO dao=new CosmeticDAOImpl();
		
		CosmeticDTO dto1=new CosmeticDTO("Lakme", CosmeticShade.GRAY, CosmeticType.EYELINER, 250, 1);
		dao.save(dto1);
		System.out.println(dto1);
		System.out.println(dao.totalSize());
		System.out.println(" ");
		
		CosmeticDTO dto2=new CosmeticDTO("Lakme", CosmeticShade.BLACK, CosmeticType.EYELINER, 350, 1);
		dao.save(dto2);
		System.out.println(dto2);
		System.out.println(" ");
		
		CosmeticDTO dto3=new CosmeticDTO("Elle", CosmeticShade.RED, CosmeticType.LIPSTICK, 400, 1);
		dao.save(dto3);
		System.out.println(dto3);
		System.out.println(" ");
		
		CosmeticDTO dto4=new CosmeticDTO("LOreal", CosmeticShade.PINK, CosmeticType.MASCARA, 600, 2);
		dao.save(dto4);
		System.out.println(dto4);
		System.out.println(" ");
		
		dao.updatePriceAndQuantityByBrand(650, 5, "LOreal");
		System.out.println(" ");
		dao.updatePriceByBrandAndType(1000, "LOreal", CosmeticType.EYELINER);
		//System.out.println(dao.getAll());	
	}

}
