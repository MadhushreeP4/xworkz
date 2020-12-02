package com.xworkz.copies;

import com.xworkz.copies.init.Temple;

public class TempleTester {
	public static void main(String[] args) {
		Temple temple = new Temple("venkateshwar", "tirupathi", 5.00f, "laddu", 10.00f);
		System.out.println("Temple name: " + temple.getName());
		System.out.println("Temple location: " + temple.getLocation());
		System.out.println("Temple open time: " + temple.getOpenTime() + "AM");
		System.out.println("Temple prasada: " + temple.getPrasada());
		System.out.println("Temple close time: " + temple.getCloseTime() + "PM");		
		temple.setPrasada("laadu");
		String prasada=temple.getPrasada();
		System.out.println("updated prasada: "+prasada);
		

	}

}
