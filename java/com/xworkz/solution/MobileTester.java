package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;

public class MobileTester {

	public static void main(String[] args) {

		Collection<Long> mobile = new ArrayList();
		mobile.add(9876543218l);
		mobile.add(7204823110l);
		mobile.add(8885432987l);
		mobile.add(9896785554l);

		for (Long mobileNumber : mobile) {
			String converted = mobileNumber.toString();
			Character letter = converted.charAt(converted.length() - 1);
			System.out.println(letter);
			if (Integer.parseInt(letter.toString()) > 3) {
				System.out.println("mobile no greater than 3 " + converted);
			}
		}

	}

}
