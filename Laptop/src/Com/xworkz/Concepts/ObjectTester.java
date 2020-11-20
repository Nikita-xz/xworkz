package Com.xworkz.Concepts;

import Com.xworkz.Concepts.obj.Vechicle;

public class ObjectTester {

	public static void main(String[] args) {
Vechicle.yom="2020";
		
Vechicle vehicle=new Vechicle();
		//vehicle.displayInfo();
		vehicle.color="Black";
		vehicle.owner="Sahana";
		vehicle.model="Baleno";
		vehicle.displayInfo();
		System.out.println("******************************");
		Vechicle vehicle2=new Vechicle();
		//vehicle2.displayInfo();
		vehicle2.color="Blue";
		vehicle2.model="Rolls Royce";
		vehicle2.displayInfo();
		
      

	}

}
