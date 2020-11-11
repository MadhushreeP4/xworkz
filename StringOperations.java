package com.xworkz.basics.stringEx;

public class StringOperations {

	public static void main(String[] args) {
		System.out.println("JVM Invoked main");
		
		String name="Xworkz ODC";
		System.out.println("name: "+name);
		System.out.println("length: "+name.length());
		
		String name1=name.concat(" Trainee");
		System.out.println("name: "+name1);
		System.out.println("length: "+name1.length());
		
		String name3=name1.toLowerCase();
		System.out.println("name: "+name3);
		
		String name4=name1.toUpperCase();
		System.out.println("name: "+name4);
		
		String name5=name1.substring(11);
		System.out.println("name: "+name5);
		
		char name6=name1.charAt(8);
		System.out.println("alphabet: "+name6);
				
		System.out.println("EXIT :: main");
	}

}
