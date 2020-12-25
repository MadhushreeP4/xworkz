package com.xworkz.engineering.engineer;

import com.xworkz.engineering.constatnts.Branch;

public class CSEngineer extends Engineer{
	
	public Branch branch = Branch.CS;

	public void problemSolving() {
		System.out.println("branch is: "+this.branch);
		System.out.println(this.branch+" deals with coding");
		System.out.println("default: "+super.getBranch());
	}

}
