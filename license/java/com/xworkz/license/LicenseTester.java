package com.xworkz.license;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.xworkz.license.constants.BloodGroup;
import com.xworkz.license.constants.Gender;
import com.xworkz.license.constants.IdProof;
import com.xworkz.license.constants.VechicleType;
import com.xworkz.license.dao.LicenseDAO;
import com.xworkz.license.dao.impl.LicenseDAOImpl;
import com.xworkz.license.dto.AddressDTO;
import com.xworkz.license.dto.LicenseDTO;

public class LicenseTester {

	public static void main(String[] args) {
		AddressDTO addressDTO = new AddressDTO(3254, "NA", 560003, "Soundatti", "Soundatti", "Ka", "Na");

		Date dob = new Date();// 16/10/1997
		SimpleDateFormat format=new SimpleDateFormat("dd/mm/yyyy");
		try {
			dob=format.parse("16/10/1997");
		} catch (ParseException e) {
			e.printStackTrace();
		}

		LicenseDTO dto = new LicenseDTO("Soubhagya", 23, addressDTO, dob, 8884923476l, BloodGroup.AB_POSITIVE,
				Gender.FEMALE);
		dto.setIdProof(IdProof.AADHAR);
		dto.setIdProofNo("6363 8787 6449");
		dto.setCommercial(false);
		dto.setDisablity(false);
		dto.setStartdate(new Date());// change to future
		dto.setVehicleType(VechicleType.TWO_WHEELER);

		LicenseDAO dao = new LicenseDAOImpl();
		dao.save(dto);// DAO
			// CRUD----
		LicenseDTO dtoFound = dao.findByIdProofNo("6363 8787 6449");
		System.out.println(dtoFound);

		boolean updated=dao.updateVehicleTypeByIdProofNo("6363 8787 6449", VechicleType.LMV);
		System.out.println("updated "+ updated);
		
		
		LicenseDTO dtoafterUpdate=dao.findByIdProofNo("6363 8787 6449");
		System.out.println(dtoafterUpdate);
	}
	}


