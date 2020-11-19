package com.xworkz.StaticImp;

import static com.xworkz.StaticImp.Info.InfoData.data;

public class StaticTester {

	public static void main(String[] args) {
		System.out.println("jvm invoked main");
		data();
		data();
		System.out.println("EXIT :: main");

	}

}
