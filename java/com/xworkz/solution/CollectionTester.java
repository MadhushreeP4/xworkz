package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionTester {

	public static void main(String[] args) {
		
		String cadbury="Silk";
		cadbury="dairy milk";
		String cadbury2="dairy milk";
		String nestle="kit kat";
		String ferrero="nutella";
		String amul="dark chocolate";
		String campco="snack bar";
		String lotus="eclairs";
		
		Collection chocolates=new ArrayList();
		chocolates.add(cadbury);
		chocolates.add(cadbury2);
		chocolates.add(nestle);
		chocolates.add(ferrero);
		chocolates.add(amul);
		chocolates.add(campco);
		chocolates.add(lotus);
		
		System.out.println(chocolates.size());
		System.out.println(" ");
		
		boolean rmv=chocolates.remove(lotus);
		System.out.println(rmv);
		System.out.println(chocolates.size());
		System.out.println(" ");
		
		boolean cont=chocolates.contains(lotus);
		System.out.println(cont);
		System.out.println(chocolates.size());
		System.out.println(" ");
		
		boolean empty=chocolates.isEmpty();
		System.out.println(empty);
		System.out.println(chocolates.size());
		System.out.println(" ");
		
		System.out.println("looping");
		Object[] converted=chocolates.toArray();
		for(int i=0;i<converted.length;i++){
			System.out.println(converted[i]);
		}
		System.out.println(" ");
		
		System.out.println("looping using iterator");
		Iterator iterator=chocolates.iterator();
		
		while(iterator.hasNext()){
			
			Object str=iterator.next();
			System.out.println(str);
		}
	
		
		/*Iterable chocos=new ArrayList();
		
		ArrayList lists=new ArrayList();
		
		Collection gadgets=new LinkedList();
		
		Iterable mobiles=new LinkedList();*/
		

	}

}

/*class Abc{
	
	void run(){
		Collection c = new ArrayList<>();
	}
}*/
