package Com.xworkz.Concepts.obj;

public class Mobile {
	public String model;
	public String color;
	public String camera;
	public String sensors;
	public static String OS;

	public void displayInfo()
	{
		System.out.println("invoked displayInfo");
		System.out.println(model);
		System.out.println(color);
		System.out.println(camera);
		System.out.println(sensors);
		System.out.println(OS);
	}
		
}
