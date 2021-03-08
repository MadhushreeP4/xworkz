package com.xworkz.waterfall.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.waterfall.entity.StateEntity;
import com.xworkz.waterfall.util.SFUtil;

public class StateDAOImpl implements StateDAO {
	
	private SessionFactory factory=SFUtil.getFactory();
	
	//List<StateEntity> list;
	
	public StateDAOImpl() {
		//this.list=list;
	}

	@Override
	public void create(List<StateEntity> entities) {
		System.out.println("invoked create");
		System.out.println("args :"+entities);
		Transaction transaction=null;
		try {
			System.out.println("started op");
		Session session=factory.openSession();
		transaction=session.beginTransaction();
		//Iterator<StateEntity> iterator=list.iterator();
		int count=0;
		for (StateEntity stateEntity : entities) {
			session.save(stateEntity);
			count++;
			if(count==count%5) {
				session.flush();
			}
			System.out.println("saved");
		}
		System.out.println("end of op");
		transaction.commit();
		}catch (Exception e) {
			transaction.rollback();
		}
	}

}
