package com.xworkz.car.showroom;

import com.xworkz.car.carconstants.CarVariant;

import com.xworkz.car.manager.CarDTO;

import com.xworkz.car.manager.ManagerDTO;

/**
 * 
 * @author Madhushree
 *
 */

public class CarShowroom {
	private String name;
	private String location;
	private ManagerDTO managerDTO;
	private CarDTO[] cars = new CarDTO[5];
	private int currentIndex = 0;

	public CarShowroom() {
		System.out.println("default constructor");
	}
	
	/**
	 * constructor with
	 * @param name
	 * @param location
	 */

	public CarShowroom(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	
	/**
	 * normal method to add manager with
	 * @param name
	 * @param contactN0
	 */

	public void addManager(String name, long contactN0) {
		if (name != null && contactN0 > 0) {
			this.managerDTO = new ManagerDTO(name, contactN0);
			System.out.println("manager added");
		} else {
			System.out.println("data is invalid");
		}
	}
	
	/**
	 * adding manager with DTO
	 * @param name
	 */

	public void addManager(ManagerDTO name) {
		if (name != null) {
			this.managerDTO = name;
			System.out.println("manager added");
		} else {
			System.out.println("data is invalid");
		}
	}

	public void displayManager() {
		if (this.managerDTO != null) {
			System.out.println(this.managerDTO.getName());
			System.out.println((this.managerDTO.getContactNo()));
		} else {
			System.out.println("manager is not there");
		}
	}

	public void removeManager() {
		this.managerDTO = null;
	}
	
	/**
	 * updating manager with DTO
	 * @param name
	 */

	public void updateManager(ManagerDTO name) {
		if (managerDTO != null) {
			this.managerDTO = name;
			System.out.println("New manager added");
		} else {
			System.out.println("Manager is not there so add manager");
		}
	}
	
	/**
	 * adding cars to car show room
	 * @param car
	 */

	public void addCar(CarDTO car) {
		if (car != null && this.currentIndex < 5) {
			System.out.println("add car");
			System.out.println("index value: " + this.currentIndex);
			this.cars[this.currentIndex] = car;
			this.currentIndex++;
		} else {
			if (car == null) {
				System.out.println("cannot add null");
			}
			if (car != null) {
				System.out.println("cannot add more than " + this.currentIndex + " cars");
			}
		}

	}

	public void displayCars() {

		for (int c = 0; c < this.cars.length; c++) {
			CarDTO cdto = this.cars[c];
			System.out.println(cdto);
			System.out.println(cdto.getModel());
			System.out.println(cdto.getPrice());
			System.out.println(cdto.getVariant());
		}
	}
	
	/**
	 * updating car variant with the help of index value
	 * @param newVariant
	 * @param indexToUpdate
	 */

	public void updateCarVariant(CarVariant newVariant, int indexToUpdate) {
		if (newVariant != null && indexToUpdate >= 0 && indexToUpdate < 5) {
			System.out.println("car index: " + indexToUpdate);
			System.out.println("updated car variant: " + newVariant);
			CarDTO carDTO = this.cars[indexToUpdate];
			System.out.println("updating car " + carDTO.getModel());
			carDTO.setVariant(newVariant);
		}
	}
	
	/**
	 * displays model price and variant when we give index value
	 * @param indexToDisplay
	 */

	public void displayCarAtIndex(int indexToDisplay) {
		if (indexToDisplay >= 0 && indexToDisplay < 5) {
			System.out.println("car at index: " + indexToDisplay);
			CarDTO refCar = this.cars[indexToDisplay];
			System.out.println(refCar.getModel());
			System.out.println(refCar.getPrice());
			System.out.println(refCar.getVariant());

		}
	}
	
	/**
	 * displays price and variant of a car when we give a model name
	 * @param model
	 */

	public void displayCarByModel(String model) {
		if (model != null) {
			System.out.println("searching for model "+model);
			boolean carFound = false;
			for (int index = 0; index < this.cars.length; index++) {
				CarDTO refOfCar = this.cars[index];
				String localModel = refOfCar.getModel();
				if (localModel.equals(model)) {
					System.out.println("car is found");
					System.out.println(refOfCar.getPrice());
					System.out.println(refOfCar.getVariant());
					carFound = true;
					break;
				}
			}
			if (carFound == false) {
				System.out.println(model+" car is not found");
			}
		}
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public ManagerDTO getManagerDTO() {
		return managerDTO;
	}

	public CarDTO[] getCars() {
		return cars;
	}

	public int getCurrentIndex() {
		return currentIndex;
	}

}
