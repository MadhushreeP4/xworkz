package com.xworkz.machine;

import java.util.List;

import com.xworkz.machine.entity.MachineEntity;
import com.xworkz.machine.repository.MachineRepo;
import com.xworkz.machine.repository.MachineRepoImpl;

public class MachineGetTester {

	public static void main(String[] args) {


		MachineRepo repo=new MachineRepoImpl();
		
		System.out.println(repo.findByName("HP"));
		
		List<MachineEntity> list=repo.getAll();
		list.forEach(m->System.out.println(m));

	}

}
