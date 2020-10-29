public class Cars{
	public static void traveling (String place){
		System.out.println("invoked traveling ");
		System.out.println("arg place: "+place);
		
	}
	public static void traveling(String place,String noOfPeople)
	{
		System.out.println("invoked traveling with two parameters ");
		System.out.println("String and String");
		System.out.println("arg1 place"+place);
		System.out.println("arg2 noOfPpeople"+noOfPeople);
		
	}
	
	public static void traveling(String place,int noOfPeople)
	{
		
		System.out.println("invoked traveling with two parameters ");
		System.out.println("String and int");
		System.out.println("arg1 place"+place);
		System.out.println("arg2 noOfPeople"+noOfPeople);
	}
	
	public static void holding(int noOfPeople,String place)
	{
		System.out.println("invoked travelin with two parameters ");
		System.out.println("int and String");
		System.out.println("arg1 noOfPeople"+noOfPeople);
		System.out.println("arg2 place"+place);
		
	}
	
	
	
}
		
	