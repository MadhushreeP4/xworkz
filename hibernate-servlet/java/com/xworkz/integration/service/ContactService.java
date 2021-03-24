package com.xworkz.integration.service;

import java.util.List;

import com.xworkz.integration.entity.ContactEntity;

public interface ContactService<T> {
	
	boolean validateAndSave(T entity);
	
	ContactEntity validateAndFindByName(String name);

	ContactEntity validateAndFindByEmail(String email);
	
	List<ContactEntity> displayAll();

}
