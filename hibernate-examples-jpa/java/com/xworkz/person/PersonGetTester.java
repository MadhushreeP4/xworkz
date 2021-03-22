package com.xworkz.person;

import java.util.List;

import com.xworkz.person.entity.PersonEntity;
import com.xworkz.person.repository.PersonRepo;
import com.xworkz.person.repository.PersonRepoImpl;

public class PersonGetTester {

	public static void main(String[] args) {
		
		PersonRepo repo=new PersonRepoImpl();
		
		System.out.println(repo.findByName("madhu"));
		
		List<PersonEntity> list=repo.getAll();
		list.forEach(p->System.out.println(p));

	}

}
