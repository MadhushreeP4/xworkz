package com.xworkz.moon.service;

import com.xworkz.moon.dto.MenuDTO;
import com.xworkz.moon.dto.MenuDTO.Type;

public class VegFinderImpl implements Finder{

	@Override
	public boolean Test(MenuDTO dto) {
		if(dto!=null && dto.getType().equals(Type.VEG)){
			return true;
		}
		return false;
	}

}
