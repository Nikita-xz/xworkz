public class TheaterTester{


public static void main(String[] names)
{

System.out.println("invoked main, doing switch and enum");

TheaterFinder.goodTheaterUsingString("VIJAYA");
	String theaterName="PVR";
	Theater enumTheaterName=Theater.valueOf(theaterName);
TheaterFinder.goodTheaterUsingEnum(enumTheaterName);

System.out.println("EXIT :: main, doing switch and enum");
}

}