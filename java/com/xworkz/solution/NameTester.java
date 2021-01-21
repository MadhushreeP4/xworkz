package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class NameTester {

	public static void main(String[] args) {

		Collection<String> names = new ArrayList();
		names.add("Omkar");
		names.add("Nikunj");
		names.add("Akshar");
		names.add("drone");
		names.add("Devendra");

		System.out.println(names.size());

		Iterator<String> iterator = names.iterator();
		while (iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
			if (name.equals("drone")) {
				iterator.remove();
			}
		}
		System.out.println(names.size());
		for (String nm : names) {
			System.out.println(nm);
		}

	}

}
