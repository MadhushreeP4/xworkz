package com.xworkz.waterfall.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.waterfall.exception.SFUtilCreationException;

public class SFUtil {

	private static SessionFactory factory;

	public static SessionFactory getFactory() {

		return factory;
	}

	static {
		System.out.println("static block from SFUtil");
		try {
			Configuration cfg = new Configuration();
			cfg.configure();
			// cfg.addAnnotatedClass(null);
			factory = cfg.buildSessionFactory();
			if (factory != null) {
				System.out.println("SFUtil Created successfully");
			} else {
				throw new SFUtilCreationException("SFUtil creation Failed");
			}
		} catch (Exception e) {
			throw new SFUtilCreationException(e.getMessage());
		}
	}

}
