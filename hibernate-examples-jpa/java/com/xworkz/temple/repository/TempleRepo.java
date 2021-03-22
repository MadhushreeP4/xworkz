package com.xworkz.temple.repository;

import java.util.List;

import com.xworkz.temple.entity.TempleEntity;

public interface TempleRepo {
	
	void save(TempleEntity entity);
	
	TempleEntity findByName(String name);
	
	void deleteById(int id);
	
	List<TempleEntity> getAll();

}
