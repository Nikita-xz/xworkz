public class AddressTester{
	public static void main(String[] values)
	{
		System.out.println("JVM invoked main");
		short door=Address.doorNo;
		System.out.println("door "+ door);
		String street=Address.street;
		System.out.println("street "+ street);
		System.out.println("city "+ Address.city);
		System.out.println("pinCode "+ Address.pinCode);
		
		System.out.println("Exit :: main");
	}
	}
