package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTester {

	public static void main(String[] args) {
		String cadbury = "Dairy Milk";
		String nestle = "KitKat";
		String parle = "Kiss me";
		String campco = "Milkybar";
		String amul = "Dark chocolate";

		Collection collection = new ArrayList();
		boolean added = false;
		added = collection.add(cadbury);
		System.out.println(added);

		added = collection.add(nestle);
		System.out.println(added);

		added = collection.add(parle);
		System.out.println(added);

		added = collection.add(campco);
		System.out.println(added);

		added = collection.add(amul);
		System.out.println(added);

		int totalElements = collection.size();
		System.out.println("totalelements" + totalElements);

		String Hersheys = "hersheys kisses";
		boolean removed = collection.remove(null);
		System.out.println("removed:" + removed);

		String ref = null;
		if (ref != null) {
			System.out.println(ref.toString());
		}
		added = collection.add(null);
		System.out.println("Added null:" + added);

		added = collection.add(null);
		System.out.println("Added null:" + added);

		totalElements = collection.size();
		System.out.println("Totle elements after adding null :" + totalElements);

		added = collection.add(parle);
		totalElements = collection.size();
		System.out.println("Total elements after adding null :" + totalElements);

		collection.remove(parle);
		collection.remove(parle);
		totalElements = collection.size();
		System.out.println(totalElements);

		System.out.println("Looping chocolates");

		Object[] convertedChocolate = collection.toArray();
		for (int i = 0; i < convertedChocolate.length; i++) {
			System.out.println(convertedChocolate[i]);
		}

		System.out.println("Looping using iterator*****************");
		Iterator iterator = collection.iterator();
		while (iterator.hasNext()) {
			System.out.println("element present");
			Object obj = iterator.next();
			System.out.println(obj);
		}

	}

}
