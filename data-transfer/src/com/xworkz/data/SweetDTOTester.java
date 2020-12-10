package com.xworkz.data;
import com.xworkz.data.dto.SweetDTO;

public class SweetDTOTester {

	public static void main(String[] args) {
		SweetDTO sweetDto=new SweetDTO("Dharwad peda", 200);
		System.out.println(sweetDto.getName());
		System.out.println(sweetDto.getPrice());
		sweetDto.setPrice(150);
		System.out.println("updated price  "+sweetDto.getPrice());
		
		String[] color=new String[2];
		color[0]="brown";
		color[1]="Gray";
		
		
		SweetDTO sweetDto2=new SweetDTO("Karnataka","3KG", color);
		System.out.println(sweetDto2.getPopularState());
		System.out.println(sweetDto2.getQuantity());
		System.out.println(sweetDto2.getColor());
		
		System.out.println(sweetDto2.getShape());
		

	}

}
