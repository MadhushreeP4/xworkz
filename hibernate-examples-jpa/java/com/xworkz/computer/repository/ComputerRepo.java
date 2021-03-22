package com.xworkz.computer.repository;

import java.util.List;

import com.xworkz.computer.entity.ComputerEntity;

public interface ComputerRepo {
	
	void save(ComputerEntity entity);

	ComputerEntity findByName(String name);

	void deleteById(int id);

	List<ComputerEntity> getAll();

}
