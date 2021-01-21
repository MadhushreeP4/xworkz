package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class HomogenousTester {

	public static void main(String[] args) {
		
		//generic
		Object[] validages=new Object[4];
		validages[0]=44;
		validages[1]="Yes";
		validages[2]=true;
		validages[3]=new Thread();
		
		Collection mobiles=new ArrayList();
		mobiles.add("Nokia");
		mobiles.add("realme");
		mobiles.add(44);
		mobiles.add(null);
		mobiles.add("one plus");
		
		Iterator iterator=mobiles.iterator();
		int stringCount=0;
		while(iterator.hasNext()){
			Object obj=iterator.next();
			if(obj instanceof String){
				System.out.println("String is found");
				System.out.println(obj);
				stringCount++;
			}
		}
		System.out.println("total string "+stringCount);

	}

}
