package com.xworkz.cosmetics.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.cosmetics.constants.CosmeticType;
import com.xworkz.cosmetics.dao.CosmeticDAO;
import com.xworkz.cosmetics.dto.CosmeticDTO;

public class CosmeticDAOImpl implements CosmeticDAO {

	protected List<CosmeticDTO> cosmetics;
	
	public CosmeticDAOImpl() {
		
		System.out.println("created CosmeticDAOImpl");
		this.cosmetics=new ArrayList<>();
	}

	@Override
	public boolean save(CosmeticDTO dto) {
		System.out.println("invoked save");
		boolean contain = this.cosmetics.contains(dto);
		if (!contain) {
			this.cosmetics.add(dto);
			System.out.println("Cosmetic added");
			return true;
		} else {
			System.out.println("cosmetic is already there");
			return false;
		}

	}

	@Override
	public boolean updatePriceAndQuantityByBrand(double price, int quantity, String brand) {
		System.out.println("invoked updatePriceAndQuantityByBrand");
		System.out.println("brand: " + brand);
		System.out.println("price: " + price);
		for (CosmeticDTO cosmeticDTO : this.cosmetics) {
			String brandFromDTO = cosmeticDTO.getBrand();
			if (brandFromDTO != null && brandFromDTO.equals(brand)) {
				System.out.println("Brand found, can update");
				System.out.println("before update price : " + cosmeticDTO.getPrice());
				System.out.println("before update quantity: " + cosmeticDTO.getQuantity());
				cosmeticDTO.setPrice(price);
				cosmeticDTO.setQuantity(quantity);
				System.out.println("updated price: " + cosmeticDTO.getPrice());
				System.out.println("updated quantity: " + cosmeticDTO.getQuantity());
				return true;
			} else {
				System.out.println("brand not found");
				//return false;
			}

		}
		return false;
	}

	private CosmeticDTO findByBrand(String brand) {
		// System.out.println("invoked findByBrand");
		for (CosmeticDTO cosmeticDTO : this.cosmetics) {
			String brandFromDTO = cosmeticDTO.getBrand();
			if (brandFromDTO.equals(brand)) {
				System.out.println("brand found");
				return cosmeticDTO;
			}
		}
		return null;
	}

	private CosmeticDTO findByType(CosmeticType type) {
		// System.out.println("invoked findByType");
		for (CosmeticDTO cosmeticDTO : this.cosmetics) {
			CosmeticType typeFromDTO = cosmeticDTO.getType();
			if (typeFromDTO.equals(type)) {
				System.out.println("type found");
				return cosmeticDTO;
			}
		}
		return null;
	}

	@Override
	public boolean updatePriceByBrandAndType(double price, String brand, CosmeticType type) {
		System.out.println("invoked updatePriceByBrandAndType");
		System.out.println("price: " + price);
		System.out.println("brand: " + brand);
		System.out.println("type: " + type);
		CosmeticDTO update = this.findByBrand(brand);
		update = this.findByType(type);
		if (update != null) {
			System.out.println("can update");
			System.out.println("before update price: " + update.getPrice());
			update.setPrice(price);
			System.out.println("updated price: " + update.getPrice());
			return true;
		} else {
			System.out.println("cannot update");
			return false;
		}

	}

	@Override
	public boolean updateTypeByBrand(String brand, CosmeticType type) {
		System.out.println("invoked updateTypeByBrand");
		System.out.println("brand: " + brand);
		System.out.println("type: " + type);
		CosmeticDTO update = this.findByBrand(brand);
		if (update != null) {
			System.out.println("can update");
			System.out.println("before update type: " + update.getType());
			update.setType(type);
			System.out.println("updatedtype: " + update.getType());
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteByBrand(String brand) {
		Iterator<CosmeticDTO> iterator=this.cosmetics.iterator();
		while(iterator.hasNext()){
			CosmeticDTO dto=iterator.next();
			if(dto.getBrand().equals(brand)){
				iterator.remove();
				return true;
			}
		}
		return false;

	}

	@Override
	public List<CosmeticDTO> getAll() {
		System.out.println("invoked getAll");
		
		return this.cosmetics;
	}

	@Override
	public void deleteAll() {
		System.out.println("invoked deleteAll");
		cosmetics.clear();

	}

	@Override
	public int totalSize() {
		System.out.println("invoked totalSize");
		return this.cosmetics.size();
	}

}
