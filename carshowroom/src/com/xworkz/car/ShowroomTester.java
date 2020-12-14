package com.xworkz.car;

import com.xworkz.car.manager.ManagerDTO;
import com.xworkz.car.showroom.CarShowroom;

public class ShowroomTester {

	public static void main(String[] args) {

		CarShowroom carShowroom = new CarShowroom();
		System.out.println(" ");

		carShowroom.addManager("Madhu", 7654321098l);
		carShowroom.displayManager();
		System.out.println(" ");

		carShowroom.removeManager();
		carShowroom.displayManager();
		System.out.println(" ");

		ManagerDTO managerDTO = new ManagerDTO("Kartik", 8765432109l);
		carShowroom.updateManager(managerDTO);
		carShowroom.displayManager();
		System.out.println(" ");

		carShowroom.addManager(managerDTO);
		carShowroom.displayManager();
		System.out.println(" ");

		ManagerDTO managerDTO2 = new ManagerDTO("Madhu", 7654321098l);
		carShowroom.updateManager(managerDTO2);
		carShowroom.displayManager();

	}

}
