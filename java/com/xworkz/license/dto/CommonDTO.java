package com.xworkz.license.dto;

import java.util.Date;

import com.xworkz.license.constants.BloodGroup;
import com.xworkz.license.constants.Gender;
import com.xworkz.license.constants.IdProof;

public class CommonDTO {

	private String name;
	private int age;
	private long mobile;
	private Date Dob;
	private AddressDTO addressDTO;
	private Gender gender;
	private BloodGroup bloodGroup;
	
	public CommonDTO() {
		super();
	}

	public CommonDTO(String name, int age, long mobile, Date dob, AddressDTO addressDTO, Gender gender,
			BloodGroup bloodGroup) {
		super();
		this.name = name;
		this.age = age;
		this.mobile = mobile;
		Dob = dob;
		this.addressDTO = addressDTO;
		this.gender = gender;
		this.bloodGroup = bloodGroup;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public long getMobile() {
		return mobile;
	}

	public Date getDob() {
		return Dob;
	}

	public AddressDTO getAddressDTO() {
		return addressDTO;
	}

	public Gender getGender() {
		return gender;
	}

	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}

}
