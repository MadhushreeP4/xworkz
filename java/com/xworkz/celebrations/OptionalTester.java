package com.xworkz.celebrations;

import java.util.Optional;

public class OptionalTester {

	public static void main(String[] args) {

		String email = null;

		System.out.println(email);

		if (email != null) {
			System.out.println(email.toUpperCase());
		}

		Optional<String> optional = Optional.of("madhushreep@xworkz.com");

		System.out.println(optional.isPresent());

		if (optional.isPresent()) {
			System.out.println(optional.get());
		}

		Optional<Integer> yearOptional = Optional.empty();

		System.out.println(yearOptional.isPresent());

		yearOptional.ifPresent((v) -> System.out.println(v));

		Optional<String> country = Optional.ofNullable("india");

		country.ifPresent(e -> {
			String value = country.map(String::toUpperCase).get();
			System.out.println(value);

		});

		String def = country.orElse("Srilanka");
		System.out.println(def);

	}

}
