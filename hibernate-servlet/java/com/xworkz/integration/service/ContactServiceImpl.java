package com.xworkz.integration.service;

import java.util.List;

import javax.persistence.NoResultException;

import com.xworkz.integration.entity.ContactEntity;
import com.xworkz.integration.repository.ContactRepo;
import com.xworkz.integration.repository.ContactRepoImpl;

public class ContactServiceImpl implements ContactService<ContactEntity> {
	
	private ContactRepo repo=new ContactRepoImpl();
	
	public ContactServiceImpl(ContactRepo repo) {
		System.out.println("created ContactServiceImpl");
		this.repo=repo;
	}
	
	public ContactServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean validateAndSave(ContactEntity entity) {
		System.out.println("invoked validateAndSave");
		boolean valid=false;
		if(entity!=null) {
			String name=entity.getName();
			if(name!=null && !name.isEmpty() && name.length()>=4 && name.length()<25) {
				System.out.println("name is valid");
				valid=true;
			}else {
				System.out.println("name is invalid");
				valid=false;
			}
			
			if(valid) {
				String phone=entity.getPhone();
				if(phone!=null && phone.length()==10) {
					System.out.println("phone number is valid");
					valid=true;
				}else {
					System.out.println("phone number is invalid");
					valid=false;
				}
			}
			if(valid) {
				String company=entity.getCompany();
				if(company!=null && company.length()>=3 && company.length()<=15) {
					System.out.println("comapny is valid");
					valid=true;
				}else {
					System.out.println("company is invalid");
					valid=false;
				}
			}
			if(valid) {
				String mail=entity.getEmail();
				if(mail!=null && !mail.isEmpty() && mail.contains("@")) {
					System.out.println("mail is valid");
					valid=true;
				}else {
					System.out.println("mail is invalid");
					valid=false;
				}
			}
			if(valid) {
				String about=entity.getAboutUs();
				if(about!=null && !about.isEmpty()) {
					System.out.println("about is valid");
					valid=true;
				}else {
					System.out.println("about is invalid");
					valid=false;
				}
			}
			if(valid) {
				System.out.println("data is valid can invoke save method");
				repo.save(entity);
			}else {
				System.out.println("data is invalid");
			}
		}
		return valid;
	}

	@Override
	public ContactEntity validateAndFindByName(String name) {
		System.out.println("invoked validateAndFindByName");
		ContactEntity entity=null;
		try {
		if(name!=null && !name.isEmpty() && name.length()>3 && name.length()<25) {
			System.out.println("name is valid");
			entity=this.repo.findByName(name);
			return entity;
		}else {
			System.out.println("name is invalid");
			return null;
		}
		}catch (NoResultException e) {
			return null;
		}
		
	}
	
	@Override
	public ContactEntity validateAndFindByEmail(String email) {
		System.out.println("invoked validateAndFindByName");
		ContactEntity entity=null;
		try {
		if(email!=null && !email.isEmpty() && email.contains("@") && (email.endsWith(".com") || email.endsWith(".in"))) {
			System.out.println("email is valid");
			entity=this.repo.findByEmail(email);
			return entity;
		}else {
			System.out.println("email is invalid");
			return null;
		}
		}catch (NoResultException e) {
			return null;
		}
		
	}
	
	@Override
	public List<ContactEntity> displayAll() {
		System.out.println("invoked displayAll");
		if(this.repo!=null) {
			System.out.println("repository is not null");
			List<ContactEntity> list=this.repo.findAll();
			return list;
		}else {
			System.out.println("repository is null");
			return null;
		}
		
	}

}
