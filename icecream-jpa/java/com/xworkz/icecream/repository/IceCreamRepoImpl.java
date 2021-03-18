package com.xworkz.icecream.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.xworkx.util.JPAUtil;
import com.xworkz.icecream.entity.IceCreamEntity;

public class IceCreamRepoImpl implements IceCreamRepo {
	
	private EntityManagerFactory factory=JPAUtil.getFactory();

	@Override
	public void persist(IceCreamEntity entity) {
		System.out.println("invoked persist");
		EntityManager session=this.factory.createEntityManager();
		session.getTransaction().begin();
		session.persist(entity);
		session.getTransaction().commit();
		session.close();
		System.out.println("Entity Saved");
	}

	@Override
	public void deleteByName(String name) {
		System.out.println("invoked deleteByName");
		EntityManager session=this.factory.createEntityManager();
		session.getTransaction().begin();
		Query query=session.createNamedQuery("deleteByName");
		query.setParameter("nm", name);
		query.executeUpdate();
		session.getTransaction().commit();
		session.close();
		System.out.println("deleted");

	}

	@Override
	public void updatePriceByName(String name, double price) {
		System.out.println("invoked updatePriceByName");
		EntityManager session=this.factory.createEntityManager();
		session.getTransaction().begin();
		String hql="update IceCreamEntity set price=:pc where name=:nm";
		Query query=session.createQuery(hql);
		query.setParameter("pc", price);
		query.setParameter("nm", name);
		query.executeUpdate();
		session.getTransaction().commit();
		session.close();
		System.out.println("updated");

	}

	@Override
	public List<IceCreamEntity> getAll() {
		System.out.println("invoked getAll");
		EntityManager session=this.factory.createEntityManager();
		Query query=session.createNamedQuery("getAll");
		List<IceCreamEntity> list=query.getResultList();
		session.close();
		
		return list;
	}

	@Override
	public IceCreamEntity findByNameAndPrice(String name, double price) {
		System.out.println("invoked findByNameAndPrice");
		EntityManager session=this.factory.createEntityManager();
		Query query=session.createNamedQuery("findByNameAndPrice");
		query.setParameter("nm", name);
		query.setParameter("pc", price);
		IceCreamEntity entityFromDB=(IceCreamEntity) query.getSingleResult();
		session.close();
		return entityFromDB;
	}

	@Override
	public IceCreamEntity getByMaxPrice() {
		System.out.println("invoked getByMaxPrice");
		EntityManager session=this.factory.createEntityManager();
		String hql="select ice from IceCreamEntity ice where 0=(select count(distinct(price)) from IceCreamEntity i where ice.price<i.price";
		Query query=session.createQuery(hql);
		IceCreamEntity entityFromDB=(IceCreamEntity) query.getSingleResult();
		session.close();
		return entityFromDB;
	}

	@Override
	public IceCreamEntity getByMinPrice() {
		System.out.println("invoked getByMinPrice");
		EntityManager session=this.factory.createEntityManager();
		String hql="select ice from IceCreamEntity ice where 0=(select count(distinct(price)) from IceCreamEntity i where ice.price>i.price";
		Query query=session.createQuery(hql);
		IceCreamEntity entityFromDB=(IceCreamEntity) query.getSingleResult();
		session.close();
		return entityFromDB;
	}

	@Override
	public Double getSumPrice() {
		System.out.println("invoked getSumPrice");
		EntityManager session=this.factory.createEntityManager();
		Query query=session.createNamedQuery("getSumPrice");
		Double sumPrice=(Double) query.getSingleResult();
		session.close();
		return sumPrice;
	}

	@Override
	public Double getPriceByName(String name) {
		System.out.println("invoked getPriceByName");
		EntityManager session=this.factory.createEntityManager();
		Query query=session.createNamedQuery("getPriceByName");
		query.setParameter("nm", name);
		Double price=(Double) query.getSingleResult();
		session.close();
		return price;
	}

	@Override
	public List<Object[]> getNameAndFlavourByPrice(double price) {
		System.out.println("invoked getNameAndFlavourByPrice");
		EntityManager session=this.factory.createEntityManager();
		Query query=session.createNamedQuery("getNameAndFlavourByPrice");
		query.setParameter("pc", price);
		List<Object[]> nameAndFlavour=(List<Object[]>) query.getSingleResult();
		
		session.close();
		return nameAndFlavour;
	}

}
