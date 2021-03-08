package com.xworkz.coupon.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.coupon.entity.CouponEntity;
import com.xworkz.util.SFUtil;

public class CouponDAOImpl implements CouponDAO {

	SessionFactory factory = SFUtil.getFactory();

	public CouponDAOImpl() {

	}

	public void create(CouponEntity entity) {
		System.out.println("invoked create");

		Transaction transaction = null;

		try {
			Session session = factory.openSession();
			transaction = session.beginTransaction();
			session.save(entity);
			transaction.commit();
			System.out.println("entity saved");

		} catch (Exception e) {
			transaction.rollback();
			System.out.println("entity not saved");
		}
	}

	public CouponEntity getById(int id) {
		System.out.println("invoked getById");

		Transaction transaction = null;
		CouponEntity entityFromDB = null;

		try {
			Session session = factory.openSession();
			transaction = session.beginTransaction();
			entityFromDB = session.get(CouponEntity.class, id);
			System.out.println("entity from db");

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			System.out.println("failed to get entity from db");
		}
		return entityFromDB;
	}

	public void updateValidyMonthsAndOfferById(int months, int offer, int id) {
		System.out.println("invoked updateValidyMonthsAndOfferById");
		Transaction transaction = null;
		try {
			Session session = factory.openSession();
			transaction = session.beginTransaction();
			CouponEntity entityFromDB = session.get(CouponEntity.class, id);
			if (entityFromDB != null) {
				entityFromDB.setValidityMonth(months);
				entityFromDB.setOfferInPercentage(offer);
				session.update(entityFromDB);
			}
			transaction.commit();
			System.out.println("month and offers are updated");
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

	}

	public void deleteById(int id) {
		System.out.println("invoked deleteById");
		Transaction transaction = null;
		try {
			Session session = factory.openSession();
			transaction = session.beginTransaction();
			CouponEntity entityFromDB = session.get(CouponEntity.class, id);
			if (entityFromDB != null) {
				session.delete(entityFromDB);
			}
			transaction.commit();
			System.out.println("entity deleted");

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

	}

	public void create(List<CouponEntity> entities) {
		System.out.println("invoked create with list");
		Transaction transaction = null;
		try {
			Session session = factory.openSession();
			transaction = session.beginTransaction();
			int count = 0;
			for (CouponEntity couponEntity : entities) {
				session.save(couponEntity);
				count++;
				if (count == count % 5) {
					session.flush();
				}
			}
			transaction.commit();
			System.out.println("list saved");
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

	}

}
