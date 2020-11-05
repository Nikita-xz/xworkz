public class Tester{
	public static void main(String[] args){
		System.out.println("JVM invoked main");
		System.out.println("state name "+States.stateName);
		int count=States.noOfTaluks;
		System.out.println("no of taluks "+count);
		System.out.println("no of district "+States.noOfDistrict);
		double number=States.noOfPopulation;
		System.out.println("no of population" +number);
		System.out.println("capital name "+States.capitalName);
		
		System.out.println("*************************");
		
		int ns=SolarSystem.naturalSatellites;
		System.out.println("natural satellites "+ns);
		int as=SolarSystem.artificalSatellites;
		System.out.println("artifical Satellites "+as);
		System.out.println("no of planets "+SolarSystem.noOfPlanetes);
		System.out.println("brightest star "+SolarSystem.brightestStar);
		System.out.println("blue planet "+SolarSystem.bluePlanet);
		
		System.out.println("*******************");
		
		int meb=KarnatakaParliment.noOfMembers;
		System.out.println("no of members "+meb);
		System.out.println("no of houses "+KarnatakaParliment.noOfHouses);
		System.out.println("house name "+KarnatakaParliment.houseName);
		System.out.println("name of CM "+KarnatakaParliment.nameOfCM);
		System.out.println("speaker name "+KarnatakaParliment.speakerName);
		
		System.out.println("*******************");
		
		
		System.out.println("no of months "+Year.noOfMonths);
		System.out.println("no of days in a year "+Year.noOfDaysInYear);
		System.out.println("name of month "+Year.nameOfMonth);
		System.out.println("no Of weeks in a month "+Year.noOfWeeksInAMonth);
		System.out.println("days in leap year "+Year.daysInLeapYear);
		
		System.out.println("*******************");
		
		int result=University.noOfStaff;
		System.out.println("no of staff "+result);
		int output=University.noOfStudents;
		System.out.println("no of students "+output);
		System.out.println("no of branches "+University.noOfBranches);
		System.out.println(" name of university "+University.nameOfUniversity);
		System.out.println("location "+University.location);
		
		System.out.println(" Exit :: main");
		
	}
	}
		