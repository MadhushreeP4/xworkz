package com.xworkz.waterfall;

import org.hibernate.SessionFactory;

import com.xworkz.waterfall.dao.WaterFallDAO;
import com.xworkz.waterfall.dao.WaterFallDAOImpl;
import com.xworkz.waterfall.entity.WaterFallEntity;
import com.xworkz.waterfall.util.SFUtil;

public class WaterFallTester {

	public static void main(String[] args) {

		// SessionFactory factory=SFUtil.getFactory();
		// System.out.println(factory);

		WaterFallEntity entity = new WaterFallEntity();
		entity.setName("Niagara");
		entity.setLocation("Canada");
		entity.setHeight(167);
		entity.setDepth(170);
		entity.setElectricityGenerated(true);
		entity.setDestination("US");
		entity.setEntryFees(2000);
		entity.setNoOfDeaths(100);
		entity.setNoOfVisitors(100000);
		entity.setRating(5);
		entity.setSourceRiver("Lake Erie");

		WaterFallEntity entity2 = new WaterFallEntity();
		entity2.setName("Gokak Falls");
		entity2.setLocation("Belgaum");
		entity2.setHeight(80);
		entity2.setDepth(40);
		entity2.setElectricityGenerated(true);
		entity2.setDestination("Sagara");
		entity2.setEntryFees(50);
		entity2.setNoOfDeaths(2);
		entity2.setNoOfVisitors(50000);
		entity2.setRating(5);
		entity2.setSourceRiver("Tunga");

		WaterFallDAO dao = new WaterFallDAOImpl();
		// dao.create(entity);
		// dao.create(entity2);

		WaterFallEntity values = dao.getById(2);
		System.out.println(values);
		System.out.println(" ");
		// dao.updateHeightAndDepthById(2, 168, 171);
		System.out.println(" ");
		dao.deleteById(7);

	}

}
