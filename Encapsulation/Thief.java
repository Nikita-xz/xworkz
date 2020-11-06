public class Thief{



public static void steal()
{
	System.out.println("invoked steal");
	
	double pocket=Reliance.getBudget();
	System.out.println("steal budget "+pocket);
	System.out.println("Reliance budget "+Reliance.getBudget());
	System.out.println("EXIT :: steal");
	
}

}