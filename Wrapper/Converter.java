public class Converter{
	
	
	public static void main(String[] values)
	{
		
		System.out.println("JVM invoked main");
		System.out.println("The Program will convert string to number");
		
		String pairOfSocks="120";
		byte convertedpairOfSocks=Byte.parseByte(pairOfSocks);
		System.out.println("converted byte : "+convertedpairOfSocks);
		
		String doorNo="562";
		short convertedDoorNo=Short.parseShort(doorNo);
		System.out.println("converted short : "+convertedDoorNo);
		
		
		String salary="62457";
		int convertedSalary=Integer.parseInt(salary);
		System.out.println("converted salary : "+convertedSalary);
		
		int addDoorNoAndSalary=convertedDoorNo+convertedSalary;
		System.out.println("addDoorNoAndSalary  : "+ addDoorNoAndSalary);
		
		
		String numOfStudentsInUniversity="63000";
		long convertednumOfStudentsInUniversity=Long.parseLong(numOfStudentsInUniversity);
		System.out.println("converted numOfStudentsInUniversity : "+convertednumOfStudentsInUniversity);
		
		String interestRate="8.5f";
		float convertedinterestRate=Float.parseFloat(interestRate);
		System.out.println("converted interestRate  : "+convertedinterestRate);
		
		String piValue="3.12429d";
		double convertedpiValue=Double.parseDouble(piValue);
		System.out.println("converted piValue: "+convertedpiValue);
		
		String isJavaFun="true";
		boolean convertedisJavaFun=Boolean.parseBoolean(isJavaFun);
		System.out.println("converted isJavaFun boolean: "+convertedisJavaFun);


		System.out.println("EXIT :: main");
					
	}
	
	
}