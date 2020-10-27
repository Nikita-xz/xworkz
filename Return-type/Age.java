public class Age{
	public static byte ageDefinition(double age){
		System.out.println("Invoked age :" +age);
if (age>=1 && age<=5){
	System.out.println("child");
	return 0;
}
if(age>=6 && age<=12) {
	System.out.println("Kid");
	return 1;
}
if(age>=13 && age<=18){
	System.out.println("Teen");
	return 2;
}
if(age>=19 && age<=45){
	System.out.println("Adult");
	return 3;
}
if(age>=46 && age<=100){
	System.out.println("Old");
	return 4;
}
return -1;
	}
}
	