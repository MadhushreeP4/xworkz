package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.solution.dto.AlcoholDTO;

public class AlcoholTester {

	public static void main(String[] args) {
		
		AlcoholDTO alcoholDTO=new AlcoholDTO("Magic moment", "NA", 4);
		AlcoholDTO alcoholDTO2=new AlcoholDTO("IB", "Imperial", 48);
		AlcoholDTO alcoholDTO3=new AlcoholDTO("Amstel", "King Fisher", 40);
		AlcoholDTO alcoholDTO4=new AlcoholDTO("Old Monk", "NA", 42);
		
		List<AlcoholDTO> lists=new ArrayList();
		lists.add(alcoholDTO);
		lists.add(alcoholDTO4);
		lists.add(2, alcoholDTO2);
		lists.add(alcoholDTO3);
		
		System.out.println(lists.size());
		
		//list.remove(1);
		//lists.remove(alcoholDTO2);
		
		System.out.println(lists.size());
		
		AlcoholDTO alcoholDTO5=new AlcoholDTO("Bud Wiser", "King Fisher", 10);
		
		//lists.set(1, alcoholDTO5);
		lists.add(1, alcoholDTO5);
		
		for(AlcoholDTO dto: lists){
			System.out.println(dto);
		}
		

	}

}
