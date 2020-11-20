package Com.xworkz.Concepts;
import Com.xworkz.Concepts.obj.Mobile;


public class MobileTester {

	public static void main(String[] args) {
		
		Mobile mobile=new Mobile();
		Mobile.OS="android";
		
		mobile.model="Redmi note 7 pro";
		mobile.color="Neptune Blue";
		mobile.camera="48MP+5MP";
		mobile.sensors="Face lock";
		mobile.displayInfo();
		
		System.out.println("******************************");
		
		Mobile mobile2=new Mobile();
		mobile2.model="Vivo v17";
		mobile2.color="Black";
		mobile2.camera="48MP";
		mobile2.sensors="Finger print";
		mobile2.displayInfo();
		System.out.println("******************************");
		
		Mobile mobile3=new Mobile();
		mobile3.model="Oppo F11 pro";
		mobile3.color="Green";
		mobile3.camera="48MP+5MP dual";
		mobile3.sensors="Proximity";
		mobile3.displayInfo();
		System.out.println("******************************");
		
		Mobile mobile4=new Mobile();
		mobile4.model="Real me";
		mobile4.color="Space Blue";
		mobile4.camera="13MP";
		mobile4.sensors="accelerometer";
		mobile4.displayInfo();
		System.out.println("******************************");
		
		Mobile mobile5=new Mobile();
		mobile5.model="Samsung";
		mobile5.color="Red";
		mobile5.camera="16MP";
		mobile5.sensors="Fingerprint Scanner";
		mobile5.displayInfo();
		System.out.println("******************************");
		
		Mobile mobile6=new Mobile();
		mobile6.model="OnePlus";
		mobile6.color="Aquamarine green";
		mobile6.camera="Dual-32MP+wide angle camerar";
		mobile6.sensors="Light sensor";
		mobile6.displayInfo();
		System.out.println("******************************");
		
		Mobile mobile7=new Mobile();
		mobile7.model="Nokia";
		mobile7.color="Charcoal";
		mobile7.camera="12+5|8MP";
		mobile7.sensors="ultra-wide 118 lens";
		mobile7.displayInfo();
		System.out.println("******************************");
		
		Mobile mobile8=new Mobile();
		mobile8.model="Lenovo K6 Note";
		mobile8.color="Gold";
		mobile8.camera="16MP";
		mobile8.sensors="Fingerprint";
		mobile8.displayInfo();
		System.out.println("******************************");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
