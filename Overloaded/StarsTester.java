public class StarsTester{


public static void main(String[] beautiful)
{
	System.out.println("JVM invoked main");	
	System.out.println("main method args length"+beautiful.length);	
        
		String white="Color";
		Stars.shining(white);

		Stars.shining(white,6);
		
		Stars.shining(white,"small");
		Stars.shining("6","color");


	System.out.println("EXIT :: main");	
}

}