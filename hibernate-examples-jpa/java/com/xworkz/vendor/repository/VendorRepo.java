package com.xworkz.vendor.repository;

import java.util.List;

import com.xworkz.vendor.entity.VendorEntity;

public interface VendorRepo {

	void save(VendorEntity entity);

	VendorEntity findByName(String name);

	void deleteById(int id);

	List<VendorEntity> getAll();

}
