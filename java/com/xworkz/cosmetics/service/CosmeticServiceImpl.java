package com.xworkz.cosmetics.service;

import java.util.List;

import com.xworkz.cosmetics.constants.CosmeticShade;
import com.xworkz.cosmetics.constants.CosmeticType;
import com.xworkz.cosmetics.dao.CosmeticDAO;
import com.xworkz.cosmetics.dao.impl.CosmeticDAOImpl;
import com.xworkz.cosmetics.dto.CosmeticDTO;

public class CosmeticServiceImpl implements CosmeticService {
	
	protected CosmeticDAO cosmeticDAO;
	
	public CosmeticServiceImpl(CosmeticDAO cosmeticDAO) {
		this.cosmeticDAO=cosmeticDAO;
	}

	@Override
	public boolean serviceAndSave(CosmeticDTO cosmeticDTO) {
		boolean validData = false;
		if (cosmeticDTO != null) {
			System.out.println("dto is not null, can validate");

				String brand = cosmeticDTO.getBrand();
				if (brand != null && brand.length() >= 3 && !brand.isEmpty() && 
						!brand.contains(" ")) {
					System.out.println("brand is valid");
					validData=true;

				} else {
					System.out.println("brand is invalid");
					validData=false;
				}
			

			if (validData) {
				CosmeticShade shade = cosmeticDTO.getShade();
				if (shade != null) {
					System.out.println("shade is valid");
					validData=true;
				} else {
					System.out.println("shade is invalid");
					validData=false;
				}
			}

			if (validData) {
				CosmeticType type = cosmeticDTO.getType();
				if (type != null) {
					System.out.println("type is valid");
					validData=true;
				} else {
					System.out.println("type is invalid");
					validData=false;
				}
			}

			if (validData) {
				double price = cosmeticDTO.getPrice();
				if (price > 0) {
					System.out.println("price is valid");
					validData=true;
				} else {
					System.out.println("price is invalid");
					validData=false;
				}
			}

			if (validData) {
				int quantity = cosmeticDTO.getQuantity();
				if (quantity > 0 && quantity <= 100) {
					System.out.println("quantity is valid");
					validData=true;
				} else {
					System.out.println("quantity is invalid");
					validData=false;
				}
			}
			
			if(validData){
				System.out.println("validation is done, can invoke dao");
				//cosmeticDAO=new CosmeticDAOImpl();
				this.cosmeticDAO.save(cosmeticDTO);
			}

		} else {
			System.out.println("dto is null");
			validData=false;
		}
		return false;
	}

	@Override
	public void deleteByBrand(String brand) {
		System.out.println("invoked deleteByBrand");
		if(brand!=null && brand.length()>=3 && !brand.isEmpty() && !brand.contains(" ")){
			System.out.println("brand is valid, can delete");
			this.cosmeticDAO.deleteByBrand(brand);
		}else{
			System.out.println("brand is invalid");
		}
		
	}

	@Override
	public int totalSizeI() {
		System.out.println("invoked totalSizeI");
		
		return this.cosmeticDAO.totalSize();
	}

}
