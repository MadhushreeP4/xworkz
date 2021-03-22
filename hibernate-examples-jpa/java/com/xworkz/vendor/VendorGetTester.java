package com.xworkz.vendor;

import java.util.List;

import com.xworkz.vendor.entity.VendorEntity;
import com.xworkz.vendor.repository.VendorRepo;
import com.xworkz.vendor.repository.VendorRepoImpl;

public class VendorGetTester {

	public static void main(String[] args) {


		VendorRepo repo=new VendorRepoImpl();
		
		System.out.println(repo.findByName("Madhu"));
		
		List<VendorEntity> list=repo.getAll();
		list.forEach(v->System.out.println(v));

	}

}
