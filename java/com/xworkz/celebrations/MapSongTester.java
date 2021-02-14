package com.xworkz.celebrations;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

public class MapSongTester {

	public static void main(String[] args) {

		Map<String, String> map = new TreeMap<String, String>((a, b) -> b.compareTo(a));
		map.put("Jab Tak", "Arman Malik");
		map.put("Happy Agide", "All Ok");
		map.put("Kabira", "Arijith singh");
		map.put("Cheerleader", "Omi");
		map.put("Senorita", "Shawn Mendas");

		Set<Entry<String, String>> entrySet = map.entrySet();
		entrySet.forEach(m-> System.out.println("Song :" + m.getKey() 
		+ " sang by : " + m.getValue()));

		map.forEach((k, v) -> System.out.println(k + " " + v));

		Properties properties = new Properties();
		properties.setProperty("Name", "Email");
		properties.getProperty("Name");

		// Properties
		// Map map2;
		// deal values from file, which always will be string

	}

}
