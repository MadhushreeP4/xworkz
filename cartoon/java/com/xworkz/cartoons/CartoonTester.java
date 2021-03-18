package com.xworkz.cartoons;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.cartoons.dao.CartoonDAO;
import com.xworkz.cartoons.dao.CartoonDAOImpl;
import com.xworkz.cartoons.entity.CartoonEntity;
import com.xworkz.cartoons.entity.CartoonEntity.ChannelName;

public class CartoonTester {

	public static void main(String[] args) {
		
		CartoonEntity entity1=new CartoonEntity("Jerry", "Tom and Jerry", ChannelName.CARTOON_NETWORK, "english");
		CartoonEntity entity2=new CartoonEntity("Tom", "Tom and Jerry", ChannelName.CARTOON_NETWORK, "english");
		CartoonEntity entity3=new CartoonEntity("Oswald", "Oswald", ChannelName.POGO, "english");
		
		CartoonDAO dao=new CartoonDAOImpl();
		
		List<CartoonEntity> list=new ArrayList<CartoonEntity>();
		list.add(entity1);
		list.add(entity2);
		list.add(entity3);
		//dao.create(list);
		
		CartoonEntity entity4=new CartoonEntity("Richie", "Richie Rich", ChannelName.CARTOON_NETWORK, "english");
		CartoonEntity entity5=new CartoonEntity("Mr.Bean", "Mr.Bean", ChannelName.POGO, "english");
		CartoonEntity entity6=new CartoonEntity("Bheem", "Choto Beam", ChannelName.POGO, "english");
		CartoonEntity entity7=new CartoonEntity("Kalia", "Choto Beam", ChannelName.POGO, "english");
		
		List<CartoonEntity> list2=new ArrayList<CartoonEntity>();
		list2.add(entity4);
		list2.add(entity5);
		list2.add(entity6);
		list2.add(entity7);
		
		//dao.create(list2);
		
		List<CartoonEntity> list3=new ArrayList<CartoonEntity>();
		CartoonEntity entity8=new CartoonEntity("Shinchan", "Shinchan", ChannelName.DISNEY, "english");
		list3.add(entity8);
		dao.create(list3);
		
	}

}
