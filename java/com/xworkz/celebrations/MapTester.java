package com.xworkz.celebrations;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTester {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Madhu", 22);
		map.put("Kartik", 25);
		map.put("Rajashree", 23);
		map.put("Madhu", 22);
		map.put(null, 35);
		map.put("Bhaskar", null);

		System.out.println(map.size());

		Integer age = map.get("Madhu");
		System.out.println("age "+age);
		
		Set<String> key = map.keySet();
		System.out.println("keys "+key);

		System.out.println(map.values());

		Set<Entry<String, Integer>> entry = map.entrySet();
		System.out.println(entry);

		map.forEach((v, i) -> {
			if (v != null && i != null) {
				System.out.println(v + " " + i);
			}
		});

	}

}
