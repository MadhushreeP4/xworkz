package com.xworkz.integration.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.xworkx.util.JPAUtil;
import com.xworkz.integration.entity.ContactEntity;

public class ContactRepoImpl implements ContactRepo {

	public ContactRepoImpl() {
		System.out.println("created ContactRepoImpl");
	}

	private EntityManagerFactory factory = JPAUtil.getFactory();

	@Override
	public void save(ContactEntity entity) {
		System.out.println("invoked save");
		EntityManager session = this.factory.createEntityManager();
		session.getTransaction().begin();
		session.persist(entity);
		session.getTransaction().commit();
		session.close();
		System.out.println("Entity Saved");

	}

	@Override
	public ContactEntity findByName(String name) {
		System.out.println("invoked findByName");
		EntityManager session = this.factory.createEntityManager();
		Query query = session.createNamedQuery("findByName");
		query.setParameter("nm", name);
		ContactEntity entityFromDB = (ContactEntity) query.getSingleResult();
		if (entityFromDB != null) {
			return entityFromDB;
		} else {
			return null;
		}
	}

	@Override
	public ContactEntity findByEmail(String email) {
		System.out.println("invoked findByEmail");
		EntityManager session = this.factory.createEntityManager();
		Query query = session.createNamedQuery("findByEmail");
		query.setParameter("mail", email);
		ContactEntity entityFromDB = (ContactEntity) query.getSingleResult();
		if (entityFromDB != null) {
			return entityFromDB;
		} else {
			return null;
		}
	}
	
	@Override
	public List<ContactEntity> findAll() {
		System.out.println("invoked findAll");
		EntityManager session=this.factory.createEntityManager();
		Query query=session.createNamedQuery("findAll");
		List<ContactEntity> list=query.getResultList();
		return list;
	}

}
