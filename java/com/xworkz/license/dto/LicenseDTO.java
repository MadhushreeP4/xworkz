package com.xworkz.license.dto;

import java.util.Date;

import com.xworkz.license.constants.BloodGroup;
import com.xworkz.license.constants.Gender;
import com.xworkz.license.constants.IdProof;
import com.xworkz.license.constants.VehicleType;

public class LicenseDTO extends CommonDTO {

	private boolean disability;
	private boolean commercial;
	private IdProof idProof;
	private String idProofNo;
	private Date startDate;
	private VehicleType vehicleType;

	public LicenseDTO() {
		super();
	}

	public LicenseDTO(boolean disability, boolean commercial, IdProof idProof, String idProofNo, Date startDate,
			VehicleType vehicleType) {
		super();
		this.disability = disability;
		this.commercial = commercial;
		this.idProof = idProof;
		this.idProofNo = idProofNo;
		this.startDate = startDate;
		this.vehicleType = vehicleType;
	}

	public LicenseDTO(String name, int age, long mobile, Date dob, AddressDTO addressDTO, Gender gender,
			BloodGroup bloodGroup) {
		super(name, age, mobile, dob, addressDTO, gender, bloodGroup);

	}

	@Override
	public String toString() {
		return "LicenseDTO [disability=" + disability + ", commercial=" + commercial + ", idProofNo=" + idProofNo
				+ ", startDate=" + startDate + ", vehicleType=" + vehicleType + "]";
	}

	public boolean isDisability() {
		return disability;
	}

	public void setDisability(boolean disability) {
		this.disability = disability;
	}

	public boolean isCommercial() {
		return commercial;
	}

	public void setCommercial(boolean commercial) {
		this.commercial = commercial;
	}

	public IdProof getIdProof() {
		return idProof;
	}

	public void setIdProof(IdProof idProof) {
		this.idProof = idProof;
	}

	public String getIdProofNo() {
		return idProofNo;
	}

	public void setIdProofNo(String idProofNo) {
		this.idProofNo = idProofNo;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

}
