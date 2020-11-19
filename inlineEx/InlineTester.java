package com.xworkz.inlineEx;

import com.xworkz.inlineEx.country.*;

public class InlineTester {

	public static void main(String[] args) {
		System.out.println("jvm Invoked main");
		
		CountryName.name();
		com.xworkz.inlineEx.state.StateName.name();
		
		System.out.println("EXIT :: main");

	}

}
