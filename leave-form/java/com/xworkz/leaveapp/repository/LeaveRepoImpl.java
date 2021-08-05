package com.xworkz.leaveapp.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.xworkx.util.JPAUtil;
import com.xworkz.leaveapp.entity.LeaveEntity;

public class LeaveRepoImpl implements LeaveRepo {
	
	private EntityManagerFactory factory=JPAUtil.getFactory();
	
	public LeaveRepoImpl() {
		System.out.println("created "+this.getClass().getSimpleName());
	}

	@Override
	public void save(LeaveEntity entity) {
		System.out.println("invoked save");
		EntityManager session=factory.createEntityManager();
		session.getTransaction().begin();
		session.persist(entity);
		session.getTransaction().commit();
		session.close();
		System.out.println("data saved");

	}

	@Override
	public LeaveEntity findByName(String name) {
		System.out.println("invoked findByName");
		EntityManager session=factory.createEntityManager();
		Query query=session.createNamedQuery("findByName");
		query.setParameter("nm", name);
		LeaveEntity entityFromDB=(LeaveEntity) query.getSingleResult();
		return entityFromDB;
	}

}
