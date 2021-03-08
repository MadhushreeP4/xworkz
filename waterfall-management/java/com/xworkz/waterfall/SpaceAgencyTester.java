package com.xworkz.waterfall;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.waterfall.dao.SpaceAgencyDAO;
import com.xworkz.waterfall.dao.SpaceAgencyDAOImpl;
import com.xworkz.waterfall.entity.SpaceAgencyEntity;

public class SpaceAgencyTester {

	public static void main(String[] args) {

		SpaceAgencyEntity agency1 = new SpaceAgencyEntity("ISRO", 1969, 1500, "India");// 1.5b
		SpaceAgencyEntity agency2 = new SpaceAgencyEntity("NASA", 1958, 20700, "US");// 20.7b
		SpaceAgencyEntity agency3 = new SpaceAgencyEntity("JAXA", 1993, 2030, "Japan");// 2.03b
		SpaceAgencyEntity agency4 = new SpaceAgencyEntity("RFSA", 1992, 3270, "Russia");// 3.27b
		SpaceAgencyEntity agency5 = new SpaceAgencyEntity("SPACEX", 2002, 1200, "Non-Gov");// 1.2b
		SpaceAgencyEntity agency6 = new SpaceAgencyEntity("ESA", 1975, 7000, "Europe");// 7b

		List<SpaceAgencyEntity> list = new ArrayList<>();
		list.add(agency1);
		list.add(agency2);
		list.add(agency3);
		list.add(agency4);
		list.add(agency5);
		list.add(agency6);

		SpaceAgencyEntity agency7 = new SpaceAgencyEntity("CNSA", 1993, 11000, "China");// 11B

		SpaceAgencyDAO dao = new SpaceAgencyDAOImpl();
		// dao.create(list);
		// dao.create(agency7);
		SpaceAgencyEntity entity = dao.getById(1);
		System.out.println(entity);
		//dao.updateAnnualBudgetById(3, 2040);
		dao.deleteById(7);

	}

}
