package com.xworkz.constructor;

import com.xworkz.constructor.museum.Museum;

public class MuseumTester {

	public static void main(String[] args) {
		
		Museum museum=new Museum("Goa State Museum",1977,"Goa");
		System.out.println("Museum name: "+museum.museumName);
		System.out.println("Established year: "+museum.establishedYear);
		System.out.println("State: "+museum.state);
		
		Museum museum2=new Museum("Museum of Natural History",1995,"Karnataka");
		System.out.println("Museum name: "+museum2.museumName);
		System.out.println("Established year: "+museum2.establishedYear);
		System.out.println("State: "+museum2.state);
		
	}

}
