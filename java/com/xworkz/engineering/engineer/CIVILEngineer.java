package com.xworkz.engineering.engineer;

import com.xworkz.engineering.constatnts.Branch;

public class CIVILEngineer extends Engineer{
	
	public Branch branch = Branch.CIVIL;

	public void problemSolving() {
		System.out.println("branch is: "+this.branch);
		System.out.println(this.branch+" deals with construction");
		System.out.println("default: "+super.getBranch());
	}

}
