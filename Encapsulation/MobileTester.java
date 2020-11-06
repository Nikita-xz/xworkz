public class MobileTester{
	
	
	public static void main(String[] runT)
{
System.out.println("JVM invoked main");

String value=runT[0];
String unlockValue=Mobile.getUnlock();

System.out.println("unlockValue"+unlockValue);

Mobile.setUnlock(value);

unlockValue=Mobile.getUnlock();

System.out.println("unlockValue"+unlockValue);

System.out.println("EXIT :: main");

}
	
}
