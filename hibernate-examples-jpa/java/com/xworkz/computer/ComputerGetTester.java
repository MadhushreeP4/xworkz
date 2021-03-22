package com.xworkz.computer;

import java.util.List;

import com.xworkz.computer.entity.ComputerEntity;
import com.xworkz.computer.repository.ComputerRepo;
import com.xworkz.computer.repository.ComputerRepoImpl;

public class ComputerGetTester {

	public static void main(String[] args) {
		
		ComputerRepo repo=new ComputerRepoImpl();
		
		System.out.println(repo.findByName("HP"));
		
		List<ComputerEntity> list=repo.getAll();
		list.forEach(c->System.out.println(c));

	}

}
