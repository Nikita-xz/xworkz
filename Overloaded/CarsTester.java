public class CarsTester{


public static void main(String[] nikita)
{
	System.out.println("JVM invoked main");	
	System.out.println("main method args length"+nikita.length);	
        
		String seats="Avalabile";
		Cars.traveling(seats);
		Cars.traveling("place","people");
		Cars.traveling(seats,5);
			
		
		Cars.traveling("5","seats");
		


	System.out.println("EXIT :: main");	
}

}