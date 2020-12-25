package com.xworkz.engineering.engineer;

import com.xworkz.engineering.constatnts.Branch;

public class EEEEngineer extends Engineer{
	
	public Branch branch = Branch.EEE;

	public void problemSolving() {
		System.out.println("branch is: "+this.branch);
		System.out.println(this.branch+" deals with Power");
				
	}

}
