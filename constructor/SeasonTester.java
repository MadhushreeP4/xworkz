package com.xworkz.constructor;

import com.xworkz.constructor.season.Season;

public class SeasonTester {

	public static void main(String[] args) {
		
		Season season=new Season();
		
		Season season2=new Season("Winter","December");
		System.out.println("Season: "+season2.seasonName);
		System.out.println("month: "+season2.startMonth);

	}

}
