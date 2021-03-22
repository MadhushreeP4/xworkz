package com.xworkz.person.repository;

import java.util.List;

import com.xworkz.person.entity.PersonEntity;

public interface PersonRepo {
	
	void save(PersonEntity entity);

	PersonEntity findByName(String name);

	void deleteById(int id);

	List<PersonEntity> getAll();

}
