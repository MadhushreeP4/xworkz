package com.xworkz.temple;

import java.util.List;

import com.xworkz.temple.entity.TempleEntity;
import com.xworkz.temple.repository.TempleRepo;
import com.xworkz.temple.repository.TempleRepoImpl;

public class TempleGetTester {

	public static void main(String[] args) {
		
		TempleRepo repo=new TempleRepoImpl();
		
		System.out.println(repo.findByName("Bhajarangi"));
		
		List<TempleEntity> list=repo.getAll();
		list.forEach(m->System.out.println(m));

	}

}
