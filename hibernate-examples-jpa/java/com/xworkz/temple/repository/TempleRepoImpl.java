package com.xworkz.temple.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.xworkx.util.JPAUtil;
import com.xworkz.temple.entity.TempleEntity;

public class TempleRepoImpl implements TempleRepo {
	
	private EntityManagerFactory factory=JPAUtil.getFactory();
	//private EntityManager entityManager;
	
	public TempleRepoImpl() {
		System.out.println("created TempleRepoImpl");
	}

	@Override
	public void save(TempleEntity entity) {
		System.out.println("invoked save");
		EntityManager session=factory.createEntityManager();
		session.getTransaction().begin();
		session.persist(entity);
		session.getTransaction().commit();
		session.close();
		System.out.println("entity saved");

	}

	@Override
	public TempleEntity findByName(String name) {
		System.out.println("invoked findByName");
		EntityManager session=factory.createEntityManager();
		Query query=session.createNamedQuery("findByName");
		query.setParameter("nm", name);
		TempleEntity entityFromDB=(TempleEntity) query.getSingleResult();
		return entityFromDB;
	}

	@Override
	public void deleteById(int id) {
		System.out.println("invoked deleteById");
		EntityManager session=factory.createEntityManager();
		session.getTransaction().begin();
		TempleEntity entityFromDB=session.find(TempleEntity.class, id);
		if(entityFromDB!=null) {
			session.remove(entityFromDB);
			System.out.println("entity removed");
			session.getTransaction().commit();
			
		}else {
			System.out.println("cannot delete");
		}
		
		session.close();
		

	}

	@Override
	public List<TempleEntity> getAll() {
		System.out.println("invoked getAll");
		EntityManager session=factory.createEntityManager();
		Query query=session.createNamedQuery("getAll");
		List<TempleEntity> allFromDB=query.getResultList();
		return allFromDB;
	}

}
