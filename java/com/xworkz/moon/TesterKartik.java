package com.xworkz.moon;

import java.util.Collections;

import com.xworkz.moon.dto.MenuDTO;
import com.xworkz.moon.dto.MenuDTO.Type;
import com.xworkz.moon.service.Finder;
import com.xworkz.moon.service.NonVegFinderImpl;
import com.xworkz.moon.service.RestaurantService;
import com.xworkz.moon.service.RestaurantServiceImpl;
import com.xworkz.moon.service.VegFinderImpl;

public class TesterKartik {

	public static void main(String[] args) {
		RestaurantService service=new RestaurantServiceImpl();
		service.displayItemGreaterThan(200);
		System.out.println(" ");
		/*Finder finder=new VegFinderImpl();
		MenuDTO dto=new MenuDTO("momos", 150, Type.NONVEG);
		finder.Test(dto);
		finder=new NonVegFinderImpl();
		finder.Test(dto);*/
		
		service.findAndDisplay(new Finder() {
			
			@Override
			public boolean Test(MenuDTO dto) {
				if(dto.getPrice()<200){
					return true;
				}
				return false;
			}
		});
		System.out.println(" ");
		
		//() is required = more than one parameter
		//{} is required = more than one statements
		
		service.findAndDisplay(m->m.getPrice()>300);
		
		//Collections.sort(list);

	}

}
