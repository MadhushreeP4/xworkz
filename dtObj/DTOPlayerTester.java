package com.xworkz.dtObj;

import java.util.Arrays;

import com.xworkz.dtObj.player.PlayerDTO;

public class DTOPlayerTester {

	public static void main(String[] args) {
		PlayerDTO playerDTO=new PlayerDTO();
		playerDTO.setName("Dhoni");
		playerDTO.setCountry("India");
		playerDTO.setSports(new String[] {"Cricket"});
		playerDTO.setAwards(new String[] {"Padma Bhushan","Padma Shri","Khel Ratna"});
		
		System.out.println(playerDTO.getName());
		System.out.println(playerDTO.getCountry());
		System.out.println(Arrays.toString(playerDTO.getSports()));
		System.out.println(Arrays.toString(playerDTO.getAwards()));
		System.out.println(" ");
		
		PlayerDTO playerDTO2=new PlayerDTO();
		playerDTO2.setName("Kohli");
		playerDTO2.setCountry("India");
		playerDTO2.setSports(new String[] {"Cricket","Badminton"});
		playerDTO2.setAwards(new String[] {"Padma Shri","Khel Ratna","Arjuna"});
		
		System.out.println(playerDTO2.getName());
		System.out.println(playerDTO2.getCountry());
		System.out.println(Arrays.toString(playerDTO2.getSports()));
		System.out.println(Arrays.toString(playerDTO2.getAwards()));
		System.out.println(" ");
		
		PlayerDTO playerDTO3=new PlayerDTO();
		playerDTO3.setName("AB de Villiers");
		playerDTO3.setCountry("SA");
		playerDTO3.setSports(new String[] {"Cricket"});
		playerDTO3.setAwards(new String[] {"ODI player of the year"});
		
		System.out.println(playerDTO3.getName());
		System.out.println(playerDTO3.getCountry());
		System.out.println(Arrays.toString(playerDTO3.getSports()));
		System.out.println(Arrays.toString(playerDTO3.getAwards()));
		System.out.println(" ");
		
		PlayerDTO playerDTO4=new PlayerDTO();
		playerDTO4.setName("Chris Gayle");
		playerDTO4.setCountry("Jamaica");
		playerDTO4.setSports(new String[] {"Cricket"});
		playerDTO4.setAwards(new String[] {"Jamaican Sportsman of the year","ICC Champions Trophy"});
		
		System.out.println(playerDTO4.getName());
		System.out.println(playerDTO4.getCountry());
		System.out.println(Arrays.toString(playerDTO4.getSports()));
		System.out.println(Arrays.toString(playerDTO4.getAwards()));
		System.out.println(" ");
		
		PlayerDTO playerDTO5=new PlayerDTO();
		playerDTO5.setName("Saina Nehwal");
		playerDTO5.setCountry("India");
		playerDTO5.setSports(new String[] {"Badminton"});
		playerDTO5.setAwards(new String[] {"Padma Bhushan","Padma Shri","Khel Ratna","Arjuna"});
		
		System.out.println(playerDTO5.getName());
		System.out.println(playerDTO5.getCountry());
		System.out.println(Arrays.toString(playerDTO5.getSports()));
		System.out.println(Arrays.toString(playerDTO5.getAwards()));
		

	}

}
