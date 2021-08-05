package com.xworkz.leaveapp.service;

import com.xworkz.leaveapp.entity.LeaveEntity;
import com.xworkz.leaveapp.repository.LeaveRepo;

public class LeaveServiceImpl implements LeaveService<LeaveEntity> {
	
	private LeaveRepo repo;
	
	public LeaveServiceImpl(LeaveRepo repo) {
		System.out.println("created "+this.getClass().getSimpleName());
		this.repo=repo;
	}

	@Override
	public boolean validateAndSave(LeaveEntity entity) {
		System.out.println("invoked validateAndSave");
		boolean valid=false;
		if(entity!=null) {
			String name=entity.getName();
			if(name!=null && !name.isEmpty() && name.length()>=3 && name.length()<=25) {
				System.out.println("name is valid");
				valid=true;
			}else {
				System.out.println("name is invalid");
				valid=false;
			}
			if(valid) {
				String mail=entity.getEmail();
				if(mail!=null && !mail.isEmpty() && mail.contains("@")) {
					System.out.println("mail is valid");
					valid=true;
				}else {
					System.out.println("maail is invalid");
					valid=false;
				}
			}
			if(valid) {
				String leaves=entity.getNoOfLeaves();
				if(leaves!=null && leaves.length()<2) {
					System.out.println("leave is valid");
					valid=true;
				}else {
					System.out.println("leave is invalid");
					valid=false;
				}
			}
			if(valid) {
				String reason=entity.getReason();
				if(reason!=null && !reason.isEmpty()) {
					System.out.println("reason is valid");
					valid=true;
				}else {
					System.out.println("reason is invalid");
					valid=false;
				}
			}
			if(valid) {
				String startDate=entity.getStartDate();
				if(startDate!=null) {
					System.out.println("start date is valid");
					valid=true;
				}else {
					System.out.println("start date is invalid");
					valid=false;
				}
			}
			if(valid) {
				System.out.println("data is valid, can invoke save");
				repo.save(entity);
			}else {
				System.out.println("data is invalid");
			}
		}
		return valid;
	}

	@Override
	public LeaveEntity validateAndFindByName(String name) {
		System.out.println("invoked validateAndFindByName");
		if(name!=null && !name.isEmpty() && name.length()>=3 && name.length()<=25) {
			System.out.println("name is valid");
			return this.repo.findByName(name);
		}else {
			System.out.println("name is invalid");
		}
		return null;
	}

}
