package com.xworkz.moon.service;

import java.util.LinkedList;
import java.util.List;
import com.xworkz.moon.dto.MenuDTO.Type;

import com.xworkz.moon.dto.MenuDTO;

public class RestaurantServiceImpl implements RestaurantService {
	
	private List<MenuDTO> menus;
	
	public RestaurantServiceImpl() {
		this.menus=new LinkedList<MenuDTO>();
	
	MenuDTO menu1=new MenuDTO("Brownie", 200, Type.VEG);
	MenuDTO menu2=new MenuDTO("Biryani", 275, Type.NONVEG);
	MenuDTO menu3=new MenuDTO("Gobi Rice", 100, Type.VEG);
	MenuDTO menu4=new MenuDTO("Obbattu", 15, Type.VEG);
	MenuDTO menu5=new MenuDTO("Pani Puri", 30, Type.VEG);
	
	this.menus.add(menu1);
	this.menus.add(menu2);
	this.menus.add(menu3);
	this.menus.add(menu4);
	this.menus.add(menu5);
	}

	@Override
	public void displayItemGreaterThan(double price) {
		System.out.println("invoked displayItemGreaterThan");
		for (MenuDTO menuDTO : menus) {
			if(menuDTO.getPrice()>=price){
				System.out.println(menuDTO);
			}
		}

	}

	@Override
	public void displayByName(String name) {
		System.out.println("invoked displayByName");
		for (MenuDTO menuDTO : menus) {
			if(menuDTO.getItemName().equals(name)){
				System.out.println(menuDTO);
			}
		}

	}

	@Override
	public void findAndDisplay(Finder finder) {
		System.out.println("invoked findAndDisplay");
		for (MenuDTO menuDTO : menus) {
			if(finder.Test(menuDTO)){
				System.out.println(menuDTO);
			}
		}

	}

}
