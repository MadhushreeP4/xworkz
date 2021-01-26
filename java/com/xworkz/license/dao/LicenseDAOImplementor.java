package com.xworkz.license.dao;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.license.constants.VehicleType;
import com.xworkz.license.dto.LicenseDTO;

public class LicenseDAOImplementor implements LicenseDAO {

	List<LicenseDTO> dataBase = new ArrayList();

	@Override
	public void save(LicenseDTO dto) {
		System.out.println("Implemented save method");
		System.out.println("save arg:" + dto);
		boolean saved = this.dataBase.add(dto);
		if (saved)
			System.out.println("dto is saved");
		else
			System.out.println("dto is not saved");
	}

	@Override
	public LicenseDTO findByIdProofNo(String idProofNo) {
		System.out.println("invoked findByIdProofNo");
		System.out.println("idProofNo: " + idProofNo);
		for (LicenseDTO licenseDTO : this.dataBase) {
			String idNoFromDTO = licenseDTO.getIdProofNo();
			if (idNoFromDTO.equals(idProofNo)) {
				System.out.println("license found");
				return licenseDTO;
			} else {
				System.out.println("license not found");
			}
		}
		return null;
	}

	@Override
	public boolean updateVehicleTypeByIdProofNo(VehicleType type, String idProofNo) {
		System.out.println("invoked updateVehicleTypeByIdProofNo");
		System.out.println("type: " + type);
		System.out.println("idProofNo: " + idProofNo);
		LicenseDTO idNoFromDB = this.findByIdProofNo(idProofNo);
		if (idNoFromDB != null) {
			System.out.println("can update");
			idNoFromDB.setVehicleType(type);
			System.out.println("updated type: " + idNoFromDB.getVehicleType());
			return true;
		} else {
			System.out.println("can not update");
		}
		return false;
	}

	@Override
	public boolean deleteByIdProofNo(String idProofNo) {
		LicenseDTO id = this.findByIdProofNo(idProofNo);
		if (id != null) {
			dataBase.remove(idProofNo);
			System.out.println("removed");
			return true;
		} else {
			System.out.println("not removed");
			return false;
		}

	}

}
