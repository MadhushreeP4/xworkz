package com.xworkz.cartoons;

import com.xworkz.cartoons.dao.CartoonDAO;
import com.xworkz.cartoons.dao.CartoonDAOImpl;
import com.xworkz.cartoons.entity.CartoonEntity;
import com.xworkz.cartoons.entity.CartoonEntity.ChannelName;

public class HQLGetTester {

	public static void main(String[] args) {
		
		CartoonDAO dao=new CartoonDAOImpl();
		
		//System.out.println(dao.findByName("Jerry"));
		
		System.out.println(" ");
		
		CartoonEntity entityFromDB=dao.findByChannelAndLanguage(ChannelName.DISNEY, "english");
		System.out.println(entityFromDB);

	}

}
