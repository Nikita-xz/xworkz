public class Marks{
	public static byte marksDefinition(float marks){
		System.out.println("Invoked marks "+marks);
		if(marks>=85 && marks<=100){
			System.out.println("Result is Distinction");
			return 0;
		}
		if(marks>=60 && marks<=84){
			System.out.println("Result is first class");
			return 1;
		}
				if(marks>=51 && marks<=65){
					System.out.println("Result is second class");
					return 2;
				}
				if(marks>=35 && marks<=50){
					System.out.println("Result is pass");
					return 3;
				}
				if(marks>=0 && marks<=34){
					System.out.println("Result is fail");
				return 4;
				}
			
		return -1;
				
				
			}
		}
					
				
					
				
					
				
			
		
			
	