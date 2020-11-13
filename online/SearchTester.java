package com.xworkz.online;

public class SearchTester {

	public static void main(String[] args) {

			System.out.println("jvm invoked main");

			System.out.println("Total items to search" + Amazon.totalItems());
			Amazon.search("Glass");

			System.out.println("EXIT main");
		}
	}
