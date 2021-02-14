package com.xworkz.cosmetics.service;

import com.xworkz.cosmetics.dto.CosmeticDTO;

public interface CosmeticService {
	
	boolean serviceAndSave(CosmeticDTO cosmeticDTO);
	
	void deleteByBrand(String brand);
	
	int totalSizeI();

}
