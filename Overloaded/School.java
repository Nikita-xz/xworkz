public class School 
{
	
	
	public static void teaching(String learn)
	{
		
		System.out.println("invoked traching");
		System.out.println("arg learn: "+learn);
		
	}
	//chnage in parameter
	//no of parameters
	//change in data type of the parameters
	//change in sequence of parameters
	public static void teaching(String punish,String noOfBook)
	{
		System.out.println("invoked teaching with two parameters ");
		System.out.println("String and String");
		System.out.println("arg1 punish"+punish);
		System.out.println("arg2 noOfBook"+noOfBook);
		
	}
	
	public static void teaching(String punish,int noOfBook)
	{
		
		System.out.println("invoked teaching with two parameters ");
		System.out.println("String and int");
		System.out.println("arg1 punish"+punish);
		System.out.println("arg2 noOfBook"+noOfBook);
	}
	
	public static void teaching(int noOfBook,String punish)
	{
		System.out.println("invoked teaching with two parameters ");
		System.out.println("int and String");
		System.out.println("arg1 noOfBook"+noOfBook);
		System.out.println("arg2 punish"+punish);
		
	}
	
	
	
}