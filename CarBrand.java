public class CarBrand{
	public static void getBrand()
	{
		System.out.println("invoked getBrand");
		String[] display={"Toyota","Audi","Mercedes-Benz","Duster","Lamborghini", "Jaguar"};
		
		System.out.println("brand size"+display.length);
		
		for(int brand=0;brand<display.length;brand++)
		{
			System.out.println(" Brand name"+brand);
			String message=display[brand];
			System.out.println("Car Brand "+ message);
		}
	}
}
		
