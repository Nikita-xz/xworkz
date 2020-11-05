public class CountryTester{
	public static void main(String[] result){
		System.out.println("JVM invoked main");
		System.out.println("country name "+Country.countryName);
		float number=Country.population;
		System.out.println("population is "+number);
		System.out.println("no of states "+Country.noOfStates);
		System.out.println("union territory" +Country.unionTerritory);
		System.out.println("no of districts "+Country.noOfDistricts);
		System.out.println(" Exit :: main");
		
	}
	}