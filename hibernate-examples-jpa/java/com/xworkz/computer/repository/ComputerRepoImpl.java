package com.xworkz.computer.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.xworkx.util.JPAUtil;
import com.xworkz.computer.entity.ComputerEntity;

public class ComputerRepoImpl implements ComputerRepo {

	private EntityManagerFactory factory = JPAUtil.getFactory();

	public ComputerRepoImpl() {
		System.out.println("created ComputerRepoImpl");
	}

	@Override
	public void save(ComputerEntity entity) {
		System.out.println("invoked save");
		EntityManager session = factory.createEntityManager();
		session.getTransaction().begin();
		session.persist(entity);
		session.getTransaction().commit();
		session.close();
		System.out.println("entity saved");

	}

	@Override
	public ComputerEntity findByName(String name) {
		System.out.println("invoked findByName");
		EntityManager session = factory.createEntityManager();
		Query query = session.createNamedQuery("findByNameFromComputerEntity");
		query.setParameter("nm", name);
		ComputerEntity entityFromDB = (ComputerEntity) query.getSingleResult();
		session.close();
		return entityFromDB;
	}

	@Override
	public void deleteById(int id) {
		System.out.println("invoked deleteById");
		EntityManager session = factory.createEntityManager();
		session.getTransaction().begin();
		ComputerEntity entityFromDB = session.find(ComputerEntity.class, id);
		if (entityFromDB != null) {
			session.remove(entityFromDB);
			System.out.println("entity removed");
			session.getTransaction().commit();

		} else {
			System.out.println("cannot delete");
		}
		session.close();
	}

	@Override
	public List<ComputerEntity> getAll() {
		System.out.println("invoked getAll");
		EntityManager session = factory.createEntityManager();
		Query query = session.createNamedQuery("getAllFromComputerEntity");
		List<ComputerEntity> allFromDB = query.getResultList();
		session.close();
		return allFromDB;
	}

}
