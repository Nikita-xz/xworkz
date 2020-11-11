package Basics;

public class CreditCardEstimator {
	private static double limit=1000;
	public static void expenditure(double amount ) {
		System.out.println("invoked expenditure");
		System.out.println("arg 1 , amount : " + amount);
		
		if(amount<limit) {
		System.out.println("Total expenditure is"+ amount);
		amount=limit-amount;
		System.out.println("remaining amount is "+amount);
		}
		else {
			System.out.println("expenditure must be less than limit");
		}
		System.out.println("EXIT :: expenditure");
	}
		
	

}

