package com.xworkz.data;
import com.xworkz.data.transfer.CustomerDTO;

public class DTOTester {

	public static void main(String[] args) {
		CustomerDTO customerDto=new CustomerDTO();
		customerDto.setCustomerId(1234);
		System.out.println(customerDto.getCustomerId());
		customerDto.setName("Nikita");
		System.out.println(customerDto.getName());
		customerDto.setContactNo(8050172934l);
		System.out.println(customerDto.getContactNo());
		customerDto.setEmail("nikita.xworkx@gmail.com");
		System.out.println(customerDto.getEmail());
		System.out.println("************************");
		
		
		CustomerDTO customerDto2=new CustomerDTO();
		customerDto2.setCustomerId(5678);
		System.out.println(customerDto2.getCustomerId());
		customerDto2.setName("Pratiksha");
		System.out.println(customerDto2.getName());
		customerDto2.setContactNo(9480024716l);
		System.out.println(customerDto2.getContactNo());
		customerDto2.setEmail("pratikshakulkarni@gmail.com");
		System.out.println(customerDto2.getEmail());
		

	}

}