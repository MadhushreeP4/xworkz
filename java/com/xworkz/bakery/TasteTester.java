package com.xworkz.bakery;

import com.xworkz.bakery.cake.Cake;
import com.xworkz.bakery.cake.HoneyCake;

public class TasteTester {

	public static void main(String[] args) {

		Cake cake = new Cake();
		cake.setFlavour("Red Velvet");
		cake.setShape("Square");
		cake.setSize(1.5);
		cake.taste();

		System.out.println(cake.getFlavour());
		System.out.println(cake.getShape());
		System.out.println(cake.getSize());

		HoneyCake honeyCake = new HoneyCake();
		honeyCake.taste();

		System.out.println(honeyCake.getFlavour());
		System.out.println(honeyCake.getShape());
		System.out.println(honeyCake.getSize());

	}

}
