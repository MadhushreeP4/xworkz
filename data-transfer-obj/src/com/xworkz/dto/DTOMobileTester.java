package com.xworkz.dto;

import com.xworkz.dto.mobile.MobileDTO;

public class DTOMobileTester {

	public static void main(String[] args) {

		MobileDTO mobileDto = new MobileDTO("Nokia","64GB",6.3,4);
		System.out.println(mobileDto.getName());
		System.out.println(mobileDto.getIntStorage());
		System.out.println(mobileDto.getSize());
		System.out.println(mobileDto.getRAMInGb());
		System.out.println(" ");

		MobileDTO mobileDto1 = new MobileDTO("Black", "10", "HMD Global");
		System.out.println(mobileDto1.getColor());
		System.out.println(mobileDto1.getVersion());
		System.out.println(mobileDto1.getCompany());

		mobileDto1.setPrice(13999);
		System.out.println(mobileDto1.getPrice());

	}

}
