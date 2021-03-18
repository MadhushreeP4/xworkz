package com.xworkz.icecream;

import com.xworkz.icecream.entity.IceCreamEntity;
import com.xworkz.icecream.entity.IceCreamEntity.Color;
import com.xworkz.icecream.entity.IceCreamEntity.Flavour;
import com.xworkz.icecream.repository.IceCreamRepo;
import com.xworkz.icecream.repository.IceCreamRepoImpl;

public class IceCreateTester {

	public static void main(String[] args) {
		
		IceCreamEntity entity1=new IceCreamEntity("RainBow", Flavour.BUTTERSCOTCH, Color.MIX, 50);
		entity1.setId(1);
		
		IceCreamEntity entity2=new IceCreamEntity("RainBow", Flavour.BUTTERSCOTCH, Color.MIX, 50);
		entity2.setId(2);
		
		IceCreamEntity entity3=new IceCreamEntity("FamilyPck", Flavour.BLACKCURRANT, Color.BLACK, 300);
		entity3.setId(3);
		
		IceCreamEntity entity4=new IceCreamEntity("BlueMoon", Flavour.VANILLA, Color.BLUE, 70);
		entity4.setId(4);
		
		IceCreamEntity entity5=new IceCreamEntity("Candy Cane", Flavour.STRAWBERRY, Color.PINK, 65);
		entity5.setId(5);
		
		IceCreamRepo repo=new IceCreamRepoImpl();
		//repo.persist(entity1);
		//repo.persist(entity2);
		//repo.persist(entity3);
		repo.persist(entity4);//1
		repo.persist(entity5);

	}

}
