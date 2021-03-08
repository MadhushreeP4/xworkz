package com.xworkz.waterfall.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.waterfall.entity.WaterFallEntity;
import com.xworkz.waterfall.util.SFUtil;

public class WaterFallDAOImpl implements WaterFallDAO {

	private SessionFactory factory = SFUtil.getFactory();

	public WaterFallDAOImpl() {
		System.out.println("create " + this.getClass());
	}

	public void create(WaterFallEntity entity) {
		System.out.println("invoked create");
		try (Session session = factory.openSession()) {
			System.out.println("started op");
			Transaction transaction = session.beginTransaction();
			session.save(entity);
			transaction.commit();
			System.out.println("end of op");
		}
	}

	@Override
	public WaterFallEntity getById(int id) {
		System.out.println("invoked getById");
		WaterFallEntity entityFromDB;
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			entityFromDB = session.get(WaterFallEntity.class, id);
		}
		return entityFromDB;
	}

	@Override
	public void updateHeightAndDepthById(int id, int height, int depth) {
		System.out.println("invoked updateHeightAndDepthById");
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			WaterFallEntity entityFromDB = session.get(WaterFallEntity.class, id);
			if (entityFromDB != null) {
				System.out.println(" id found, entity is not null can update");
				entityFromDB.setHeight(height);
				entityFromDB.setDepth(depth);
				session.update(entityFromDB);
				transaction.commit();
			}
		}

	}

	@Override
	public void deleteById(int id) {
		System.out.println("invoked deleteById");
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			WaterFallEntity entityFromDB = session.get(WaterFallEntity.class, id);
			if (entityFromDB != null) {
				System.out.println("Id found can delete");
				session.delete(entityFromDB);
				transaction.commit();
			}

		}

	}

}
