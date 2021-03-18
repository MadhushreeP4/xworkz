package com.xworkx.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static EntityManagerFactory factory=null;
	
	public JPAUtil() {
		
	}
	
	public static EntityManagerFactory getFactory() {
		return factory;
	}
	
	static {
		try {
			factory=Persistence.createEntityManagerFactory("com.xworkz.jpa");
			if(factory!=null) {
				System.out.println("EMF Util Created Successfully");
			}else {
				throw new EMFUtilCreationException("EMF Util Creation Failed");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			throw new EMFUtilCreationException(e.getMessage());
			
		}
	}

}
