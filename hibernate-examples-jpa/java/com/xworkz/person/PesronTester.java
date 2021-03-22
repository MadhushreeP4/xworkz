package com.xworkz.person;

import com.xworkz.person.entity.PersonEntity;
import com.xworkz.person.repository.PersonRepo;
import com.xworkz.person.repository.PersonRepoImpl;

public class PesronTester {

	public static void main(String[] args) {

		PersonEntity entity1=new PersonEntity("Madhu", "madhu@gmail.com", "7654321098");
		PersonEntity entity2=new PersonEntity("Lakshmi", "lakshmi@gmail.com", "7543210986");
		PersonEntity entity3=new PersonEntity("Kavya", "kavya@gmail.com", "8123456906");
		PersonEntity entity4=new PersonEntity("sushma", "sushma@gmail.com", "7867564534");
		PersonEntity entity5=new PersonEntity("ashwal", "ashwal@gmail.com", "8172635489");
		
		PersonRepo repo=new PersonRepoImpl();
		//repo.save(entity1);
		//repo.save(entity2);
		//repo.save(entity3);
		//repo.save(entity4);
		//repo.save(entity5);
		
		repo.deleteById(5);
		

	}

}
