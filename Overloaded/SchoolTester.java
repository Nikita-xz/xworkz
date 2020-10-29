public class SchoolTester{


public static void main(String[] somethings)
{
	System.out.println("JVM invoked main");	
	System.out.println("main method args length"+somethings.length);	
        
		String book="Comic";
		School.teaching(book);

		School.teaching(book,6);
		
		School.teaching(book,"pen");


	System.out.println("EXIT :: main");	
}

}