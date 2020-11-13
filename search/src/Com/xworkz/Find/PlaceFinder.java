package Com.xworkz.Find;

public class PlaceFinder {

	public static void main(String[] args) {
		System.out.println("JVM invoked main");

		System.out.println("Total places to search" + BusSearch.totalPlaces());
		BusSearch.find("Dharwad");

		System.out.println("Exit :: main");

	}

}
