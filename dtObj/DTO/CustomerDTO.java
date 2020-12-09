package com.xworkz.dtObj.DTO;

public class CustomerDTO {
	private String name;
	private int customerId;
	private long contactNo;
	private String email;
	
	public CustomerDTO(){
		System.out.println("Invoked DTO");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
