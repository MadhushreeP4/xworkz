package com.xworkz.temple;

import com.xworkz.temple.entity.TempleEntity;
import com.xworkz.temple.repository.TempleRepo;
import com.xworkz.temple.repository.TempleRepoImpl;

public class TempleTester {

	public static void main(String[] args) {
		
		TempleEntity entity1=new TempleEntity("Bhajarangi", "Bangalore", 4000, 5);
		TempleEntity entity2=new TempleEntity("Kannah", "Udupi", 10000, 10);
		TempleEntity entity3=new TempleEntity("Chamundi", " Mysore", 12000, 15);
		TempleEntity entity4=new TempleEntity("Bhadra", "Gadag", 1000, 2);
		TempleEntity entity5=new TempleEntity("abc", "xyz", 400, 1);
		
		TempleRepo repo=new TempleRepoImpl();
		//repo.save(entity1);
		//repo.save(entity2);
		//repo.save(entity3);
		//repo.save(entity4);
		//repo.save(entity5);
		
		repo.deleteById(5);

	}

}
