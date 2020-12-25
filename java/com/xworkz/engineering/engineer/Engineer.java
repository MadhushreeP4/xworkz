package com.xworkz.engineering.engineer;

import com.xworkz.engineering.constatnts.Branch;

public class Engineer {
	
	private String USN;
	private Branch branch = Branch.CHEMICAL;

	public void problemSolving() {
		System.out.println("Invoking problemSolving from Engineer class");
		System.out.println(this.branch);
	}

	public String getUSN() {
		return USN;
	}

	public void setUSN(String uSN) {
		USN = uSN;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	
	

}
