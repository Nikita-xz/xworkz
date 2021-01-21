package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;

public class ContactTester {

	public static void main(String[] args) {
		long number = 8050172934l;
		long number1 = 9480024716l;
		long number2 = 9620192669l;
		long number3 = 9900895687l;
		long number4 = 9900832218l;
		long number5 = 9916905991l;
		long number6 = 9739899497l;
		long number7 = 7676736268l;
		long number8 = 7022513234l;
		long number9 = 9483102094l;

		Collection num = new ArrayList();
		boolean added = num.add(number);
		num.add(number1);
		num.add(number2);
		num.add(number3);
		num.add(number4);
		num.add(number5);
		num.add(number6);
		num.add(number7);
		num.add(number8);
		num.add(number9);

		int totalElement = num.size();
		System.out.println(totalElement);

	}

}
