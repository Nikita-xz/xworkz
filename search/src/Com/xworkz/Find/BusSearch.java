package Com.xworkz.Find;

public class BusSearch {
	private static String[] places = { "Dharwad", "Hubli", "Gadag", "Haveri", "Bangalore", "Tumkur", "Goa",
			"Belgavi", "Jaipur", "Manali", "Hydrabad", "Hariyana", "Pune", "Delhi", "Davangeri", "Koppal" };

	public static void find(String names) {
		System.out.println("Invoked find");
		System.out.println("Total places available" + places.length);
		System.out.println("arg1 :" + names);
		boolean placeFound = false;
		for (int count = 0; count < places.length; count++) {
			String place = places[count];
			if (place.equals(names)) {
				placeFound = true;
				break;
			} else {
				placeFound = false;
			}

		}

		if (placeFound) {
			System.out.println("place is found ");
		} else {
			System.out.println("place is not found");
		}
		System.out.println("Exit :: find");

	}

	public static int totalPlaces() {
		return places.length;

}
}


