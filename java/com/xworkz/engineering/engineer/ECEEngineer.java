package com.xworkz.engineering.engineer;

import com.xworkz.engineering.constatnts.Branch;

public class ECEEngineer extends Engineer {
	
	public Branch branch = Branch.ECE;

	public void problemSolving() {
		System.out.println("branch is: "+this.branch);
		System.out.println(this.branch+" deals with electronics");
		System.out.println("default: "+super.getBranch());
	}

}
