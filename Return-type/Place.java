public class Place{
	public static String finder(int distance)
	{
		System.out.println("Invoked distance :" +distance);
		if(distance==250){
			System.out.println("Mysore");
			return "Mysore";
		}
		if(distance==133.5){
			System.out.println("Goa");
			return "Goa";
		}
		if(distance==1500){
			System.out.println("Gujarat");
			return "Gujarat";
		}
		if(distance==431){
			System.out.println("Bangalore");
			return "Bangalore";
		}
		if(distance==677){
			System.out.println("Kerala");
			return "Kerala";
		}
		if(distance==1647){
			System.out.println("Rajasthan");
			return "Rajasthan";
		}
		if(distance==2415){
			System.out.println("Darjeeling");
			return "Darjeeling";
		}
		if(distance==1789){
			System.out.println("Delhi");
			return "Delhi";
		}
		if(distance==72){
			System.out.println("Laxmeshwar");
			return "Laxmeshwar";
		}
		if(distance==197){
			System.out.println("Bijapur");
			return "Bijapur";
		}
		if(distance==200000){
			System.out.println("place Not in Earth");
			return "place Not in Earth";
		}
		return "place not found";
	}
}