package com.xworkz.obj.mobile;

public class Mobile {
	public static String battery;
	public String modelName;
	public String price;
	public String colorOfModel;
	public String yearOfRelease;
	
	public void displayInfo()
	{
		System.out.println("battery used in all mobiles: " + battery);
		System.out.println("Model name: "+ modelName);
		System.out.println("price: "+ price);
		System.out.println("Color: "+ colorOfModel);
		System.out.println("Year of release: "+ yearOfRelease);
		
	}

}
