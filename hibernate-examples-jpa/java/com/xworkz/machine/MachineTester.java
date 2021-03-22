package com.xworkz.machine;

import com.xworkz.machine.entity.MachineEntity;
import com.xworkz.machine.repository.MachineRepo;
import com.xworkz.machine.repository.MachineRepoImpl;

public class MachineTester {

	public static void main(String[] args) {


		MachineEntity entity1=new MachineEntity("Ink-jet Printers", "printer", "Canon");
		MachineEntity entity2=new MachineEntity("Washing Machine", "wash", "LG");
		MachineEntity entity3=new MachineEntity("TV", "electronic", "Onida");
		MachineEntity entity4=new MachineEntity("HP", "Laptop", "HP");
		MachineEntity entity5=new MachineEntity("Air-Condition", "electronic", "Godrej");
		
		MachineRepo repo=new MachineRepoImpl();
		//repo.save(entity1);
		//repo.save(entity2);
		//repo.save(entity3);
		//repo.save(entity4);
		//repo.save(entity5);
		
		repo.deleteById(3);

	}

}
