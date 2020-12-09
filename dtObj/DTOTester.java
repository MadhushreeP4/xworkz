package com.xworkz.dtObj;

import com.xworkz.dtObj.DTO.CustomerDTO;

public class DTOTester {

	public static void main(String[] args) {
		
		CustomerDTO customerDTO=new CustomerDTO();
		customerDTO.setName("Madhu");
		customerDTO.setCustomerId(1234);
		customerDTO.setContactNo(7654321890L);
		customerDTO.setEmail("madhu@gmail.com");
		
		System.out.println(customerDTO.getName());
		System.out.println(customerDTO.getCustomerId());
		System.out.println(customerDTO.getContactNo());
		System.out.println(customerDTO.getEmail());
		System.out.println(" ");
		
		CustomerDTO customerDTO2=new CustomerDTO();
		customerDTO2.setName("Madhvi");
		customerDTO2.setCustomerId(5678);
		customerDTO2.setContactNo(7654376543L);
		customerDTO2.setEmail("madhvi@gmail.com");
		
		System.out.println(customerDTO2.getName());
		System.out.println(customerDTO2.getCustomerId());
		System.out.println(customerDTO2.getContactNo());
		System.out.println(customerDTO2.getEmail());
		System.out.println(" ");
		
		CustomerDTO customerDTO3=new CustomerDTO();
		customerDTO3.setName("Rekha");
		customerDTO3.setCustomerId(4321);
		customerDTO3.setContactNo(7890123456L);
		customerDTO3.setEmail("rekha@gmail.com");
		
		System.out.println(customerDTO3.getName());
		System.out.println(customerDTO3.getCustomerId());
		System.out.println(customerDTO3.getContactNo());
		System.out.println(customerDTO3.getEmail());
	}

}
