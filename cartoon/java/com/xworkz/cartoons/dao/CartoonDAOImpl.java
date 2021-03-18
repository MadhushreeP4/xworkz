package com.xworkz.cartoons.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.xworkz.cartoons.entity.CartoonEntity;
import com.xworkz.cartoons.entity.CartoonEntity.ChannelName;
import com.xworkz.util.SFUtil;

public class CartoonDAOImpl implements CartoonDAO {

	private SessionFactory factory = SFUtil.getFactory();

	public void create(List<CartoonEntity> entity) {
		System.out.println("invoked create with list");
		Transaction transaction = null;
		try {
			Session session = factory.openSession();
			transaction = session.beginTransaction();
			int count = 0;
			for (CartoonEntity cartoonEntity : entity) {
				session.save(cartoonEntity);
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

	public CartoonEntity findByName(String name) {
		System.out.println("invoked findByName");
		CartoonEntity entityFromDB=null;
		try(Session session=factory.openSession()){
			String queryString="SELECT TOON FROM CartoonEntity TOON WHERE TOON.name='"+name+"'";
			Query<CartoonEntity> query=session.createQuery(queryString);
			entityFromDB=query.uniqueResult();
			//return entityFromDB;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return entityFromDB;
	}

	@Override
	public CartoonEntity findByChannelAndLanguage(ChannelName channel, String language) {
		System.out.println("invoked findByChannelAndLanguage");
		CartoonEntity cartoonEntity=null;
		try(Session session=factory.openSession()){
			
			String queryString="SELECT TOON FROM CartoonEntity TOON WHERE TOON.channel='"+channel+"' AND TOON.language='"+language+"'";
			Query<CartoonEntity> query=session.createQuery(queryString);
			cartoonEntity=query.uniqueResult();
			
			
		}
		return cartoonEntity;
		
	}

}
