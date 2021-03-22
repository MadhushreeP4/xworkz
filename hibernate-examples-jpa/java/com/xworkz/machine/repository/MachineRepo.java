package com.xworkz.machine.repository;

import java.util.List;

import com.xworkz.machine.entity.MachineEntity;

public interface MachineRepo {
	
	void save(MachineEntity entity);

	MachineEntity findByName(String name);

	void deleteById(int id);

	List<MachineEntity> getAll();


}
