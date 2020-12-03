package cons.com.xworkz.constructor;

import cons.com.xworkz.constructor.vehicle.Vehicle;

public class VehicleTester {

	public static void main(String[] args) {
		
		Vehicle vehicle=new Vehicle("4jan2000","Honda",3001);
		
		String mfgDate=vehicle.getMfgDate();
		String company=vehicle.getCompany();
		int no=vehicle.getChasisNo();
		
		System.out.println(mfgDate);
		System.out.println(company);
		System.out.println(no);
		
		String color="white";
		vehicle.setColor(color);
		
		String owner="Hondai";
		vehicle.setOwnerName(owner);

	}

}
