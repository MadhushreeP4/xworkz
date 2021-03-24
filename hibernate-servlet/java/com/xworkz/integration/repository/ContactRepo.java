package com.xworkz.integration.repository;

import java.util.List;

import com.xworkz.integration.entity.ContactEntity;

public interface ContactRepo {
	
	public void save(ContactEntity entity);
	
	public ContactEntity findByName(String name);
	
	public ContactEntity findByEmail(String email);
	
	List<ContactEntity> findAll();

}
