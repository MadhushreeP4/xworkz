package com.xworkz.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SFUtil {
	
	private static SessionFactory factory;
	
	public static SessionFactory getFactory() {
		
		return factory;
	}
	
	static {
		try {
			Configuration cfg=new Configuration();
			cfg.configure();
			factory=cfg.buildSessionFactory();
			if(factory!=null) {
				System.out.println("factory created successfully");
			}else {
				throw new SFCreationException("factory creation failed");
			}
		}catch (Exception e) {
			throw new SFCreationException(e.getMessage());
		}
	}

}
