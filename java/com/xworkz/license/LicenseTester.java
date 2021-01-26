package com.xworkz.license;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.xworkz.license.constants.BloodGroup;
import com.xworkz.license.constants.Gender;
import com.xworkz.license.constants.VehicleType;
import com.xworkz.license.dao.LicenseDAOImplementor;
import com.xworkz.license.dto.AddressDTO;
import com.xworkz.license.dto.LicenseDTO;

public class LicenseTester {

	public static void main(String[] args) {

		AddressDTO addressDTO = new AddressDTO(45, "Navarang Layout", "Renuka Nilaya", "Hudco-Colony", 582101, "Gadag",
				"Karnataka");
		
		Date date=new Date();
		SimpleDateFormat format=new SimpleDateFormat("dd/mm/yyyy");
		try{
			date=format.parse("19/09/1998");
		}
		catch(ParseException e){
			
		}

		LicenseDTO licenseDTO = new LicenseDTO("Madhu", 23, 8885467900l, date, addressDTO, Gender.FEMALE, BloodGroup.B_POSITIVE);
		
		Date date2=new Date();
		
		licenseDTO.setVehicleType(VehicleType.TWO_WHEELER);
		licenseDTO.setStartDate(date2);
		licenseDTO.setIdProofNo("mad1234");
		licenseDTO.setDisability(false);
		licenseDTO.setCommercial(false);
		
		LicenseDAOImplementor daoImplementor=new LicenseDAOImplementor();
		daoImplementor.save(licenseDTO);
		System.out.println(" ");
		
		LicenseDTO id=daoImplementor.findByIdProofNo("mad1234");
		System.out.println(id);
		System.out.println(" ");
		
		boolean update=daoImplementor.updateVehicleTypeByIdProofNo(VehicleType.THREE_WHEELER, "mad1234");
		System.out.println(update);
		System.out.println(" ");
		
		boolean delete=daoImplementor.deleteByIdProofNo("mad1234");
		System.out.println(delete);

	}

}
