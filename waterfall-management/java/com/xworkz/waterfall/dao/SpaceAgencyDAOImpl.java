package com.xworkz.waterfall.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.waterfall.entity.SpaceAgencyEntity;
import com.xworkz.waterfall.util.SFUtil;

public class SpaceAgencyDAOImpl implements SpaceAgencyDAO {
	
	private SessionFactory factory=SFUtil.getFactory();
	
	public SpaceAgencyDAOImpl() {
		System.out.println("created SpaceAgencyDAOImpl");
	}

	@Override
	public void create(SpaceAgencyEntity entity) {
		System.out.println("invoked create with entity");
		Transaction transaction=null;
		try {
			Session session=factory.openSession();
			transaction=session.beginTransaction();
			session.save(entity);
			transaction.commit();
			System.out.println("entity saved");
			
		}catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

	}

	@Override
	public void create(List<SpaceAgencyEntity> entities) {
		System.out.println("invoked create with list");
		Transaction transaction=null;
		try {
			Session session=factory.openSession();
			transaction=session.beginTransaction();
			int count=0;
			for (SpaceAgencyEntity spaceAgencyEntity : entities) {
				session.save(spaceAgencyEntity);
				count++;
				if(count==count%5) {
					session.flush();
				}
			}
			transaction.commit();
			System.out.println("list saved");
		}catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

	}

	@Override
	public SpaceAgencyEntity getById(int id) {
		System.out.println("invoked getById");
		Transaction transaction=null;
		SpaceAgencyEntity entityFromDB=null;
		try {
			Session session=factory.openSession();
			transaction=session.beginTransaction();
			entityFromDB=session.get(SpaceAgencyEntity.class, id);
			
		}catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		return entityFromDB;
	}

	@Override
	public void updateAnnualBudgetById(int id, int budget) {
		System.out.println("invoked updateAnnualBudgetById");
		Transaction transaction=null;
		try {
			Session session=factory.openSession();
			transaction=session.beginTransaction();
			SpaceAgencyEntity entityFromDB=session.get(SpaceAgencyEntity.class, id);
			if(entityFromDB!=null) {
				entityFromDB.setAnnualBudgetInMillions(budget);
				session.update(entityFromDB);
			}
			transaction.commit();
			System.out.println("budget is updated");
		}catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

	}

	@Override
	public void deleteById(int id) {
		System.out.println("invoked deleteById");
		Transaction transaction=null;
		try {
			Session session=factory.openSession();
			transaction=session.beginTransaction();
			SpaceAgencyEntity entityFromDB=session.get(SpaceAgencyEntity.class, id);
			if(entityFromDB!=null) {
				session.delete(entityFromDB);
			}
			transaction.commit();
			System.out.println("entity deleted");
			
		}catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

	}

}
