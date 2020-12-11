package com.xworkz.dto;

import java.util.Arrays;

import com.xworkz.dto.sweet.Shape;
import com.xworkz.dto.sweet.SweetDTO;

public class DTOSweetTester {

	public static void main(String[] args) {

		SweetDTO sweetDTO = new SweetDTO();
		System.out.println(sweetDTO.getName());
		System.out.println(sweetDTO.getPopularState());
		System.out.println(sweetDTO.getPrice());
		System.out.println(" ");

		String[] color = new String[2];
		color[0] = "white";
		color[1] = "Brown";

		SweetDTO sweetDTO2 = new SweetDTO("Peda", "Karnataka", color, Shape.RECTANGLE);
		System.out.println(sweetDTO2.getName());
		System.out.println(sweetDTO2.getPopularState());
		System.out.println(Arrays.toString(color));
		System.out.println(sweetDTO2.getShape());
		sweetDTO2.setPrice(400);
		System.out.println(sweetDTO2.getPrice());
	}

}
