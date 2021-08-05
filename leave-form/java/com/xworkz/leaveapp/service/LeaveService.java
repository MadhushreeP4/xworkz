package com.xworkz.leaveapp.service;

public interface LeaveService<T> {
	
	public boolean validateAndSave(T entity);
	
	T validateAndFindByName(String name);

}
