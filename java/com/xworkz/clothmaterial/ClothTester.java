package com.xworkz.clothmaterial;

import com.xworkz.clothmaterial.cloth.Brand;

import com.xworkz.clothmaterial.cloth.Cloth;

public class ClothTester {

	public static void main(String[] args) {
		
		Cloth cloth = new Cloth();
		cloth.setBrand("Nike");
		cloth.setFabric("Synthetic");
		cloth.design();
		
		System.out.println(cloth.getBrand());
		System.out.println(cloth.getFabric());
		System.out.println(cloth.getPrice());
		
		Brand brand=new Brand();
		brand.setBrand("Gucci");
		brand.setFabric("Prato");
		brand.design();
		
		System.out.println(brand.getBrand());
		System.out.println(brand.getFabric());
		System.out.println(brand.getPrice());
		
		

	}

}
