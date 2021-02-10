package com.xworkz.license.dao;

import com.xworkz.license.constants.VechicleType;
import com.xworkz.license.dto.LicenseDTO;

public interface LicenseDAO {
void save(LicenseDTO dto);
	
	LicenseDTO findByIdProofNo(String idProofNo);
	
	boolean updateVehicleTypeByIdProofNo(String idProof,VechicleType type);
	
	boolean deleteByIdProofNo(String idPrrof);

}
