package com.xworkz.moon.service;

import com.xworkz.moon.dto.MenuDTO;
import com.xworkz.moon.dto.MenuDTO.Type;

public class NonVegFinderImpl implements Finder {

	@Override
	public boolean Test(MenuDTO dto) {
		System.out.println("invoked Test");
		if(dto!=null && dto.getType().equals(Type.NONVEG)){
			return true;
		}
		return false;
	}

}
