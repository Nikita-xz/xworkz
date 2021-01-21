package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;

import javax.swing.text.StyledEditorKit.BoldAction;

public class EmailTester {

	public static void main(String[] args) {
		String email = "xworkzodc@gmail.com";
		String email2 = "nikit.xworkz@gmail.com";
		String email3 = "nikitaskgoudar@gail.com";
		String email4 = "anitavn022@gmail.com";
		String email5 = "kavya.xworkz@gmail.com";
		String email6 = "anita.xworkz@gmail.com";
		String email7 = "vena.xworkz@gmail.com";
		String email8 = "truptisn.094@gmail.com";
		String email9 = "sushma.xworkz@gmail.com";
		String email10 = "komalskgoudar@gmail.com";
		String email11 = "suriskgoudar@gmail.com";
		String email12 = "nikitakallanagoudar@gmail.com";
		String email13 = "ombn.xworkz@gmail.com";
		String email14 = "contact@x-workz.in";
		String email15 = "om.bn@outlook.com";
		String email16 = "vinay@x-workz.in";
		String email17 = "kavyasajjanar11@gmail.com";
		String email18 = "kavsjn011@gmail.com";

		Collection emailAdded = new ArrayList();
		boolean added = emailAdded.add(email);
		emailAdded.add(email);
		emailAdded.add(email2);
		emailAdded.add(email3);
		emailAdded.add(email4);
		emailAdded.add(email5);
		emailAdded.add(email6);
		emailAdded.add(email7);
		emailAdded.add(email8);
		emailAdded.add(email9);
		emailAdded.add(email10);
		emailAdded.add(email11);
		emailAdded.add(email12);
		emailAdded.add(email13);
		emailAdded.add(email14);
		emailAdded.add(email15);
		emailAdded.add(email16);
		emailAdded.add(email17);
		emailAdded.add(email18);

		int totalElement = emailAdded.size();
		System.out.println(totalElement);

		boolean removed = emailAdded.remove(email14);
		System.out.println(removed);

		totalElement = emailAdded.size();
		System.out.println(totalElement);

	}

}
