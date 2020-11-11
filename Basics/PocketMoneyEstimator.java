package Basics;

public class PocketMoneyEstimator {
	private static double totalAmount;
	public static void request(double amount, String day) {
		System.out.println("invoked request");
		System.out.println("arg 1 , amount : " + amount);
		System.out.println("arg 2 , day : " + day);
		totalAmount=totalAmount+amount;
		System.out.println("Total Amount after request"+ totalAmount);
		System.out.println("EXIT :: request");
	}
	
	public static void expenditure(double amount) {
		System.out.println("invoked expenditure");
		System.out.println("arg 1 , amount : " + amount);
		totalAmount=totalAmount-amount;
		System.out.println("Total Amount after expenditure"+ totalAmount);
		System.out.println("EXIT :: expenditure");
		
		
	}
	
	
		
		
				
	}


