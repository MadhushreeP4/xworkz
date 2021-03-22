package com.xworkz.computer;

import com.xworkz.computer.entity.ComputerEntity;
import com.xworkz.computer.repository.ComputerRepo;
import com.xworkz.computer.repository.ComputerRepoImpl;

public class ComputerTester {

	public static void main(String[] args) {


		ComputerEntity entity1=new ComputerEntity("Apple", 150000, "Laptop", "MacBook");
		ComputerEntity entity2=new ComputerEntity("HP", 40000, "Laptop", "Elitebook");
		ComputerEntity entity3=new ComputerEntity("Acer", 50000, "Laptop", "Aspire");
		ComputerEntity entity4=new ComputerEntity("Dell", 55000, "Laptop", "Inspiron");
		ComputerEntity entity5=new ComputerEntity("Asus Chromebox 3", 30000, "Desktop", "Asus");
		
		ComputerRepo repo=new ComputerRepoImpl();
		//repo.save(entity1);
		//repo.save(entity2);
		//repo.save(entity3);
		//repo.save(entity4);
		//repo.save(entity5);
		
		repo.deleteById(3);
		
		

	}

}
