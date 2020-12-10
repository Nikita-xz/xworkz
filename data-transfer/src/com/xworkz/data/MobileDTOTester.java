package com.xworkz.data;
import com.xworkz.data.dto.MobileDTO;

public class MobileDTOTester {

	public static void main(String[] args) {
		
			MobileDTO mobileDto=new MobileDTO("Oppo");
			System.out.println(mobileDto.getName());
			mobileDto.setName("Redime");
			System.out.println(mobileDto.getName());
			
			
			MobileDTO mobileDto1=new MobileDTO("Blue", "16GB", 10000, 12000);
			System.out.println(mobileDto1.getColor());
			System.out.println(mobileDto1.getBatteryCapacity());
			System.out.println(mobileDto1.getStorage());
			System.out.println(mobileDto1.getPrice());

		
	}

}
