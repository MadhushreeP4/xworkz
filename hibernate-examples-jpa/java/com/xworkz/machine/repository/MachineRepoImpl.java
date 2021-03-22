package com.xworkz.machine.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.xworkx.util.JPAUtil;
import com.xworkz.machine.entity.MachineEntity;

public class MachineRepoImpl implements MachineRepo {
	
	private EntityManagerFactory factory = JPAUtil.getFactory();
	
	public MachineRepoImpl() {
		System.out.println("created MachineRepoImpl");
	}

	@Override
	public void save(MachineEntity entity) {
		System.out.println("invoked save");
		EntityManager session = factory.createEntityManager();
		session.getTransaction().begin();
		session.persist(entity);
		session.getTransaction().commit();
		session.close();
		System.out.println("entity saved");

	}

	@Override
	public MachineEntity findByName(String name) {
		System.out.println("invoked findByName");
		EntityManager session = factory.createEntityManager();
		Query query = session.createNamedQuery("findByNameFromMachineEntity");
		query.setParameter("nm", name);
		MachineEntity entityFromDB = (MachineEntity) query.getSingleResult();
		session.close();
		return entityFromDB;
	}

	@Override
	public void deleteById(int id) {
		System.out.println("invoked deleteById");
		EntityManager session = factory.createEntityManager();
		session.getTransaction().begin();
		MachineEntity entityFromDB = session.find(MachineEntity.class, id);
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
	public List<MachineEntity> getAll() {
		System.out.println("invoked getAll");
		EntityManager session = factory.createEntityManager();
		Query query = session.createNamedQuery("getAllFromMachineEntity");
		List<MachineEntity> allFromDB = query.getResultList();
		session.close();
		return allFromDB;
	}

}
