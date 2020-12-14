package com.xworkz.car.showroom;

import com.xworkz.car.manager.ManagerDTO;

public class CarShowroom {
	private String name;
	private String location;
	private long contactNo;
	private ManagerDTO managerDTO;

	public CarShowroom() {
		System.out.println("default constructor");
	}

	public CarShowroom(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

	public void addManager(String name, long contactN0) {
		if (name != null && contactN0 > 0) {
			this.managerDTO = new ManagerDTO(name, contactN0);
			System.out.println("manager added");
		} else {
			System.out.println("data is invalid");
		}
	}

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

	public void updateManager(ManagerDTO name) {
		if (managerDTO != null) {
			this.managerDTO = name;
			System.out.println("New manager added");
		} else {
			System.out.println("Manager is not there so add manager");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public ManagerDTO getManagerDTO() {
		return managerDTO;
	}

	public void setManagerDTO(ManagerDTO managerDTO) {
		this.managerDTO = managerDTO;
	}

}
