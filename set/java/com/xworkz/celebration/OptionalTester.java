package com.xworkz.celebration;

import java.util.Optional;

public class OptionalTester {

	public static void main(String[] args) {
		String email=null;
		System.out.println(email);
		
		if(email !=null) {
			System.out.println(email.toUpperCase());
		}
		Optional<Integer>yearOptional=Optional.empty();
		System.out.println(yearOptional.isPresent());
		yearOptional.ifPresent((v)->System.out.println(v));
		Optional<String>country=Optional.ofNullable("India");
		country.ifPresent(e->{
			String value=country.map(String::toUpperCase).get();
			System.out.println(value);
		});
		String def=country.orElse("US");
		System.out.println(def);
	}

}
