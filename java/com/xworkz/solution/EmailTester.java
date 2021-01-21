package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class EmailTester {

	public static void main(String[] args) {
		
		Collection<String> mails=new ArrayList();
		mails.add("madhu@x-workz.com");
		mails.add("contact@x-workz.in");
		mails.add("madhu@x-workz.com");
		mails.add("akshara@x-workz.in");
		mails.add("madhu@x-workz.com");
		mails.add("om.bn@outlook.in");
		mails.add("madhu@x-workz.com");
		mails.add("rajashree@x-workz.com");
		mails.add("madhu@x-workz.com");
		mails.add("sushma@x-workz.com");
		mails.add("madhu@x-workz.com");
		mails.add("bhaskar@x-workz.com");
		mails.add("madhu@x-workz.com");
		mails.add("vena@x-workz.com");
		mails.add("madhu@x-workz.com");
		mails.add("kavya@x-workz.com");
		mails.add("madhu@x-workz.com");
		mails.add("nikita@x-workz.com");
		mails.add("madhu@x-workz.com");
		
		int total=mails.size();
		System.out.println("size of mails"
				+ " "+total);
		
		Collection<String> tempMail=new ArrayList();
		
		Iterator<String> iterator=mails.iterator();
		while(iterator.hasNext()){
			String str=iterator.next();
			if(tempMail.contains(str)){
				iterator.remove();
			}
			else{
				tempMail.add(str);
			}
		}
		
		int total1=tempMail.size();
		System.out.println("size of duplicate collection "+total1);
		
		mails.clear();
		total=mails.size();
		System.out.println("size of mails "+total);
			
		

	}

}
