package com.xworkz.data;
import com.xworkz.data.dto.CompanyDTO;

public class CompanyDTOTester {

	public static void main(String[] args) {
		CompanyDTO company=new CompanyDTO();
		System.out.println(company.getName());
		System.out.println(company.getLocation());
		System.out.println("****************************************************");
		CompanyDTO company2=new CompanyDTO("Amazon","MNC","New Delhi",1234,"www.amazon.co.in");
		System.out.println(company2.getCompanyId());
		System.out.println(company2.getName());
		System.out.println(company2.getLocation());
		System.out.println(company2.getType());
		System.out.println(company2.getWebSite());
		company2.setName("TCS");
		System.out.println(company2.getName());
	
	}
		

	}


