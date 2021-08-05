package com.xworkz.leaveapp.repository;

import com.xworkz.leaveapp.entity.LeaveEntity;

public interface LeaveRepo {
	
	public void save(LeaveEntity entity);
	
	public LeaveEntity findByName(String name);

}
