package com.xworkz.constructor.season;

public class Season {
	
	public String seasonName;
	public String startMonth;
	
	public Season(){
		System.out.println("Invoked default constructor");
		System.out.println(seasonName);
		System.out.println(startMonth);
	}
	
	public Season(String seasonName,String month){
		System.out.println("Invoked parameterized constructor");
		this.seasonName=seasonName;
		startMonth=month;
	}

}
