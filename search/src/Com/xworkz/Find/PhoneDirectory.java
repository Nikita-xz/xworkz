package Com.xworkz.Find;

public class PhoneDirectory {
	private static String[] numbers = { "8050172934", "9480024716", "9916905991", "9900895687", "9900832218",
			"9620192669", "9739899497", "8050201916", "7829452551", "9019258728" };
	public static void explore(String value) {
		System.out.println("Invoked explore");
		System.out.println("Total values available" + numbers.length);
		System.out.println("arg1 :" + value);
		boolean valuesFound = false;
		for (int result = 0; result < numbers.length; result++) {
			String number = numbers[result];
			if (numbers.equals(number)) {
				valuesFound = true;
				break;
			} else {
				
				valuesFound = false;
			}

		}

		if (valuesFound) {
			System.out.println("value is found ");
		} else {
			System.out.println("value is not found");
		}
		System.out.println("Exit :: explore");

	}

	public static int totalNumbers() {
		return numbers.length;


}

	}


