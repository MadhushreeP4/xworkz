package com.xworkz.vendor;

import com.xworkz.vendor.entity.VendorEntity;
import com.xworkz.vendor.repository.VendorRepo;
import com.xworkz.vendor.repository.VendorRepoImpl;

public class VendorTester {
	
	public static void main(String[] args) {
		VendorEntity entity1=new VendorEntity("Madhu", "Gadag", 4.5);
		VendorEntity entity2=new VendorEntity("Lakshmi", "CBPur", 4.5);
		VendorEntity entity3=new VendorEntity("Vena", "Lxm", 4.5);
		VendorEntity entity4=new VendorEntity("Sushma", "Bagalkot", 4.5);
		VendorEntity entity5=new VendorEntity("Madhvi", "Hubli", 4.5);
		
		VendorRepo repo=new VendorRepoImpl();
		//repo.save(entity1);
		//repo.save(entity2);
		//repo.save(entity3);
		//repo.save(entity4);
		//repo.save(entity5);
		
		repo.deleteById(5);
	}

}
