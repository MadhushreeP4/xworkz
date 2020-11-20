package com.xworkz.obj;

import com.xworkz.obj.vehicle.Vehicle;;

public class VehicleTester {

	public static void main(String[] args) {
		
		Vehicle vehicle=new Vehicle();
		
		vehicle.model="Duster";
		vehicle.color="Grey";
		Vehicle.company="Renault";
		vehicle.displayInfo();
		
		System.out.println("**************");
		
			
		Vehicle vehicle2=new Vehicle();
		vehicle2.model="BMW";
		vehicle2.color="Black";
		Vehicle.company="BMW Group";
		vehicle2.displayInfo();		

	}

}
