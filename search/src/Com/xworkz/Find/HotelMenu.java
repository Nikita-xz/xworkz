package Com.xworkz.Find;

public class HotelMenu {
	private static String[] items = { "Idli", "Dosa", "Pav-Bhagi", "Rave-Dosa", "Gobbi", "Noodles", "Uttapa",
			"Puri-sagu", "Shev-puri", "Samosa", "Vada", "Tea", "Coffee", "Soft-Drinks", "Ice-cream", "Fruit-juice" };
	public static void look(String hotel) {
		System.out.println("Invokes look");
		System.out.println("Total menu available" + items.length);
		System.out.println("arg1 :" + hotel);
		boolean itemFound = false;
		for (int result = 0; result <items.length; result++) {
			String search = items[result];
			if (items.equals(hotel)) {
				itemFound = true;
				break;
			} else {
				itemFound = false;
			}

		}

		if (itemFound) {
			System.out.println("menu is found ");
		} else {
			System.out.println("menu is not found");
		}
		System.out.println("Exit :: look");

	}

	public static int totalItems() {
		return items.length;

}
}



