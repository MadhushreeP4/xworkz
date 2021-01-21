package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.solution.dto.ShoppingCartDTO;

public class ShoppingTester {

	public static void main(String[] args) {

		ShoppingCartDTO cartDTO = new ShoppingCartDTO("Bag", 800, 1);
		ShoppingCartDTO cartDTO2 = new ShoppingCartDTO("Shoe", 1500, 1);

		Collection<ShoppingCartDTO> cartDTOs = new ArrayList();
		cartDTOs.add(cartDTO);
		cartDTOs.add(cartDTO2);

		ShoppingCartDTO cartDTO3 = new ShoppingCartDTO("Bottle", 400, 1);
		
		ShoppingCartDTO cartDTO4=new ShoppingCartDTO("Shoe", 1500, 1);

		boolean contain = cartDTOs.contains(cartDTO4);
		System.out.println(contain);
		if (contain) {
			System.out.println("already there in cart");
		} else {
			System.out.println("added to cart");
			cartDTOs.add(cartDTO3);
		}

		int size = cartDTOs.size();
		System.out.println(size);

	}

}
