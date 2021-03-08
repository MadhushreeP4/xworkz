package com.xworkz.waterfall.dao;

import com.xworkz.waterfall.entity.WaterFallEntity;

public interface WaterFallDAO {
	
	void create(WaterFallEntity entity);
	
	WaterFallEntity getById(int id);
	
	void updateHeightAndDepthById(int id,int height,int depth);
	
	void deleteById(int id);

}
