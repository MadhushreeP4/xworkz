package com.xworkz.icecream;

import java.util.List;

import com.xworkz.icecream.entity.IceCreamEntity;
import com.xworkz.icecream.repository.IceCreamRepo;
import com.xworkz.icecream.repository.IceCreamRepoImpl;

public class RUDTester {

	public static void main(String[] args) {
		
		IceCreamRepo repo=new IceCreamRepoImpl();
		
		List<IceCreamEntity> list=repo.getAll();//4
		list.forEach(m->System.out.println(m));
		System.out.println(" ");
		
		//repo.updatePriceByName("Candy Cane", 150);//2
		
		System.out.println(repo.findByNameAndPrice("FamilyPck", 300));//5
		System.out.println(" ");
		repo.deleteByName("Raspberry");//3
	}

}
