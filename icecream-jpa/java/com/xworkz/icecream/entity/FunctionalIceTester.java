package com.xworkz.icecream.entity;

import java.util.List;

import com.xworkz.icecream.repository.IceCreamRepo;
import com.xworkz.icecream.repository.IceCreamRepoImpl;

public class FunctionalIceTester {

	public static void main(String[] args) {
		
		IceCreamRepo repo=new IceCreamRepoImpl();
		//System.out.println(repo.getByMaxPrice());
		//System.out.println(repo.getByMinPrice());
		
		//System.out.println(repo.getSumPrice());//6
		//System.out.println("price by name: "+repo.getPriceByName("BlueMoon"));//7
		
		List<Object[]> list=repo.getNameAndFlavourByPrice(150);
		list.forEach(m->System.out.println(m));
	}

}
