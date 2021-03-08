package com.xworkz.waterfall.dao;

import java.util.List;

import com.xworkz.waterfall.entity.SpaceAgencyEntity;

public interface SpaceAgencyDAO {
	
	void create(SpaceAgencyEntity entity);
	
	void create(List<SpaceAgencyEntity> entities);
	
	SpaceAgencyEntity getById(int id);
	
	void updateAnnualBudgetById(int id,int budget);
	
	void deleteById(int id);

}
