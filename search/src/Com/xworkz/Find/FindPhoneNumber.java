package Com.xworkz.Find;

public class FindPhoneNumber {

	public static void main(String[] args) {
		System.out.println("jvm invoked main");

		System.out.println("Total numbers to search" + PhoneDirectory.totalNumbers());
		PhoneDirectory.explore("9480024716");

		System.out.println("Exit :: main");
	
	}

}
