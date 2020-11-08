public class TheaterFinder{


public static void goodTheaterUsingString(String theaterName)
{
	System.out.println("invoked goodTheaterUsingString");
	System.out.println("arg 1 theaterName "+theaterName);
	switch(theaterName){
			case "PVR":
				System.out.println("case is " +theaterName);
				System.out.println("cost is 300");
				break;
			case "CINEPOLIS":
				System.out.println("case is " +theaterName);
				System.out.println("cost is 400");
				break;
			case "SANGAM":
				System.out.println("case is " +theaterName);
				System.out.println("cost is 200");
				break;
			case "VIJAYA":
				System.out.println("case is " +theaterName);
				System.out.println("cost is 250");
				break;
			case "APSARA":
				System.out.println("case is " +theaterName);
				System.out.println("cost is 200");
				break;
			
		
	}
	
	System.out.println("EXIt:: goodTheaterUsingString");
	
}


public static void goodTheaterUsingEnum(Theater theaterName)
{

System.out.println("invoked goodTheaterUsingEnum");
	System.out.println("arg 1 theaterName "+theaterName);	
	switch(theaterName){
		case PVR:
				System.out.println("case is " +theaterName);
				System.out.println("cost is 400");
				System.out.println("Best Theater in Hubli");
				break;
		case SANGAM:
				System.out.println("case is " +theaterName);
				System.out.println("cost is 200");
				System.out.println("Best Theater in Dharwad");
				break;
		
	}
	
	System.out.println("EXIt:: goodTheaterUsingString");
}

}